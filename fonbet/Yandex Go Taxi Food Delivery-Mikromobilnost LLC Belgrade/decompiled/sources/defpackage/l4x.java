package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.a;

/* loaded from: classes.dex */
public final class l4x {
    public final k4x a;
    public final o4x b;
    public boolean c;
    public final float d;

    public l4x(Window window, k4x k4xVar) {
        this.a = k4xVar;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            ny61.r("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        View rootView = peekDecorView.getRootView();
        Object tag = rootView.getTag(t9h0.metricsStateHolder);
        if (tag == null) {
            tag = new xva0();
            rootView.setTag(t9h0.metricsStateHolder, tag);
        }
        xva0 xva0Var = (xva0) tag;
        if (xva0Var.a == null) {
            xva0Var.a = new yuf0(17);
        }
        o4x p4xVar = Build.VERSION.SDK_INT >= 31 ? new p4x(this, peekDecorView, window) : new o4x(this, peekDecorView, window);
        this.b = p4xVar;
        p4xVar.j.getDecorView().post(new a(true, p4xVar));
        this.c = true;
        this.d = 2.0f;
    }
}
