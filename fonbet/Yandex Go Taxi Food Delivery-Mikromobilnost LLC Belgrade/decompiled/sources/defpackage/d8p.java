package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;
import defpackage.d8p;

/* loaded from: classes3.dex */
public final class d8p extends h {
    public final Interpolator t;
    public final Interpolator u;

    public d8p(Context context) {
        this.t = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_fade_out);
        this.u = AnimationUtils.loadInterpolator(context, bmg0.ybsdk_interpolator_operation_fade_in);
        this.c = 150L;
        this.d = 150L;
        this.g = false;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(x0 x0Var) {
        x0Var.a.setAlpha(0.0f);
        z(x0Var, 1.0f, this.d, this.u);
        return false;
    }

    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean r(x0 x0Var) {
        z(x0Var, 0.0f, 0L, this.t);
        return false;
    }

    public final void z(final x0 x0Var, float f, long j, Interpolator interpolator) {
        final View view = x0Var.a;
        ValueAnimator duration = ValueAnimator.ofFloat(view.getAlpha(), f).setDuration(this.c);
        duration.setStartDelay(j);
        duration.setInterpolator(interpolator);
        duration.addUpdateListener(new wd2(view, 5));
        duration.addListener(new Animator.AnimatorListener(x0Var, view, this, x0Var, view) { // from class: com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.adapter.animator.FadeInFadeOutAnimator$animateFade$lambda$3$$inlined$addListener$default$1
            final /* synthetic */ x0 $holder$inlined;
            final /* synthetic */ x0 $holder$inlined$1;
            final /* synthetic */ View $itemView$inlined;
            final /* synthetic */ View $itemView$inlined$1;

            {
                this.$holder$inlined$1 = x0Var;
                this.$itemView$inlined$1 = view;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                d8p.this.h(this.$holder$inlined$1);
                this.$itemView$inlined$1.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                d8p.this.h(this.$holder$inlined);
                this.$itemView$inlined.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        duration.start();
    }
}
