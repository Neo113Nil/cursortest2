package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.google.android.gms.cast.framework.internal.featurehighlight.InnerZoneDrawable;
import com.google.android.gms.internal.cast.zzgp;
import com.google.android.gms.internal.cast.zzgy;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.editor.StickerDeleteAreaView;
import java.util.Objects;

/* compiled from: StickerDeleteAreaView.java */
/* loaded from: classes6.dex */
public final class e3l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ View c;

    public e3l0(com.google.android.gms.cast.framework.internal.featurehighlight.c cVar) {
        Objects.requireNonNull(cVar);
        this.c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.b) {
            case 0:
                onAnimationEnd(animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                ((StickerDeleteAreaView) view).i = null;
                break;
            default:
                com.google.android.gms.cast.framework.internal.featurehighlight.c cVar = (com.google.android.gms.cast.framework.internal.featurehighlight.c) view;
                cVar.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                InnerZoneDrawable innerZoneDrawable = cVar.f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.0f, 1.1f).setDuration(500L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.1f, 1.0f).setDuration(500L);
                ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).setDuration(500L);
                animatorSet.play(duration);
                animatorSet.play(duration2).with(duration3).after(duration);
                animatorSet.setInterpolator(zzgy.zzc());
                animatorSet.setStartDelay(500L);
                zzgp.zzb(animatorSet, -1, null);
                cVar.h = animatorSet;
                animatorSet.start();
                break;
        }
    }

    public e3l0(StickerDeleteAreaView stickerDeleteAreaView) {
        this.c = stickerDeleteAreaView;
    }
}
