package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: IdeasProgressDelegate.kt */
/* loaded from: classes6.dex */
public final class psv extends AnimatorListenerAdapter {
    public final /* synthetic */ qsv b;

    public psv(qsv qsvVar) {
        this.b = qsvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qsv qsvVar = this.b;
        if (animator.equals(qsvVar.d)) {
            boolean z = qsvVar.f;
            qsvVar.d = null;
            if (z) {
                return;
            }
            qsvVar.b.invoke();
        }
    }
}
