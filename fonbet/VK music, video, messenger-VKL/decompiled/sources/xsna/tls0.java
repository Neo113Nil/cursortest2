package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: VideoFocusDelegate.kt */
/* loaded from: classes2.dex */
public final class tls0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ rls0 c;

    public tls0(View view, rls0 rls0Var) {
        this.b = view;
        this.c = rls0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.b;
        if (view.isShown()) {
            this.c.invoke(view);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
