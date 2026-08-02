package ru.ok.face.gpu;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLProgram;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.GlUtil;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.Model;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.to2;

/* loaded from: classes9.dex */
public abstract class BaseFaceProcessor extends Model implements IBaseGPUProcessor {
    static final String SAVING_PATH = "/sdcard/Download/tensorflow/";
    protected Bitmap crop;
    protected int cropHeight;
    protected float cropScaleFactor;
    protected float cropTranslationFactor;
    protected int cropWidth;
    int frameIdx;
    protected FrameBuffer gpuCroppedBuffer;
    protected GLSSBO inputBuffer;
    protected TFImageData inputData;
    protected boolean is3D;
    protected FloatBuffer outputBufferLocations;
    protected FloatBuffer outputBufferScore;
    protected GLSSBO outputLocationsBufferGPU;
    protected Map<Integer, Object> outputMap;
    protected GLSSBO outputScoresBufferGPU;
    protected boolean withAngles;
    protected boolean zeroMean;

    public BaseFaceProcessor(@NonNull ModelDataProvider modelDataProvider, float f, float f2, boolean z, boolean z2, boolean z3, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, boolean z4, GpuCache gpuCache) {
        super(modelDataProvider, Util.DelegateType.GPU, z4 ? Util.Api2BufferType.PassGPU : Util.Api2BufferType.None, gpuCache, weakReference, weakReference2);
        int i;
        int i2;
        int i3;
        int i4;
        this.frameIdx = 0;
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
        this.outputBufferLocations = FloatBuffer.allocate(i * i2);
        int[] outputTensorShape2 = this.interpreterWrapper.getOutputTensorShape(1);
        if (outputTensorShape2.length == 4) {
            i3 = outputTensorShape2[0] * outputTensorShape2[1] * outputTensorShape2[2];
            i4 = outputTensorShape2[3];
        } else {
            i3 = outputTensorShape2[0] * outputTensorShape2[1];
            i4 = outputTensorShape2[2];
        }
        this.outputBufferScore = FloatBuffer.allocate(i3 * i4);
        HashMap hashMap = new HashMap();
        this.outputMap = hashMap;
        hashMap.put(0, this.outputBufferLocations);
        this.outputMap.put(1, this.outputBufferScore);
        this.zeroMean = z;
        this.inputData = new TFImageData(this.cropHeight, this.cropWidth, false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$0() {
        this.gpuCroppedBuffer.release();
    }

    private static Bitmap rasterizeTexture(int i, int i2, int i3) {
        FrameBuffer frameBuffer = new FrameBuffer(i, i2, i3);
        frameBuffer.bind();
        Bitmap saveCurrentRenderTarget = GlUtil.saveCurrentRenderTarget(i2, i3);
        frameBuffer.unbind();
        return saveCurrentRenderTarget;
    }

    private static void saveBitmap(Bitmap bitmap, String str, String str2) {
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(str + DomExceptionUtils.SEPARATOR + str2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public float[] extract2D(float[] fArr) {
        float[] fArr2 = new float[(fArr.length / 3) * 2];
        for (int i = 0; i < fArr.length / 3; i++) {
            int i2 = i * 2;
            int i3 = i * 3;
            fArr2[i2] = fArr[i3];
            fArr2[i2 + 1] = fArr[i3 + 1];
        }
        return fArr2;
    }

    @Override // ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        if (this.gpuResourcesInited) {
            return;
        }
        initConvertShader(this.cropWidth, this.cropHeight, this.zeroMean);
        createCopyShader();
        if (this.gpuCroppedBuffer == null) {
            this.gpuCroppedBuffer = new FrameBuffer(this.cropWidth, this.cropHeight);
            addGPUResourse(new to2(this, 2));
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
        super.initGPUResources();
    }

    @Override // ru.ok.face.gpu.IBaseGPUProcessor
    public boolean isGPUInited() {
        return this.interpreterWrapper.isGPUInited();
    }

    public float[] merge2DAnd3D(float[] fArr, float[] fArr2, float f) {
        for (int i = 0; i < fArr.length / 3; i++) {
            int i2 = i * 3;
            int i3 = i * 2;
            fArr[i2] = fArr2[i3];
            fArr[i2 + 1] = fArr2[i3 + 1];
            int i4 = i2 + 2;
            fArr[i4] = fArr[i4] * f;
        }
        return fArr;
    }

    public abstract Object[] prepareCPUInput();

    public abstract Map<Integer, Object> prepareCPUOutput();

    public GLProgram prepareGPUCrop(FrameHolder frameHolder, Detection detection) {
        return this.copyProgram;
    }

    public abstract Object[] prepareGPUInput();

    public abstract Map<Integer, Object> prepareGPUOutput(FrameHolder frameHolder);

    public FaceFigure processBaseResults(Detection detection, Matrix matrix, boolean z) {
        float[] copyOfRange;
        float[] fArr;
        float f = this.outputBufferScore.array()[0];
        Detection updateScore = detection.updateScore(f);
        float[] array = this.outputBufferLocations.array();
        if (this.withAngles) {
            copyOfRange = Arrays.copyOfRange(array, 0, array.length - 3);
            fArr = Arrays.copyOfRange(array, array.length - 3, array.length);
            fArr[2] = (updateScore.angleDegrees.floatValue() - 90.0f) + fArr[2];
        } else {
            copyOfRange = Arrays.copyOfRange(array, 0, array.length);
            fArr = new float[9];
        }
        float[] fArr2 = fArr;
        float[] extract2D = this.is3D ? extract2D(copyOfRange) : copyOfRange;
        matrix.mapPoints(extract2D);
        if (z) {
            copyOfRange = merge2DAnd3D(copyOfRange, extract2D, 100.0f / this.cropWidth);
        }
        return new FaceFigure(updateScore, z ? copyOfRange : extract2D, f, fArr2, z);
    }

    public abstract void processCPUOutput();

    public abstract void processGPUOutput();

    public Matrix runModel(FrameHolder frameHolder, Detection detection, boolean z, boolean z2) {
        Matrix transformation = detection.getTransformation(this.cropWidth, this.cropHeight, this.cropTranslationFactor, this.cropScaleFactor, true);
        Matrix matrix = new Matrix();
        transformation.invert(matrix);
        startInitGPU(null);
        if (!z2) {
            Bitmap extractCrop = detection.extractCrop(frameHolder.getCPUFrame(), this.cropWidth, this.cropHeight, transformation);
            this.crop = extractCrop;
            runModel(extractCrop);
            return matrix;
        }
        initGPUResources();
        GLProgram prepareGPUCrop = prepareGPUCrop(frameHolder, detection);
        System.currentTimeMillis();
        detection.extractCropGPU(frameHolder, this.cropWidth, this.cropHeight, transformation, this.gpuCroppedBuffer, prepareGPUCrop);
        System.currentTimeMillis();
        this.gpuCroppedBuffer.detachTexture();
        runModelGPU(new FrameHolder(this.gpuCroppedBuffer.getTextureId(), this.cropWidth, this.cropHeight));
        this.gpuCroppedBuffer.attachTexture();
        return matrix;
    }

    public void runModelGPU(FrameHolder frameHolder) {
        Map<Integer, Object> prepareGPUOutput = prepareGPUOutput(frameHolder);
        Object[] prepareGPUInput = prepareGPUInput();
        GlUtil.syncGL();
        System.currentTimeMillis();
        this.interpreterWrapper.runForMultipleInputsOutputsGPU(prepareGPUInput, prepareGPUOutput);
        System.currentTimeMillis();
        processGPUOutput();
    }

    private void runModel(Bitmap bitmap) {
        this.interpreterWrapper.runForMultipleInputsOutputs(prepareCPUInput(), prepareCPUOutput());
        processCPUOutput();
    }
}
