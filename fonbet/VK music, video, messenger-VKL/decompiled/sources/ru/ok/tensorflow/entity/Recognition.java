package ru.ok.tensorflow.entity;

import android.graphics.Matrix;
import ru.ok.tensorflow.gesture.GestureManager;
import xsna.fw3;

/* loaded from: classes9.dex */
public class Recognition {
    public final Float confidence;
    public final Detection detection;
    public final long epoch = System.currentTimeMillis();
    public final long id;
    public final PalmClass palmClass;

    public Recognition(PalmClass palmClass, Float f, Detection detection) {
        this.palmClass = palmClass;
        this.confidence = f;
        this.detection = detection;
        this.id = detection.id;
    }

    public Gesture getGesture() {
        return GestureManager.recognitionToGesture(this);
    }

    public String toString() {
        String str = "";
        if (this.palmClass != null) {
            str = "" + this.palmClass + " ";
        }
        StringBuilder e = fw3.e(str);
        e.append(String.format("(%.1f%%) ", Float.valueOf(this.confidence.floatValue() * 100.0f)));
        StringBuilder e2 = fw3.e(e.toString());
        e2.append(this.detection.getRect());
        e2.append(" ");
        return e2.toString().trim();
    }

    public Recognition transform(Matrix matrix) {
        return new Recognition(this.palmClass, this.confidence, this.detection.transform(matrix));
    }

    public Recognition updateDetection(Detection detection) {
        return new Recognition(this.palmClass, this.confidence, detection);
    }
}
