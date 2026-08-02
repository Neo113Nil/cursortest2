package com.yandex.plus.animation.taxi;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.animation.taxi.TaxiAnimationLayout;
import defpackage.amh0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.mpx0;
import defpackage.mxp0;
import defpackage.oew0;
import defpackage.qoi0;
import defpackage.r9h0;
import defpackage.sls;
import defpackage.ttx0;
import defpackage.utx0;
import defpackage.wv5;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001NB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ=\u0010\u0012\u001a\u00020\u0011*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0018\"\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010\bR\u001b\u0010)\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001b\u0010/\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001b\u00102\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u001b\u00105\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001b\u00108\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(R\u001b\u0010;\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R\u001b\u0010>\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010(R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010FR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/yandex/plus/animation/taxi/TaxiAnimationLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "animateWheels", "()V", "animateGift", "animatePlusIcon", "animateAvatar", "Landroid/widget/ImageView;", "Lkotlin/Function0;", "nextAction", "additionalAnimatedView", "additionalEndAction", "Landroid/animation/ValueAnimator;", "createAnimator", "(Landroid/widget/ImageView;Lsls;Landroid/widget/ImageView;Lsls;)Landroid/animation/ValueAnimator;", "", "animationDuration", "", "isClockwise", "", "animatedViews", "createRotationAnimator", "(JZ[Landroid/widget/ImageView;)Landroid/animation/ValueAnimator;", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "leftBackWheel$delegate", "Lwv5;", "getLeftBackWheel", "()Landroid/widget/ImageView;", "leftBackWheel", "rightBackWheel$delegate", "getRightBackWheel", "rightBackWheel", "leftFrontWheel$delegate", "getLeftFrontWheel", "leftFrontWheel", "rightFrontWheel$delegate", "getRightFrontWheel", "rightFrontWheel", "gift$delegate", "getGift", "gift", "avatar$delegate", "getAvatar", "avatar", "plusIcon$delegate", "getPlusIcon", "plusIcon", "plusDash$delegate", "getPlusDash", "plusDash", "", "halfWidth$delegate", "Li3y;", "getHalfWidth", "()F", "halfWidth", "wheelsAnimator", "Landroid/animation/ValueAnimator;", "giftAnimatior", "plusIconAnimatior", "avatarAnimatior", "Landroid/view/animation/LinearInterpolator;", "defaultInterpolator", "Landroid/view/animation/LinearInterpolator;", "Companion", "ttx0", "plus-sdk-loading-animation-taxi_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaxiAnimationLayout extends ConstraintLayout {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("leftBackWheel", 0, "getLeftBackWheel()Landroid/widget/ImageView;", TaxiAnimationLayout.class), b64.x(qoi0.a, TaxiAnimationLayout.class, "rightBackWheel", "getRightBackWheel()Landroid/widget/ImageView;", 0), new PropertyReference1Impl("leftFrontWheel", 0, "getLeftFrontWheel()Landroid/widget/ImageView;", TaxiAnimationLayout.class), new PropertyReference1Impl("rightFrontWheel", 0, "getRightFrontWheel()Landroid/widget/ImageView;", TaxiAnimationLayout.class), new PropertyReference1Impl("gift", 0, "getGift()Landroid/widget/ImageView;", TaxiAnimationLayout.class), new PropertyReference1Impl("avatar", 0, "getAvatar()Landroid/widget/ImageView;", TaxiAnimationLayout.class), new PropertyReference1Impl("plusIcon", 0, "getPlusIcon()Landroid/widget/ImageView;", TaxiAnimationLayout.class), new PropertyReference1Impl("plusDash", 0, "getPlusDash()Landroid/widget/ImageView;", TaxiAnimationLayout.class)};
    private static final ttx0 Companion = new ttx0();

    @Deprecated
    public static final long DEFAULT_ANIMATION_DURATION = 1500;

    @Deprecated
    public static final float END_ROTATION_ANIMATION_DEGREE = 359.0f;

    @Deprecated
    public static final long PLUS_ICON_ROTATION_DURATION = 800;

    @Deprecated
    public static final float START_ROTATION_ANIMATION_DEGREE = 0.0f;

    @Deprecated
    public static final long WHEELS_ANIMATION_DURATION = 100;

    /* renamed from: avatar$delegate, reason: from kotlin metadata */
    private final wv5 avatar;
    private ValueAnimator avatarAnimatior;
    private final LinearInterpolator defaultInterpolator;

    /* renamed from: gift$delegate, reason: from kotlin metadata */
    private final wv5 gift;
    private ValueAnimator giftAnimatior;

    /* renamed from: halfWidth$delegate, reason: from kotlin metadata */
    private final i3y halfWidth;

    /* renamed from: leftBackWheel$delegate, reason: from kotlin metadata */
    private final wv5 leftBackWheel;

    /* renamed from: leftFrontWheel$delegate, reason: from kotlin metadata */
    private final wv5 leftFrontWheel;

    /* renamed from: plusDash$delegate, reason: from kotlin metadata */
    private final wv5 plusDash;

    /* renamed from: plusIcon$delegate, reason: from kotlin metadata */
    private final wv5 plusIcon;
    private ValueAnimator plusIconAnimatior;

    /* renamed from: rightBackWheel$delegate, reason: from kotlin metadata */
    private final wv5 rightBackWheel;

    /* renamed from: rightFrontWheel$delegate, reason: from kotlin metadata */
    private final wv5 rightFrontWheel;
    private ValueAnimator wheelsAnimator;

    public TaxiAnimationLayout(Context context) {
        super(context);
        this.leftBackWheel = new wv5(new utx0(this, r9h0.left_back_wheel, 0));
        this.rightBackWheel = new wv5(new utx0(this, r9h0.right_back_wheel, 1));
        this.leftFrontWheel = new wv5(new utx0(this, r9h0.left_front_wheel, 2));
        this.rightFrontWheel = new wv5(new utx0(this, r9h0.right_front_wheel, 3));
        this.gift = new wv5(new utx0(this, r9h0.gift, 4));
        this.avatar = new wv5(new utx0(this, r9h0.avatar, 5));
        this.plusIcon = new wv5(new utx0(this, r9h0.plus_icon, 6));
        int i = 7;
        this.plusDash = new wv5(new utx0(this, r9h0.plus_dash, i));
        this.halfWidth = a.a(new oew0(i, this));
        this.defaultInterpolator = new LinearInterpolator();
        bb1.v(this, amh0.plus_sdk_taxi_animation, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateAvatar() {
        this.avatarAnimatior = createAnimator$default(this, getAvatar(), new TaxiAnimationLayout$animateAvatar$1(0, this, TaxiAnimationLayout.class, "animateGift", "animateGift()V", 0), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateGift() {
        this.giftAnimatior = createAnimator$default(this, getGift(), new TaxiAnimationLayout$animateGift$1(0, this, TaxiAnimationLayout.class, "animatePlusIcon", "animatePlusIcon()V", 0), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animatePlusIcon() {
        this.plusIconAnimatior = createAnimator(getPlusIcon(), new TaxiAnimationLayout$animatePlusIcon$1(0, this, TaxiAnimationLayout.class, "animateAvatar", "animateAvatar()V", 0), getPlusDash(), new TaxiAnimationLayout$animatePlusIcon$2(0, createRotationAnimator(800L, false, getPlusIcon()), ValueAnimator.class, "cancel", "cancel()V", 0));
    }

    private final void animateWheels() {
        this.wheelsAnimator = createRotationAnimator(100L, true, getLeftBackWheel(), getRightBackWheel(), getLeftFrontWheel(), getRightFrontWheel());
    }

    private final ValueAnimator createAnimator(final ImageView imageView, final sls slsVar, final ImageView imageView2, final sls slsVar2) {
        final float x = imageView.getX();
        float measuredWidth = imageView.getMeasuredWidth();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x, -measuredWidth);
        ofFloat.setDuration(1500L);
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: stx0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TaxiAnimationLayout.createAnimator$lambda$5$lambda$2(imageView, imageView2, ref$BooleanRef, this, slsVar, valueAnimator);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.animation.taxi.TaxiAnimationLayout$createAnimator$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                imageView.setX(x);
                ImageView imageView3 = imageView2;
                if (imageView3 != null) {
                    imageView3.setX(x);
                }
                slsVar2.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.animation.taxi.TaxiAnimationLayout$createAnimator$lambda$5$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                sls.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        return ofFloat;
    }

    public static /* synthetic */ ValueAnimator createAnimator$default(TaxiAnimationLayout taxiAnimationLayout, ImageView imageView, sls slsVar, ImageView imageView2, sls slsVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            imageView2 = null;
        }
        if ((i & 4) != 0) {
            slsVar2 = new mpx0(7);
        }
        return taxiAnimationLayout.createAnimator(imageView, slsVar, imageView2, slsVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createAnimator$lambda$5$lambda$2(ImageView imageView, ImageView imageView2, Ref$BooleanRef ref$BooleanRef, TaxiAnimationLayout taxiAnimationLayout, sls slsVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        imageView.setX(floatValue);
        if (imageView2 != null) {
            imageView2.setX(floatValue);
        }
        if (!ref$BooleanRef.element || imageView.getX() >= taxiAnimationLayout.getHalfWidth()) {
            return;
        }
        ref$BooleanRef.element = false;
        slsVar.invoke();
    }

    private final ValueAnimator createRotationAnimator(long animationDuration, boolean isClockwise, final ImageView... animatedViews) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, isClockwise ? 359.0f : -359.0f);
        ofFloat.setDuration(animationDuration);
        ofFloat.setInterpolator(this.defaultInterpolator);
        ofFloat.addUpdateListener(new mxp0(20, animatedViews));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.plus.animation.taxi.TaxiAnimationLayout$createRotationAnimator$lambda$10$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                for (ImageView imageView : animatedViews) {
                    imageView.setRotation(0.0f);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createRotationAnimator$lambda$10$lambda$7(ImageView[] imageViewArr, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (ImageView imageView : imageViewArr) {
            imageView.setRotation(floatValue);
        }
    }

    private final ImageView getAvatar() {
        return (ImageView) this.avatar.a($$delegatedProperties[5]);
    }

    private final ImageView getGift() {
        return (ImageView) this.gift.a($$delegatedProperties[4]);
    }

    private final float getHalfWidth() {
        return ((Number) this.halfWidth.getValue()).floatValue();
    }

    private final ImageView getLeftBackWheel() {
        return (ImageView) this.leftBackWheel.a($$delegatedProperties[0]);
    }

    private final ImageView getLeftFrontWheel() {
        return (ImageView) this.leftFrontWheel.a($$delegatedProperties[2]);
    }

    private final ImageView getPlusDash() {
        return (ImageView) this.plusDash.a($$delegatedProperties[7]);
    }

    private final ImageView getPlusIcon() {
        return (ImageView) this.plusIcon.a($$delegatedProperties[6]);
    }

    private final ImageView getRightBackWheel() {
        return (ImageView) this.rightBackWheel.a($$delegatedProperties[1]);
    }

    private final ImageView getRightFrontWheel() {
        return (ImageView) this.rightFrontWheel.a($$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float halfWidth_delegate$lambda$0(TaxiAnimationLayout taxiAnimationLayout) {
        return taxiAnimationLayout.getWidth() / 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.wheelsAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.giftAnimatior;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.plusIconAnimatior;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.avatarAnimatior;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        animateWheels();
        animateGift();
    }
}
