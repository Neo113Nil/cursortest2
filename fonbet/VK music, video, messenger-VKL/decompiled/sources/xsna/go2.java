package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.libvideo.dialogs.AnimationDialog;

/* compiled from: AnimationDialog.kt */
/* loaded from: classes14.dex */
public final class go2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ go2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                AnimationDialog animationDialog = (AnimationDialog) this.c;
                animationDialog.oo();
                animationDialog.eo();
                animationDialog.S = null;
                animationDialog.R = null;
                animationDialog.T = null;
                break;
            default:
                ((js2) this.c).run();
                break;
        }
    }
}
