package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VelocityTracker1D.Strategy.values().length];
        try {
            iArr[VelocityTracker1D.Strategy.Impulse.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VelocityTracker1D.Strategy.Lsq2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
