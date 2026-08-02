package defpackage;

/* loaded from: classes.dex */
public abstract class cmm0 {
    public static final long[] a = {-9187201950435737345L, -1};
    public static final hz40 b = new hz40(0);

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final hz40 b() {
        return new hz40((Object) null);
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
        return x4e.c(i, 1, 7, i);
    }
}
