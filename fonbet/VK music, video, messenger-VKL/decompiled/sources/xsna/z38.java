package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes13.dex */
public final class z38 extends AnimatorListenerAdapter {
    public boolean b;
    public final /* synthetic */ ActionMenuView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ BottomAppBar f;

    public z38(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f = bottomAppBar;
        this.c = actionMenuView;
        this.d = i;
        this.e = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            return;
        }
        this.f.F(this.c, this.d, this.e, false);
    }
}
