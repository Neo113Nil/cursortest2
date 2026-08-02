package ru.ok.gl.tf.factory;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.smoothing.SmootherSimple;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Function;
import ru.ok.tensorflow.util.Logger;
import xsna.e10;
import xsna.r11;

/* loaded from: classes9.dex */
public class FaceMorphingFactory {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private GpuCache gpuCache;
    private final Logger logger;
    private TensorflowModel model;
    private int threadCount;
    private boolean useGPU;
    private boolean useGPUPass;

    public FaceMorphingFactory(TensorflowModel tensorflowModel, int i, boolean z, boolean z2, GpuCache gpuCache, @NonNull Logger logger) {
        this.model = tensorflowModel;
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
        this.useGPUPass = z2;
        this.gpuCache = gpuCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Float lambda$create$0(Float f) {
        float min = Math.min(f.floatValue() / 0.1f, 1.0f);
        return Float.valueOf((0.13000001f * min * min) + 0.02f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DetectionSmoother lambda$create$1(Function function, Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.09f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, detection, 0L, function);
    }

    public FaceMorphingPipeline create(DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        List asList = Arrays.asList(new Pair(8, 2), new Pair(16, 6));
        HashMap hashMap = new HashMap();
        hashMap.put(0, "human face");
        return new FaceMorphingPipeline(new Detector(supplier1.get(TensorflowModel.FACE_DETECTION), asList, false, false, 0.5f, 0.5f, hashMap, weakReference, weakReference2, false, this.logger), 1, 0, new FaceMorphingProcessor(supplier1.get(this.model), 0.2f, 0.5555556f, false, false, false, weakReference, weakReference2, this.useGPUPass, this.gpuCache), 0.5f, 0.95f, new SmootherSimple(new e10(new r11(13), 26)), null, 8, 9, 36, 45, 90.0f, 1.0f);
    }
}
