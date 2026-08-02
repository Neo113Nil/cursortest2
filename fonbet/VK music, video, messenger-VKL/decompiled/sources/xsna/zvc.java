package xsna;

import android.animation.Animator;
import java.util.ArrayList;

/* compiled from: Animator.kt */
/* loaded from: classes17.dex */
public final class zvc implements Animator.AnimatorListener {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ArrayList c;

    public zvc(ArrayList arrayList, boolean z) {
        this.b = z;
        this.c = arrayList;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = uvc.c;
        uvc.d(this.c, true, this.b);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
