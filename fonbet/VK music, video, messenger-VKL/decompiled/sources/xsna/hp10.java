package xsna;

import android.view.View;

/* compiled from: MeasureUtils.java */
/* loaded from: classes2.dex */
public final class hp10 {
    public static int a(int i, int i2, int i3, int i4) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        return (mode == 1073741824 || mode == Integer.MIN_VALUE) ? size < i2 ? Math.max(0, i2 - i4) : size > i3 ? Math.max(0, i3 - i4) : Math.max(0, size - i4) : Math.max(0, i3 - i4);
    }

    public static int b(int i, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (size < i2 || size < i4) ? size : Math.max(i2, Math.min(i4, i3));
        }
        if (mode == 0) {
            return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
    }

    public static int c(int i) {
        return tr.a(i, 1073741823, 0, Integer.MIN_VALUE);
    }

    public static int d(int i) {
        return tr.a(i, 1073741823, 0, 1073741824);
    }
}
