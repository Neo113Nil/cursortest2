package ru.ok.tensorflow.classification;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.classification.ClassifierWithRegression;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.PalmClass;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;
import xsna.hv2;
import xsna.n7;

/* loaded from: classes9.dex */
public class ClassifierWithRegression extends Classifier {
    private FrameBuffer inputCopy;
    private FrameHolder inputCopyFrame;
    private final TFImageData inputData;
    protected FloatBuffer outputClassesBuffer;
    private GLSSBO outputClassesBufferGPU;
    protected FloatBuffer outputLocationsBuffer;
    private GLSSBO outputLocationsBufferGPU;
    private final HashMap<Integer, Object> outputMap;

    public ClassifierWithRegression(@NonNull ModelDataProvider modelDataProvider, List<Pair<PalmClass, Float>> list, float f, float f2, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, boolean z, GpuCache gpuCache, @NonNull Logger logger) {
        super(modelDataProvider, list, f, f2, z, gpuCache, weakReference, weakReference2, logger);
        int[] outputTensorShape = this.interpreterWrapper.getOutputTensorShape(0);
        this.outputClassesBuffer = FloatBuffer.allocate(outputTensorShape[0] * outputTensorShape[1] * outputTensorShape[2] * outputTensorShape[3]);
        int[] outputTensorShape2 = this.interpreterWrapper.getOutputTensorShape(1);
        this.outputLocationsBuffer = FloatBuffer.allocate(outputTensorShape2[0] * outputTensorShape2[1] * outputTensorShape2[2] * outputTensorShape2[3]);
        HashMap<Integer, Object> hashMap = new HashMap<>();
        this.outputMap = hashMap;
        hashMap.put(0, this.outputClassesBuffer);
        hashMap.put(1, this.outputLocationsBuffer);
        this.inputData = new TFImageData(this.cropHeight, this.cropWidth, false, false);
        this.useGPUPass = z;
    }

