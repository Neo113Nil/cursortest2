package com.lightside.animations;

import android.animation.ValueAnimator;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
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
