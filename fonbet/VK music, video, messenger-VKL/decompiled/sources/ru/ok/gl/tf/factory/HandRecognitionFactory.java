package ru.ok.gl.tf.factory;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.factory.HandRecognitionFactory;
import ru.ok.gl.util.Supplier1;
import ru.ok.tensorflow.classification.Classifier;
import ru.ok.tensorflow.classification.ClassifierWithRegression;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.PalmClass;
import ru.ok.tensorflow.recognition.RecognizerFrugal;
import ru.ok.tensorflow.smoothing.DetectionMerger;
import ru.ok.tensorflow.smoothing.DetectionSmoother;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.tflite.DelegateManager;
import ru.ok.tensorflow.tflite.GpuCache;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import ru.ok.tensorflow.tflite.ModelDataProvider;
import ru.ok.tensorflow.tflite.Util;
import ru.ok.tensorflow.tracking.TrackerWrapper;
import ru.ok.tensorflow.util.ExceptionHandler;
import ru.ok.tensorflow.util.Logger;
import xsna.hr;

/* loaded from: classes9.dex */
public class HandRecognitionFactory {
    public static final List<Pair<PalmClass, Float>> THRESHOLDS_DEFAULT;
    public static final List<Pair<PalmClass, Float>> THRESHOLDS_DRAWING;
    public static final List<Pair<PalmClass, Float>> THRESHOLDS_GESTURE_GAME;
    private GpuCache gpuCache;
    private final Logger logger;
    private int threadCount;
    private boolean useGPU;
    private boolean useGPUPass;

