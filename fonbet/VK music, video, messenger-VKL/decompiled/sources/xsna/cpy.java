package xsna;

import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: LayoutParams.kt */
/* loaded from: classes17.dex */
public final class cpy {
    public static FrameLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if ((i7 & 1) != 0) {
            i = -2;
        }
        if ((i7 & 2) != 0) {
            i2 = -2;
        }
        if ((i7 & 4) != 0) {
            i3 = 0;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.setMarginStart(i3);
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i5;
        layoutParams.setMarginEnd(i6);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if ((i7 & 1) != 0) {
            i = -2;
        }
        if ((i7 & 2) != 0) {
            i2 = -2;
        }
        if ((i7 & 4) != 0) {
            i3 = 0;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        layoutParams.setMarginStart(i3);
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i5;
        layoutParams.setMarginEnd(i6);
        return layoutParams;
    }
}
