package com.google.ar.core;

import defpackage.yx61;

/* loaded from: classes11.dex */
public enum Coordinates2d {
    TEXTURE_TEXELS(0),
    TEXTURE_NORMALIZED(1),
    IMAGE_PIXELS(2),
    IMAGE_NORMALIZED(3),
    OPENGL_NORMALIZED_DEVICE_COORDINATES(6),
    VIEW(7),
    VIEW_NORMALIZED(8);

    final int nativeCode;

    Coordinates2d(int i) {
        this.nativeCode = i;
    }

    public static Coordinates2d forNumber(int i) {
        for (Coordinates2d coordinates2d : values()) {
            if (coordinates2d.nativeCode == i) {
                return coordinates2d;
            }
        }
        yx61.f(a0.a((byte) 49, i, "Unexpected value for native Coordinates2d, value="));
        return null;
    }
}
