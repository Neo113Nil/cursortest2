package com.ybsdk.feature.main.internal.screens.products.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.cma1;
import defpackage.cwg0;
import defpackage.ebh0;
import defpackage.eyg0;
import defpackage.fj11;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.kj11;
import defpackage.kp50;
import defpackage.li91;
import defpackage.lj11;
import defpackage.mnh0;
import defpackage.mxp0;
import defpackage.na61;
import defpackage.ny61;
import defpackage.sls;
import defpackage.smg0;
import defpackage.vmu0;
import defpackage.vng;
import defpackage.ylg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 32\u00020\u0001:\u0002#4B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0016J\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0016J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/products/views/TsarButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isDesignV2", "Lfj11;", "gradientConfiguration", "Lzy11;", "renderStyle", "(ZLfj11;)V", "Lcom/ybsdk/widgets/common/YbButtonView$a;", "buttonState", "renderContent", "(Lcom/ybsdk/widgets/common/YbButtonView$a;)V", "cancelAppearingAnimation", "()V", "cancelPulseAnimation", "onDetachedFromWindow", "Lkotlin/Function0;", "clickListener", "setOnClickListener", "(Lsls;)V", "action", "addOnAppearingAnimationEnd", "startAppearingAnimation", "isAppearingAnimationRunning", "()Z", "cancelAnimations", "Llj11;", ClidProvider.STATE, "render", "(Llj11;)V", "Lna61;", "binding", "Lna61;", "Lsls;", "Lcom/ybsdk/feature/main/internal/screens/products/views/PulsingGradientDrawable;", "pulsingGradientDrawable", "Lcom/ybsdk/feature/main/internal/screens/products/views/PulsingGradientDrawable;", "Landroid/animation/ValueAnimator;", "appearingAnimation", "Landroid/animation/ValueAnimator;", "prevState", "Llj11;", "Companion", "kj11", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TsarButtonView extends FrameLayout {

    @Deprecated
    public static final long TSAR_BUTTON_ANIMATION_DURATION = 800;

    @Deprecated
    public static final float TSAR_BUTTON_TRANSLATION_Y_END_PX = 0.0f;

    @Deprecated
    public static final String TSAR_BUTTON_VIEW_EDUCATION_TAG = "tsar_button_view_identifier";
    private ValueAnimator appearingAnimation;
    private final na61 binding;
    private sls clickListener;
    private lj11 prevState;
    private PulsingGradientDrawable pulsingGradientDrawable;
    private static final kj11 Companion = new kj11();
    private static final float TSAR_BUTTON_TRANSLATION_Y_START_PX = kp50.t(200);

    public TsarButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(mnh0.ybsdk_tsar_button_view, this);
        int i2 = ebh0.tsarButtonView;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i2, this);
        if (ybButtonView == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
            throw null;
        }
        this.binding = new na61(this, ybButtonView);
        ybButtonView.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, smg0.ybsdk_click_scale_animator));
        ybButtonView.setOnClickListener(new vmu0(24, this));
        li91.j(ybButtonView, TSAR_BUTTON_VIEW_EDUCATION_TAG);
    }

    private final void cancelAppearingAnimation() {
        ValueAnimator valueAnimator = this.appearingAnimation;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.appearingAnimation;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.appearingAnimation = null;
    }

    private final void cancelPulseAnimation() {
        PulsingGradientDrawable pulsingGradientDrawable = this.pulsingGradientDrawable;
        if (pulsingGradientDrawable != null) {
            pulsingGradientDrawable.stopPulse();
        }
        this.pulsingGradientDrawable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(TsarButtonView tsarButtonView, View view) {
        sls slsVar = tsarButtonView.clickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final void renderContent(YbButtonView.a buttonState) {
        PulsingGradientDrawable pulsingGradientDrawable;
        ValueAnimator valueAnimator = this.appearingAnimation;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            PulsingGradientDrawable pulsingGradientDrawable2 = this.pulsingGradientDrawable;
            if (!(pulsingGradientDrawable2 != null ? jl40.l(pulsingGradientDrawable2.isAnimationInProgress(), Boolean.TRUE) : false) && (pulsingGradientDrawable = this.pulsingGradientDrawable) != null) {
                pulsingGradientDrawable.startPulse();
            }
        }
        this.binding.b.render(buttonState);
    }

    private final void renderStyle(boolean isDesignV2, fj11 gradientConfiguration) {
        Drawable t;
        YbButtonView ybButtonView = this.binding.b;
        int dimensionPixelSize = isDesignV2 ? ybButtonView.getResources().getDimensionPixelSize(cwg0.ybsdk_tsar_button_redesign_horizontal_padding) : ybButtonView.getResources().getDimensionPixelSize(cwg0.ybsdk_tsar_button_padding);
        int dimensionPixelSize2 = isDesignV2 ? ybButtonView.getResources().getDimensionPixelSize(cwg0.ybsdk_tsar_button_redesign_vertical_padding) : ybButtonView.getResources().getDimensionPixelSize(cwg0.ybsdk_tsar_button_padding);
        ybButtonView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        if (isDesignV2) {
            PulsingGradientDrawable pulsingGradientDrawable = new PulsingGradientDrawable(ybButtonView.getContext(), gradientConfiguration);
            this.pulsingGradientDrawable = pulsingGradientDrawable;
            t = new LayerDrawable(new Drawable[]{vng.t(eyg0.ybsdk_tsar_button_redesign_background, ybButtonView.getContext()), pulsingGradientDrawable});
        } else {
            t = vng.t(eyg0.ybsdk_tsar_button_background, ybButtonView.getContext());
        }
        ybButtonView.setBackground(t);
        int dimensionPixelSize3 = isDesignV2 ? ybButtonView.getResources().getDimensionPixelSize(cwg0.ybsdk_tsar_button_redesign_margin_bottom) : ybButtonView.getResources().getDimensionPixelSize(cwg0.ybsdk_tsar_button_margin_bottom);
        ViewGroup.LayoutParams layoutParams = ybButtonView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelSize3);
        ybButtonView.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAppearingAnimation$lambda$5$lambda$3(TsarButtonView tsarButtonView, ValueAnimator valueAnimator) {
        tsarButtonView.binding.a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void addOnAppearingAnimationEnd(final sls action) {
        ValueAnimator valueAnimator = this.appearingAnimation;
        if (valueAnimator != null) {
            valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.main.internal.screens.products.views.TsarButtonView$addOnAppearingAnimationEnd$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    sls.this.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    public final void cancelAnimations() {
        cancelAppearingAnimation();
        cancelPulseAnimation();
    }

    public final boolean isAppearingAnimationRunning() {
        ValueAnimator valueAnimator = this.appearingAnimation;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        cancelAppearingAnimation();
        cancelPulseAnimation();
        super.onDetachedFromWindow();
    }

    public final void render(lj11 state) {
        boolean z = state.b;
        if (state.equals(this.prevState)) {
            return;
        }
        lj11 lj11Var = this.prevState;
        if (lj11Var == null || z != lj11Var.b) {
            renderStyle(z, state.c);
        }
        renderContent(state.a);
        this.prevState = state;
    }

    public final void setOnClickListener(sls clickListener) {
        this.clickListener = clickListener;
    }

    public final void startAppearingAnimation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(TSAR_BUTTON_TRANSLATION_Y_START_PX, 0.0f);
        ofFloat.setInterpolator(AnimationUtils.loadInterpolator(getContext(), ylg0.ybsdk_default_interpolator));
        ofFloat.setDuration(800L);
        ofFloat.addUpdateListener(new mxp0(24, this));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.main.internal.screens.products.views.TsarButtonView$startAppearingAnimation$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PulsingGradientDrawable pulsingGradientDrawable;
                pulsingGradientDrawable = TsarButtonView.this.pulsingGradientDrawable;
                if (pulsingGradientDrawable != null) {
                    pulsingGradientDrawable.startPulse();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.appearingAnimation = ofFloat;
        i5z0.a.a("Tsar button animation started", new Object[0]);
    }

    public TsarButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TsarButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TsarButtonView(Context context) {
        this(context, null, 0, 6, null);
    }
}
