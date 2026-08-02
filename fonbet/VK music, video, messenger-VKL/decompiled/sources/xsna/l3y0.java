package xsna;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class l3y0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ f3y0 b;

    public l3y0(f3y0 f3y0Var) {
        this.b = f3y0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f3y0 f3y0Var = this.b;
        f3y0Var.getViewTreeObserver().removeOnPreDrawListener(this);
        if (!(f3y0Var.getParent() instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) f3y0Var.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        return true;
    }
}
