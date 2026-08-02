package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;

/* compiled from: VideoSkippablePartDelegate.kt */
/* loaded from: classes3.dex */
public final class cht0 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ qyt b;
    public final /* synthetic */ VideoSkippablePartView.c c;

    public cht0(qyt qytVar, VideoSkippablePartView.c cVar) {
        this.b = qytVar;
        this.c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            this.c.invoke();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (((Boolean) this.b.invoke()).booleanValue() || !valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.cancel();
    }
}
