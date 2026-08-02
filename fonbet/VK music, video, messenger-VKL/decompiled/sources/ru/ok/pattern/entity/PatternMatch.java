package ru.ok.pattern.entity;

import android.graphics.Matrix;
import org.opencv.core.Mat;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class PatternMatch {
    public final float angleX;
    public final float angleY;
    public final float angleZ;
    public final Detection areaDetection;
    public final Matrix homography;
    public final Detection patternDetection;
    public final float size;
    public final Mat tvec;
    public final float x;
    public final float y;

    public PatternMatch(float f, float f2, float f3, float f4, float f5, float f6, Matrix matrix, Mat mat, Detection detection, Detection detection2) {
        this.x = f;
        this.y = f2;
        this.size = f3;
        this.angleX = f4;
        this.angleY = f5;
        this.angleZ = f6;
        this.homography = matrix;
        this.tvec = mat;
        this.areaDetection = detection;
        this.patternDetection = detection2;
    }
}
