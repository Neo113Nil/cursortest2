package ru.ok.gl.tf.factory;

import android.graphics.BitmapFactory;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.util.Supplier1;
import ru.ok.pattern.keypoints.KeypointPatternMatcher;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.pattern.smoothing.RotationSmoother;
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
import xsna.vy4;
import xsna.zq;

/* loaded from: classes9.dex */
public class BodyPatternMatchingFactory {
    private final Logger logger;
    private int threadCount;
    private boolean useGPU;

    public enum Pattern {
        CLIPS_WHITE("templates/clips_white.jpg"),
        CLIPS_BLACK("templates/clips_black.jpg");

        public final String path;

        Pattern(String str) {
            this.path = str;
        }
    }

    public BodyPatternMatchingFactory(int i, boolean z, @NonNull Logger logger) {
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DetectionSmoother lambda$create$0(Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.008f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.004f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, detection, 0L);
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

    public BodyPatternMatchingPipeline create(Pattern pattern, DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        List asList = Arrays.asList(new Pair(8, 2), new Pair(16, 6));
        HashMap hashMap = new HashMap();
        hashMap.put(0, "human face");
        Detector detector = new Detector(supplier1.get(TensorflowModel.FACE_DETECTION), asList, false, false, 0.8f, 0.1f, hashMap, weakReference, weakReference2, false, this.logger);
        try {
            BodyPatternMatchingPipeline bodyPatternMatchingPipeline = new BodyPatternMatchingPipeline(detector, 2.5f, 2.45f, new KeypointPatternMatcher(BitmapFactory.decodeStream(delegateManager.getContext().getAssets().open(pattern.path)), 300, 300, 0.75f, true), 2, 5, new TrackerWrapper(0.9f, 1.2f, 2.0f), new Smoother(new DetectionMerger(1.5f, 1.5f), 15, new zq(5)), new RotationSmoother(0.85f, 0.85f, 0.8f, 12.566371f, 12.566371f, 12.566371f), 800.0f, 0.75f);
            if (this.useGPU) {
                delegateManager.submit(new vy4(this, detector, runnable, 1));
            }
            return bodyPatternMatchingPipeline;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
