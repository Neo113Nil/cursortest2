package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.Objects;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes11.dex */
public final class a0u0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ View d;

    public a0u0(com.google.android.gms.cast.framework.internal.featurehighlight.c cVar, Runnable runnable) {
        this.c = runnable;
        Objects.requireNonNull(cVar);
        this.d = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.b) {
            case 0:
                ((e0u0) this.c).c();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                ((e0u0) this.c).b();
                break;
            default:
                com.google.android.gms.cast.framework.internal.featurehighlight.c cVar = (com.google.android.gms.cast.framework.internal.featurehighlight.c) this.d;
                cVar.setVisibility(8);
                cVar.h = null;
                ((Runnable) this.c).run();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 0:
                ((e0u0) this.c).a();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public a0u0(e0u0 e0u0Var, View view) {
        this.c = e0u0Var;
        this.d = view;
    }
}
