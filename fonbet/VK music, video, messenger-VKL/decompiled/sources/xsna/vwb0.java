package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class vwb0 extends swb0 {
    @Override // xsna.wwb0, xsna.rwb0
    public final void a(Rect rect, View view) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        currentWindowMetrics = ((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        rect.set(bounds);
    }
}
