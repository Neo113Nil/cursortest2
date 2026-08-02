package ru.ok.gl.tf.factory;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.face.mesh.FaceMeshRegressor;
import ru.ok.face.pipeline.FaceDetectionPipeline;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.smoothing.DetectionMerger;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.tracking.TrackerWrapper;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;
import xsna.wm8;
import xsna.xr;

/* loaded from: classes9.dex */
public class FaceDetectionFactory {
    private final Logger logger;
    private int threadCount;
    private boolean useGPU;
    private boolean useGPUPass;

    public FaceDetectionFactory(int i, boolean z, boolean z2, @NonNull Logger logger) {
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
        this.useGPUPass = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DetectionSmoother lambda$create$0(Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.009f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.006f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, detection, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$1(Detector detector, Runnable runnable) {
        try {
            detector.initInterpreter(this.threadCount, Util.DelegateType.GPU, false, Util.Api2BufferType.None, null).get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }

    public FaceDetectionPipeline create(DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        List asList = Arrays.asList(new Pair(8, 2), new Pair(16, 6));
        HashMap hashMap = new HashMap();
        hashMap.put(0, "human face");
        Detector detector = new Detector(supplier1.get(TensorflowModel.FACE_DETECTION), asList, false, true, 0.9f, 0.1f, hashMap, weakReference, weakReference2, this.useGPUPass, this.logger);
        FaceDetectionPipeline faceDetectionPipeline = new FaceDetectionPipeline(detector, new FaceMeshRegressor(supplier1.get(TensorflowModel.FACE_LANDMARK), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6666667f, true, true, false, weakReference, weakReference2, this.useGPUPass, null), new TrackerWrapper(1.2f, 1.2f, 2.0f), new Smoother(new DetectionMerger(1.5f, 1.5f), 15, new xr(17)), this.logger);
        if (this.useGPU && !this.useGPUPass) {
            delegateManager.submit(new wm8(this, detector, runnable, 3));
        }
        return faceDetectionPipeline;
    }
}
