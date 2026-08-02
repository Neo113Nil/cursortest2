package defpackage;

import coil.transform.PixelOpacity;
import coil.view.Scale;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class c {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PixelOpacity.values().length];
        try {
            iArr[PixelOpacity.UNCHANGED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixelOpacity.TRANSLUCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PixelOpacity.OPAQUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Scale.values().length];
        try {
            iArr2[Scale.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Scale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
