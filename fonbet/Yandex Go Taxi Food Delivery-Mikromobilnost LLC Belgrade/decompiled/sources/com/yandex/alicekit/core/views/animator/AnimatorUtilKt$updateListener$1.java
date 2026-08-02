package com.yandex.alicekit.core.views.animator;

import android.animation.ValueAnimator;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroid/animation/ValueAnimator;", "it", "Lzy11;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes11.dex */
public final class AnimatorUtilKt$updateListener$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ tls $block;

    public AnimatorUtilKt$updateListener$1(tls tlsVar) {
        this.$block = tlsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        valueAnimator.getAnimatedValue();
        jl40.P();
        throw null;
    }
}
