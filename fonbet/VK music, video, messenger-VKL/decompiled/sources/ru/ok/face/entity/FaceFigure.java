package ru.ok.face.entity;

import android.graphics.RectF;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class FaceFigure {
    public final Detection detection;
    public final boolean is3DMesh;
    public final float[] mesh;
    public final RectF position;
    public final float[] rotationMatrix;
    public final float score;

    public FaceFigure(Detection detection, float[] fArr, float f, float[] fArr2, boolean z) {
        RectF rectF = new RectF();
        this.position = rectF;
        this.detection = detection;
        this.mesh = fArr;
        this.score = f;
        this.rotationMatrix = fArr2;
        this.is3DMesh = z;
        detection.fillRect(rectF);
    }

    public FaceFigure updateDetection(Detection detection) {
        return new FaceFigure(detection, this.mesh, this.score, this.rotationMatrix, this.is3DMesh);
    }
}
