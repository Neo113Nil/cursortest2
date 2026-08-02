package ru.ok.tensorflow.classification;

import android.graphics.Bitmap;
import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gl.objects.GLSSBO;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.PalmClass;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.Model;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.TFImageData;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;
import xsna.wk;

/* loaded from: classes9.dex */
public class Classifier extends Model {
    protected List<Pair<PalmClass, Float>> classesWithThresholds;
    protected Bitmap crop;
    protected int cropHeight;
    protected float cropScaleFactor;
    protected float cropTranslationFactor;
    protected int cropWidth;
    protected FrameBuffer gpuCroppedBuffer;
    protected GLSSBO inputBufferGPU;
    protected final TFImageData inputData;
    protected final Logger logger;
    protected float[][] outputClasses;

    public Classifier(@NonNull ModelDataProvider modelDataProvider, List<Pair<PalmClass, Float>> list, float f, float f2, boolean z, GpuCache gpuCache, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2, @NonNull Logger logger) {
        super(modelDataProvider, Util.DelegateType.CPU, z ? Util.Api2BufferType.PassGPU : Util.Api2BufferType.None, gpuCache, weakReference, weakReference2);
        this.logger = logger;
        this.classesWithThresholds = list;
        this.cropTranslationFactor = f;
        this.cropScaleFactor = f2;
        int[] inputTensorShape = this.interpreterWrapper.getInputTensorShape(0);
        this.cropHeight = inputTensorShape[1];
        this.cropWidth = inputTensorShape[2];
        int[] outputTensorShape = this.interpreterWrapper.getOutputTensorShape(0);
        this.outputClasses = (float[][]) Array.newInstance((Class<?>) Float.TYPE, outputTensorShape[0], outputTensorShape[1]);
        this.inputData = new TFImageData(this.cropHeight, this.cropWidth, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initGPUResources$0() {
        this.gpuCroppedBuffer.release();
    }

    public Map<PalmClass, Float> classify(Bitmap bitmap) {
        this.inputData.fromBitmap(bitmap);
        this.interpreterWrapper.run(this.inputData.buffer, this.outputClasses);
        return getClasses(this.outputClasses[0], this.classesWithThresholds);
    }

    public List<Recognition> classifyCPU(FrameHolder frameHolder, List<Detection> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Detection detection : list) {
            Bitmap extractCrop = detection.extractCrop(frameHolder.getCPUFrame(), this.cropWidth, this.cropHeight, this.cropTranslationFactor, this.cropScaleFactor, true);
            this.crop = extractCrop;
            Map<PalmClass, Float> classify = classify(extractCrop);
            PalmClass palmClass = PalmClass.NOT_HAND;
            Pair<PalmClass, Float> pair = classify.containsKey(palmClass) ? new Pair<>(palmClass, classify.get(palmClass)) : getMax(classify);
            arrayList.add(new Recognition((PalmClass) pair.first, (Float) pair.second, detection));
        }
        return arrayList;
    }

    public List<Recognition> classifyGPU(FrameHolder frameHolder, List<Detection> list, @Nullable Boolean bool) {
        throw new RuntimeException("Need implement");
    }

    public void copyInput(FrameHolder frameHolder) {
        throw new RuntimeException("Need implement");
    }

    public Map<PalmClass, Float> getClasses(float[] fArr, List<Pair<PalmClass, Float>> list) {
        ArrayMap arrayMap = new ArrayMap();
        for (int i = 0; i < fArr.length; i++) {
            float floatValue = fArr[i] - ((Float) list.get(i).second).floatValue();
            if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayMap.put((PalmClass) list.get(i).first, Float.valueOf(floatValue));
            }
        }
        return arrayMap;
    }

    public Pair<PalmClass, Float> getMax(Map<PalmClass, Float> map) {
        PalmClass palmClass = PalmClass.NOT_SURE;
        float f = Float.NEGATIVE_INFINITY;
        for (Map.Entry<PalmClass, Float> entry : map.entrySet()) {
            Float value = entry.getValue();
            if (value.floatValue() > f) {
                float floatValue = value.floatValue();
                f = floatValue;
                palmClass = entry.getKey();
            }
        }
        return new Pair<>(palmClass, Float.valueOf(f));
    }

    @Override // ru.ok.tensorflow.tflite.Model
    public void initGPUResources() {
        initConvertShader(this.cropWidth, this.cropHeight, false);
        if (this.inputBufferGPU == null) {
            this.inputBufferGPU = createSSBO(this.inputData.buffer.capacity());
        }
        if (this.gpuCroppedBuffer == null) {
            this.gpuCroppedBuffer = new FrameBuffer(this.cropWidth, this.cropHeight);
            addGPUResourse(new wk(this, 5));
        }
        super.initGPUResources();
    }

    public void setThresholds(List<Pair<PalmClass, Float>> list) {
        this.classesWithThresholds = list;
    }

    public boolean wantRunWithGPUPass() {
        throw new RuntimeException("Need implement");
    }
}
