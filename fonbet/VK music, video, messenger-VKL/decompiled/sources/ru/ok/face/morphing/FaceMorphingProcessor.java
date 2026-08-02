package ru.ok.face.morphing;

import android.graphics.Matrix;
import android.opengl.GLES20;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.TFFrameType;
import ru.ok.face.entity.FaceMorphingFigure;
import ru.ok.face.gpu.BaseFaceProcessor;
import ru.ok.gl.objects.GLComputerProgram;
import ru.ok.gl.objects.GLProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.objects.Texture2D;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.a72;
import xsna.gv2;
import xsna.hv2;
import xsna.kv3;
import xsna.wk;
import xsna.z27;

/* loaded from: classes9.dex */
public class FaceMorphingProcessor extends BaseFaceProcessor implements IFaceMorphingProcessor {
    public static final String FLOAT_BUFFER1_TO_BYTE_BUFFER = "#version 310 es\nlayout(local_size_x = 64)  in;\nstruct SSBOBlock\n{\n  uint data;\n};\nlayout(std430) buffer;\nlayout(binding = 1) writeonly buffer Output { SSBOBlock elements[]; } output_data;\nlayout(binding = 2) readonly buffer Input0  { float elements[]; } input_data;\nvoid main() \n{\noutput_data.elements[gl_GlobalInvocationID.x].data = packUnorm4x8(vec4(input_data.elements[gl_GlobalInvocationID.x]));\n}\n";
    public static final String FLOAT_BUFFER3_TO_BYTE_BUFFER = "#version 310 es\nlayout(local_size_x = 8, local_size_y = 8) in;\nstruct SSBOBlock\n{\n  uint data;\n};\nlayout(std430) buffer;\nlayout(binding = 1) writeonly buffer Output { SSBOBlock elements[]; } output_data;\nlayout(binding = 2) readonly buffer Input0  { float elements[]; } input_data;\nuniform int width;\nuniform int height;\nvoid main() \n{\nivec2 gid = ivec2(gl_GlobalInvocationID.xy);\nif (gid.x >= width || gid.y >= height) return;\nint linear_index_out  = (gid.y * width + gid.x);\nint linear_index_in   = (gid.y * width + gid.x) * 3;\noutput_data.elements[linear_index_out].data = packUnorm4x8(vec4(input_data.elements[linear_index_in + 2], input_data.elements[linear_index_in + 1], input_data.elements[linear_index_in + 0], 1.0));\n}\n";
    private static final String FRAGMENT_SHADER_UNI_TEXTURE_ALPHA = "texAlpha";
    private static final String FRAGMENT_SOURCE_CROP = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float texAlpha;\nuniform float scaleFactor;\nuniform float width;\nuniform float height;\nuniform int maxIndex;\nuniform int minIndex;\nuniform float leftEdge;\nuniform float rightEdge;\nvec4 tex2DArea( sampler2D textureSampler_i, vec2 texCoord_i, vec2 pixelSize ) {\nvec4 sumColor = vec4(0.0);\nivec2 indexesMax = ivec2(maxIndex, maxIndex);\nivec2 indexesMin = ivec2(minIndex, minIndex);\nfor (int m = minIndex; m <= maxIndex; m++) {\nfor (int n = minIndex; n <= maxIndex; n++) {\nfloat factorX = 1.0;\nfloat factorY = 1.0;\nif (m == minIndex) {\nfactorX *= leftEdge;\n}\nif (m == maxIndex) {\nfactorX *= rightEdge;\n}\nif (n == minIndex) {\nfactorY *= leftEdge;\n}\nif (n == maxIndex) {\nfactorY *= rightEdge;\n}\nsumColor += factorX * factorY *\n  texture2D(textureSampler_i, texCoord_i + pixelSize * vec2(float( m ), float( n )));\n}\n}\nreturn sumColor / (scaleFactor * scaleFactor);\n}\nvoid main() {\nvec2 pixelSize = vec2(1.0 / width, 1.0 / height);\nvec4 tempColor = tex2DArea( sTexture, vTextureCoord, pixelSize);\ntempColor *= texAlpha;\ngl_FragColor = tempColor;\n}";
    protected GLComputerProgram copyBuffers1;
    protected GLComputerProgram copyBuffers3;
    protected SimpleGLProgram copyProgramEx;
    protected Texture2D imageTextureOutput;
    protected Texture2D maskTextureOutput;
    protected int[] outputBufferImage;
    protected int outputBufferImageSize;
    protected int[] outputBufferMask;
    protected int outputBufferMaskSize;
    protected FloatBuffer outputBufferWarpMap;
    protected GLSSBO outputImageBufferGPU;
    protected Map<Integer, Object> outputMap;
    protected GLSSBO outputMaskBufferGPU;
    protected GLSSBO outputWarpMapBufferGPU;
    protected Texture2D warpTextureOutput;

