package ru.ok.tensorflow.tracking;

import android.graphics.Bitmap;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.opencv.core.Mat;
import ru.ok.native_loader_bridge.NativeLibLoaderBridge;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.entity.Recognition;
import ru.ok.tensorflow.execution.BatchedExecutor;
import ru.ok.tensorflow.util.ImageUtils;

/* loaded from: classes9.dex */
public class TrackerWrapper extends BatchedExecutor<Mat, Detection> {
    private float boxScaleFactor;
    private Mat frameMat = new Mat();
    private float maxPositionChange;
    private float maxScaleChange;

    static {
        NativeLibLoaderBridge.loadLibrary("opencv_java4");
    }

    public TrackerWrapper(float f, float f2, float f3) {
        this.boxScaleFactor = f;
        this.maxScaleChange = f2;
        this.maxPositionChange = f3;
    }

    public void intialize(Mat mat, List<Detection> list) {
        this.executors = new ArrayList(list.size());
        Iterator<Detection> it = list.iterator();
        while (it.hasNext()) {
            Mat mat2 = mat;
            this.executors.add(new TrackerSingle(this.boxScaleFactor, this.maxScaleChange, this.maxPositionChange, mat2, it.next()));
            mat = mat2;
        }
    }

    public void intializeWithRecognitions(Mat mat, List<Recognition> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Recognition> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().detection);
        }
        intialize(mat, arrayList);
    }

    public List<Pair<Boolean, Detection>> track(Bitmap bitmap) {
        Mat bitmapToMat = ImageUtils.bitmapToMat(bitmap, this.frameMat);
        this.frameMat = bitmapToMat;
        return execute(bitmapToMat);
    }

    public List<Detection> trackDetections(Bitmap bitmap) {
        List<Pair<Boolean, Detection>> track = track(bitmap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < track.size(); i++) {
            Pair<Boolean, Detection> pair = track.get(i);
            if (((Boolean) pair.first).booleanValue()) {
                arrayList.add((Detection) pair.second);
            }
        }
        return arrayList;
    }

    public List<PatternMatchRaw> trackPatternMatches(Bitmap bitmap, List<PatternMatchRaw> list) {
        List<Pair<Boolean, Detection>> track = track(bitmap);
        if (list.size() != track.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < track.size(); i++) {
            Pair<Boolean, Detection> pair = track.get(i);
            if (((Boolean) pair.first).booleanValue()) {
                PatternMatchRaw patternMatchRaw = list.get(i);
                arrayList.add(new PatternMatchRaw(patternMatchRaw.areaDetectionOriginal, (Detection) pair.second, patternMatchRaw.homography, patternMatchRaw.score.intValue()));
            }
        }
        return arrayList;
    }

    public List<Recognition> trackRecognitions(Bitmap bitmap, List<Recognition> list) {
        List<Pair<Boolean, Detection>> track = track(bitmap);
        if (list.size() != track.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < track.size(); i++) {
            Pair<Boolean, Detection> pair = track.get(i);
            if (((Boolean) pair.first).booleanValue()) {
                arrayList.add(list.get(i).updateDetection((Detection) pair.second));
            }
        }
        return arrayList;
    }
}
