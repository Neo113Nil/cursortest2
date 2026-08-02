package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: FlexLayout.kt */
/* loaded from: classes18.dex */
public final class tor extends AnimatorListenerAdapter {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ gzs<s3q0> c;

    public tor(Ref$BooleanRef ref$BooleanRef, gzs<s3q0> gzsVar) {
        this.b = ref$BooleanRef;
        this.c = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.element = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.element) {
            return;
        }
        this.c.invoke();
    }
}
