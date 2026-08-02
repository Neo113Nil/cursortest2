package com.yandex.fintechsdk.core.ui.impl.api.cutout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/yandex/fintechsdk/core/ui/impl/api/cutout/CutoutBackgroundDrawable$startAnimation$animator$1$2", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lzy11;", "onAnimationCancel", "(Landroid/animation/Animator;)V", "onAnimationEnd", "", "isCancelled", "Z", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CutoutBackgroundDrawable$startAnimation$animator$1$2 extends AnimatorListenerAdapter {
    final /* synthetic */ sls $onEnd;
    private boolean isCancelled;

    public CutoutBackgroundDrawable$startAnimation$animator$1$2(sls slsVar) {
        this.$onEnd = slsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        this.isCancelled = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        sls slsVar;
        if (this.isCancelled || (slsVar = this.$onEnd) == null) {
            return;
        }
        slsVar.invoke();
    }
}
