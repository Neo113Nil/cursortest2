package com.ybsdk.feature.passes.widget.api.presentation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.passes.widget.api.presentation.PassesWidgetView;
import defpackage.cma1;
import defpackage.jbh0;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.pm90;
import defpackage.qm90;
import defpackage.rm90;
import defpackage.rnh0;
import defpackage.sls;
import defpackage.sm90;
import defpackage.tls;
import defpackage.tm90;
import defpackage.w511;
import defpackage.y361;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 02\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u00020\f2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014j\u0002`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00162\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/ybsdk/feature/passes/widget/api/presentation/PassesWidgetView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "targetPadding", "Lkotlin/Function0;", "Lzy11;", "onEnd", "animateBottomPadding", "(ILsls;)V", "Ltm90;", ClidProvider.STATE, "render", "(Ltm90;)V", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setActionHandler", "(Ltls;)V", "block", "setOnRetryClick", "(Lsls;)V", "bottomInset", "applyBottomInset", "(I)V", "show", "animateWidget", "(ZLsls;)V", "onDetachedFromWindow", "()V", "Ly361;", "binding", "Ly361;", "baseBottomPadding", CA20Status.STATUS_USER_I, "isWidgetShown", "Z", "Landroid/animation/ValueAnimator;", "widgetAnimator", "Landroid/animation/ValueAnimator;", "Companion", "pm90", "feature-passes-widget-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class PassesWidgetView extends FrameLayout {

    @Deprecated
    public static final long ANIMATION_DURATION = 300;
    private static final pm90 Companion = new pm90();

    @Deprecated
    public static final float FALLBACK_HEIGHT_DP = 80.0f;
    private int baseBottomPadding;
    private final y361 binding;
    private boolean isWidgetShown;
    private ValueAnimator widgetAnimator;

    public PassesWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(rnh0.ybsdk_passes_widget_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = jbh0.divView;
        YbDivView ybDivView = (YbDivView) cma1.O(i2, inflate);
        if (ybDivView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            i2 = jbh0.passesWidgetErrorView;
            PassesWidgetErrorView passesWidgetErrorView = (PassesWidgetErrorView) cma1.O(i2, inflate);
            if (passesWidgetErrorView != null) {
                i2 = jbh0.skeletonView;
                DivSkeletonsView divSkeletonsView = (DivSkeletonsView) cma1.O(i2, inflate);
                if (divSkeletonsView != null) {
                    this.binding = new y361(frameLayout, ybDivView, frameLayout, passesWidgetErrorView, divSkeletonsView);
                    this.isWidgetShown = true;
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void animateBottomPadding(final int targetPadding, final sls onEnd) {
        ValueAnimator valueAnimator = this.widgetAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int paddingBottom = getPaddingBottom();
        ValueAnimator ofInt = ValueAnimator.ofInt(paddingBottom, targetPadding);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: om90
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PassesWidgetView.animateBottomPadding$lambda$4$lambda$2(PassesWidgetView.this, targetPadding, paddingBottom, valueAnimator2);
            }
        });
        if (onEnd != null) {
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.ybsdk.feature.passes.widget.api.presentation.PassesWidgetView$animateBottomPadding$1$2$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    PassesWidgetView.this.setAlpha(1.0f);
                    PassesWidgetView passesWidgetView = PassesWidgetView.this;
                    passesWidgetView.setPadding(passesWidgetView.getPaddingLeft(), passesWidgetView.getPaddingTop(), passesWidgetView.getPaddingRight(), targetPadding);
                    onEnd.invoke();
                }
            });
        }
        ofInt.setDuration(300L);
        ofInt.start();
        this.widgetAnimator = ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBottomPadding$lambda$4$lambda$2(PassesWidgetView passesWidgetView, int i, int i2, ValueAnimator valueAnimator) {
        passesWidgetView.setPadding(passesWidgetView.getPaddingLeft(), passesWidgetView.getPaddingTop(), passesWidgetView.getPaddingRight(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (i < i2) {
            animatedFraction = 1.0f - animatedFraction;
        }
        passesWidgetView.setAlpha(animatedFraction);
    }

    public static /* synthetic */ void animateWidget$default(PassesWidgetView passesWidgetView, boolean z, sls slsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: animateWidget");
            return;
        }
        if ((i & 2) != 0) {
            slsVar = null;
        }
        passesWidgetView.animateWidget(z, slsVar);
    }

    public final void animateWidget(boolean show, sls onEnd) {
        if (show && !this.isWidgetShown) {
            this.isWidgetShown = true;
            animateBottomPadding(this.baseBottomPadding, onEnd);
        } else {
            if (show || !this.isWidgetShown) {
                return;
            }
            this.isWidgetShown = false;
            animateBottomPadding(this.baseBottomPadding - Math.max(getHeight(), Math.max(getMeasuredHeight(), kp50.q(80.0f))), onEnd);
        }
    }

    public final void applyBottomInset(int bottomInset) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), bottomInset);
        this.baseBottomPadding = bottomInset;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.widgetAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.widgetAnimator = null;
    }

    public final void render(tm90 state) {
        y361 y361Var = this.binding;
        if (state instanceof qm90) {
            FrameLayout frameLayout = y361Var.c;
            YbDivView ybDivView = y361Var.b;
            DivSkeletonsView divSkeletonsView = y361Var.e;
            frameLayout.setVisibility(0);
            y361Var.d.setVisibility(8);
            divSkeletonsView.setVisibility(8);
            ybDivView.setVisibility(0);
            divSkeletonsView.stopShimmer();
            YbDivView.setData$default(ybDivView, ((qm90) state).a, null, null, false, 14, null);
            return;
        }
        if (state instanceof sm90) {
            FrameLayout frameLayout2 = y361Var.c;
            DivSkeletonsView divSkeletonsView2 = y361Var.e;
            frameLayout2.setVisibility(0);
            y361Var.d.setVisibility(8);
            divSkeletonsView2.setVisibility(0);
            y361Var.b.setVisibility(8);
            divSkeletonsView2.render(((sm90) state).a);
            divSkeletonsView2.startShimmer();
            return;
        }
        if (jl40.l(state, rm90.a)) {
            FrameLayout frameLayout3 = y361Var.c;
            DivSkeletonsView divSkeletonsView3 = y361Var.e;
            frameLayout3.setVisibility(0);
            y361Var.d.setVisibility(0);
            divSkeletonsView3.setVisibility(8);
            y361Var.b.setVisibility(8);
            divSkeletonsView3.stopShimmer();
            return;
        }
        if (state != null) {
            w511.b();
            return;
        }
        FrameLayout frameLayout4 = y361Var.c;
        DivSkeletonsView divSkeletonsView4 = y361Var.e;
        frameLayout4.setVisibility(8);
        y361Var.d.setVisibility(8);
        divSkeletonsView4.setVisibility(8);
        y361Var.b.setVisibility(8);
        divSkeletonsView4.stopShimmer();
    }

    public final void setActionHandler(tls handler) {
        this.binding.b.setActionHandler(handler);
    }

    public final void setOnRetryClick(sls block) {
        this.binding.d.setOnRetryClick(block);
    }

    public PassesWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PassesWidgetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PassesWidgetView(Context context) {
        this(context, null, 0, 6, null);
    }
}
