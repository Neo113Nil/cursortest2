package com.yandex.go.splash.dynamic;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.image.api.domain.models.ImageModel$Tag$Theme;
import com.yandex.go.image.domain.requests.f;
import com.yandex.go.splash.BaseSplashView;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.splash.dynamic.DynamicSplashView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a4h0;
import defpackage.a82;
import defpackage.cma1;
import defpackage.fkh0;
import defpackage.h9n;
import defpackage.jx81;
import defpackage.n5h0;
import defpackage.n9n;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.qje;
import defpackage.qqt0;
import defpackage.sah;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.v7h0;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.z4n;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u0001:\u0001LBW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b$\u0010\u001aJ\u001f\u0010'\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001a\u00103\u001a\u00020\u001b8\u0014X\u0094D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0014X\u0094\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u0004\u0018\u00010H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/yandex/go/splash/dynamic/DynamicSplashView;", "Lcom/yandex/go/splash/BaseSplashView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lcom/yandex/go/splash/data/dto/DynamicSplash;", "splash", "Lh9n;", "dynamicSplashDelegate", "Ltse;", "coroutineScope", "Lpav;", "imageLoader", "Lcom/yandex/go/splash/dynamic/a;", "dynamicSplashInteractor", "Lqqt0;", "hapticPreferences", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/yandex/go/splash/data/dto/DynamicSplash;Lh9n;Ltse;Lpav;Lcom/yandex/go/splash/dynamic/a;Lqqt0;)V", "Ljava/lang/Runnable;", "detachFromParent", "Lzy11;", "animateBackground", "(Ljava/lang/Runnable;)V", "", "delay", "duration", "amplitude", "vibrate", "(JJI)V", "animateFade", "onAttachedToWindow", "()V", "hide", "width", "height", "recalculateBounds", "(II)V", "Landroid/animation/ValueAnimator;", "animation", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Lcom/yandex/go/splash/data/dto/DynamicSplash;", "Lh9n;", "Ltse;", "Lpav;", "Lcom/yandex/go/splash/dynamic/a;", "Lqqt0;", "inDuration", "J", "getInDuration", "()J", "Landroid/view/animation/OvershootInterpolator;", "interpolator", "Landroid/view/animation/OvershootInterpolator;", "getInterpolator", "()Landroid/view/animation/OvershootInterpolator;", "Lz4n;", "binding", "Lz4n;", "startColor", CA20Status.STATUS_USER_I, "endColor", "Landroid/view/View;", "rootView", "Landroid/view/View;", "", "baseTranslationY", "F", "Landroid/os/Vibrator;", "vibrator", "Landroid/os/Vibrator;", "Companion", "n9n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DynamicSplashView extends BaseSplashView {
    private static final int BASE_TRANSLATION_Y = 80;
    private static final n9n Companion = new n9n();
    private float baseTranslationY;
    private final z4n binding;
    private final tse coroutineScope;
    private final h9n dynamicSplashDelegate;
    private final a dynamicSplashInteractor;
    private final int endColor;
    private final qqt0 hapticPreferences;
    private final pav imageLoader;
    private final long inDuration;
    private final OvershootInterpolator interpolator;
    private final View rootView;
    private final DynamicSplash splash;
    private final int startColor;
    private final Vibrator vibrator;

    public DynamicSplashView(Context context, AttributeSet attributeSet, int i, DynamicSplash dynamicSplash, h9n h9nVar, tse tseVar, pav pavVar, a aVar, qqt0 qqt0Var) {
        super(context, attributeSet, i);
        Vibrator vibrator;
        ImageModel$Tag$Theme imageModel$Tag$Theme;
        final int i2;
        this.splash = dynamicSplash;
        this.dynamicSplashDelegate = h9nVar;
        this.coroutineScope = tseVar;
        this.imageLoader = pavVar;
        this.dynamicSplashInteractor = aVar;
        this.hapticPreferences = qqt0Var;
        this.interpolator = new OvershootInterpolator(1.075f);
        View inflate = LayoutInflater.from(context).inflate(fkh0.dynamic_animation_splash_layout, (ViewGroup) null, false);
        int i3 = v7h0.background_image_view;
        ImageView imageView = (ImageView) cma1.O(i3, inflate);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i3 = v7h0.logo;
            ImageView imageView2 = (ImageView) cma1.O(i3, inflate);
            if (imageView2 != null) {
                i3 = v7h0.logo_container;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i3, inflate);
                if (linearLayout != null) {
                    i3 = v7h0.title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i3, inflate);
                    if (appCompatTextView != null) {
                        i3 = v7h0.top_image_view;
                        ImageView imageView3 = (ImageView) cma1.O(i3, inflate);
                        if (imageView3 != null) {
                            final z4n z4nVar = new z4n(constraintLayout, imageView, constraintLayout, imageView2, linearLayout, appCompatTextView, imageView3);
                            this.binding = z4nVar;
                            sah sahVar = (sah) h9nVar;
                            sahVar.getClass();
                            int color = context.getColor(xqg0.go_brand);
                            this.startColor = color;
                            this.endColor = qje.t(xng0.bgMain, getContext());
                            this.rootView = constraintLayout;
                            this.baseTranslationY = ru.yandex.taxi.design.utils.c.j(80, constraintLayout);
                            if (jx81.e()) {
                                VibratorManager h = a82.h(context.getSystemService("vibrator_manager"));
                                vibrator = h != null ? h.getDefaultVibrator() : null;
                            } else {
                                vibrator = (Vibrator) context.getSystemService("vibrator");
                            }
                            this.vibrator = vibrator;
                            sahVar.getClass();
                            imageView2.setImageDrawable(vng.t(a4h0.go_splash_logo, context));
                            constraintLayout.setBackgroundColor(color);
                            Resources resources = getResources();
                            sahVar.getClass();
                            Typeface font = resources.getFont(n5h0.ys_display_cond_black);
                            Paint paint = new Paint();
                            paint.setTextSize(tje.b0(getContext(), 40.0f));
                            paint.setTypeface(font);
                            paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
                            paint.setStyle(Paint.Style.FILL);
                            Rect rect = new Rect();
                            String str = dynamicSplash.j;
                            String str2 = dynamicSplash.e;
                            String str3 = dynamicSplash.d;
                            if (str != null) {
                                paint.getTextBounds(str, 0, str.length(), rect);
                            }
                            addView(constraintLayout);
                            appCompatTextView.setTypeface(font);
                            h9nVar.getClass();
                            appCompatTextView.setTextSize(2, 40.0f);
                            imageView3.setY(context.getResources().getDisplayMetrics().heightPixels);
                            imageView.setY(this.baseTranslationY);
                            String str4 = dynamicSplash.j;
                            appCompatTextView.setText(str4 == null ? "" : str4);
                            String str5 = dynamicSplash.c;
                            if (str5 != null) {
                                appCompatTextView.setTextColor(Color.parseColor(str5));
                            }
                            if (str3 != null) {
                                f g = pavVar.g();
                                imageModel$Tag$Theme = null;
                                i2 = 0;
                                g.c(new obv(str3, null, 6, 0));
                                f.a(g, new tls() { // from class: l9n
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        zy11 lambda$1$1;
                                        zy11 lambda$1$2;
                                        int i4 = i2;
                                        z4n z4nVar2 = z4nVar;
                                        Bitmap bitmap = (Bitmap) obj;
                                        switch (i4) {
                                            case 0:
                                                lambda$1$1 = DynamicSplashView.lambda$1$1(z4nVar2, bitmap);
                                                return lambda$1$1;
                                            default:
                                                lambda$1$2 = DynamicSplashView.lambda$1$2(z4nVar2, bitmap);
                                                return lambda$1$2;
                                        }
                                    }
                                });
                            } else {
                                imageModel$Tag$Theme = null;
                                i2 = 0;
                            }
                            if (str2 != null) {
                                f g2 = pavVar.g();
                                g2.c(new obv(str2, imageModel$Tag$Theme, 6, i2));
                                final int i4 = 1;
                                f.a(g2, new tls() { // from class: l9n
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        zy11 lambda$1$1;
                                        zy11 lambda$1$2;
                                        int i42 = i4;
                                        z4n z4nVar2 = z4nVar;
                                        Bitmap bitmap = (Bitmap) obj;
                                        switch (i42) {
                                            case 0:
                                                lambda$1$1 = DynamicSplashView.lambda$1$1(z4nVar2, bitmap);
                                                return lambda$1$1;
                                            default:
                                                lambda$1$2 = DynamicSplashView.lambda$1$2(z4nVar2, bitmap);
                                                return lambda$1$2;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    private final void animateBackground(final Runnable detachFromParent) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.startColor), Integer.valueOf(this.endColor));
        ofObject.setDuration(this.splash.i);
        DynamicSplash dynamicSplash = this.splash;
        ofObject.setStartDelay(dynamicSplash.h + dynamicSplash.g);
        final int i = 0;
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m9n
            public final /* synthetic */ DynamicSplashView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                DynamicSplashView dynamicSplashView = this.b;
                switch (i2) {
                    case 0:
                        DynamicSplashView.animateBackground$lambda$0$0(dynamicSplashView, valueAnimator);
                        break;
                    default:
                        DynamicSplashView.animateBackground$lambda$1$0(dynamicSplashView, valueAnimator);
                        break;
                }
            }
        });
        ofObject.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.splash.dynamic.DynamicSplashView$animateBackground$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DynamicSplashView.this.animateFade(detachFromParent);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofObject.start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(this.splash.i);
        DynamicSplash dynamicSplash2 = this.splash;
        ofFloat.setStartDelay(dynamicSplash2.h + dynamicSplash2.g);
        final int i2 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m9n
            public final /* synthetic */ DynamicSplashView b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i2;
                DynamicSplashView dynamicSplashView = this.b;
                switch (i22) {
                    case 0:
                        DynamicSplashView.animateBackground$lambda$0$0(dynamicSplashView, valueAnimator);
                        break;
                    default:
                        DynamicSplashView.animateBackground$lambda$1$0(dynamicSplashView, valueAnimator);
                        break;
                }
            }
        });
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBackground$lambda$0$0(DynamicSplashView dynamicSplashView, ValueAnimator valueAnimator) {
        dynamicSplashView.binding.c.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBackground$lambda$1$0(DynamicSplashView dynamicSplashView, ValueAnimator valueAnimator) {
        dynamicSplashView.binding.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        dynamicSplashView.binding.g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        dynamicSplashView.binding.f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        dynamicSplashView.binding.b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateFade(Runnable detachFromParent) {
        animate().alpha(0.0f).setDuration(this.splash.i).withEndAction(detachFromParent).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$1$1(z4n z4nVar, Bitmap bitmap) {
        z4nVar.g.setImageBitmap(bitmap);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$1$2(z4n z4nVar, Bitmap bitmap) {
        z4nVar.b.setImageBitmap(bitmap);
        return zy11.a;
    }

    private final void vibrate(long delay, long duration, int amplitude) {
        Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasAmplitudeControl()) {
            return;
        }
        tje.N(this.coroutineScope, null, null, new DynamicSplashView$vibrate$1(delay, this, duration, amplitude, null), 3);
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public long getInDuration() {
        return this.inDuration;
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void hide(Runnable detachFromParent) {
        int i = getResources().getDisplayMetrics().heightPixels;
        WindowInsets rootWindowInsets = this.rootView.getRootWindowInsets();
        int stableInsetTop = i + (rootWindowInsets != null ? rootWindowInsets.getStableInsetTop() : 0);
        int stableInsetBottom = (int) ((stableInsetTop + (this.rootView.getRootWindowInsets() != null ? r1.getStableInsetBottom() : 0)) * 0.47d);
        ImageView imageView = this.binding.g;
        ru.yandex.taxi.design.utils.c.D(imageView.getLayoutParams().width, stableInsetBottom, imageView);
        ImageView imageView2 = this.binding.b;
        ru.yandex.taxi.design.utils.c.D(imageView2.getLayoutParams().width, (int) (tje.w(24, getContext()) + imageView2.getHeight() + (this.rootView.getRootWindowInsets() != null ? r3.getStableInsetTop() : 0) + (this.rootView.getRootWindowInsets() != null ? r3.getStableInsetBottom() : 0)), imageView2);
        this.baseTranslationY = Math.max(this.baseTranslationY, tje.w(24, getContext()) + ((this.binding.f.getBottom() - (getResources().getDisplayMetrics().heightPixels - stableInsetBottom)) - (this.binding.f.getTop() - (getResources().getDisplayMetrics().heightPixels - stableInsetBottom))));
        WindowInsets rootWindowInsets2 = this.rootView.getRootWindowInsets();
        Number valueOf = rootWindowInsets2 != null ? Integer.valueOf(rootWindowInsets2.getStableInsetBottom()) : Float.valueOf(0.0f);
        this.binding.e.animate().translationY(-this.baseTranslationY).scaleY(0.7f).scaleX(0.7f).setDuration(this.splash.g).setInterpolator(getInterpolator()).start();
        this.binding.f.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationY(tje.w(8, getContext()) + ((-this.baseTranslationY) - this.splash.l)).setDuration(this.splash.g).setInterpolator(getInterpolator()).start();
        this.binding.g.animate().alpha(1.0f).translationY(valueOf.floatValue()).setDuration(this.splash.g).setInterpolator(getInterpolator()).start();
        this.binding.b.animate().alpha(1.0f).translationY(0.0f).setDuration(this.splash.g).setInterpolator(getInterpolator()).start();
        animateBackground(detachFromParent);
        this.dynamicSplashDelegate.getClass();
        if (this.hapticPreferences.a()) {
            vibrate(0L, 25L, 32);
            long j = this.splash.g - 200;
            vibrate(j < 0 ? 0L : j, 25L, 32);
            vibrate(this.splash.g, 25L, 20);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
    }

    @Override // com.yandex.go.splash.BaseSplashView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tje.N(this.coroutineScope, null, null, new DynamicSplashView$onAttachedToWindow$1(this, null), 3);
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void recalculateBounds(int width, int height) {
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public OvershootInterpolator getInterpolator() {
        return this.interpolator;
    }

    public DynamicSplashView(Context context, DynamicSplash dynamicSplash, h9n h9nVar, tse tseVar, pav pavVar, a aVar, qqt0 qqt0Var) {
        this(context, null, 0, dynamicSplash, h9nVar, tseVar, pavVar, aVar, qqt0Var, 6, null);
    }

    public DynamicSplashView(Context context, AttributeSet attributeSet, DynamicSplash dynamicSplash, h9n h9nVar, tse tseVar, pav pavVar, a aVar, qqt0 qqt0Var) {
        this(context, attributeSet, 0, dynamicSplash, h9nVar, tseVar, pavVar, aVar, qqt0Var, 4, null);
    }

    public /* synthetic */ DynamicSplashView(Context context, AttributeSet attributeSet, int i, DynamicSplash dynamicSplash, h9n h9nVar, tse tseVar, pav pavVar, a aVar, qqt0 qqt0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, dynamicSplash, h9nVar, tseVar, pavVar, aVar, qqt0Var);
    }
}
