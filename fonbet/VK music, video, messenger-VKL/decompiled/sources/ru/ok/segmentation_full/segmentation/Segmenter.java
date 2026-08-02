package ru.ok.segmentation_full.segmentation;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import ru.ok.TFFrameType;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.tflite.Model;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;

/* loaded from: classes9.dex */
public class Segmenter extends Model implements ISegmenter {
    private final TFImageData inputData;
    private int inputHeight;
    private int inputWidth;
    private boolean isQuantized;
    private final Logger logger;
    private final ByteBuffer outputBuffer;
    private byte[] outputMapByte;
    protected TFFrameType useFrameIndex;

    public Segmenter(WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, @NonNull ModelDataProvider modelDataProvider, boolean z, boolean z2, @NonNull Logger logger, TFFrameType tFFrameType) {
        super(modelDataProvider, Util.DelegateType.CPU, z2 ? Util.Api2BufferType.PassCPU : Util.Api2BufferType.None, null, weakReference, weakReference2);
        this.logger = logger;
        this.isQuantized = z;
        this.useFrameIndex = tFFrameType;
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(0);
        this.inputHeight = inputTensorShape[1];
        this.inputWidth = inputTensorShape[2];
        int[] outputTensorShape = this.interpreterWrapper.getOutputTensorShape(0);
        if (z) {
            this.outputBuffer = ByteBuffer.allocateDirect(outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2] * outputTensorShape[3]);
        } else {
            this.outputBuffer = ByteBuffer.allocateDirect(outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2] * outputTensorShape[3] * 4);
        }
        this.outputMapByte = new byte[this.outputBuffer.capacity()];
        this.inputData = new TFImageData(this.inputHeight, this.inputWidth, z, false);
    }

    private byte[] getOutputMapByte(ByteBuffer byteBuffer, byte[] bArr, boolean z) {
        int i = this.inputHeight;
        int i2 = this.inputWidth;
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        for (int i3 = 0; i3 < i * i2; i3++) {
            int i4 = (i3 * 4) + arrayOffset;
            float intBitsToFloat = Float.intBitsToFloat(((array[i4 + 3] & 255) << 24) | (array[i4] & 255) | ((array[i4 + 1] & 255) << 8) | ((array[i4 + 2] & 255) << 16));
            if (z) {
                intBitsToFloat = sigmoid(intBitsToFloat, 0.5f, 20.0f);
            }
            bArr[i3] = (byte) (intBitsToFloat * 255.0f);
        }
        return bArr;
    }

    private float sigmoid(float f, float f2, float f3) {
        return (float) (1.0d / (Math.exp((-(f - f2)) * f3) + 1.0d));
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public int getInputHeight() {
        return this.inputHeight;
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public int getInputWidth() {
        return this.inputWidth;
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public boolean isGPUInited() {
        return this.interpreterWrapper.isGPUInited();
    }

    public boolean isUseGPUPass() {
        return this.useGPUPass;
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public Bitmap segment(FrameHolder frameHolder) {
        this.inputData.fromBitmap(frameHolder.getCPUFrame());
        this.outputBuffer.clear();
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.outputBuffer);
        this.interpreterWrapper.runForMultipleInputsOutputs(new Object[]{this.inputData.buffer}, hashMap);
        if (this.isQuantized) {
            this.outputMapByte = this.outputBuffer.array();
        } else {
            this.outputMapByte = getOutputMapByte(this.outputBuffer, this.outputMapByte, false);
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.inputWidth, this.inputHeight, Bitmap.Config.ALPHA_8);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.outputMapByte));
        return createBitmap;
    }

    @Override // ru.ok.tensorflow.tflite.Model, ru.ok.segmentation_full.segmentation.ISegmenter
    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        super.startInitGPU(glThreadWithSharedContext);
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        return tFFrameType != this.useFrameIndex ? 0 : 1;
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public boolean wantRunWithGPUPass() {
        return this.useGPUPass && this.interpreterWrapper.isGPUInited();
    }
}
