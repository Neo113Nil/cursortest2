package xsna;

import android.animation.Animator;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Animator.kt */
/* loaded from: classes7.dex */
public final class grk implements Animator.AnimatorListener {
    public final /* synthetic */ hrk b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$BooleanRef d;

    public grk(hrk hrkVar, Ref$IntRef ref$IntRef, Ref$BooleanRef ref$BooleanRef) {
        this.b = hrkVar;
        this.c = ref$IntRef;
        this.d = ref$BooleanRef;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hrk hrkVar = this.b;
        hrkVar.f = null;
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        if (i != 0) {
            hrkVar.b.scrollBy(-i, 0);
            ref$IntRef.element = 0;
        }
        if (this.d.element) {
            return;
        }
        hrkVar.d.postDelayed(hrkVar.g, (gsi0.b().i != null ? r1.intValue() : 3) * 1000);
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
