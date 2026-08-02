package xsna;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* compiled from: NowView.kt */
/* loaded from: classes16.dex */
public final class ml70 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ pl70 b;

    public ml70(pl70 pl70Var) {
        this.b = pl70Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        pl70 pl70Var = this.b;
        pl70Var.getRecycler().getViewTreeObserver().removeOnPreDrawListener(this);
        Rect clipRect = pl70Var.getClipRect();
        clipRect.left = 0;
        clipRect.top = 0;
        clipRect.right = pl70Var.getRecycler().getWidth();
        clipRect.bottom = pl70Var.getRecycler().getHeight();
        pl70Var.getRecycler().setClipBounds(pl70Var.getClipRect());
        return true;
    }
}
