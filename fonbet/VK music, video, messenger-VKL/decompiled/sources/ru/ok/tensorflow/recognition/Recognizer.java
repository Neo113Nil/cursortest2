package ru.ok.tensorflow.recognition;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.opencv.core.Mat;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.classification.Classifier;
import ru.ok.tensorflow.detection.Detector;
import ru.ok.tensorflow.entity.PalmClass;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.recognition.RecognizerAsync;
import ru.ok.tensorflow.smoothing.Smoother;
import ru.ok.tensorflow.tracking.TrackerWrapper;
import ru.ok.tensorflow.util.ImageUtils;
import ru.ok.tensorflow.util.Logger;

/* loaded from: classes9.dex */
public class Recognizer implements Closeable {
    protected final Classifier classifier;
    protected final Detector detector;
    protected Matrix inverseTransform;
    protected List<Recognition> lastRecognitionsScaled = new ArrayList();
    private final Logger logger;
    protected final RecognizerAsync recognizerAsync;
    protected final boolean removeFalseDetections;
    protected Bitmap scaledBitmap;
    protected Canvas scaledBitmapCanvas;
    protected final Smoother smoother;
    protected final TrackerWrapper tracker;
    protected Matrix transform;

    public Recognizer(Detector detector, TrackerWrapper trackerWrapper, Classifier classifier, Smoother smoother, Smoother smoother2, boolean z, @NonNull Logger logger) {
        this.logger = logger;
        this.detector = detector;
        this.classifier = classifier;
        this.tracker = trackerWrapper;
        this.smoother = smoother;
        this.removeFalseDetections = z;
        this.recognizerAsync = new RecognizerAsync(detector, classifier, smoother2);
        this.scaledBitmap = Bitmap.createBitmap(detector.getInputWidth(), detector.getInputHeight(), Bitmap.Config.ARGB_8888);
        this.scaledBitmapCanvas = new Canvas(this.scaledBitmap);
    }

    private void setTransform(Matrix matrix) {
        this.transform = matrix;
        Matrix matrix2 = new Matrix();
        this.inverseTransform = matrix2;
        this.transform.invert(matrix2);
        this.recognizerAsync.setInverseTransform(this.inverseTransform);
    }

    private List<Recognition> transformRecognitions(List<Recognition> list, Matrix matrix) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Recognition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().transform(matrix));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.detector.close();
        this.classifier.close();
        this.recognizerAsync.close();
        Bitmap bitmap = this.scaledBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.scaledBitmap = null;
        }
    }

    public List<Recognition> process(FrameHolder frameHolder) {
        this.scaledBitmapCanvas.drawBitmap(frameHolder.getCPUFrame(), this.transform, null);
        return process(frameHolder, new FrameHolder(this.scaledBitmap));
    }

    public void setAsyncFilterAngle(boolean z) {
        this.recognizerAsync.setFilterAngle(z);
    }

    public void setClassifierThresholds(List<Pair<PalmClass, Float>> list) {
        this.classifier.setThresholds(list);
    }

    public void setInputSize(int i, int i2) {
        setTransform(ImageUtils.getTransformationMatrix(i, i2, this.detector.getInputWidth(), this.detector.getInputHeight(), false, true, true));
    }

    public List<Recognition> process(FrameHolder frameHolder, FrameHolder frameHolder2) {
        if (this.recognizerAsync.isReady()) {
            RecognizerAsync.Result fetchResult = this.recognizerAsync.fetchResult();
            this.recognizerAsync.initiateRecognition(frameHolder, frameHolder2);
            this.lastRecognitionsScaled = new ArrayList();
            for (Recognition recognition : fetchResult.recognitions) {
                if (!this.removeFalseDetections || recognition.palmClass != PalmClass.NOT_HAND) {
                    this.lastRecognitionsScaled.add(recognition);
                }
            }
            this.lastRecognitionsScaled = transformRecognitions(this.lastRecognitionsScaled, this.transform);
            TrackerWrapper trackerWrapper = this.tracker;
            Mat mat = fetchResult.lastFrameMat;
            if (mat == null) {
                mat = ImageUtils.bitmapToMat(frameHolder2.getCPUFrame());
            }
            trackerWrapper.intializeWithRecognitions(mat, this.lastRecognitionsScaled);
        }
        List<Recognition> trackRecognitions = this.tracker.trackRecognitions(frameHolder2.getCPUFrame(), this.lastRecognitionsScaled);
        this.lastRecognitionsScaled = trackRecognitions;
        return this.smoother.smoothRecognitions(transformRecognitions(trackRecognitions, this.inverseTransform));
    }
}
