package com.ybsdk.widgets.common.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.p;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.eja1;
import defpackage.fch0;
import defpackage.fcl0;
import defpackage.g1t0;
import defpackage.i0t0;
import defpackage.jxi;
import defpackage.kp50;
import defpackage.l8x;
import defpackage.n0t0;
import defpackage.n361;
import defpackage.ny61;
import defpackage.pey;
import defpackage.poh0;
import defpackage.sls;
import defpackage.tje;
import defpackage.vng;
import defpackage.ylg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ1\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/widgets/common/snackbar/SnackbarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "animateShow", "()V", "Lkotlin/Function0;", "endAction", "animateDismiss", "(Lsls;)V", "onDetachedFromWindow", "Ln0t0;", "content", "", "duration", "onDismiss", "show", "(Ln0t0;JLsls;)V", "dismissNow", "Ln361;", "binding", "Ln361;", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "interpolator", "Landroid/view/animation/Interpolator;", "Ll8x;", "dismissJob", "Ll8x;", "Landroid/view/ViewPropertyAnimator;", "animator", "Landroid/view/ViewPropertyAnimator;", "Companion", "g1t0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnackbarView extends FrameLayout {
    private static final g1t0 Companion = new g1t0();

    @Deprecated
    public static final long DEFAULT_DURATION = 4000;

    @Deprecated
    public static final long FADE_ANIMATION_DURATION = 200;

    @Deprecated
    public static final long FADE_ANIMATION_OFFSET = 50;

    @Deprecated
    public static final long TRANSLATION_ANIMATION_DURATION = 250;

    @Deprecated
    public static final int TRANSLATION_Y_START = -16;
    private ViewPropertyAnimator animator;
    private final n361 binding;
    private l8x dismissJob;
    private final Interpolator interpolator;

    public SnackbarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_layout_snackbar_deprecated, (ViewGroup) this, false);
        addView(inflate);
        int i2 = fch0.description;
        TextView textView = (TextView) cma1.O(i2, inflate);
        if (textView != null) {
            i2 = fch0.text;
            TextView textView2 = (TextView) cma1.O(i2, inflate);
            if (textView2 != null) {
                this.binding = new n361((ConstraintLayout) inflate, textView, textView2);
                this.interpolator = AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator);
                setVisibility(8);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateDismiss(sls endAction) {
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
        d.withStartAction(new i0t0(withEndAction, 2)).withEndAction(endAction != null ? new fcl0(20, endAction) : null);
        this.animator = d;
        d.start();
    }

    public static /* synthetic */ void animateDismiss$default(SnackbarView snackbarView, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = null;
        }
        snackbarView.animateDismiss(slsVar);
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
        d.withStartAction(new i0t0(g, 3));
        this.animator = d;
        d.start();
    }

    public static /* synthetic */ void show$default(SnackbarView snackbarView, n0t0 n0t0Var, long j, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 4000;
        }
        if ((i & 4) != 0) {
            slsVar = null;
        }
        snackbarView.show(n0t0Var, j, slsVar);
    }

    public final void dismissNow() {
        l8x l8xVar = this.dismissJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.dismissJob = null;
        animateDismiss$default(this, null, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        dismissNow();
        super.onDetachedFromWindow();
    }

    public final void show(n0t0 content, long duration, sls onDismiss) {
        this.binding.c.setText(d.a(getContext(), content.a));
        TextView textView = this.binding.b;
        Text text = content.b;
        textView.setVisibility(!(text instanceof Text.Empty) ? 0 : 8);
        this.binding.b.setText(d.a(getContext(), text));
        animateShow();
        pey o = vng.o(this);
        if (o != null) {
            p s = eja1.s(o);
            Long valueOf = Long.valueOf(duration);
            if (duration <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.dismissJob = tje.N(s, null, null, new SnackbarView$show$1$2$1(duration, this, onDismiss, null), 3);
            }
        }
    }

    public SnackbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SnackbarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SnackbarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
