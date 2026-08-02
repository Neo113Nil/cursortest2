package com.yandex.go.navigator.driving.speedometer;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.fuh0;
import defpackage.mpt0;
import defpackage.ny61;
import defpackage.qtg0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.v2h0;
import defpackage.vng;
import defpackage.xng0;
import defpackage.xqg0;
import defpackage.xw31;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010'\"\u0004\b(\u0010\u001eR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/navigator/driving/speedometer/SpeedLimitView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "updateVisibility", "()V", "updateTextColor", "updateBackground", "updateStyle", "alarm", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onFinishInflate", "", "speedLimit", "setSpeedLimit", "(Ljava/lang/String;)V", "", "exceeded", "setSpeedLimitExceeded", "(Z)V", "Lmpt0;", "binding", "Lmpt0;", "", "smallTextSize", "F", "largeTextSize", "value", "Z", "setExceeded", "Landroid/animation/ObjectAnimator;", "backgroundAnimator", "Landroid/animation/ObjectAnimator;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SpeedLimitView extends GoFrameLayout {
    public static final int $stable = 8;
    private ObjectAnimator backgroundAnimator;
    private final mpt0 binding;
    private boolean exceeded;
    private final float largeTextSize;
    private final float smallTextSize;

    public SpeedLimitView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View O;
        View inflate = LayoutInflater.from(context).inflate(fuh0.speed_limit_view, (ViewGroup) this, false);
        addView(inflate);
        int i3 = z5h0.text_speedlimit;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, inflate);
        if (robotoTextView != null && (O = cma1.O((i3 = z5h0.view_speedlimit_alarm), inflate)) != null) {
            i3 = z5h0.view_speedlimit_frame;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i3, inflate);
            if (goFrameLayout != null) {
                this.binding = new mpt0((GoFrameLayout) inflate, robotoTextView, O, goFrameLayout);
                this.smallTextSize = getResources().getDimensionPixelSize(qtg0.textsize_map_speedvalue_min);
                this.largeTextSize = getResources().getDimensionPixelSize(qtg0.textsize_map_speedvalue_max);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    private final void alarm() {
        ObjectAnimator objectAnimator = this.backgroundAnimator;
        if (objectAnimator == null) {
            objectAnimator = null;
        }
        objectAnimator.cancel();
        ObjectAnimator objectAnimator2 = this.backgroundAnimator;
        (objectAnimator2 != null ? objectAnimator2 : null).start();
    }

    private final void setExceeded(boolean z) {
        if (this.exceeded == z) {
            return;
        }
        this.exceeded = z;
        if (!z) {
            updateBackground();
            ObjectAnimator objectAnimator = this.backgroundAnimator;
            (objectAnimator != null ? objectAnimator : null).cancel();
            updateTextColor();
            return;
        }
        updateBackground();
        ObjectAnimator objectAnimator2 = this.backgroundAnimator;
        (objectAnimator2 != null ? objectAnimator2 : null).start();
        updateTextColor();
        alarm();
    }

    private final void updateBackground() {
        GoFrameLayout goFrameLayout = this.binding.d;
        Context context = getContext();
        Drawable t = vng.t(this.exceeded ? v2h0.map_speedlimit_exceeded : v2h0.map_speedlimit, context);
        t.setLayoutDirection(xw31.n(context) ? 1 : 0);
        goFrameLayout.setBackground(t);
    }

    private final void updateStyle() {
        int r = tje.r(qtg0.size_map_speed, getContext());
        int r2 = tje.r(qtg0.size_map_speedanimation, getContext());
        ViewGroup.LayoutParams layoutParams = this.binding.a.getLayoutParams();
        layoutParams.width = r;
        layoutParams.height = r;
        ViewGroup.LayoutParams layoutParams2 = this.binding.c.getLayoutParams();
        layoutParams2.width = r2;
        layoutParams2.height = r2;
        this.binding.c.setBackground(vng.t(v2h0.map_speedalarm, getContext()));
    }

    private final void updateTextColor() {
        int m;
        RobotoTextView robotoTextView = this.binding.b;
        if (this.exceeded) {
            m = getContext().getColor(xqg0.white);
        } else {
            m = s8o.m(new bdc(xng0.textMain), getContext());
        }
        robotoTextView.setTextColor(m);
    }

    private final void updateVisibility() {
        mpt0 mpt0Var = this.binding;
        GoFrameLayout goFrameLayout = mpt0Var.a;
        CharSequence text = mpt0Var.b.getText();
        goFrameLayout.setVisibility((text == null || text.length() == 0) ? 8 : 0);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateBackground();
        updateStyle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.binding.c, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        this.backgroundAnimator = ofFloat;
        if (ofFloat == null) {
            ofFloat = null;
        }
        ofFloat.setDuration(220L);
        ofFloat.setRepeatCount(11);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.navigator.driving.speedometer.SpeedLimitView$onFinishInflate$1$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                mpt0 mpt0Var;
                mpt0Var = SpeedLimitView.this.binding;
                mpt0Var.c.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                mpt0 mpt0Var;
                mpt0Var = SpeedLimitView.this.binding;
                mpt0Var.c.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                mpt0 mpt0Var;
                mpt0Var = SpeedLimitView.this.binding;
                mpt0Var.c.setVisibility(0);
            }
        });
        updateVisibility();
        updateStyle();
        updateBackground();
    }

    public final void setSpeedLimit(String speedLimit) {
        this.binding.b.setText(speedLimit);
        this.binding.b.setTextSize(0, speedLimit.length() > 2 ? this.smallTextSize : this.largeTextSize);
        updateVisibility();
    }

    public final void setSpeedLimitExceeded(boolean exceeded) {
        setExceeded(exceeded);
    }

    public SpeedLimitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SpeedLimitView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SpeedLimitView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ SpeedLimitView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
