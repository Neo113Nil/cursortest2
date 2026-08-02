package xsna;

import android.animation.Animator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Animator.kt */
/* loaded from: classes2.dex */
public final class n0f0 implements Animator.AnimatorListener {
    public final /* synthetic */ ArrayList b;

    public n0f0(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(1.0f);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
