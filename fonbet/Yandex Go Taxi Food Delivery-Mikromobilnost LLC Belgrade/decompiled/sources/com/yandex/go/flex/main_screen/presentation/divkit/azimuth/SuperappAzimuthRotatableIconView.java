package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.flex.common.api.FeedSdkTheme;
import defpackage.czo0;
import defpackage.d9w0;
import defpackage.e9w0;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.hnr0;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.lbm;
import defpackage.lnv0;
import defpackage.nac;
import defpackage.obv;
import defpackage.pav;
import defpackage.yqq;
import defpackage.ytz;
import defpackage.zqq;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 H2\u00020\u0001:\u0001IB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0012*\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u0010J\u000f\u0010,\u001a\u00020\u000eH\u0014¢\u0006\u0004\b,\u0010\u0010J\u000f\u0010-\u001a\u00020\u000eH\u0014¢\u0006\u0004\b-\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010E¨\u0006J"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/divkit/azimuth/SuperappAzimuthRotatableIconView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/flex/main_screen/presentation/divkit/azimuth/e;", "superappAzimuthRotationPresenter", "Lpav;", "imageLoader", "Lytz;", "lottieLoader", "Lyqq;", "feedSdkThemeInteractor", "<init>", "(Landroid/content/Context;Lcom/yandex/go/flex/main_screen/presentation/divkit/azimuth/e;Lpav;Lytz;Lyqq;)V", "Lzy11;", "startIntro", "()V", "observeThemeChanges", "", "url", "Ld9w0;", "icon", "playIntroAnimation", "(Ljava/lang/String;Ld9w0;)V", "finishIntro", "enableRotation", "registerForeground", "unregisterForeground", "resetAnimation", "scheduleAnimationFallback", "cancelAnimationFallback", "resolveAnimationUrl", "(Ld9w0;)Ljava/lang/String;", "Lcom/yandex/go/flex/common/api/FeedSdkTheme;", "", "isDark", "(Lcom/yandex/go/flex/common/api/FeedSdkTheme;)Z", "Landroid/view/View;", "view", "addLayer", "(Landroid/view/View;)V", "bind", "(Ld9w0;)V", "release", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/go/flex/main_screen/presentation/divkit/azimuth/e;", "Lpav;", "Lytz;", "Lyqq;", "Lcom/yandex/go/design/view/GoImageView;", C0553n3.g, "Lcom/yandex/go/design/view/GoImageView;", "foreground", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "Lhbp0;", "viewScope", "Lhbp0;", "Ll8x;", "animationJob", "Ll8x;", "Ljava/lang/Runnable;", "animationFallback", "Ljava/lang/Runnable;", "boundIcon", "Ld9w0;", "shouldRotate", "Z", "isForegroundRegistered", "isIntroPending", "Companion", "e9w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuperappAzimuthRotatableIconView extends GoFrameLayout {

    @Deprecated
    public static final long ANIMATION_FALLBACK_DELAY_MS = 3000;
    private static final e9w0 Companion = new e9w0();
    private final Runnable animationFallback;
    private l8x animationJob;
    private final LottieAnimationView animationView;
    private final GoImageView background;
    private d9w0 boundIcon;
    private final yqq feedSdkThemeInteractor;
    private final GoImageView foreground;
    private final pav imageLoader;
    private boolean isForegroundRegistered;
    private boolean isIntroPending;
    private final ytz lottieLoader;
    private boolean shouldRotate;
    private final e superappAzimuthRotationPresenter;
    private final hbp0 viewScope;

    public SuperappAzimuthRotatableIconView(Context context, e eVar, pav pavVar, ytz ytzVar, yqq yqqVar) {
        super(context, null, 0, 0, 14, null);
        this.superappAzimuthRotationPresenter = eVar;
        this.imageLoader = pavVar;
        this.lottieLoader = ytzVar;
        this.feedSdkThemeInteractor = yqqVar;
        int i = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i2 = 0;
        GoImageView goImageView = new GoImageView(context, attributeSet, i2, i, defaultConstructorMarker);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        goImageView.setScaleType(scaleType);
        this.background = goImageView;
        GoImageView goImageView2 = new GoImageView(context, attributeSet, i2, i, defaultConstructorMarker);
        goImageView2.setScaleType(scaleType);
        goImageView2.setVisibility(8);
        this.foreground = goImageView2;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(scaleType);
        lottieAnimationView.setVisibility(8);
        this.animationView = lottieAnimationView;
        this.viewScope = new hbp0(new czo0(15), "SuperappAzimuthRotatableIconView", null);
        this.animationFallback = new lnv0(9, this);
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
        addLayer(goImageView);
        addLayer(goImageView2);
        addLayer(lottieAnimationView);
    }

    private final void addLayer(View view) {
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelAnimationFallback() {
        removeCallbacks(this.animationFallback);
    }

    private final void enableRotation() {
        this.shouldRotate = true;
        if (isAttachedToWindow()) {
            registerForeground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void finishIntro() {
        this.isIntroPending = false;
        d9w0 d9w0Var = this.boundIcon;
        if (d9w0Var != null) {
            e eVar = this.superappAzimuthRotationPresenter;
            String str = d9w0Var.a;
            if (str != null) {
                if (evu0.J(str)) {
                    str = null;
                }
            }
            str = d9w0Var.c;
            eVar.f.add(str);
        }
        resetAnimation();
        enableRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDark(FeedSdkTheme feedSdkTheme) {
        return feedSdkTheme == FeedSdkTheme.DARK || feedSdkTheme == FeedSdkTheme.ULTIMA_DARK;
    }

    private final void observeThemeChanges() {
        hbp0.e(this.viewScope, null, null, new SuperappAzimuthRotatableIconView$observeThemeChanges$1(this, null), 3);
    }

    private final void playIntroAnimation(String url, d9w0 icon) {
        this.animationView.setVisibility(0);
        scheduleAnimationFallback();
        this.animationJob = hbp0.e(this.viewScope, null, null, new SuperappAzimuthRotatableIconView$playIntroAnimation$1(this, url, icon, null), 3);
    }

    private final void registerForeground() {
        d9w0 d9w0Var = this.boundIcon;
        if (d9w0Var == null || this.isForegroundRegistered) {
            return;
        }
        this.superappAzimuthRotationPresenter.a(d9w0Var.d, this.foreground);
        this.isForegroundRegistered = true;
    }

    private final void resetAnimation() {
        l8x l8xVar = this.animationJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.animationJob = null;
        cancelAnimationFallback();
        LottieAnimationView lottieAnimationView = this.animationView;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setVisibility(8);
    }

    private final String resolveAnimationUrl(d9w0 d9w0Var) {
        zqq zqqVar = (zqq) this.feedSdkThemeInteractor;
        FeedSdkTheme feedSdkTheme = (FeedSdkTheme) kotlin.collections.a.R(((hnr0) zqqVar.f.getValue()).b());
        if (feedSdkTheme == null) {
            feedSdkTheme = zqqVar.b();
        }
        if (isDark(feedSdkTheme)) {
            String str = d9w0Var.f;
            return str == null ? d9w0Var.e : str;
        }
        String str2 = d9w0Var.e;
        return str2 == null ? d9w0Var.f : str2;
    }

    private final void scheduleAnimationFallback() {
        cancelAnimationFallback();
        postDelayed(this.animationFallback, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startIntro() {
        d9w0 d9w0Var = this.boundIcon;
        if (d9w0Var == null) {
            return;
        }
        String resolveAnimationUrl = resolveAnimationUrl(d9w0Var);
        if (resolveAnimationUrl == null || evu0.J(resolveAnimationUrl)) {
            finishIntro();
        } else {
            resetAnimation();
            playIntroAnimation(resolveAnimationUrl, d9w0Var);
        }
    }

    private final void unregisterForeground() {
        if (this.isForegroundRegistered) {
            e eVar = this.superappAzimuthRotationPresenter;
            GoImageView goImageView = this.foreground;
            l8x l8xVar = (l8x) eVar.e.remove(goImageView);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            goImageView.setRotation(0.0f);
            this.isForegroundRegistered = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(d9w0 icon) {
        if (jl40.l(this.boundIcon, icon)) {
            return;
        }
        this.boundIcon = icon;
        int i = 0;
        this.shouldRotate = false;
        this.isIntroPending = false;
        unregisterForeground();
        resetAnimation();
        lbm a = this.imageLoader.a(this.background);
        String str = icon.b;
        String str2 = icon.c;
        int i2 = 6;
        ((nac) a).b(new obv(str, 0 == true ? 1 : 0, i2, i));
        this.background.setVisibility(0);
        ((nac) this.imageLoader.a(this.foreground)).b(new obv(str2, 0 == true ? 1 : 0, i2, i));
        this.foreground.setRotation(0.0f);
        this.foreground.setVisibility(0);
        String resolveAnimationUrl = resolveAnimationUrl(icon);
        if (resolveAnimationUrl == null || evu0.J(resolveAnimationUrl)) {
            enableRotation();
            return;
        }
        e eVar = this.superappAzimuthRotationPresenter;
        String str3 = icon.a;
        if (str3 != null) {
            String str4 = evu0.J(str3) ? null : str3;
            if (str4 != null) {
                str2 = str4;
            }
        }
        if (eVar.f.contains(str2)) {
            enableRotation();
            return;
        }
        this.isIntroPending = true;
        if (isAttachedToWindow()) {
            startIntro();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.viewScope.a();
        observeThemeChanges();
        if (this.shouldRotate) {
            registerForeground();
        }
        if (this.isIntroPending) {
            startIntro();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.viewScope.b();
        unregisterForeground();
        cancelAnimationFallback();
        super.onDetachedFromWindow();
    }

    public final void release() {
        this.boundIcon = null;
        this.shouldRotate = false;
        this.isIntroPending = false;
        unregisterForeground();
        resetAnimation();
    }
}
