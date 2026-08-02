package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes3.dex */
public final class gwt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    public gwt0(View view, gzs<s3q0> gzsVar) {
        this.b = view;
        this.c = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.b;
        view.setVisibility(4);
        twt0.a(view, view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), 1);
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
