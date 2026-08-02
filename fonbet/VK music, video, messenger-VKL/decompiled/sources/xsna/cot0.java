package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: VideoUnderModalBottomSheetResizer.kt */
/* loaded from: classes14.dex */
public final class cot0 {
    public static final void a(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == layoutParams.width && i2 == layoutParams.height) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }
}
