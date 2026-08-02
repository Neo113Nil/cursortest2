package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseCameraEditorViewAnimationsDelegate.kt */
/* loaded from: classes16.dex */
public final class f96 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f96(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                b96 b96Var = (b96) this.c;
                b96Var.a.setStickersViewTouchesEnabled(false);
                b96Var.a.W(false, true);
                break;
            default:
                glp glpVar = (glp) this.c;
                if (!glpVar.j) {
                    glpVar.k.x0();
                    d3m.e(glpVar.g, 300L, 0L, null, null, true);
                    glpVar.j = true;
                    break;
                }
                break;
        }
    }
}
