package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes10.dex */
public final class c9e0 extends b9e0 {
    @Override // defpackage.d9e0, defpackage.a9e0
    public final void b(View view, Rect rect) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        currentWindowMetrics = ((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        rect.set(bounds);
    }
}