    private List<Recognition> classifyCommon(final FrameHolder frameHolder, List<Detection> list, boolean z, @Nullable Boolean bool) {
        boolean z2;
        startInitGPU(null);
        boolean z3 = bool == null || !bool.booleanValue();
        if (z && z3) {
            prepareGPUResources(frameHolder);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (final Detection detection : list) {
            if (z) {
                z2 = true;
                final boolean booleanValue = bool.booleanValue();
                runNetworkGPU(this.inputBufferGPU, z3, new InterpreterWrapper.RunnableOnGPU() { // from class: xsna.jhc
                    @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.RunnableOnGPU
                    public final void run(SimpleGLProgram simpleGLProgram) {
                        ClassifierWithRegression.this.lambda$classifyCommon$0(detection, booleanValue, frameHolder, true, simpleGLProgram);
                    }
                });
            } else {
                z2 = true;
                Bitmap extractCrop = detection.extractCrop(frameHolder.getCPUFrame(), this.cropWidth, this.cropHeight, this.cropTranslationFactor, this.cropScaleFactor, true);
                this.crop = extractCrop;
                runNetwork(extractCrop);
            }
            Map<PalmClass, Float> classes = getClasses(this.outputClassesBuffer.array(), this.classesWithThresholds);
            PalmClass palmClass = PalmClass.NOT_HAND;
            Pair<PalmClass, Float> pair = classes.containsKey(palmClass) ? new Pair<>(palmClass, classes.get(palmClass)) : getMax(classes);
            Matrix transformation = detection.getTransformation(this.cropWidth, this.cropHeight, this.cropTranslationFactor, this.cropScaleFactor, z2);
            Matrix matrix = new Matrix();
            transformation.invert(matrix);
            float[] array = this.outputLocationsBuffer.array();
            matrix.mapPoints(array);
            arrayList.add(new Recognition((PalmClass) pair.first, (Float) pair.second, detection.addLocations(array)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$classifyCommon$0(Detection detection, boolean z, FrameHolder frameHolder, boolean z2, SimpleGLProgram simpleGLProgram) {
        this.gpuCroppedBuffer.attachTexture();
        if (z) {
            frameHolder = this.inputCopyFrame;
        }
        detection.extractCropGPU(frameHolder, this.cropWidth, this.cropHeight, this.cropTranslationFactor, this.cropScaleFactor, z2, this.gpuCroppedBuffer, simpleGLProgram);
        this.gpuCroppedBuffer.detachTexture();
        copyTextureToBuffer(new FrameHolder(this.gpuCroppedBuffer.getTextureId(), this.cropWidth, this.cropHeight), this.inputBufferGPU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$2() {
        this.inputCopy.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runNetworkGPU$1(SimpleGLProgram simpleGLProgram) {
        this.outputClassesBufferGPU.copyDataTo(this.outputClassesBuffer);
        this.outputLocationsBufferGPU.copyDataTo(this.outputLocationsBuffer);
    }

    private void prepareGPUResources(FrameHolder frameHolder) {
        initGPUResources(false, frameHolder);
    }

    private void runNetwork(Bitmap bitmap) {
        this.inputData.fromBitmap(bitmap);
        this.outputClassesBuffer.clear();
        this.outputLocationsBuffer.clear();
        this.interpreterWrapper.runForMultipleInputsOutputs(new Object[]{this.inputData.buffer}, this.outputMap);
    }

    private void runNetworkGPU(GLSSBO glssbo, boolean z, InterpreterWrapper.RunnableOnGPU runnableOnGPU) {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Integer.valueOf(this.outputClassesBufferGPU.getId()));
        hashMap.put(1, Integer.valueOf(this.outputLocationsBufferGPU.getId()));
        if (!z) {
            this.interpreterWrapper.runForMultipleInputsOutputsGPU(new Object[]{Integer.valueOf(glssbo.getId())}, hashMap, runnableOnGPU, new n7(this, 8));
            return;
        }
        runnableOnGPU.run(this.copyProgram);
        this.interpreterWrapper.runForMultipleInputsOutputsGPU(new Object[]{Integer.valueOf(glssbo.getId())}, hashMap);
        this.outputClassesBufferGPU.copyDataTo(this.outputClassesBuffer);
        this.outputLocationsBufferGPU.copyDataTo(this.outputLocationsBuffer);
    }

    @Override // ru.ok.tensorflow.classification.Classifier
    public List<Recognition> classifyCPU(FrameHolder frameHolder, List<Detection> list) {
        return classifyCommon(frameHolder, list, false, Boolean.FALSE);
    }

    @Override // ru.ok.tensorflow.classification.Classifier
    public List<Recognition> classifyGPU(FrameHolder frameHolder, List<Detection> list, @Nullable Boolean bool) {
        return classifyCommon(frameHolder, list, true, bool);
    }

    @Override // ru.ok.tensorflow.classification.Classifier
    public void copyInput(FrameHolder frameHolder) {
        initGPUResources(true, frameHolder);
        this.inputCopy.attachTexture();
        copyTexture(this.inputCopy, frameHolder.getGPUFrame());
        this.inputCopy.detachTexture();
    }

    public void initGPUResources(boolean z, FrameHolder frameHolder) {
        if (this.gpuResourcesInited) {
            return;
        }
        if (this.outputClassesBufferGPU == null) {
            this.outputClassesBufferGPU = createSSBO(this.outputClassesBuffer.capacity() * 4);
        }
        if (this.outputLocationsBufferGPU == null) {
            this.outputLocationsBufferGPU = createSSBO(this.outputLocationsBuffer.capacity() * 4);
        }
        createCopyShader();
        if (z && this.inputCopy == null) {
            this.inputCopy = new FrameBuffer(frameHolder.getWidth(), frameHolder.getHeight());
            addGPUResourse(new hv2(this, 2));
            this.inputCopyFrame = new FrameHolder(this.inputCopy.getTextureId(), this.inputCopy.getWidth(), this.inputCopy.getHeight());
        }
        super.initGPUResources();
    }

    @Override // ru.ok.tensorflow.classification.Classifier
    public boolean wantRunWithGPUPass() {
        return this.useGPUPass && this.interpreterWrapper.isGPUInited();
    }
}
