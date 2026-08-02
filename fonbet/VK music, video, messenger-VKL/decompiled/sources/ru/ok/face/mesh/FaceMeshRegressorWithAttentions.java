package ru.ok.face.mesh;

import androidx.annotation.NonNull;
import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.atv0;
import xsna.sj1;

/* loaded from: classes9.dex */
public class FaceMeshRegressorWithAttentions extends FaceMeshRegressor {
    private final FloatBuffer[] otherOutputBuffer;
    protected GLSSBO[] otherOutputBufferGPU;

    public FaceMeshRegressorWithAttentions(@NonNull ModelDataProvider modelDataProvider, float f, float f2, boolean z, boolean z2, boolean z3, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, boolean z4, GpuCache gpuCache) {
        super(modelDataProvider, f, f2, z, z2, z3, weakReference, weakReference2, z4, gpuCache);
        int i;
        int i2;
        int i3;
        int i4;
        this.otherOutputBufferGPU = new GLSSBO[5];
        this.otherOutputBuffer = new FloatBuffer[5];
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(0);
        this.cropHeight = inputTensorShape[1];
        this.cropWidth = inputTensorShape[0];
        int[] outputTensorShape = this.interpreterWrapper.getOutputTensorShape(0);
        if (outputTensorShape.length == 4) {
            i = outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2];
            i2 = outputTensorShape[3];
        } else {
            i = outputTensorShape[0] * outputTensorShape[1];
            i2 = outputTensorShape[2];
        }
        this.outputBufferLocations = FloatBuffer.allocate(i * i2);
        int[] outputTensorShape2 = this.interpreterWrapper.getOutputTensorShape(6);
        if (outputTensorShape.length == 4) {
            i3 = outputTensorShape2[0] * outputTensorShape2[1] * outputTensorShape2[2];
            i4 = outputTensorShape2[3];
        } else {
            i3 = outputTensorShape2[0] * outputTensorShape2[1];
            i4 = outputTensorShape2[2];
        }
        this.outputBufferScore = FloatBuffer.allocate(i3 * i4);
        for (int i5 = 1; i5 < this.otherOutputBuffer.length + 1; i5++) {
            int[] outputTensorShape3 = this.interpreterWrapper.getOutputTensorShape(i5);
            this.otherOutputBuffer[i5 - 1] = FloatBuffer.allocate(outputTensorShape3[0] * outputTensorShape3[1] * outputTensorShape3[2]);
        }
        this.inputData = new TFImageData(this.cropHeight, this.cropWidth, false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$0() {
        this.gpuCroppedBuffer.release();
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor, ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        if (this.gpuResourcesInited) {
            return;
        }
        initConvertShader(this.cropWidth, this.cropHeight, this.zeroMean);
        createCopyShader();
        if (this.gpuCroppedBuffer == null) {
            this.gpuCroppedBuffer = new FrameBuffer(this.cropWidth, this.cropHeight);
            addGPUResourse(new sj1(this, 5));
        }
        if (this.outputLocationsBufferGPU == null) {
            this.outputLocationsBufferGPU = createSSBO(this.outputBufferLocations.capacity() * 4);
        }
        if (this.outputScoresBufferGPU == null) {
            this.outputScoresBufferGPU = createSSBO(this.outputBufferScore.capacity() * 4);
        }
        if (this.inputBuffer == null) {
            this.inputBuffer = createSSBO(this.inputData.buffer.capacity());
        }
        int i = 0;
        while (true) {
            FloatBuffer[] floatBufferArr = this.otherOutputBuffer;
            if (i >= floatBufferArr.length) {
                super.initGPUResources();
                return;
            }
            GLSSBO[] glssboArr = this.otherOutputBufferGPU;
            if (glssboArr[i] == null) {
                glssboArr[i] = createSSBO(floatBufferArr[i].capacity() * 4);
            }
            i++;
        }
    }

    @Override // ru.ok.face.mesh.FaceMeshRegressor, ru.ok.face.gpu.BaseFaceProcessor
    public Map<Integer, Object> prepareGPUOutput(FrameHolder frameHolder) {
        copyTextureToBuffer(frameHolder, this.inputBuffer);
        HashMap hashMap = new HashMap();
        hashMap.put(0, Integer.valueOf(this.outputLocationsBufferGPU.getId()));
        hashMap.put(1, Integer.valueOf(this.otherOutputBufferGPU[0].getId()));
        hashMap.put(2, Integer.valueOf(this.otherOutputBufferGPU[1].getId()));
        hashMap.put(3, Integer.valueOf(this.otherOutputBufferGPU[2].getId()));
        hashMap.put(4, Integer.valueOf(this.otherOutputBufferGPU[3].getId()));
        hashMap.put(5, Integer.valueOf(this.otherOutputBufferGPU[4].getId()));
        hashMap.put(6, Integer.valueOf(this.outputScoresBufferGPU.getId()));
        return hashMap;
    }

    @Override // ru.ok.face.mesh.FaceMeshRegressor, ru.ok.face.gpu.BaseFaceProcessor
    public void processGPUOutput() {
        this.outputBufferLocations.clear();
        this.outputBufferScore.clear();
        this.outputLocationsBufferGPU.copyDataTo(this.outputBufferLocations);
        this.outputScoresBufferGPU.copyDataTo(this.outputBufferScore);
        this.outputLocationsBufferGPU.copyDataTo(this.outputBufferLocations);
        this.otherOutputBufferGPU[0].copyDataTo(this.otherOutputBuffer[0]);
        this.otherOutputBufferGPU[1].copyDataTo(this.otherOutputBuffer[1]);
        this.otherOutputBufferGPU[2].copyDataTo(this.otherOutputBuffer[2]);
        this.outputScoresBufferGPU.copyDataTo(this.outputBufferScore);
        int[] iArr = {61, 146, 91, 181, 84, 17, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE, InterfaceC4413l1.a.b.e, Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, 375, 291, 185, 40, 39, 37, 0, 267, 269, atv0.b, InterfaceC4413l1.a.b.i, 78, 95, 88, 178, 87, 14, Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 402, Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 324, Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, 191, 80, 81, 82, 13, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, 415, 76, 77, 90, 180, 85, 16, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 404, 320, 307, 306, 184, 74, 73, 72, 11, 302, Http.StatusCode.SEE_OTHER, Sdk.SDKError.Reason.AD_EXPIRED_VALUE, InterfaceC4413l1.a.b.h, 62, 96, 89, 179, 86, 15, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 403, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 325, 292, 183, 42, 41, 38, 12, 268, 271, 272, InterfaceC4413l1.a.b.g};
        int i = 0;
        for (int i2 = 0; i2 < 80; i2++) {
            int i3 = iArr[i2] * 3;
            this.outputBufferLocations.put(i3, this.otherOutputBuffer[0].get(i));
            this.outputBufferLocations.put(i3 + 1, this.otherOutputBuffer[0].get(i + 1));
            i += 2;
        }
        int[] iArr2 = {33, 7, 163, 144, 145, 153, 154, 155, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 246, 161, 160, 159, 158, 157, 173, 130, 25, 110, 24, 23, 22, 26, 112, 243, 247, 30, 29, 27, 28, 56, 190, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 31, 228, 229, 230, 231, 232, 233, 244, 113, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, PsExtractor.PRIVATE_STREAM_1, 35, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 46, 53, 52, 65, 143, 111, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 128, 245, 156, 70, 63, 105, 66, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 55, 193};
        int i4 = 0;
        for (int i5 = 0; i5 < 71; i5++) {
            int i6 = iArr2[i5] * 3;
            this.outputBufferLocations.put(i6, this.otherOutputBuffer[1].get(i4));
            this.outputBufferLocations.put(i6 + 1, this.otherOutputBuffer[1].get(i4 + 1));
            i4 += 2;
        }
        int[] iArr3 = {263, 249, 390, 373, 374, 380, 381, 382, 362, 466, 388, 387, 386, 385, 384, 398, 359, 255, 339, 254, 253, 252, 256, 341, 463, 467, 260, 259, 257, 258, 286, 414, 446, 261, 448, 449, 450, 451, 452, ApiInvocationException.ErrorCodes.SESSION_REQUIRED, 464, 342, 445, 444, 443, 442, 441, 413, 265, 353, 276, 283, 282, 295, 372, 340, 346, 347, 348, 349, 350, 357, 465, 383, 300, 293, 334, 296, 336, 285, 417};
        int i7 = 0;
        for (int i8 = 0; i8 < 71; i8++) {
            int i9 = iArr3[i8] * 3;
            this.outputBufferLocations.put(i9, this.otherOutputBuffer[2].get(i7));
            this.outputBufferLocations.put(i9 + 1, this.otherOutputBuffer[2].get(i7 + 1));
            i7 += 2;
        }
    }
}
