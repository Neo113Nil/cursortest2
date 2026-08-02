package xsna;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public class wwb0 implements rwb0 {
    @Override // xsna.rwb0
    public void a(Rect rect, View view) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // xsna.rwb0
    public void b(owb0 owb0Var, int i, int i2) {
    }
}
