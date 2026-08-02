package xsna;

import android.animation.Animator;
import java.util.List;
import one.video.ad.ux.ShoppableAdView;
import one.video.ad.ux.ShoppableCardView;

/* compiled from: ShoppableAdView.kt */
/* loaded from: classes8.dex */
public final class pej0 implements Animator.AnimatorListener {
    public boolean b;
    public final /* synthetic */ ShoppableAdView c;

    public pej0(ShoppableAdView shoppableAdView) {
        this.c = shoppableAdView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ShoppableAdView shoppableAdView = this.c;
        ShoppableCardView shoppableCardView = shoppableAdView.e;
        shoppableAdView.e = shoppableAdView.f;
        shoppableAdView.f = shoppableCardView;
        shoppableAdView.c = (shoppableAdView.c + 1) % shoppableAdView.d.size();
        if (this.b) {
            return;
        }
        animator.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        qej0 listener;
        ShoppableAdView shoppableAdView = this.c;
        nej0 nej0Var = (nej0) j5g.b0(shoppableAdView.c, shoppableAdView.d);
        if (nej0Var != null && (listener = shoppableAdView.getListener()) != null) {
            listener.b(nej0Var);
        }
        ShoppableCardView shoppableCardView = shoppableAdView.f;
        List<nej0> list = shoppableAdView.d;
        shoppableCardView.P4(mh0.a(list.get((shoppableAdView.c + 1) % list.size())));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