    public FaceMorphingProcessor(@NonNull ModelDataProvider modelDataProvider, float f, float f2, boolean z, boolean z2, boolean z3, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, boolean z4, GpuCache gpuCache) {
        super(modelDataProvider, f, f2, z, z2, z3, weakReference, weakReference2, z4, gpuCache);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.cropTranslationFactor = f;
        this.cropScaleFactor = f2;
        this.is3D = z2;
        this.withAngles = z3;
        this.useGPUPass = z4;
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(0);
        this.cropHeight = inputTensorShape[1];
        this.cropWidth = inputTensorShape[2];
        int[] outputTensorShape = this.interpreterWrapper.getOutputTensorShape(0);
        if (outputTensorShape.length == 4) {
            i = outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2];
            i2 = outputTensorShape[3];
        } else {
            i = outputTensorShape[0] * outputTensorShape[1];
            i2 = outputTensorShape[2];
        }
        this.outputBufferImageSize = i * i2;
        this.outputBufferImage = new int[outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2]];
        int[] outputTensorShape2 = this.interpreterWrapper.getOutputTensorShape(1);
        if (outputTensorShape2.length == 4) {
            i3 = outputTensorShape2[0] * outputTensorShape2[1] * outputTensorShape2[2];
            i4 = outputTensorShape2[3];
        } else {
            i3 = outputTensorShape2[0] * outputTensorShape2[1];
            i4 = outputTensorShape2[2];
        }
        this.outputBufferMaskSize = i3 * i4;
        this.outputBufferMask = new int[outputTensorShape2[0] * outputTensorShape2[1] * outputTensorShape2[2]];
        int[] outputTensorShape3 = this.interpreterWrapper.getOutputTensorShape(2);
        if (outputTensorShape3.length == 4) {
            i5 = outputTensorShape3[0] * outputTensorShape3[1] * outputTensorShape3[2];
            i6 = outputTensorShape3[3];
        } else {
            i5 = outputTensorShape3[0] * outputTensorShape3[1];
            i6 = outputTensorShape3[2];
        }
        this.outputBufferLocations = FloatBuffer.allocate(i5 * i6);
        int[] outputTensorShape4 = this.interpreterWrapper.getOutputTensorShape(3);
        if (outputTensorShape4.length == 4) {
            i7 = outputTensorShape4[0] * outputTensorShape4[1] * outputTensorShape4[2];
            i8 = outputTensorShape4[3];
        } else {
            i7 = outputTensorShape4[0] * outputTensorShape4[1];
            i8 = outputTensorShape4[2];
        }
        this.outputBufferScore = FloatBuffer.allocate(i7 * i8);
        int[] outputTensorShape5 = this.interpreterWrapper.getOutputTensorShape(4);
        if (outputTensorShape5.length == 4) {
            i9 = outputTensorShape5[0] * outputTensorShape5[1] * outputTensorShape5[2];
            i10 = outputTensorShape5[3];
        } else {
            i9 = outputTensorShape5[0] * outputTensorShape5[1];
            i10 = outputTensorShape5[2];
        }
        this.outputBufferWarpMap = FloatBuffer.allocate(i9 * i10);
        HashMap hashMap = new HashMap();
        this.outputMap = hashMap;
        hashMap.put(0, this.outputBufferImage);
        this.outputMap.put(1, this.outputBufferMask);
        this.outputMap.put(2, this.outputBufferLocations);
        this.outputMap.put(3, this.outputBufferScore);
        this.outputMap.put(4, this.outputBufferWarpMap);
        this.zeroMean = z;
        this.inputData = new TFImageData(this.cropHeight, this.cropWidth, false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$0() {
        this.imageTextureOutput.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$1() {
        this.maskTextureOutput.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$2() {
        this.warpTextureOutput.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$3() {
        this.copyProgramEx.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$4() {
        this.copyBuffers3.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$5() {
        this.copyBuffers1.release();
    }

    private static void saveMatrixAndScore(String str, String str2, Matrix matrix, float f) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str + DomExceptionUtils.SEPARATOR + str2, true));
            try {
                bufferedWriter.append((CharSequence) (Arrays.toString(fArr) + System.lineSeparator() + "score is: " + f));
                bufferedWriter.close();
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor, ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        if (this.gpuResourcesInited) {
            return;
        }
        if (this.outputImageBufferGPU == null) {
            this.outputImageBufferGPU = createSSBO(this.outputBufferImageSize * 4);
        }
        if (this.imageTextureOutput == null) {
            this.imageTextureOutput = new Texture2D(this.cropWidth, this.cropHeight, 32856);
            addGPUResourse(new kv3(this, 8));
        }
        if (this.outputMaskBufferGPU == null) {
            this.outputMaskBufferGPU = createSSBO(this.outputBufferMaskSize * 4);
        }
        if (this.maskTextureOutput == null) {
            this.maskTextureOutput = new Texture2D(this.cropWidth, this.cropHeight, 32856);
            addGPUResourse(new wk(this, 11));
        }
        if (this.outputLocationsBufferGPU == null) {
            this.outputLocationsBufferGPU = createSSBO(this.outputBufferLocations.capacity() * 4);
        }
        if (this.outputWarpMapBufferGPU == null) {
            this.outputWarpMapBufferGPU = createSSBO(this.outputBufferWarpMap.capacity() * 4);
        }
        if (this.warpTextureOutput == null) {
            this.warpTextureOutput = new Texture2D(this.cropWidth, this.cropHeight, 34842);
            addGPUResourse(new gv2(this, 8));
        }
        if (this.copyProgramEx == null) {
            this.copyProgramEx = new SimpleGLProgram(FRAGMENT_SOURCE_CROP);
            addGPUResourse(new a72(this, 10));
        }
        if (this.copyBuffers3 == null) {
            this.copyBuffers3 = new GLComputerProgram(FLOAT_BUFFER3_TO_BYTE_BUFFER);
            addGPUResourse(new hv2(this, 6));
        }
        if (this.copyBuffers1 == null) {
            this.copyBuffers1 = new GLComputerProgram(FLOAT_BUFFER1_TO_BYTE_BUFFER);
            addGPUResourse(new z27(this, 3));
        }
        super.initGPUResources();
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Object[] prepareCPUInput() {
        return new Object[]{this.inputData.buffer};
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Map<Integer, Object> prepareCPUOutput() {
        return this.outputMap;
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public GLProgram prepareGPUCrop(FrameHolder frameHolder, Detection detection) {
        float f;
        float f2;
        GLES20.glBindTexture(3553, frameHolder.getGPUFrame());
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        float min = Math.min(Math.max(detection.getWidth() / (this.cropWidth * this.cropScaleFactor), 1.001f), 3.999f);
        this.copyProgramEx.setCustomParameter("scaleFactor", min);
        this.copyProgramEx.setCustomParameter("width", frameHolder.getWidth());
        this.copyProgramEx.setCustomParameter("height", frameHolder.getHeight());
        float ceil = (float) Math.ceil(min);
        int i = (int) (ceil / 2.0d);
        int i2 = -((r1 - i) - 1);
        if (((int) ceil) == 2) {
            f = 1.0f;
            f2 = min - 1.0f;
        } else {
            f = (min - (ceil - 2.0f)) / 2.0f;
            f2 = f;
        }
        this.copyProgramEx.setCustomParameter("maxIndex", i);
        this.copyProgramEx.setCustomParameter("minIndex", i2);
        this.copyProgramEx.setCustomParameter("leftEdge", f);
        this.copyProgramEx.setCustomParameter("rightEdge", f2);
        return this.copyProgramEx;
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Object[] prepareGPUInput() {
        return new Object[]{Integer.valueOf(this.inputBuffer.getId())};
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public Map<Integer, Object> prepareGPUOutput(FrameHolder frameHolder) {
        copyTextureToBuffer(frameHolder, this.inputBuffer);
        HashMap hashMap = new HashMap();
        hashMap.put(0, Integer.valueOf(this.outputImageBufferGPU.getId()));
        hashMap.put(1, Integer.valueOf(this.outputMaskBufferGPU.getId()));
        hashMap.put(2, Integer.valueOf(this.outputLocationsBufferGPU.getId()));
        hashMap.put(3, Integer.valueOf(this.outputScoresBufferGPU.getId()));
        hashMap.put(4, Integer.valueOf(this.outputWarpMapBufferGPU.getId()));
        return hashMap;
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public void processGPUOutput() {
        this.outputImageBufferGPU.copyDataToTexture(this.imageTextureOutput, 3, new int[]{0, 1, 2, 0});
        this.outputMaskBufferGPU.copyDataToTexture(this.maskTextureOutput, 1, new int[]{0, 0, 0, 0});
        this.outputWarpMapBufferGPU.copyDataToTexture(this.warpTextureOutput, 2, new int[]{0, 1, 0, 0});
        GlUtil.syncGL();
    }

    @Override // ru.ok.face.morphing.IFaceMorphingProcessor
    public List<FaceMorphingFigure> run(FrameHolder frameHolder, List<Detection> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Detection> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(run(frameHolder, it.next(), z));
        }
        return arrayList;
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        if (tFFrameType == TFFrameType.ORIGINAL) {
            return (this.useGPUPass && this.interpreterWrapper.isGPUInited()) ? 2 : 1;
        }
        return 0;
    }

    @Override // ru.ok.face.morphing.IFaceMorphingProcessor
    public FaceMorphingFigure run(FrameHolder frameHolder, Detection detection, boolean z) {
        boolean z2 = this.useGPUPass && this.interpreterWrapper.isGPUInited() && frameHolder.hasGPU();
        if (!z2) {
            return null;
        }
        runModel(frameHolder, detection, z, z2);
        return new FaceMorphingFigure(detection, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, 1.0f, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, z, new FaceMorphingFigure.ImageBuffer(this.imageTextureOutput), new FaceMorphingFigure.ImageBuffer(this.maskTextureOutput), new FaceMorphingFigure.ImageBuffer(this.warpTextureOutput), this.cropScaleFactor, this.cropTranslationFactor);
    }

    @Override // ru.ok.face.gpu.BaseFaceProcessor
    public void processCPUOutput() {
    }
}
