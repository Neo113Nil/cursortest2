package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class ywt0 {
    public static final Rect a = new Rect();

    public static void a(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = viewGroup.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = viewGroup.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = viewGroup.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = viewGroup.getPaddingBottom();
        }
        viewGroup.setPadding(i, i2, i3, i4);
    }
}
