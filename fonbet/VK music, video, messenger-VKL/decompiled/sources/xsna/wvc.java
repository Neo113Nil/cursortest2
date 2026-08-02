package xsna;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Animator.kt */
/* loaded from: classes17.dex */
public final class wvc implements Animator.AnimatorListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ z8e c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ io2 e;
    public final /* synthetic */ gzs f;

    public wvc(RecyclerView recyclerView, z8e z8eVar, boolean z, io2 io2Var, gzs gzsVar) {
        this.b = recyclerView;
        this.c = z8eVar;
        this.d = z;
        this.e = io2Var;
        this.f = gzsVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = uvc.c;
        RecyclerView.Adapter adapter = this.b.getAdapter();
        while (adapter instanceof pd90) {
            adapter = ((pd90) adapter).c;
        }
        wke wkeVar = adapter instanceof wke ? (wke) adapter : null;
        if (wkeVar != null) {
            wkeVar.L0();
        }
        z8e z8eVar = this.c;
        w4r w4rVar = z8eVar instanceof w4r ? (w4r) z8eVar : null;
        if (w4rVar != null) {
            w4rVar.O();
        }
        uvc.b(this.d, this.e, this.f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
