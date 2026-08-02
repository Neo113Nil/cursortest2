package xsna;

import android.view.ViewGroup;

/* compiled from: BottomBarOverlayInsetExt.kt */
/* loaded from: classes3.dex */
public final class h48 {
    public static final void a(ViewGroup viewGroup, int i, int i2, int i3) {
        if (i2 <= 0) {
            i3 = 0;
        }
        int i4 = i + i2 + i3;
        if (viewGroup.getPaddingBottom() != i4) {
            viewGroup.setClipToPadding(false);
            viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i4);
        }
    }
}
