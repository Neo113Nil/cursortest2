package com.ybsdk.widgets.common.shimmer;

import android.animation.Animator;
import com.ybsdk.core.design.animation.BaseAnimatorListener;
import defpackage.ntr0;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/widgets/common/shimmer/AutoRepeatAnimatorListener;", "Lcom/ybsdk/core/design/animation/BaseAnimatorListener;", "Lkotlin/Function0;", "Lzy11;", "onCancel", "onUpdateRequired", "Lntr0;", "shimmerArgsProvider", "", "animationPlaysAmount", "<init>", "(Lsls;Lsls;Lsls;Ljava/lang/Integer;)V", "Landroid/animation/Animator;", "animation", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "Lsls;", "timesLeftToPlay", "Ljava/lang/Integer;", "", "isCancelled", "Z", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoRepeatAnimatorListener extends BaseAnimatorListener {
    private boolean isCancelled;
    private final sls onCancel;
    private final sls onUpdateRequired;
    private final sls shimmerArgsProvider;
    private Integer timesLeftToPlay;

    public AutoRepeatAnimatorListener(sls slsVar, sls slsVar2, sls slsVar3, Integer num) {
        this.onCancel = slsVar;
        this.onUpdateRequired = slsVar2;
        this.shimmerArgsProvider = slsVar3;
        this.timesLeftToPlay = num;
    }

    @Override // com.ybsdk.core.design.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        this.isCancelled = true;
        this.onCancel.invoke();
    }

    @Override // com.ybsdk.core.design.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Integer num = this.timesLeftToPlay;
        boolean z = true;
        Integer valueOf = num != null ? Integer.valueOf(num.intValue() - 1) : null;
        this.timesLeftToPlay = valueOf;
        if (valueOf != null && valueOf.intValue() <= 0) {
            z = false;
        }
        if (this.isCancelled || !z) {
            this.onUpdateRequired.invoke();
            return;
        }
        if (animation != null) {
            animation.setStartDelay(((ntr0) this.shimmerArgsProvider.invoke()).e);
        }
        if (animation != null) {
            animation.start();
        }
    }

    @Override // com.ybsdk.core.design.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        this.isCancelled = false;
    }

    public /* synthetic */ AutoRepeatAnimatorListener(sls slsVar, sls slsVar2, sls slsVar3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(slsVar, slsVar2, slsVar3, (i & 8) != 0 ? null : num);
    }
}
