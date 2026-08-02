package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: HeaderController.kt */
/* loaded from: classes16.dex */
public final class lwu extends hrl {
    public final NonBouncedAppBarLayout e;
    public final VkText f;
    public final VkText g;
    public final ObjectAnimator h;
    public final ObjectAnimator i;
    public final AnimatorSet j;
    public final ObjectAnimator k;
    public AnimatorSet l;

    /* compiled from: HeaderController.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ lwu c;
        public final /* synthetic */ gzs<s3q0> d;

        public a(gzs<s3q0> gzsVar, lwu lwuVar, gzs<s3q0> gzsVar2) {
            this.b = gzsVar;
            this.c = lwuVar;
            this.d = gzsVar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            lwu lwuVar = this.c;
            lwuVar.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lwuVar.f.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.removeListener(this);
            this.c.l = null;
            this.d.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public lwu(View view, pkn0 pkn0Var) {
        super(pkn0Var);
        this.e = (NonBouncedAppBarLayout) view.findViewById(R.id.clips_interests_appbar);
        VkText vkText = (VkText) view.findViewById(R.id.clips_interests_step);
        this.f = vkText;
        VkText vkText2 = (VkText) view.findViewById(R.id.clips_interests_title);
        float pivotX = vkText2.getPivotX();
        vkText2.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vkText2.setPivotX(pivotX);
        this.g = vkText2;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkText2, (Property<VkText, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(this.b);
        this.h = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setDuration(600L);
        ofFloat2.setInterpolator(this.b);
        this.i = ofFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(vkText2, (Property<VkText, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), ObjectAnimator.ofFloat(vkText2, (Property<VkText, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(this.b);
        this.j = animatorSet;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(this.b);
        this.k = ofFloat3;
    }

    @Override // xsna.hrl
    public final void c(gzs gzsVar) {
        this.e.h(true, false, true);
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(this.j, this.k);
        animatorSet2.addListener(new kwu(this, gzsVar));
        this.l = animatorSet2;
        animatorSet2.start();
    }

    @Override // xsna.hrl
    public final void d(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(this.h, this.i);
        animatorSet2.addListener(new a(gzsVar, this, gzsVar2));
        this.l = animatorSet2;
        animatorSet2.start();
    }

    @Override // xsna.hrl
    public final void e(ClipsInterestsViewState.d dVar) {
        ClipsInterestsViewState.f fVar = dVar.d;
        tlo0.f fVar2 = fVar.b;
        VkText vkText = this.g;
        vkText.setText(fVar2.a(vkText.getContext()));
        tlo0.g gVar = fVar.a;
        VkText vkText2 = this.f;
        vkText2.setText(gVar.a(vkText2.getContext()));
    }

    @Override // xsna.hrl
    public final boolean f(ClipsInterestsViewState.d dVar, ClipsInterestsViewState.d dVar2) {
        return !epx.f(dVar.d, dVar2.d);
    }
}
