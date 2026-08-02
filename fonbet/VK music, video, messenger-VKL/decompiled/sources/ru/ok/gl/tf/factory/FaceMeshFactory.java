package ru.ok.gl.tf.factory;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.face.mesh.FaceMeshRegressor;
import ru.ok.face.mesh.FaceMeshRegressorWithAttentions;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.factory.FaceMeshFactory;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.smoothing.SmootherSimple;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Function;
import ru.ok.tensorflow.util.Logger;
import xsna.eal;

/* loaded from: classes9.dex */
public class FaceMeshFactory {
    private TensorflowFaceLandmarksType faceLandmarksType;
    private GpuCache gpuCache;
    private final Logger logger;
    private int threadCount;
    private boolean useGPU;
    private boolean useGPUPass;

    public FaceMeshFactory(int i, boolean z, boolean z2, GpuCache gpuCache, TensorflowFaceLandmarksType tensorflowFaceLandmarksType, @NonNull Logger logger) {
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
        this.useGPUPass = z2;
        this.gpuCache = gpuCache;
        this.faceLandmarksType = tensorflowFaceLandmarksType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Float lambda$create$0(Float f) {
        return Float.valueOf((0.24f * ((float) Math.pow(Math.min(f.floatValue() / 0.02f, 1.0f), 2.0d))) + 0.01f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DetectionSmoother lambda$create$1(Function function, Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.faceLandmarksType == TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS ? 0.09f : 0.03f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, detection, 0L, function);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$2(FaceMeshRegressor faceMeshRegressor, Runnable runnable) {
        try {
            faceMeshRegressor.initInterpreter(this.threadCount, Util.DelegateType.GPU, false, Util.Api2BufferType.None, this.gpuCache).get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }

    public FrugalKeypointPipeline create(DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, final Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        List asList = Arrays.asList(new Pair(8, 2), new Pair(16, 6));
        HashMap hashMap = new HashMap();
        hashMap.put(0, "human face");
        Detector detector = new Detector(supplier1.get(TensorflowModel.FACE_DETECTION), asList, false, false, 0.5f, 0.5f, hashMap, weakReference, weakReference2, false, this.logger);
        final FaceMeshRegressor faceMeshRegressor = this.faceLandmarksType == TensorflowFaceLandmarksType.DEFAULT_FACE_LANDMARKS ? new FaceMeshRegressor(supplier1.get(TensorflowModel.FACE_LANDMARK), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6666667f, true, true, false, weakReference, weakReference2, this.useGPUPass, this.gpuCache) : new FaceMeshRegressorWithAttentions(supplier1.get(TensorflowModel.FACE_LANDMARK_WITH_ATTENTION), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6666667f, true, true, false, weakReference, weakReference2, this.useGPUPass, this.gpuCache);
        FrugalKeypointPipeline frugalKeypointPipeline = new FrugalKeypointPipeline(detector, 1, 50, faceMeshRegressor, 0.5f, 0.95f, new SmootherSimple(new eal(this, new c(18))), null, 8, 9, 33, 263, 90.0f, 1.0f);
        if (this.useGPU && !this.useGPUPass) {
            delegateManager.submit(new Runnable() { // from class: xsna.nhq
                @Override // java.lang.Runnable
                public final void run() {
                    FaceMeshFactory.this.lambda$create$2(faceMeshRegressor, runnable);
                }
            });
        }
        return frugalKeypointPipeline;
    }
}
