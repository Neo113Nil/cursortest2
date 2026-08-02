package com.yandex.go.platform.ui.components;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.e;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.platform.lottie_splash.domain.LottiePositionPresentationModel;
import com.yandex.go.platform.lottie_splash.domain.LottieSplashThemePresentationModel;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.apg0;
import defpackage.evu0;
import defpackage.fbz;
import defpackage.guz;
import defpackage.huz;
import defpackage.s6h0;
import defpackage.sls;
import defpackage.xuh0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 B2\u00020\u0001:\u0001CB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\f*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b)\u0010(J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/yandex/go/platform/ui/components/LottieSplashView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/yandex/go/platform/lottie_splash/domain/LottiePositionPresentationModel;", "lottiePosition", "Lzy11;", "setLottiePosition", "(Lcom/yandex/go/platform/lottie_splash/domain/LottiePositionPresentationModel;)V", "", "customSpiralColor", "updateSpiralIconColor", "(Ljava/lang/String;)V", "Landroid/widget/ImageView;", "color", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTint", "(Landroid/widget/ImageView;ILandroid/graphics/PorterDuff$Mode;)V", "splashBackgroundColor", "initBackgroundTransitionDrawable", "(I)V", "updateBackgroundColor", "defaultBackgroundColor", "setDefaultBackgroundColor", "Landroid/graphics/drawable/Drawable;", "logoDrawable", "setDefaultLogo", "(Landroid/graphics/drawable/Drawable;)V", "startSpiralAnimation", "()V", "Lkotlin/Function0;", "listener", "setOnEndSpiralAnimationListener", "(Lsls;)V", "setOnEndLottieAnimationListener", "Lcom/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel;", "lottieSplashThemePresentationModel", "startAdditionalAnimation", "(Lcom/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel;)V", "endSpiralAnimationListener", "Lsls;", "endLottieAnimationListener", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Ljava/lang/Integer;", "getLogo", "()Landroid/widget/ImageView;", "logo", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getSplashBackground", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "splashBackground", "Landroid/view/View;", "getLottieView", "()Landroid/view/View;", "lottieView", "Landroidx/constraintlayout/widget/Guideline;", "getCenterPositionGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "centerPositionGuideline", "Companion", "guz", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LottieSplashView extends FrameLayout {

    @Deprecated
    public static final int COLOR_TRANSITION_DURATION_MS = 250;
    private static final guz Companion = new guz();

    @Deprecated
    public static final float FULL_ALPHA = 1.0f;
    private static final String LOTTIE_CACHE_KEY = "custom_splash";

    @Deprecated
    public static final long SPIRAL_ANIMATION_DURATION_MS = 800;
    private Integer backgroundColor;
    private sls endLottieAnimationListener;
    private sls endSpiralAnimationListener;

    public LottieSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.endSpiralAnimationListener = LottieSplashView$endSpiralAnimationListener$1.w;
        this.endLottieAnimationListener = LottieSplashView$endLottieAnimationListener$1.w;
        View.inflate(context, xuh0.splash_lottie_view, this);
    }

    private final Guideline getCenterPositionGuideline() {
        return (Guideline) findViewById(s6h0.center_position_guideline);
    }

    private final ImageView getLogo() {
        return (ImageView) findViewById(s6h0.logo);
    }

    private final View getLottieView() {
        return findViewById(s6h0.lottie_view);
    }

    private final ConstraintLayout getSplashBackground() {
        return (ConstraintLayout) findViewById(s6h0.splash_background);
    }

    private final void initBackgroundTransitionDrawable(int splashBackgroundColor) {
        Integer num = this.backgroundColor;
        getSplashBackground().setBackground(new TransitionDrawable(new ColorDrawable[]{new ColorDrawable(num != null ? num.intValue() : getContext().getColor(apg0.red_normal)), new ColorDrawable(splashBackgroundColor)}));
    }

    private final void setLottiePosition(LottiePositionPresentationModel lottiePosition) {
        if (lottiePosition == null) {
            return;
        }
        e eVar = new e();
        eVar.g(getSplashBackground());
        int i = huz.a[lottiePosition.ordinal()];
        if (i == 1) {
            eVar.i(getLottieView().getId(), 4, getCenterPositionGuideline().getId(), 4);
        } else if (i == 2) {
            eVar.e(getLottieView().getId(), 4);
            eVar.i(getLottieView().getId(), 3, 0, 3);
        }
        eVar.b(getSplashBackground());
    }

    private final void setTint(ImageView imageView, int i, PorterDuff.Mode mode) {
        imageView.setColorFilter(i, mode);
    }

    public static /* synthetic */ void setTint$default(LottieSplashView lottieSplashView, ImageView imageView, int i, PorterDuff.Mode mode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        lottieSplashView.setTint(imageView, i, mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSpiralAnimation$lambda$1(LottieSplashView lottieSplashView) {
        lottieSplashView.endSpiralAnimationListener.invoke();
    }

    private final void updateBackgroundColor(String splashBackgroundColor) {
        int i = 0;
        if (splashBackgroundColor != null && !evu0.J(splashBackgroundColor)) {
            try {
                String upperCase = splashBackgroundColor.toUpperCase(Locale.ROOT);
                if (splashBackgroundColor.charAt(0) != '#') {
                    upperCase = ShimmerDivHandler.NUMBER_SING.concat(upperCase);
                }
                i = Color.parseColor(upperCase);
            } catch (IllegalArgumentException unused) {
            }
        }
        initBackgroundTransitionDrawable(i);
        ((TransitionDrawable) getSplashBackground().getBackground()).startTransition(250);
    }

    private final void updateSpiralIconColor(String customSpiralColor) {
        if (customSpiralColor != null) {
            ImageView logo = getLogo();
            int i = 0;
            if (!evu0.J(customSpiralColor)) {
                try {
                    String upperCase = customSpiralColor.toUpperCase(Locale.ROOT);
                    if (customSpiralColor.charAt(0) != '#') {
                        upperCase = ShimmerDivHandler.NUMBER_SING.concat(upperCase);
                    }
                    i = Color.parseColor(upperCase);
                } catch (IllegalArgumentException unused) {
                }
            }
            setTint$default(this, logo, i, null, 2, null);
        }
    }

    public final void setDefaultBackgroundColor(int defaultBackgroundColor) {
        Integer valueOf = Integer.valueOf(getContext().getColor(defaultBackgroundColor));
        getSplashBackground().setBackgroundColor(valueOf.intValue());
        this.backgroundColor = valueOf;
    }

    public final void setDefaultLogo(Drawable logoDrawable) {
        getLogo().setImageDrawable(logoDrawable);
    }

    public final void setOnEndLottieAnimationListener(sls listener) {
        this.endLottieAnimationListener = listener;
    }

    public final void setOnEndSpiralAnimationListener(sls listener) {
        this.endSpiralAnimationListener = listener;
    }

    public final void startAdditionalAnimation(LottieSplashThemePresentationModel lottieSplashThemePresentationModel) {
        updateBackgroundColor(lottieSplashThemePresentationModel.b);
        updateSpiralIconColor(lottieSplashThemePresentationModel.c);
        setLottiePosition(lottieSplashThemePresentationModel.d);
        getLottieView().setVisibility(0);
    }

    public final void startSpiralAnimation() {
        getLogo().animate().alpha(1.0f).setDuration(800L).withEndAction(new fbz(8, this)).start();
    }

    public LottieSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LottieSplashView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LottieSplashView(Context context) {
        this(context, null, 0, 6, null);
    }
}
