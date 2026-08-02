package com.yandex.go.taxi.order.feedback.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cma1;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.r8i0;
import defpackage.s8i0;
import defpackage.wm;
import defpackage.wug0;
import defpackage.xm;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/go/taxi/order/feedback/ui/AchievementsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/yandex/taxi/order/feedback/b;", "Landroid/content/Context;", "context", "Lwm;", "adapter", "<init>", "(Landroid/content/Context;Lwm;)V", "", "Lr8i0;", Constants.KEY_DATA, "Lzy11;", "updateItemsAndExpand", "(Ljava/util/List;)V", "collapseReasonsContainer", "()V", "expandReasonsContainer", "cancelAnimation", "setData", "Ls8i0;", "onClickListener", "setOnReasonClickListener", "(Ls8i0;)V", "animateFirstData", "Lwm;", "Landroid/animation/Animator;", "animator", "Landroid/animation/Animator;", "", "canAnimate", "Z", "Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "getRatingType", "()Lru/yandex/taxi/order/feedback/FeedbackStrategy$FeedbackType;", "ratingType", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AchievementsView extends RecyclerView implements ru.yandex.taxi.order.feedback.b {
    public static final int $stable = 8;
    private final wm adapter;
    private Animator animator;
    private boolean canAnimate;

    public AchievementsView(Context context, wm wmVar) {
        super(context);
        this.adapter = wmVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.b2(0);
        setLayoutManager(linearLayoutManager);
        setAdapter(wmVar);
        setNestedScrollingEnabled(false);
        setClipToPadding(false);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(mrg0.go_design_m_space);
        setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
    }

    private final void cancelAnimation() {
        Animator animator = this.animator;
        if (animator != null) {
            if (animator != null) {
                animator.removeAllListeners();
            }
            Animator animator2 = this.animator;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.animator = null;
        }
    }

    private final void collapseReasonsContainer() {
        cancelAnimation();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.canAnimate) {
            layoutParams.height = 0;
            setLayoutParams(layoutParams);
            return;
        }
        ValueAnimator f = cma1.f(layoutParams.height, 0, new xm(layoutParams, this, 1));
        this.animator = f;
        f.setDuration(300L);
        Animator animator = this.animator;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collapseReasonsContainer$lambda$0(ViewGroup.LayoutParams layoutParams, AchievementsView achievementsView, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        achievementsView.setLayoutParams(layoutParams);
    }

    private final void expandReasonsContainer() {
        cancelAnimation();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int dimension = (int) getResources().getDimension(wug0.achievement_item_height);
        if (!this.canAnimate) {
            this.canAnimate = true;
            layoutParams.height = dimension;
            setLayoutParams(layoutParams);
            return;
        }
        ValueAnimator f = cma1.f(0, dimension, new xm(layoutParams, this, 0));
        this.animator = f;
        f.setDuration(300L);
        Animator animator = this.animator;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandReasonsContainer$lambda$0(ViewGroup.LayoutParams layoutParams, AchievementsView achievementsView, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        achievementsView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemsAndExpand(List<r8i0> data) {
        wm wmVar = this.adapter;
        if (wmVar != null && !jl40.l(wmVar.b, data)) {
            wmVar.b = data;
            wmVar.notifyDataSetChanged();
        }
        expandReasonsContainer();
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void animateFirstData() {
        this.canAnimate = true;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public FeedbackStrategy.FeedbackType getRatingType() {
        return FeedbackStrategy.FeedbackType.ALL_RATING;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public View getView() {
        return this;
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setData(final List<r8i0> data) {
        wm wmVar = this.adapter;
        if (jl40.l(data, wmVar != null ? wmVar.b : null)) {
            return;
        }
        collapseReasonsContainer();
        if (this.animator == null || getChildCount() == 0) {
            updateItemsAndExpand(data);
            return;
        }
        Animator animator = this.animator;
        if (animator != null) {
            animator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.feedback.ui.AchievementsView$setData$$inlined$addListener$default$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator2) {
                    AchievementsView.this.updateItemsAndExpand(data);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                }
            });
        }
    }

    @Override // ru.yandex.taxi.order.feedback.b
    public void setOnReasonClickListener(s8i0 onClickListener) {
        wm wmVar = this.adapter;
        if (wmVar != null) {
            wmVar.c = onClickListener;
        }
    }
}
