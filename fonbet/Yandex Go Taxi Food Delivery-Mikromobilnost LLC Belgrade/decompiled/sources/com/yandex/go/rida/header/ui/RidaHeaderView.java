package com.yandex.go.rida.header.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.a6k0;
import defpackage.ax1;
import defpackage.b6k0;
import defpackage.bvf0;
import defpackage.cma1;
import defpackage.d6k0;
import defpackage.dv31;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.g7h0;
import defpackage.jl40;
import defpackage.l76;
import defpackage.lz40;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o5k0;
import defpackage.odf0;
import defpackage.pry0;
import defpackage.pz40;
import defpackage.rjh0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vfc0;
import defpackage.vyf0;
import defpackage.w511;
import defpackage.w5k0;
import defpackage.x5k0;
import defpackage.y5k0;
import defpackage.z5k0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0014¢\u0006\u0004\b)\u0010*J7\u00100\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000b¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020C0F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000b0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/yandex/go/rida/header/ui/RidaHeaderView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ld6k0;", "Lw5k0;", "gradientOrNull", "(Ld6k0;)Lw5k0;", "oldState", "newGradient", "Lzy11;", "renderGradient", "(Ld6k0;Lw5k0;)V", "", "withLogo", "renderLogo", "(Z)V", "", "text", "isShimmering", "isClickable", "minLines", "renderTitle", "(Ljava/lang/CharSequence;ZZI)V", "Lb6k0;", ClidProvider.STATE, "renderSubtitle", "(Lb6k0;)V", "previousGradient", "applyGradient", "(Lw5k0;Lw5k0;)V", "Landroid/graphics/drawable/GradientDrawable;", "toGradientDrawable", "(Lw5k0;)Landroid/graphics/drawable/GradientDrawable;", "onDetachedFromWindow", "()V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "render", "(Ld6k0;)V", "Lo5k0;", "binding", "Lo5k0;", "Lpry0;", "ellipsizer", "Lpry0;", "Lpz40;", "_contentHeightFlow", "Lpz40;", "Ln4u0;", "contentHeightFlow", "Ln4u0;", "getContentHeightFlow", "()Ln4u0;", "Llz40;", "", "_uiActions", "Llz40;", "Ltpr;", "uiActions", "Ltpr;", "getUiActions", "()Ltpr;", "Ldv31;", "stateHolder", "Ldv31;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RidaHeaderView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final pz40 _contentHeightFlow;
    private final lz40 _uiActions;
    private final o5k0 binding;
    private final n4u0 contentHeightFlow;
    private final pry0 ellipsizer;
    private final dv31 stateHolder;
    private final tpr uiActions;

    public RidaHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(rjh0.rida_header, this);
        int i3 = g7h0.rida_header_content_bottom_barrier;
        Barrier barrier = (Barrier) cma1.O(i3, this);
        if (barrier != null) {
            i3 = g7h0.rida_header_leading_icon;
            GoImageView goImageView = (GoImageView) cma1.O(i3, this);
            if (goImageView != null) {
                i3 = g7h0.rida_header_logo;
                GoImageView goImageView2 = (GoImageView) cma1.O(i3, this);
                if (goImageView2 != null) {
                    i3 = g7h0.rida_header_skeleton;
                    PlaceholderView placeholderView = (PlaceholderView) cma1.O(i3, this);
                    if (placeholderView != null) {
                        i3 = g7h0.rida_header_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
                        if (robotoTextView != null) {
                            i3 = g7h0.rida_header_subtitle_barrier;
                            if (((Barrier) cma1.O(i3, this)) != null) {
                                i3 = g7h0.rida_header_title;
                                ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i3, this);
                                if (shimmeringRobotoTextView != null) {
                                    i3 = g7h0.rida_header_top_margin_space;
                                    Space space = (Space) cma1.O(i3, this);
                                    if (space != null) {
                                        this.binding = new o5k0(this, barrier, goImageView, goImageView2, placeholderView, robotoTextView, shimmeringRobotoTextView, space);
                                        this.ellipsizer = new pry0(new vfc0(16, this));
                                        r0 c = bvf0.c(0);
                                        this._contentHeightFlow = c;
                                        this.contentHeightFlow = e.d(c);
                                        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
                                        this._uiActions = b;
                                        this.uiActions = e.c(b);
                                        c.z(new vyf0(23, this), shimmeringRobotoTextView);
                                        ax1 ax1Var = new ax1(this, new z5k0("", null, false), this, 5);
                                        this.stateHolder = ax1Var;
                                        ax1Var.e();
                                        tje.i(this, 48, new odf0(24, this));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(RidaHeaderView ridaHeaderView) {
        ridaHeaderView._uiActions.g(l76.O);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(RidaHeaderView ridaHeaderView, t1w t1wVar) {
        ridaHeaderView.setPadding(ridaHeaderView.getPaddingLeft(), t1wVar.b, ridaHeaderView.getPaddingRight(), ridaHeaderView.getPaddingBottom());
        return false;
    }

    private final void applyGradient(w5k0 previousGradient, w5k0 newGradient) {
        if (jl40.l(newGradient, previousGradient)) {
            return;
        }
        if (newGradient == null) {
            setBackground(null);
            return;
        }
        GradientDrawable gradientDrawable = toGradientDrawable(newGradient);
        Drawable background = getBackground();
        if (background == null) {
            background = previousGradient != null ? toGradientDrawable(previousGradient) : null;
        }
        if (background == null) {
            setBackground(gradientDrawable);
            return;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{background, gradientDrawable});
        transitionDrawable.setCrossFadeEnabled(true);
        setBackground(transitionDrawable);
        transitionDrawable.startTransition(300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ellipsizer$lambda$0(RidaHeaderView ridaHeaderView, CharSequence charSequence) {
        ShimmeringRobotoTextView shimmeringRobotoTextView = ridaHeaderView.binding.g;
        int width = shimmeringRobotoTextView.getWidth();
        if (width == 0) {
            width = shimmeringRobotoTextView.getMeasuredWidth();
        }
        int paddingStart = (width - shimmeringRobotoTextView.getPaddingStart()) - shimmeringRobotoTextView.getPaddingEnd();
        return (paddingStart <= 0 ? 0 : new StaticLayout(charSequence, shimmeringRobotoTextView.getPaint(), paddingStart, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount()) <= shimmeringRobotoTextView.getMaxLines();
    }

    private final w5k0 gradientOrNull(d6k0 d6k0Var) {
        if (d6k0Var instanceof z5k0) {
            return ((z5k0) d6k0Var).b;
        }
        if (d6k0Var instanceof y5k0) {
            return ((y5k0) d6k0Var).c;
        }
        if (!jl40.l(d6k0Var, x5k0.a) && !jl40.l(d6k0Var, a6k0.a) && d6k0Var != null) {
            w511.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderGradient(d6k0 oldState, w5k0 newGradient) {
        if (!(oldState instanceof x5k0) && getVisibility() == 0) {
            applyGradient(gradientOrNull(oldState), newGradient);
            return;
        }
        setBackground(newGradient != null ? toGradientDrawable(newGradient) : null);
        setAlpha(0.0f);
        cma1.J(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderLogo(boolean withLogo) {
        this.binding.h.setVisibility(withLogo ? 0 : 8);
        this.binding.d.setVisibility(withLogo ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderSubtitle(b6k0 state) {
        o5k0 o5k0Var = this.binding;
        if (state == null) {
            o5k0Var.f.setVisibility(8);
            this.binding.c.setVisibility(8);
            this.binding.c.setImageDrawable(null);
        } else {
            o5k0Var.f.setVisibility(0);
            this.binding.f.setText(state.a);
            Integer num = state.b;
            this.binding.c.setVisibility(0);
            this.binding.c.setImageResource(num.intValue());
        }
    }

    private final void renderTitle(final CharSequence text, boolean isShimmering, boolean isClickable, int minLines) {
        final ShimmeringRobotoTextView shimmeringRobotoTextView = this.binding.g;
        if (text == null || evu0.J(text)) {
            shimmeringRobotoTextView.setVisibility(8);
            shimmeringRobotoTextView.stopAnimation();
            shimmeringRobotoTextView.setClickable(false);
            shimmeringRobotoTextView.setFocusable(false);
            return;
        }
        shimmeringRobotoTextView.setMinLines(minLines);
        shimmeringRobotoTextView.setVisibility(0);
        if (shimmeringRobotoTextView.isLaidOut()) {
            pry0 pry0Var = this.ellipsizer;
            pry0Var.getClass();
            shimmeringRobotoTextView.setText(pry0Var.a(text, TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE));
        } else {
            shimmeringRobotoTextView.setText(text);
            shimmeringRobotoTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.rida.header.ui.RidaHeaderView$renderTitle$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    pry0 pry0Var2;
                    view.removeOnLayoutChangeListener(this);
                    ShimmeringRobotoTextView shimmeringRobotoTextView2 = ShimmeringRobotoTextView.this;
                    pry0Var2 = this.ellipsizer;
                    CharSequence charSequence = text;
                    pry0Var2.getClass();
                    shimmeringRobotoTextView2.setText(pry0Var2.a(charSequence, TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE));
                }
            });
        }
        if (isShimmering) {
            shimmeringRobotoTextView.startAnimation();
        } else {
            shimmeringRobotoTextView.stopAnimation();
        }
        shimmeringRobotoTextView.setClickable(isClickable);
        shimmeringRobotoTextView.setFocusable(isClickable);
    }

    public static /* synthetic */ void renderTitle$default(RidaHeaderView ridaHeaderView, CharSequence charSequence, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            i = 2;
        }
        ridaHeaderView.renderTitle(charSequence, z, z2, i);
    }

    private final GradientDrawable toGradientDrawable(w5k0 w5k0Var) {
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w5k0Var.a, w5k0Var.b});
    }

    public final n4u0 getContentHeightFlow() {
        return this.contentHeightFlow;
    }

    public final tpr getUiActions() {
        return this.uiActions;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        animate().cancel();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int bottom2 = this.binding.b.getBottom();
        if (getVisibility() != 0 || bottom2 == ((Number) this.contentHeightFlow.getValue()).intValue()) {
            return;
        }
        pz40 pz40Var = this._contentHeightFlow;
        Integer valueOf = Integer.valueOf(this.binding.b.getBottom());
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }

    public final void render(d6k0 state) {
        this.stateHolder.g(state, false, false);
    }

    public RidaHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public RidaHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public RidaHeaderView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ RidaHeaderView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