    /* renamed from: ru.ok.gl.tf.factory.HandRecognitionFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$gl$tf$factory$HandRecognitionFactory$RecognitionMode;

        static {
            int[] iArr = new int[RecognitionMode.values().length];
            $SwitchMap$ru$ok$gl$tf$factory$HandRecognitionFactory$RecognitionMode = iArr;
            try {
                iArr[RecognitionMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$gl$tf$factory$HandRecognitionFactory$RecognitionMode[RecognitionMode.DRAWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$gl$tf$factory$HandRecognitionFactory$RecognitionMode[RecognitionMode.GESTURE_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum RecognitionMode {
        DEFAULT,
        DRAWING,
        GESTURE_GAME
    }

    static {
        Float valueOf = Float.valueOf(0.8f);
        Float valueOf2 = Float.valueOf(0.9f);
        PalmClass palmClass = PalmClass.PALM;
        Pair pair = new Pair(palmClass, valueOf);
        PalmClass palmClass2 = PalmClass.OK;
        Pair pair2 = new Pair(palmClass2, valueOf);
        PalmClass palmClass3 = PalmClass.KHABIB;
        Pair pair3 = new Pair(palmClass3, valueOf2);
        PalmClass palmClass4 = PalmClass.FIST;
        Pair pair4 = new Pair(palmClass4, valueOf);
        PalmClass palmClass5 = PalmClass.VICTORY;
        Pair pair5 = new Pair(palmClass5, valueOf2);
        PalmClass palmClass6 = PalmClass.NOT_GESTURE;
        Pair pair6 = new Pair(palmClass6, valueOf);
        PalmClass palmClass7 = PalmClass.NOT_HAND;
        Float valueOf3 = Float.valueOf(0.5f);
        Pair pair7 = new Pair(palmClass7, valueOf3);
        PalmClass palmClass8 = PalmClass.THUMB_LEFT;
        Pair pair8 = new Pair(palmClass8, valueOf);
        PalmClass palmClass9 = PalmClass.THUMB_RIGHT;
        Pair pair9 = new Pair(palmClass9, valueOf);
        PalmClass palmClass10 = PalmClass.ONE;
        Pair pair10 = new Pair(palmClass10, valueOf);
        PalmClass palmClass11 = PalmClass.HEART_RIGHT;
        Pair pair11 = new Pair(palmClass11, valueOf);
        PalmClass palmClass12 = PalmClass.HEART_LEFT;
        Pair pair12 = new Pair(palmClass12, valueOf);
        PalmClass palmClass13 = PalmClass.ROCK;
        Pair pair13 = new Pair(palmClass13, valueOf);
        PalmClass palmClass14 = PalmClass.HOMMIE;
        THRESHOLDS_DEFAULT = Arrays.asList(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair(palmClass14, valueOf));
        Float valueOf4 = Float.valueOf(Float.MAX_VALUE);
        THRESHOLDS_DRAWING = Arrays.asList(new Pair(palmClass, valueOf4), new Pair(palmClass2, valueOf4), new Pair(palmClass3, valueOf4), new Pair(palmClass4, valueOf3), new Pair(palmClass5, Float.valueOf(0.95f)), new Pair(palmClass6, valueOf4), new Pair(palmClass7, valueOf3), new Pair(palmClass8, valueOf), new Pair(palmClass9, valueOf), new Pair(palmClass10, valueOf3), new Pair(palmClass11, valueOf4), new Pair(palmClass12, valueOf4), new Pair(palmClass13, valueOf4), new Pair(palmClass14, valueOf4));
        Pair pair14 = new Pair(palmClass, valueOf3);
        Pair pair15 = new Pair(palmClass2, valueOf3);
        Pair pair16 = new Pair(palmClass3, valueOf3);
        Pair pair17 = new Pair(palmClass4, valueOf3);
        Pair pair18 = new Pair(palmClass5, valueOf3);
        Pair pair19 = new Pair(palmClass6, valueOf3);
        Pair pair20 = new Pair(palmClass7, Float.valueOf(0.7f));
        Pair pair21 = new Pair(palmClass8, valueOf3);
        Pair pair22 = new Pair(palmClass9, valueOf3);
        Float valueOf5 = Float.valueOf(0.33333334f);
        THRESHOLDS_GESTURE_GAME = Arrays.asList(pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, new Pair(palmClass10, valueOf5), new Pair(palmClass11, valueOf5), new Pair(palmClass12, valueOf5), new Pair(palmClass13, valueOf3), new Pair(palmClass14, valueOf3));
    }

    public HandRecognitionFactory(int i, boolean z, boolean z2, GpuCache gpuCache, @NonNull Logger logger) {
        this.logger = logger;
        this.threadCount = i;
        this.useGPU = z;
        this.useGPUPass = z2;
        this.gpuCache = gpuCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DetectionSmoother lambda$create$0(Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.009f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.006f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, 11, 0.7f, detection, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DetectionSmoother lambda$create$1(Detection detection, Long l) {
        return new DetectionSmoother(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.009f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.006f, 0.15f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.015f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, detection, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$2(Detector detector, Classifier classifier, Runnable runnable) {
        try {
            int i = this.threadCount;
            Util.DelegateType delegateType = Util.DelegateType.GPU;
            Util.Api2BufferType api2BufferType = Util.Api2BufferType.None;
            InterpreterWrapper.InitFuture initInterpreter = detector.initInterpreter(i, delegateType, false, api2BufferType, this.gpuCache);
            InterpreterWrapper.InitFuture initInterpreter2 = classifier.initInterpreter(this.threadCount, delegateType, false, api2BufferType, this.gpuCache);
            initInterpreter.get();
            initInterpreter2.get();
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception unused) {
        }
    }

    public static void setMode(RecognizerFrugal recognizerFrugal, RecognitionMode recognitionMode) {
        int i = AnonymousClass1.$SwitchMap$ru$ok$gl$tf$factory$HandRecognitionFactory$RecognitionMode[recognitionMode.ordinal()];
        if (i == 1) {
            recognizerFrugal.setAsyncFilterAngle(false);
            recognizerFrugal.setClassifierThresholds(THRESHOLDS_DEFAULT);
        } else if (i == 2) {
            recognizerFrugal.setAsyncFilterAngle(true);
            recognizerFrugal.setClassifierThresholds(THRESHOLDS_DRAWING);
        } else {
            if (i != 3) {
                return;
            }
            recognizerFrugal.setAsyncFilterAngle(false);
            recognizerFrugal.setClassifierThresholds(THRESHOLDS_GESTURE_GAME);
        }
    }

    public RecognizerFrugal create(DelegateManager delegateManager, Supplier1<ModelDataProvider, TensorflowModel> supplier1, final Runnable runnable, WeakReference<ExceptionHandler> weakReference, WeakReference<ExceptionHandler> weakReference2) {
        final ClassifierWithRegression classifierWithRegression = new ClassifierWithRegression(supplier1.get(TensorflowModel.HAND_CLASSIFICATION), THRESHOLDS_DEFAULT, 0.5f, 0.3846154f, weakReference, weakReference2, this.useGPUPass, this.gpuCache, this.logger);
        List asList = Arrays.asList(new Pair(8, 2), new Pair(16, 2), new Pair(32, 6));
        HashMap hashMap = new HashMap();
        hashMap.put(0, "human hand");
        final Detector detector = new Detector(supplier1.get(TensorflowModel.HAND_DETECTION), asList, false, true, 0.15f, 0.1f, hashMap, weakReference, weakReference2, false, this.logger);
        RecognizerFrugal recognizerFrugal = new RecognizerFrugal(detector, new TrackerWrapper(1.2f, 1.35f, 1.5f), classifierWithRegression, new Smoother(new DetectionMerger(1.5f, 1.35f), 5, new q1(26)), new Smoother(new DetectionMerger(1.5f, 1.35f), 3, new hr(18)), true, this.useGPUPass, this.logger);
        if (this.useGPU && !this.useGPUPass) {
            delegateManager.submit(new Runnable() { // from class: xsna.wsu
                @Override // java.lang.Runnable
                public final void run() {
                    HandRecognitionFactory.this.lambda$create$2(detector, classifierWithRegression, runnable);
                }
            });
            return recognizerFrugal;
        }
        if (runnable != null) {
            runnable.run();
        }
        return recognizerFrugal;
    }
}
