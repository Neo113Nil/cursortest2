package com.ybsdk.widgets.common.snackbar;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.view.b;
import androidx.lifecycle.o;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.a1t0;
import defpackage.b1t0;
import defpackage.ce0;
import defpackage.cry;
import defpackage.e1t0;
import defpackage.i0t0;
import defpackage.i5z0;
import defpackage.j0t0;
import defpackage.jl40;
import defpackage.k0t0;
import defpackage.kp50;
import defpackage.l0t0;
import defpackage.l8x;
import defpackage.lum;
import defpackage.mmp0;
import defpackage.mtw;
import defpackage.n0t0;
import defpackage.qls0;
import defpackage.quq0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.y0t0;
import defpackage.ylg0;
import defpackage.z0t0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0002/\fB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R.\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c \u001d*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n \u001d*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/ybsdk/widgets/common/snackbar/Snackbar;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/view/View$OnTouchListener;", "backgroundTouchListener", "Landroidx/lifecycle/o;", "scope", "<init>", "(Landroid/content/Context;Landroid/view/View$OnTouchListener;Landroidx/lifecycle/o;)V", "Ln0t0;", "content", "Lk0t0;", "duration", "Lkotlin/Function0;", "Lzy11;", "onDismiss", "show", "(Ln0t0;Lk0t0;Lsls;)V", "dismissWithDelay", "()V", "animateShow", "animateDismiss", "onDetachedFromWindow", "dismissNow", "Landroidx/lifecycle/o;", "Lcry;", "", "", "kotlin.jvm.PlatformType", "adapter", "Lcry;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/view/animation/Interpolator;", "Ll8x;", "dismissJob", "Ll8x;", "Lsls;", "Lk0t0;", "Landroid/view/ViewPropertyAnimator;", "animator", "Landroid/view/ViewPropertyAnimator;", "Companion", "com/ybsdk/widgets/common/snackbar/a", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Snackbar extends FrameLayout {
    public static final a Companion = new a();
    private static final long FADE_ANIMATION_DURATION = 200;
    private static final long FADE_ANIMATION_OFFSET = 50;
    private static final int SNACKBAR_CONTENT_POSITION = 1;
    private static final long TRANSLATION_ANIMATION_DURATION = 250;
    private static final int TRANSLATION_Y_START = -16;
    private static Snackbar snackbarOnDisplay;
    private final cry adapter;
    private ViewPropertyAnimator animator;
    private l8x dismissJob;
    private k0t0 duration;
    private final Interpolator interpolator;
    private sls onDismiss;
    private final o scope;
    private final ViewPager2 viewPager;

    private Snackbar(Context context, View.OnTouchListener onTouchListener, o oVar) {
        super(context);
        this.scope = oVar;
        cry cryVar = new cry(new lum(new qls0(6), y0t0.a, new quq0(24, onTouchListener), z0t0.a), new lum(new qls0(5), a1t0.a, new mtw(26), b1t0.a));
        this.adapter = cryVar;
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        viewPager2.setAdapter(cryVar);
        viewPager2.setOrientation(0);
        viewPager2.registerOnPageChangeCallback(new l0t0(this, viewPager2));
        addView(viewPager2);
        this.viewPager = viewPager2;
        this.interpolator = AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator);
        this.duration = j0t0.b;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateDismiss() {
        ViewPropertyAnimator viewPropertyAnimator = this.animator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        setAlpha(1.0f);
        setTranslationY(kp50.r(0));
        ViewPropertyAnimator withEndAction = AnimUtils.a(0.0f, this).withEndAction(new ce0(this, 4));
        withEndAction.setDuration(200L);
        withEndAction.setStartDelay(50L);
        withEndAction.setInterpolator(this.interpolator);
        ViewPropertyAnimator d = AnimUtils.d(kp50.r(-16), this);
        d.setDuration(250L);
        d.setInterpolator(this.interpolator);
        d.withStartAction(new i0t0(withEndAction, 0)).withEndAction(new mmp0(26, this));
        this.animator = d;
        d.start();
        if (jl40.l(snackbarOnDisplay, this)) {
            snackbarOnDisplay = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismiss$lambda$4(Snackbar snackbar) {
        sls slsVar = snackbar.onDismiss;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final void animateShow() {
        ViewPropertyAnimator viewPropertyAnimator = this.animator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        setAlpha(0.0f);
        setTranslationY(kp50.r(-16));
        ViewPropertyAnimator g = AnimUtils.g(this);
        g.setDuration(200L);
        g.setStartDelay(50L);
        g.setInterpolator(this.interpolator);
        ViewPropertyAnimator d = AnimUtils.d(0.0f, this);
        d.setDuration(250L);
        d.setInterpolator(this.interpolator);
        d.withStartAction(new i0t0(g, 1));
        this.animator = d;
        d.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissWithDelay() {
        if (this.duration.a == 0) {
            return;
        }
        o oVar = this.scope;
        this.dismissJob = oVar != null ? tje.N(oVar, null, null, new Snackbar$dismissWithDelay$1(this, null), 3) : null;
        i5z0.a.a("XXX: SNACKBAR DISMISSED", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void show(n0t0 content, k0t0 duration, sls onDismiss) {
        this.duration = duration;
        this.onDismiss = onDismiss;
        cry cryVar = this.adapter;
        e1t0 e1t0Var = e1t0.a;
        cryVar.b = scc.g(e1t0Var, content, e1t0Var);
        this.adapter.notifyDataSetChanged();
        this.viewPager.setCurrentItem(1, false);
        animateShow();
        StringBuilder sb = new StringBuilder();
        Text text = content.a;
        if (!(text instanceof Text.Empty)) {
            sb.append(d.a(getContext(), text));
        }
        Text text2 = content.b;
        if (!(text2 instanceof Text.Empty)) {
            sb.append(d.a(getContext(), text2));
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            b.r(this, sb2);
        }
        dismissWithDelay();
    }

    public static /* synthetic */ void show$default(Snackbar snackbar, n0t0 n0t0Var, k0t0 k0t0Var, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            k0t0Var = j0t0.b;
        }
        if ((i & 4) != 0) {
            slsVar = null;
        }
        snackbar.show(n0t0Var, k0t0Var, slsVar);
    }

    public final void dismissNow() {
        l8x l8xVar = this.dismissJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.dismissJob = null;
        animateDismiss();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dismissNow();
        super.onDetachedFromWindow();
    }

    public /* synthetic */ Snackbar(Context context, View.OnTouchListener onTouchListener, o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, onTouchListener, oVar);
    }
}
