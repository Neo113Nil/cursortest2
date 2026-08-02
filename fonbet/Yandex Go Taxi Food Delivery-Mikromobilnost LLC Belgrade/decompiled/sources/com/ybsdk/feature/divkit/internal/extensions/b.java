package com.ybsdk.feature.divkit.internal.extensions;

import com.ybsdk.feature.divkit.internal.extensions.AbsCoordinatesExtensionHandler;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AbsCoordinatesExtensionHandler.Type.values().length];
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.CENTER_TOP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.CENTER_LEFT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.CENTER_RIGHT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AbsCoordinatesExtensionHandler.Type.CENTER_BOTTOM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
    }
}
