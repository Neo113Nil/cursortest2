package ru.ok.pattern.entity;

import android.graphics.Matrix;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class PatternMatchRaw {
    public Detection areaDetectionOriginal;
    public final Matrix homography;
    public Detection patternDetectionOriginal;
    public final Integer score;

    public PatternMatchRaw(Detection detection, Detection detection2, Matrix matrix, int i) {
        this.areaDetectionOriginal = detection;
        this.patternDetectionOriginal = detection2;
        this.homography = matrix;
        this.score = Integer.valueOf(i);
    }

    public static PatternMatchRaw empty() {
        return new PatternMatchRaw(null, null, null, 0);
    }
}
