package xsna;

/* compiled from: ScatterMap.kt */
/* loaded from: classes11.dex */
public final class h5h0 {
    public static final long[] a = {-9187201950435737345L, -1};
    public static final ph50 b = new ph50(0);

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final <K, V> ph50<K, V> b() {
        return new ph50<>((Object) null);
    }

    public static final int c(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int d(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int e(int i) {
        if (i == 7) {
            return 8;
        }
        return x9.b(i, 1, 7, i);
    }
}
