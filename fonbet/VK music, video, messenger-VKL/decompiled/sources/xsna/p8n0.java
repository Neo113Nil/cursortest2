package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import xsna.l8n0;

/* compiled from: SuperAppItemAnimatorV2.kt */
/* loaded from: classes6.dex */
public final class p8n0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l8n0 b;
    public final /* synthetic */ l8n0.a c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public p8n0(l8n0 l8n0Var, l8n0.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.b = l8n0Var;
        this.c = aVar;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        this.e.setAlpha(1.0f);
        l8n0.a aVar = this.c;
        RecyclerView.e0 e0Var = aVar.b;
        l8n0 l8n0Var = this.b;
        l8n0Var.h(e0Var);
        ArrayList<RecyclerView.e0> arrayList = l8n0Var.r;
        ttp0.a(arrayList).remove(aVar.b);
        l8n0Var.F();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.e0 e0Var = this.c.b;
        this.b.getClass();
    }
}
