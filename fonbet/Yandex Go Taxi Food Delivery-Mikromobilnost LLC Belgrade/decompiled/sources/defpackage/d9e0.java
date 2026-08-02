package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.ui.window.PopupLayout;

/* loaded from: classes10.dex */
public class d9e0 implements a9e0 {
    @Override // defpackage.a9e0
    public void a(PopupLayout popupLayout, int i, int i2) {
    }

    @Override // defpackage.a9e0
    public void b(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
