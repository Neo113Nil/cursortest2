package ru.ok.gl.tf.factory;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.face.mesh.FaceMeshRegressorRecurrent;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.ArraySmoother;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.smoothing.SmootherSimple;
import ru.ok.tensorflow.smoothing.filter.IFilter;
import ru.ok.tensorflow.smoothing.filter.OneEuroFilterCyclic;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;
import xsna.r0a;
import xsna.rr;
import xsna.zn;

/* loaded from: classes9.dex */
public class CatMeshFactory {
    private GpuCache gpuCache;
    private final Logger logger;
    private int threadCount;
    private boolean useGPU;
    private boolean useGPUPass;

    public CatMeshFactory(int i, boolean z, boolean z2, GpuCache gpuCache, @NonNull Logger logger) {
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
        this.useGPUPass = z2;
        this.gpuCache = gpuCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DetectionSmoother lambda$create$0(Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.05f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.05f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, detection, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IFilter lambda$create$1(Long l, Float f) {
        return new OneEuroFilterCyclic(l.longValue(), f.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.001f, 1.0f, 360.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$2(FaceMeshRegressorRecurrent faceMeshRegressorRecurrent, Runnable runnable) {
        try {
            faceMeshRegressorRecurrent.initInterpreter(this.threadCount, Util.DelegateType.GPU, false, Util.Api2BufferType.None, this.gpuCache).get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }

    public FrugalKeypointPipeline create(DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        List asList = Arrays.asList(new Pair(8, 2), new Pair(16, 2), new Pair(32, 6));
        HashMap hashMap = new HashMap();
        hashMap.put(1, "cat face");
        Detector detector = new Detector(supplier1.get(TensorflowModel.CAT_FACE_DETECTION), asList, false, false, 0.2f, 0.5f, hashMap, weakReference, weakReference2, false, this.logger);
        FaceMeshRegressorRecurrent faceMeshRegressorRecurrent = new FaceMeshRegressorRecurrent(supplier1.get(TensorflowModel.CAT_FACE_LANDMARK), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4761905f, false, false, true, weakReference, weakReference2, this.useGPUPass, this.gpuCache);
        FrugalKeypointPipeline frugalKeypointPipeline = new FrugalKeypointPipeline(detector, 1, 200, faceMeshRegressorRecurrent, 0.5f, 0.4f, new SmootherSimple(new rr(8)), new ArraySmoother(new zn(8)), 4, 5, 0, 1, 90.0f, 1.0f);
        if (this.useGPU && !this.useGPUPass) {
            delegateManager.submit(new r0a(this, faceMeshRegressorRecurrent, runnable, 0));
        }
        return frugalKeypointPipeline;
    }
}
