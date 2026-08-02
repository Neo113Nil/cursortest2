package com.airbnb.lottie.model.content;

/* loaded from: classes10.dex */
public enum PolystarShape$Type {
    STAR(1),
    POLYGON(2);

    private final int value;

    PolystarShape$Type(int i) {
        this.value = i;
    }

    public static PolystarShape$Type a(int i) {
        for (PolystarShape$Type polystarShape$Type : values()) {
            if (polystarShape$Type.value == i) {
                return polystarShape$Type;
            }
        }
        return null;
    }
}
