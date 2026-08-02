package defpackage;

import android.graphics.Rect;
import androidx.compose.ui.window.PopupLayout;

/* loaded from: classes10.dex */
public class b9e0 extends d9e0 {
    @Override // defpackage.d9e0, defpackage.a9e0
    public final void a(PopupLayout popupLayout, int i, int i2) {
        popupLayout.setSystemGestureExclusionRects(scc.i(new Rect(0, 0, i, i2)));
    }
}
