package defpackage;

import io.flutter.plugins.camerax.MeteringMode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gur {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MeteringMode.values().length];
        a = iArr;
        try {
            iArr[MeteringMode.AE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[MeteringMode.AF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[MeteringMode.AWB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
