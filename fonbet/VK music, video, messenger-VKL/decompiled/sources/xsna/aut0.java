package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: Effects.kt */
/* loaded from: classes17.dex */
public final class aut0 implements kgn {
    public final /* synthetic */ View a;
    public final /* synthetic */ ytt0 b;

    public aut0(View view, ytt0 ytt0Var) {
        this.a = view;
        this.b = ytt0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this.b);
        }
    }
}
