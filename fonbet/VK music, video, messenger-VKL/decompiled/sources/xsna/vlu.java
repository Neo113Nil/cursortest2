package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: GroupPickerView.kt */
/* loaded from: classes5.dex */
public final class vlu extends AnimatorListenerAdapter {
    public final /* synthetic */ xlu b;

    public vlu(xlu xluVar) {
        this.b = xluVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xlu xluVar = this.b;
        xluVar.b = false;
        xluVar.j.setMinimumHeight(0);
    }
}
