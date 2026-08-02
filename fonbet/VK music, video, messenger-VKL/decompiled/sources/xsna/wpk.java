package xsna;

/* compiled from: CvType.java */
/* loaded from: classes8.dex */
public final class wpk {
    public static final int a = b(0, 1);
    public static final int b;

    static {
        b(0, 2);
        b(0, 3);
        b(0, 4);
        b(1, 1);
        b(1, 2);
        b(1, 3);
        b(1, 4);
        b(2, 1);
        b(2, 2);
        b(2, 3);
        b(2, 4);
        b(3, 1);
        b(3, 2);
        b(3, 3);
        b(3, 4);
        b(4, 1);
        b = b(4, 2);
        b(4, 3);
        b(4, 4);
        b(5, 1);
        b(5, 2);
        b(5, 3);
        b(5, 4);
        b(6, 1);
        b(6, 2);
        b(6, 3);
        b(6, 4);
    }

    public static final int a(int i) {
        return (i >> 3) + 1;
    }

    public static final int b(int i, int i2) {
        if (i2 <= 0 || i2 >= 512) {
            throw new UnsupportedOperationException("Channels count should be 1..511");
        }
        if (i < 0 || i >= 8) {
            throw new UnsupportedOperationException("Data type depth should be 0..7");
        }
        return (i & 7) + ((i2 - 1) << 3);
    }
}
