package ru.ok.tensorflow.recognition;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import ru.ok.FrameConsumer;
import ru.ok.TFFrameType;
import ru.ok.gl.util.FrameHolder;
import ru.ok.gpu.GlThreadWithSharedContext;
import ru.ok.tensorflow.classification.Classifier;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.PalmClass;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.recognition.RecognizerAsync;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.tracking.TrackerWrapper;
import ru.ok.tensorflow.util.Logger;

/* loaded from: classes9.dex */
public class RecognizerFrugal extends Recognizer implements FrameConsumer {
    public static final long COOL_DOWN_MILLIS = 250;
    private final CoolDownTimer coolDownTimer;
    private boolean isFrugal;
    private List<Recognition> lastRecognitionsOriginal;
    private boolean useGPUpass;

    public class CoolDownTimer {
        private long lastTimeMillis;

        public CoolDownTimer() {
        }

        public boolean isUp() {
            return System.currentTimeMillis() - this.lastTimeMillis >= 250;
        }

        public void reset() {
            this.lastTimeMillis = System.currentTimeMillis();
        }
    }

    public RecognizerFrugal(Detector detector, TrackerWrapper trackerWrapper, Classifier classifier, Smoother smoother, Smoother smoother2, boolean z, boolean z2, @NonNull Logger logger) {
        super(detector, trackerWrapper, classifier, smoother, smoother2, z, logger);
        this.lastRecognitionsOriginal = new ArrayList();
        this.isFrugal = true;
        this.coolDownTimer = new CoolDownTimer();
        this.useGPUpass = z2;
    }

    public boolean isReady() {
        if (this.isFrugal) {
            return this.recognizerAsync.isReady() && this.coolDownTimer.isUp();
        }
        return true;
    }

    @Override // ru.ok.tensorflow.recognition.Recognizer
    public List<Recognition> process(FrameHolder frameHolder, FrameHolder frameHolder2) {
        return this.isFrugal ? processFrugally(frameHolder, frameHolder2) : super.process(frameHolder, frameHolder2);
    }

    public List<Recognition> processFrugally(FrameHolder frameHolder, FrameHolder frameHolder2) {
        if (this.recognizerAsync.isReady() && this.coolDownTimer.isUp()) {
            this.coolDownTimer.reset();
            RecognizerAsync.Result fetchResult = this.recognizerAsync.fetchResult();
            this.recognizerAsync.initiateRecognition(frameHolder, frameHolder2);
            this.lastRecognitionsOriginal = new ArrayList();
            for (Recognition recognition : fetchResult.recognitions) {
                if (!this.removeFalseDetections || recognition.palmClass != PalmClass.NOT_HAND) {
                    this.lastRecognitionsOriginal.add(recognition);
                }
            }
        }
        return this.lastRecognitionsOriginal;
    }

    public void setFrugal(boolean z) {
        this.isFrugal = z;
    }

    public void startInitGPU(GlThreadWithSharedContext glThreadWithSharedContext) {
        if (this.useGPUpass) {
            this.recognizerAsync.startInitGPU(glThreadWithSharedContext);
        }
    }

    @Override // ru.ok.FrameConsumer
    public int useFrame(TFFrameType tFFrameType) {
        if (isReady()) {
            return this.recognizerAsync.useFrame(tFFrameType);
        }
        return 0;
    }
}
