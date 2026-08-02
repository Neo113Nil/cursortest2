package com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.apq;
import defpackage.bpq;
import defpackage.eja1;
import defpackage.oxu0;
import defpackage.qje;
import defpackage.t7j;
import defpackage.tje;
import defpackage.tls;
import defpackage.up11;
import defpackage.w0d;
import defpackage.xng0;
import defpackage.yip0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.styling.g;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 G2\u00020\u0001:\u0001HB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b$\u0010\u0016J\u001f\u0010&\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020\u0019¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u0018J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u0010,\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\n @*\u0004\u0018\u00010?0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010C\u001a\n @*\u0004\u0018\u00010?0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/FeedOnboardingButton;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Loxu0;", "styleScreenRepository", "Landroid/content/Context;", "context", "<init>", "(Loxu0;Landroid/content/Context;)V", "Landroid/graphics/Bitmap;", "icon", "Lzy11;", "setIcon", "(Landroid/graphics/Bitmap;)V", "", "getBottomBorder", "()F", "Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/MainScreenOnboardingButtonProperties;", Constants.KEY_DATA, "Lkotlin/Function1;", "Lkr;", "handleAction", "onClick", "(Lcom/yandex/go/flex/main_screen/presentation/divkit/custom_view/onboarding_button/MainScreenOnboardingButtonProperties;Ltls;)V", "invalidateComponent", "()V", "", "isEnabled", "()Z", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "onAttachedToWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "bindData", "animated", "setIconAndShow", "(Landroid/graphics/Bitmap;Z)V", "hide", "release", "Loxu0;", "Z", "isButtonOnScreen", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "Lcom/yandex/go/design/view/GoImageView;", "iconView", "Lcom/yandex/go/design/view/GoImageView;", "", "defaultSizePx", CA20Status.STATUS_USER_I, "defaultSizeHalfPx", "animRangePx", "F", "Landroid/view/animation/AccelerateInterpolator;", "accelerateInterpolator", "Landroid/view/animation/AccelerateInterpolator;", "Landroid/view/animation/DecelerateInterpolator;", "decelerateInterpolator", "Landroid/view/animation/DecelerateInterpolator;", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "topIdleAnimator", "Landroid/animation/ObjectAnimator;", "bottomIdleAnimator", "Landroid/animation/AnimatorSet;", "idleAnimator", "Landroid/animation/AnimatorSet;", "Companion", "bpq", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedOnboardingButton extends GoLinearLayout {
    private static final long CHANGE_BOUNDS_BOTTOM_ANIMATION_DURATION = 500;
    private static final long CHANGE_BOUNDS_TOP_ANIMATION_DURATION = 1000;
    public static final bpq Companion = new bpq();
    private static final float DEFAULT_BOTTOM_BORDER = 500.0f;
    public static final int FEED_ONBOARDING_BUTTON_ANIMATION_SPREAD = 20;
    private static final int FEED_ONBOARDING_BUTTON_DEFAULT_DIMENSION_SIZE = 48;
    private static final float HORIZONTAL_PADDING = 18.0f;
    private static final float ICON_LEFT_PADDING = 8.0f;
    private static final long IN_OUT_ANIMATION_DURATION = 600;
    private static final float TEXT_SIZE_SP = 14.0f;
    private final AccelerateInterpolator accelerateInterpolator;
    private final float animRangePx;
    private final ObjectAnimator bottomIdleAnimator;
    private DecelerateInterpolator decelerateInterpolator;
    private int defaultSizeHalfPx;
    private int defaultSizePx;
    private final GoImageView iconView;
    private final AnimatorSet idleAnimator;
    private boolean isButtonOnScreen;
    private boolean isEnabled;
    private final oxu0 styleScreenRepository;
    private final TextView textView;
    private final ObjectAnimator topIdleAnimator;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeedOnboardingButton(oxu0 oxu0Var, Context context) {
        super(context, null, 0, r4, 14, r6);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        this.styleScreenRepository = oxu0Var;
        TextView textView = new TextView(context);
        this.textView = textView;
        GoImageView goImageView = new GoImageView(context, null, i, 6, defaultConstructorMarker);
        this.iconView = goImageView;
        int w = (int) tje.w(48, getContext());
        this.defaultSizePx = w;
        this.defaultSizeHalfPx = w / 2;
        float w2 = tje.w(20, getContext());
        this.animRangePx = w2;
        this.accelerateInterpolator = new AccelerateInterpolator();
        this.decelerateInterpolator = new DecelerateInterpolator();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", w2, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        this.topIdleAnimator = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationY", 0.0f, w2);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.bottomIdleAnimator = ofFloat2;
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.flex.main_screen.presentation.divkit.custom_view.onboarding_button.FeedOnboardingButton$idleAnimator$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean z;
                z = FeedOnboardingButton.this.isButtonOnScreen;
                if (z) {
                    animatorSet.start();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.idleAnimator = animatorSet;
        setVisibility(4);
        setGravity(17);
        int x = (int) tje.x(getContext(), HORIZONTAL_PADDING);
        setPadding(x, 0, x, 0);
        int[] iArr = up11.a;
        textView.setTypeface(eja1.w(3, 0));
        textView.setTextSize(2, 14.0f);
        textView.setSingleLine();
        textView.setEllipsize(null);
        textView.setContentDescription(null);
        addView(textView, 0);
        addView(goImageView, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindData$lambda$0(FeedOnboardingButton feedOnboardingButton, MainScreenOnboardingButtonProperties mainScreenOnboardingButtonProperties, tls tlsVar) {
        feedOnboardingButton.onClick(mainScreenOnboardingButtonProperties, tlsVar);
        return zy11.a;
    }

    private final float getBottomBorder() {
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        return view != null ? view.getY() + view.getHeight() + view.getPaddingBottom() : DEFAULT_BOTTOM_BORDER;
    }

    private final void invalidateComponent() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), ((g) this.styleScreenRepository).b().b);
        w0d w0dVar = new w0d();
        w0dVar.h = this.defaultSizeHalfPx;
        w0dVar.a = qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert);
        setBackgroundDrawable(w0dVar.a());
        this.textView.setTextColor(qje.u(contextThemeWrapper.getTheme(), xng0.textInvert));
    }

    private final void onClick(MainScreenOnboardingButtonProperties data, tls handleAction) {
        String str = data.c;
        if (str != null) {
            hide();
            handleAction.invoke(new yip0(str, data.f, 1, true));
        }
    }

    private final void setIcon(Bitmap icon) {
        GoImageView goImageView = this.iconView;
        if (icon == null) {
            goImageView.setVisibility(8);
            this.textView.setPadding(0, 0, 0, 0);
            return;
        }
        goImageView.getLayoutParams().width = this.defaultSizeHalfPx;
        this.iconView.getLayoutParams().height = this.defaultSizeHalfPx;
        this.iconView.setVisibility(0);
        this.textView.setPadding(0, 0, (int) tje.x(getContext(), 8.0f), 0);
        this.iconView.setImageBitmap(icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setIconAndShow$lambda$0(FeedOnboardingButton feedOnboardingButton) {
        feedOnboardingButton.idleAnimator.start();
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        invalidateComponent();
    }

    public final void bindData(MainScreenOnboardingButtonProperties data, tls handleAction) {
        ru.yandex.taxi.design.utils.c.z(new t7j(8, this, data, handleAction), this);
        this.textView.setText(data.a);
    }

    public final void hide() {
        this.isButtonOnScreen = false;
        animate().translationY(getBottomBorder()).alpha(0.0f).setInterpolator(this.accelerateInterpolator).setDuration(600L).withEndAction(new apq(this, 0)).start();
        this.isEnabled = false;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLayoutParams().width = -2;
        getLayoutParams().height = this.defaultSizePx;
        invalidateComponent();
    }

    public final void release() {
        this.isButtonOnScreen = false;
        this.idleAnimator.cancel();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    public final void setIconAndShow(Bitmap icon, boolean animated) {
        if (this.isButtonOnScreen) {
            return;
        }
        setIcon(icon);
        this.isButtonOnScreen = true;
        setVisibility(0);
        if (animated) {
            setTranslationY(getBottomBorder());
            setAlpha(0.0f);
            animate().translationY(this.animRangePx).alpha(1.0f).setInterpolator(this.decelerateInterpolator).setDuration(600L).withEndAction(new apq(this, 1)).start();
        } else {
            setAlpha(1.0f);
            setTranslationY(this.animRangePx);
            this.idleAnimator.start();
        }
        this.isEnabled = true;
    }
}
