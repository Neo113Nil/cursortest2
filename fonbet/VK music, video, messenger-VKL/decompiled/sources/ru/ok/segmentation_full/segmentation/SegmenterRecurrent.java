package ru.ok.segmentation_full.segmentation;

import android.graphics.Bitmap;
import android.opengl.GLES31;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import ru.ok.TFFrameType;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.Model;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageWithMaskData;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.hv1;
import xsna.or4;
import xsna.xq70;

/* loaded from: classes9.dex */
public class SegmenterRecurrent extends Model implements ISegmenter {
    public static final String FLOAT_BUFFER_TO_BYTE_BUFFER = "#version 310 es\nlayout(local_size_x = 64) in;\nstruct SSBOBlock\n{\n  uint data;\n};\nlayout(std430) buffer;\nlayout(binding = 1) buffer Output { SSBOBlock elements[]; } output_data;\nlayout(binding = 2) buffer Input0  { vec4 elements[]; } input_data;\nvoid main() \n{\noutput_data.elements[gl_GlobalInvocationID.x].data = packUnorm4x8(input_data.elements[gl_GlobalInvocationID.x]);\n}\n";
    private static final String TAG = "SegmenterRecurrent";
    public static final String TEXTURE_TO_BUFFER_3CHANNELS_PLUS_MASK = "#version 310 es\nlayout(local_size_x = 8, local_size_y = 8) in;\nlayout(binding = 0) uniform sampler2D u_Texture0;\nlayout(std430) buffer;\nlayout(binding = 1) writeonly buffer Output  { float elements[]; } output_data;\nlayout(binding = 2) readonly  buffer Input0  { float elements[]; } prev_data;\nuniform int u_width;\nuniform int u_height;\nuniform float f_valueFactor;\nuniform float f_valueOffset;\nvoid main() \n{\nivec2 gid = ivec2(gl_GlobalInvocationID.xy);\nif (gid.x >= u_width || gid.y >= u_height) return;\nvec3 pixel = texelFetch(u_Texture0, gid, 0).xyz;\nint linear_index_in  = (gid.y * u_width + gid.x);\nint linear_index_out = 4 * linear_index_in;\nvec3 out_value = pixel * vec3(f_valueFactor) + vec3(f_valueOffset);\noutput_data.elements[linear_index_out + 0] = out_value.x;\noutput_data.elements[linear_index_out + 1] = out_value.y;\noutput_data.elements[linear_index_out + 2] = out_value.z;\noutput_data.elements[linear_index_out + 3] = prev_data.elements[linear_index_in];\n}\n";
    protected GLComputerProgram clearBuffers;
    private SegmenterConfig config;
    protected GLComputerProgram copyBuffers;
    private int inputHeight;
    private final TFImageWithMaskData inputImageWithMask;
    protected GLSSBO inputImageWithMaskGPU;
    private int inputWidth;
    private byte[] outputMapByte;
    protected GLSSBO outputMapByteGPU;
    private final ByteBuffer outputMaskBuffer;
    protected GLSSBO outputMaskBufferGPU;
    private ByteBuffer recurrentMapsInputBuffer;
    protected GLSSBO recurrentMapsInputBufferGPU;
    private ByteBuffer recurrentMapsOutputBuffer;
    protected GLSSBO recurrentMapsOutputBufferGPU;
    protected TFFrameType useFrameIndex;

