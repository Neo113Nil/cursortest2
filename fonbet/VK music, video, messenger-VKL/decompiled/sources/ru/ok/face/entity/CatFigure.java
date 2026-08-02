package ru.ok.face.entity;

import android.graphics.RectF;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class CatFigure {
    public final float[] angles;
    public final Detection detection;
    public final float[] mesh;
    public final RectF position;
    public final float score;

    public CatFigure(Detection detection, float[] fArr, float f, float[] fArr2) {
        RectF rectF = new RectF();
        this.position = rectF;
        this.detection = detection;
        this.mesh = fArr;
        this.angles = fArr2;
        this.score = f;
        detection.fillRect(rectF);
    }
}
