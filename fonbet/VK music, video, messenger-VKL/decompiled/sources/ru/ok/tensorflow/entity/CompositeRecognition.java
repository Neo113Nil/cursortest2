package ru.ok.tensorflow.entity;

/* loaded from: classes9.dex */
public class CompositeRecognition {
    public float[] center;
    public CompositeGesture gesture;
    public Recognition leftRecognition;
    public Recognition rightRecognition;
    public float rotationDegrees;
    public float size;

    public CompositeRecognition(Recognition recognition, Recognition recognition2, float[] fArr, float f, float f2, CompositeGesture compositeGesture) {
        this.leftRecognition = recognition;
        this.rightRecognition = recognition2;
        this.center = fArr;
        this.size = f;
        this.rotationDegrees = f2;
        this.gesture = compositeGesture;
    }
}
