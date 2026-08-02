package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import defpackage.cma1;
import defpackage.fsz;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.rek0;
import defpackage.sek0;
import defpackage.sls;
import defpackage.tek0;
import defpackage.tje;
import defpackage.uek0;
import defpackage.vek0;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.wek0;
import defpackage.wug0;
import defpackage.xzx;
import defpackage.yek0;
import defpackage.yso;
import defpackage.zkh0;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010.\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010)R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010)R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardCompanionSectionView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lvek0;", "trailUiState", "Lzy11;", "setupTrailView", "(Lvek0;)V", "Lsek0;", "animationUiState", "renderAnimationTrailView", "(Lsek0;)V", "Luek0;", "imageUiState", "renderImageTrailView", "(Luek0;)V", "cancelLottieAnimation", "()V", "renderEmptyTrailView", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/animation/Animator$AnimatorListener;", "createAnimatorListener", "(Lcom/airbnb/lottie/LottieAnimationView;)Landroid/animation/Animator$AnimatorListener;", "Lwek0;", "uiState", "render", "(Lwek0;)V", "Lxzx;", "binding", "Lxzx;", "Lcom/yandex/go/design/view/GoFrameLayout;", "trailContainer", "Lcom/yandex/go/design/view/GoFrameLayout;", "trailItemSize", CA20Status.STATUS_USER_I, "lottieAnimationView$delegate", "Li3y;", "getLottieAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "Landroid/widget/ImageView;", "imageView$delegate", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Landroid/animation/ValueAnimator;", "lottieViewFadeInAnimator$delegate", "getLottieViewFadeInAnimator", "()Landroid/animation/ValueAnimator;", "lottieViewFadeInAnimator", "", "animationDelay", "J", "animationShownCount", "animationRepeatCount", "", "playingAnimationId", "Ljava/lang/String;", "Companion", "yek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardCompanionSectionView extends GoConstraintLayout {
    public static final int $stable = 8;
    private static final yek0 Companion = new yek0();

    @Deprecated
    public static final long FADE_IN_DURATION = 300;

    @Deprecated
    public static final int TITLE_MAX_LINES = 2;

    @Deprecated
    public static final int TITLE_MIN_LINES = 1;
    private long animationDelay;
    private int animationRepeatCount;
    private int animationShownCount;
    private final xzx binding;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    private final i3y imageView;

    /* renamed from: lottieAnimationView$delegate, reason: from kotlin metadata */
    private final i3y lottieAnimationView;

    /* renamed from: lottieViewFadeInAnimator$delegate, reason: from kotlin metadata */
    private final i3y lottieViewFadeInAnimator;
    private String playingAnimationId;
    private final GoFrameLayout trailContainer;
    private final int trailItemSize;

    public RideCardCompanionSectionView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(zkh0.layout_details_card_companion_section, this);
        int i2 = p8h0.companion_subtitle;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
        if (robotoTextView != null) {
            i2 = p8h0.companion_title;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, this);
            if (robotoTextView2 != null) {
                i2 = p8h0.trail_container_layout;
                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i2, this);
                if (goFrameLayout != null) {
                    this.binding = new xzx(this, robotoTextView, robotoTextView2, goFrameLayout);
                    this.trailContainer = goFrameLayout;
                    this.trailItemSize = tje.r(wug0.companion_trail_item_size, getContext());
                    final int i3 = 0;
                    this.lottieAnimationView = a.a(new sls() { // from class: xek0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            LottieAnimationView lottieAnimationView_delegate$lambda$0;
                            ImageView imageView_delegate$lambda$0;
                            int i4 = i3;
                            RideCardCompanionSectionView rideCardCompanionSectionView = this;
                            Context context2 = context;
                            switch (i4) {
                                case 0:
                                    lottieAnimationView_delegate$lambda$0 = RideCardCompanionSectionView.lottieAnimationView_delegate$lambda$0(context2, rideCardCompanionSectionView);
                                    return lottieAnimationView_delegate$lambda$0;
                                default:
                                    imageView_delegate$lambda$0 = RideCardCompanionSectionView.imageView_delegate$lambda$0(context2, rideCardCompanionSectionView);
                                    return imageView_delegate$lambda$0;
                            }
                        }
                    });
                    final int i4 = 1;
                    this.imageView = a.a(new sls() { // from class: xek0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            LottieAnimationView lottieAnimationView_delegate$lambda$0;
                            ImageView imageView_delegate$lambda$0;
                            int i42 = i4;
                            RideCardCompanionSectionView rideCardCompanionSectionView = this;
                            Context context2 = context;
                            switch (i42) {
                                case 0:
                                    lottieAnimationView_delegate$lambda$0 = RideCardCompanionSectionView.lottieAnimationView_delegate$lambda$0(context2, rideCardCompanionSectionView);
                                    return lottieAnimationView_delegate$lambda$0;
                                default:
                                    imageView_delegate$lambda$0 = RideCardCompanionSectionView.imageView_delegate$lambda$0(context2, rideCardCompanionSectionView);
                                    return imageView_delegate$lambda$0;
                            }
                        }
                    });
                    this.lottieViewFadeInAnimator = a.a(new vyf0(28, this));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void cancelLottieAnimation() {
        this.playingAnimationId = null;
        getLottieAnimationView().cancelAnimation();
        getLottieAnimationView().setVisibility(8);
    }

    private final Animator.AnimatorListener createAnimatorListener(final LottieAnimationView lottieAnimationView) {
        return new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView$createAnimatorListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i;
                long j;
                int i2;
                int i3;
                i = RideCardCompanionSectionView.this.animationRepeatCount;
                if (i != 0) {
                    i2 = RideCardCompanionSectionView.this.animationShownCount;
                    i3 = RideCardCompanionSectionView.this.animationRepeatCount;
                    if (i2 >= i3) {
                        return;
                    }
                }
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                j = RideCardCompanionSectionView.this.animationDelay;
                lottieAnimationView2.postDelayed(new fsz(lottieAnimationView2, 0), j);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                int i;
                RideCardCompanionSectionView rideCardCompanionSectionView = RideCardCompanionSectionView.this;
                i = rideCardCompanionSectionView.animationShownCount;
                rideCardCompanionSectionView.animationShownCount = i + 1;
            }
        };
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LottieAnimationView getLottieAnimationView() {
        return (LottieAnimationView) this.lottieAnimationView.getValue();
    }

    private final ValueAnimator getLottieViewFadeInAnimator() {
        return (ValueAnimator) this.lottieViewFadeInAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView imageView_delegate$lambda$0(Context context, RideCardCompanionSectionView rideCardCompanionSectionView) {
        ImageView imageView = new ImageView(context);
        int i = rideCardCompanionSectionView.trailItemSize;
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(i, i));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieAnimationView lottieAnimationView_delegate$lambda$0(Context context, RideCardCompanionSectionView rideCardCompanionSectionView) {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        int i = rideCardCompanionSectionView.trailItemSize;
        lottieAnimationView.setLayoutParams(new ConstraintLayout.LayoutParams(i, i));
        lottieAnimationView.setRepeatMode(1);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.addAnimatorListener(rideCardCompanionSectionView.createAnimatorListener(lottieAnimationView));
        return lottieAnimationView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator lottieViewFadeInAnimator_delegate$lambda$0(final RideCardCompanionSectionView rideCardCompanionSectionView) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new yso(24, rideCardCompanionSectionView));
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView$lottieViewFadeInAnimator_delegate$lambda$0$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LottieAnimationView lottieAnimationView;
                lottieAnimationView = RideCardCompanionSectionView.this.getLottieAnimationView();
                lottieAnimationView.setVisibility(0);
            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView$lottieViewFadeInAnimator_delegate$lambda$0$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LottieAnimationView lottieAnimationView;
                lottieAnimationView = RideCardCompanionSectionView.this.getLottieAnimationView();
                lottieAnimationView.playAnimation();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lottieViewFadeInAnimator_delegate$lambda$0$0$0(RideCardCompanionSectionView rideCardCompanionSectionView, ValueAnimator valueAnimator) {
        rideCardCompanionSectionView.getLottieAnimationView().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        if (rideCardCompanionSectionView.getLottieAnimationView().isAnimating()) {
            rideCardCompanionSectionView.getLottieAnimationView().pauseAnimation();
            rideCardCompanionSectionView.animationShownCount = 0;
        }
    }

    private final void renderAnimationTrailView(sek0 animationUiState) {
        if (jl40.l(this.playingAnimationId, animationUiState.a)) {
            return;
        }
        this.playingAnimationId = animationUiState.a;
        this.animationShownCount = 0;
        this.animationRepeatCount = animationUiState.d;
        this.animationDelay = animationUiState.c;
        boolean isAnimating = getLottieAnimationView().isAnimating();
        getLottieAnimationView().setComposition(animationUiState.b);
        if (getLottieAnimationView().getVisibility() == 8) {
            this.trailContainer.removeAllViews();
            this.trailContainer.addView(getLottieAnimationView());
            getLottieViewFadeInAnimator().start();
        } else {
            if (isAnimating) {
                return;
            }
            getLottieAnimationView().playAnimation();
        }
    }

    private final void renderEmptyTrailView() {
        cancelLottieAnimation();
        this.trailContainer.removeAllViews();
    }

    private final void renderImageTrailView(uek0 imageUiState) {
        Drawable drawable = imageUiState.a.getDrawable();
        if (drawable == null) {
            renderEmptyTrailView();
            return;
        }
        getImageView().setImageDrawable(drawable);
        cancelLottieAnimation();
        this.trailContainer.removeAllViews();
        this.trailContainer.addView(getImageView());
    }

    private final void setupTrailView(vek0 trailUiState) {
        if (trailUiState instanceof sek0) {
            renderAnimationTrailView((sek0) trailUiState);
            return;
        }
        if (trailUiState instanceof uek0) {
            renderImageTrailView((uek0) trailUiState);
        } else if (trailUiState instanceof tek0) {
            renderEmptyTrailView();
        } else {
            w511.b();
        }
    }

    public final void render(wek0 uiState) {
        xzx xzxVar = this.binding;
        xzxVar.c.setText(uiState.c.a);
        RobotoTextView robotoTextView = xzxVar.b;
        rek0 rek0Var = uiState.c;
        CharSequence charSequence = rek0Var.b;
        robotoTextView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        robotoTextView.setText(rek0Var.b);
        xzxVar.c.setMaxLines(robotoTextView.getVisibility() == 0 ? 1 : 2);
        setupTrailView(uiState.d);
    }

    public RideCardCompanionSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RideCardCompanionSectionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RideCardCompanionSectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
