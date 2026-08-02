package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class nwt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ mdm0 c;

    public nwt0(View view, mdm0 mdm0Var) {
        this.b = view;
        this.c = mdm0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.b;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.c.invoke(view);
        return false;
    }
}