    public SegmenterRecurrent(WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, @NonNull ModelDataProvider modelDataProvider, SegmenterConfig segmenterConfig, boolean z, Util.Api2BufferType api2BufferType, GpuCache gpuCache, TFFrameType tFFrameType) {
        super(modelDataProvider, (!z || api2BufferType == Util.Api2BufferType.PassGPU) ? Util.DelegateType.CPU : Util.DelegateType.GPU, api2BufferType, gpuCache, weakReference, weakReference2);
        this.config = segmenterConfig;
        this.useFrameIndex = tFFrameType;
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(0);
        int i = inputTensorShape[1];
        this.inputHeight = i;
        int i2 = inputTensorShape[2];
        this.inputWidth = i2;
        this.inputImageWithMask = new TFImageWithMaskData(i, i2, segmenterConfig.isQuantized, false);
        int[] inputTensorShape2 = this.interpreterWrapper.getInputTensorShape(1);
        int[] outputTensorShape = this.interpreterWrapper.getOutputTensorShape(0);
        if (segmenterConfig.isQuantized) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(inputTensorShape2[0] * inputTensorShape2[1] * inputTensorShape2[2] * inputTensorShape2[3]);
            this.recurrentMapsInputBuffer = allocateDirect;
            this.recurrentMapsOutputBuffer = ByteBuffer.allocateDirect(allocateDirect.capacity());
            this.outputMaskBuffer = ByteBuffer.allocateDirect(outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2] * outputTensorShape[3]);
        } else {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(inputTensorShape2[0] * inputTensorShape2[1] * inputTensorShape2[2] * inputTensorShape2[3] * 4);
            this.recurrentMapsInputBuffer = allocateDirect2;
            this.recurrentMapsOutputBuffer = ByteBuffer.allocateDirect(allocateDirect2.capacity());
            this.outputMaskBuffer = ByteBuffer.allocateDirect(outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2] * outputTensorShape[3] * 4);
        }
        this.outputMapByte = new byte[this.outputMaskBuffer.capacity() / 4];
    }

    private byte[] getOutputMapByte(ByteBuffer byteBuffer, byte[] bArr, boolean z) {
        int i = this.inputHeight;
        int i2 = this.inputWidth;
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        for (int i3 = 0; i3 < i * i2; i3++) {
            int i4 = (i3 * 4) + arrayOffset;
            bArr[i3] = (byte) (Float.intBitsToFloat(((array[i4 + 3] & 255) << 24) | (array[i4] & 255) | ((array[i4 + 1] & 255) << 8) | ((array[i4 + 2] & 255) << 16)) * 255.0f);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$1() {
        this.clearBuffers.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$2() {
        this.copyBuffers.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$segmentGPU$0(SimpleGLProgram simpleGLProgram) {
        this.recurrentMapsOutputBufferGPU.copyDataTo(this.recurrentMapsInputBufferGPU);
        this.outputMaskBufferGPU.bind(2);
        this.outputMapByteGPU.bind(1);
        this.copyBuffers.useProgram();
        GLES31.glDispatchCompute(this.outputMapByteGPU.getBufferSize() / 256, 1, 1);
        this.copyBuffers.resetProgram();
        this.outputMapByteGPU.unbind();
        this.outputMaskBufferGPU.unbind();
        GlUtil.checkGlError("сonvert to byte buffer");
        GlUtil.syncGL();
        this.outputMapByteGPU.copyDataTo(this.outputMapByte);
    }

    private float sigmoid(float f, float f2, float f3) {
        return (float) (1.0d / (Math.exp((-(f - f2)) * f3) + 1.0d));
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public void copyInputGPU(FrameHolder frameHolder) {
        initGPUResources();
        this.outputMaskBufferGPU.bind(2);
        copyTextureToBuffer(frameHolder, this.inputImageWithMaskGPU);
        this.outputMaskBufferGPU.unbind();
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public int getInputHeight() {
        return this.inputHeight;
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public int getInputWidth() {
        return this.inputWidth;
    }

    @Override // ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        if (this.gpuResourcesInited) {
            return;
        }
        initConvertShader(TEXTURE_TO_BUFFER_3CHANNELS_PLUS_MASK, this.inputWidth, this.inputHeight, false);
        createCopyShader();
        if (this.clearBuffers == null) {
            this.clearBuffers = new GLComputerProgram(GLComputerProgram.CLEAR_BUFFER_ZERO);
            addGPUResourse(new or4(this, 11));
        }
        if (this.outputMaskBufferGPU == null) {
            GLSSBO createSSBO = createSSBO(this.outputMaskBuffer.capacity());
            this.outputMaskBufferGPU = createSSBO;
            createSSBO.clearZero(this.clearBuffers);
        }
        if (this.recurrentMapsInputBufferGPU == null) {
            GLSSBO createSSBO2 = createSSBO(this.recurrentMapsInputBuffer.capacity());
            this.recurrentMapsInputBufferGPU = createSSBO2;
            createSSBO2.clearZero(this.clearBuffers);
        }
        if (this.recurrentMapsOutputBufferGPU == null) {
            this.recurrentMapsOutputBufferGPU = createSSBO(this.recurrentMapsOutputBuffer.capacity());
        }
        if (this.inputImageWithMaskGPU == null) {
            this.inputImageWithMaskGPU = createSSBO(this.inputImageWithMask.buffer.capacity());
        }
        if (this.outputMapByteGPU == null) {
            this.outputMapByteGPU = createSSBO(this.outputMaskBuffer.capacity() / 4);
        }
        if (this.copyBuffers == null) {
            this.copyBuffers = new GLComputerProgram(FLOAT_BUFFER_TO_BYTE_BUFFER);
            addGPUResourse(new hv1(this, 15));
        }
        super.initGPUResources();
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
        startInitGPU(null);
        return (wantRunWithGPUPass() && frameHolder.hasGPU()) ? segmentGPU(frameHolder) : segmentCPU(frameHolder);
    }

    public Bitmap segmentCPU(FrameHolder frameHolder) {
        Bitmap createBitmap = Bitmap.createBitmap(this.inputWidth, this.inputHeight, Bitmap.Config.ALPHA_8);
        if (frameHolder != null && frameHolder.getCPUFrame() != null && !frameHolder.getCPUFrame().isRecycled()) {
            try {
                this.inputImageWithMask.fromBitmap(frameHolder.getCPUFrame(), this.outputMaskBuffer);
                this.outputMaskBuffer.clear();
                this.recurrentMapsOutputBuffer.clear();
                HashMap hashMap = new HashMap();
                if (this.config.maskIsFirstOutput) {
                    hashMap.put(0, this.outputMaskBuffer);
                    hashMap.put(1, this.recurrentMapsOutputBuffer);
                } else {
                    hashMap.put(1, this.outputMaskBuffer);
                    hashMap.put(0, this.recurrentMapsOutputBuffer);
                }
                this.interpreterWrapper.runForMultipleInputsOutputs(new Object[]{this.inputImageWithMask.buffer, this.recurrentMapsInputBuffer}, hashMap);
                ByteBuffer byteBuffer = this.recurrentMapsInputBuffer;
                this.recurrentMapsInputBuffer = this.recurrentMapsOutputBuffer;
                this.recurrentMapsOutputBuffer = byteBuffer;
                if (this.config.isQuantized) {
                    this.outputMapByte = this.outputMaskBuffer.array();
                } else {
                    this.outputMapByte = getOutputMapByte(this.outputMaskBuffer, this.outputMapByte, false);
                }
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(this.outputMapByte));
                return createBitmap;
            } catch (IllegalStateException e) {
                Log.e(TAG, "Failed copy data from bitmap", e);
            }
        }
        return createBitmap;
    }

    public Bitmap segmentGPU(FrameHolder frameHolder) {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Integer.valueOf(this.outputMaskBufferGPU.getId()));
        hashMap.put(1, Integer.valueOf(this.recurrentMapsOutputBufferGPU.getId()));
        this.interpreterWrapper.runForMultipleInputsOutputsGPU(new Object[]{Integer.valueOf(this.inputImageWithMaskGPU.getId()), Integer.valueOf(this.recurrentMapsInputBufferGPU.getId())}, hashMap, null, new xq70(this, 10));
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
        if (tFFrameType != this.useFrameIndex) {
            return 0;
        }
        return wantRunWithGPUPass() ? 2 : 1;
    }

    @Override // ru.ok.segmentation_full.segmentation.ISegmenter
    public boolean wantRunWithGPUPass() {
        return this.useGPUPass && this.interpreterWrapper.isGPUInited();
    }
}
