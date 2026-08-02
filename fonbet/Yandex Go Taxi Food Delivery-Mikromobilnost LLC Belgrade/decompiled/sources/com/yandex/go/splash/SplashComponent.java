package com.yandex.go.splash;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import defpackage.ag2;
import defpackage.bx60;
import defpackage.dst0;
import defpackage.eqt0;
import defpackage.fqt0;
import defpackage.gqt0;
import defpackage.i3y;
import defpackage.jqt0;
import defpackage.juz;
import defpackage.n250;
import defpackage.n450;
import defpackage.n751;
import defpackage.qhq0;
import defpackage.tje;
import defpackage.yvf0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EBE\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0013*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001e\u0010\u0015J/\u0010$\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R#\u0010D\u001a\n ?*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u00060ER\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/yandex/go/splash/SplashComponent;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lbx60;", "Landroid/content/Context;", "context", "Lcom/yandex/go/splash/BaseSplashView;", "splashView", "Ljqt0;", "presenter", "Ljuz;", "lottieSplashViewHolderFactory", "Lyvf0;", "Ln450;", "nativeSplashViewHolderProvider", "Ln250;", "nativeAnimationSplashViewHolderFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/go/splash/BaseSplashView;Ljqt0;Ljuz;Lyvf0;Ln250;)V", "Lzy11;", "detachFromParent", "()V", "Lag2;", "setupCustomSplashView", "(Lag2;)V", "", "delayToStart", "hide", "(J)V", "onAttachedToWindow", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/view/View;", "v", "Ln751;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "Ljava/lang/Runnable;", "onDetachListener", "setOnDetachListener", "(Ljava/lang/Runnable;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onPreDraw", "()Z", "Lcom/yandex/go/splash/BaseSplashView;", "Ljqt0;", "Ljuz;", "Lyvf0;", "Ln250;", "Ljava/lang/Runnable;", "animatedSplashViewHolder", "Lag2;", "kotlin.jvm.PlatformType", "nativeSplashViewHolder$delegate", "Li3y;", "getNativeSplashViewHolder", "()Ln450;", "nativeSplashViewHolder", "Lfqt0;", "mvpView", "Lfqt0;", "Ldst0;", "getSplashViewParams", "()Ldst0;", "splashViewParams", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SplashComponent extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, bx60 {
    private ag2 animatedSplashViewHolder;
    private final juz lottieSplashViewHolderFactory;
    private final fqt0 mvpView;
    private final n250 nativeAnimationSplashViewHolderFactory;

    /* renamed from: nativeSplashViewHolder$delegate, reason: from kotlin metadata */
    private final i3y nativeSplashViewHolder;
    private final yvf0 nativeSplashViewHolderProvider;
    private Runnable onDetachListener;
    private final jqt0 presenter;
    private final BaseSplashView splashView;

    public SplashComponent(Context context, BaseSplashView baseSplashView, jqt0 jqt0Var, juz juzVar, yvf0 yvf0Var, n250 n250Var) {
        super(context);
        this.splashView = baseSplashView;
        this.presenter = jqt0Var;
        this.lottieSplashViewHolderFactory = juzVar;
        this.nativeSplashViewHolderProvider = yvf0Var;
        this.nativeAnimationSplashViewHolderFactory = n250Var;
        this.nativeSplashViewHolder = a.a(new qhq0(12, this));
        this.mvpView = new fqt0(this);
        baseSplashView.setOnDetachListener(new eqt0(this, 0));
        baseSplashView.init();
        addView(baseSplashView);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(this, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachFromParent() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        Runnable runnable = this.onDetachListener;
        if (runnable != null) {
            runnable.run();
        }
        if (isInEditMode()) {
            return;
        }
        jqt0 jqt0Var = this.presenter;
        gqt0 gqt0Var = jqt0Var.x;
        String str = (String) jqt0Var.z.a.n.get();
        long j = jqt0Var.C;
        i d = ((j) gqt0Var.a).d("Main.Splash.Closed");
        d.j((r2 & 1) == 0);
        if (str != null) {
            d.a.put("id", str);
        }
        d.c(SystemClock.elapsedRealtime() - j, "duration");
        d.m();
        jqt0Var.B.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n450 getNativeSplashViewHolder() {
        return (n450) this.nativeSplashViewHolder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hide(long delayToStart) {
        postDelayed(new eqt0(this, 1), delayToStart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$0(SplashComponent splashComponent) {
        splashComponent.splashView.doHide(new SplashComponent$hide$1$1(0, splashComponent.presenter, jqt0.class, "onSplashClosed", "onSplashClosed()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n450 nativeSplashViewHolder_delegate$lambda$0(SplashComponent splashComponent) {
        n450 n450Var = (n450) splashComponent.nativeSplashViewHolderProvider.get();
        splashComponent.addView(n450Var.a().o());
        return n450Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCustomSplashView(ag2 ag2Var) {
        this.animatedSplashViewHolder = ag2Var;
        this.splashView.setupCustomSplashView(ag2Var);
        if (ag2Var.e()) {
            this.splashView.setHideAnimType(AnimType.ANIM_TYPE_CUSTOM);
        }
        if (ag2Var.getRootView().getParent() == null) {
            addView(ag2Var.getRootView());
        }
        hide(ag2Var.d());
    }

    public final dst0 getSplashViewParams() {
        return this.splashView.getSplashViewParams();
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        this.splashView.onApplyWindowInsets(insets);
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        jqt0 jqt0Var = this.presenter;
        jqt0Var.Bg(this.mvpView);
        jqt0Var.B.a();
        jqt0Var.y.a.getClass();
        tje.N(jqt0Var.Jg(), null, null, new SplashComponentPresenter$onPreloadStepCompleted$1(jqt0Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
        removeCallbacks(null);
        this.presenter.Cg();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        getViewTreeObserver().removeOnPreDrawListener(this);
        if (isInEditMode()) {
            return false;
        }
        jqt0 jqt0Var = this.presenter;
        gqt0 gqt0Var = jqt0Var.x;
        String str = (String) jqt0Var.z.a.n.get();
        ((j) gqt0Var.a).s("Main.Splash.Opened");
        gqt0Var.c.c(str);
        jqt0Var.C = SystemClock.elapsedRealtime();
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.splashView.onSizeChanged(w, h, oldw, oldh);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    public final void setOnDetachListener(Runnable onDetachListener) {
        this.onDetachListener = onDetachListener;
    }
}
