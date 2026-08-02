package xsna;

import android.util.SparseIntArray;

/* compiled from: DefaultBitmapPoolParams.kt */
/* loaded from: classes.dex */
public final class vbl {
    public static final SparseIntArray a = new SparseIntArray(0);

    public static final fvb0 a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new fvb0(0, min > 16777216 ? (min / 4) * 3 : min / 2, a, -1);
    }
}
