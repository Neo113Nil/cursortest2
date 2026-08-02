package defpackage;

import androidx.camera.core.impl.Timebase;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class go31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Timebase.values().length];
        a = iArr;
        try {
            iArr[Timebase.REALTIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Timebase.UPTIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
