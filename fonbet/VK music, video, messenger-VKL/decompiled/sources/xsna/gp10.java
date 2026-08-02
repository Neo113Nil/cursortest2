package xsna;

import android.view.View;

/* compiled from: MeasureUtils.kt */
@ozl
/* loaded from: classes17.dex */
public final class gp10 {
    public static final int a(int i, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i);
        int max = Math.max(0, Math.min(View.MeasureSpec.getSize(i), 1073741823));
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return Math.max(0, i3 - i4);
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
            }
        }
        return max < i2 ? Math.max(0, i2 - i4) : max > i3 ? Math.max(0, i3 - i4) : Math.max(0, max - i4);
    }

    public static final int b(int i, int i2, int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i);
        int max = Math.max(0, Math.min(View.MeasureSpec.getSize(i), 1073741823));
        int i6 = i4 + i5;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return i6 < i2 ? i2 : i6 > i3 ? i3 : i6;
            }
            if (mode != 1073741824) {
                throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
            }
        } else if (max >= i2 && max >= i6) {
            return Math.max(i2, Math.min(i6, i3));
        }
        return max;
    }

    public static int c(int i, int i2) {
        return tr.a(i, 1073741823, 0, i2);
    }
}
