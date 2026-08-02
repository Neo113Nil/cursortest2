package com.yandex.go.chargers.design.components;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n8a;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.uda;
import defpackage.v4a;
import defpackage.wda;
import defpackage.xng0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001*B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010$\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0014¢\u0006\u0004\b.\u0010\u000fR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<¨\u0006>"}, d2 = {"Lcom/yandex/go/chargers/design/components/ChargersOrderTabsView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/GradientDrawable;", "createBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "Lzy11;", "renderTabs", "()V", "Lcom/yandex/go/design/view/GoView;", "createSelectedIndicator", "()Lcom/yandex/go/design/view/GoView;", "Luda;", "mode", "", "selected", "Lru/yandex/taxi/widget/RobotoTextView;", "createTabButton", "(Luda;Z)Lru/yandex/taxi/widget/RobotoTextView;", "selectTab", "(Luda;)V", "targetIndex", "animate", "updateIndicatorPosition", "(IZ)V", "", "modes", "", "defaultModeId", "setTabs", "(Ljava/util/List;Ljava/lang/String;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lwda;", "listener", "setOnTabSelectedListener", "(Lwda;)V", "onDetachedFromWindow", "Lwda;", "selectedMode", "Luda;", "Ljava/util/List;", "selectedIndicator", "Lcom/yandex/go/design/view/GoView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "tabsContainer", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/animation/ValueAnimator;", "currentAnimator", "Landroid/animation/ValueAnimator;", "shapeCornerRadius", CA20Status.STATUS_USER_I, "tabButtonHeight", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrderTabsView extends GoFrameLayout {
    public static final int $stable = 8;
    private ValueAnimator currentAnimator;
    private wda listener;
    private List<uda> modes;
    private GoView selectedIndicator;
    private uda selectedMode;
    private final int shapeCornerRadius;
    private final int tabButtonHeight;
    private GoLinearLayout tabsContainer;

    public ChargersOrderTabsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.modes = EmptyList.a;
        this.shapeCornerRadius = tje.u(44, getContext());
        this.tabButtonHeight = tje.u(44, getContext());
        setBackground(createBackgroundDrawable());
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, null, 0, 0, 14, null);
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        goLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.tabsContainer = goLinearLayout;
        addView(goLinearLayout);
        GoView createSelectedIndicator = createSelectedIndicator();
        this.selectedIndicator = createSelectedIndicator;
        addView(createSelectedIndicator);
    }

    private final GradientDrawable createBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.shapeCornerRadius);
        gradientDrawable.setColor(qje.t(xng0.bgMain, getContext()));
        return gradientDrawable;
    }

    private final GoView createSelectedIndicator() {
        GoView goView = new GoView(getContext(), null, 0, 0, 14, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.shapeCornerRadius);
        gradientDrawable.setColor(qje.t(xng0.controlMinor, goView.getContext()));
        goView.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -1);
        layoutParams.setMargins(tje.u(2, goView.getContext()), tje.u(2, goView.getContext()), tje.u(2, goView.getContext()), tje.u(2, goView.getContext()));
        goView.setLayoutParams(layoutParams);
        goView.setVisibility(4);
        return goView;
    }

    private final RobotoTextView createTabButton(uda mode, boolean selected) {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setTag(mode.a);
        robotoTextView.setText(mode.b);
        robotoTextView.setTextSize(16.0f);
        robotoTextView.setGravity(17);
        if (selected) {
            robotoTextView.setTextColor(qje.t(xng0.textMain, robotoTextView.getContext()));
        } else {
            robotoTextView.setTextColor(qje.t(xng0.textMinor, robotoTextView.getContext()));
        }
        robotoTextView.setTextTypeface(0);
        robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(0, this.tabButtonHeight, 1.0f));
        return robotoTextView;
    }

    private final void renderTabs() {
        GoLinearLayout goLinearLayout = this.tabsContainer;
        if (goLinearLayout != null) {
            goLinearLayout.removeAllViews();
        }
        if (this.modes.isEmpty()) {
            return;
        }
        for (uda udaVar : this.modes) {
            RobotoTextView createTabButton = createTabButton(udaVar, jl40.l(this.selectedMode, udaVar));
            c.z(new n8a(3, this, udaVar), createTabButton);
            GoLinearLayout goLinearLayout2 = this.tabsContainer;
            if (goLinearLayout2 != null) {
                goLinearLayout2.addView(createTabButton);
            }
        }
        post(new v4a(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderTabs$lambda$0$0(ChargersOrderTabsView chargersOrderTabsView, uda udaVar) {
        chargersOrderTabsView.selectTab(udaVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderTabs$lambda$1(ChargersOrderTabsView chargersOrderTabsView) {
        chargersOrderTabsView.updateIndicatorPosition(chargersOrderTabsView.modes.indexOf(chargersOrderTabsView.selectedMode), false);
    }

    private final void selectTab(uda mode) {
        uda udaVar = this.selectedMode;
        if (jl40.l(udaVar != null ? udaVar.a : null, mode.a)) {
            return;
        }
        Iterator<uda> it = this.modes.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(it.next().a, mode.a)) {
                break;
            } else {
                i++;
            }
        }
        this.selectedMode = mode;
        if (i != -1) {
            updateIndicatorPosition(i, true);
        }
        GoLinearLayout goLinearLayout = this.tabsContainer;
        if (goLinearLayout != null) {
            int i2 = 0;
            while (true) {
                if (!(i2 < goLinearLayout.getChildCount())) {
                    break;
                }
                int i3 = i2 + 1;
                View childAt = goLinearLayout.getChildAt(i2);
                if (childAt == null) {
                    ny61.s();
                    return;
                }
                if (childAt instanceof RobotoTextView) {
                    RobotoTextView robotoTextView = (RobotoTextView) childAt;
                    Object tag = robotoTextView.getTag();
                    uda udaVar2 = this.selectedMode;
                    if (jl40.l(tag, udaVar2 != null ? udaVar2.a : null)) {
                        robotoTextView.setTextColor(qje.t(xng0.textMain, getContext()));
                    } else {
                        robotoTextView.setTextColor(qje.t(xng0.textMinor, getContext()));
                    }
                }
                i2 = i3;
            }
        }
        wda wdaVar = this.listener;
        if (wdaVar != null) {
            wdaVar.a(mode);
        }
    }

    private final void updateIndicatorPosition(int targetIndex, boolean animate) {
        final GoView goView;
        GoLinearLayout goLinearLayout;
        if (isAttachedToWindow() && (goView = this.selectedIndicator) != null && (goLinearLayout = this.tabsContainer) != null && targetIndex >= 0 && targetIndex < this.modes.size()) {
            View childAt = goLinearLayout.getChildAt(targetIndex);
            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView == null) {
                return;
            }
            final float w = tje.w(2, getContext()) + textView.getX();
            final int width = textView.getWidth() - tje.u(4, getContext());
            ValueAnimator valueAnimator = this.currentAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!animate) {
                goView.setX(w);
                ViewGroup.LayoutParams layoutParams = goView.getLayoutParams();
                layoutParams.width = width;
                goView.setLayoutParams(layoutParams);
                goView.setVisibility(0);
                return;
            }
            final float x = goView.getX();
            final int width2 = goView.getWidth();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vda
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChargersOrderTabsView.updateIndicatorPosition$lambda$0$0(x, w, width2, width, goView, valueAnimator2);
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.chargers.design.components.ChargersOrderTabsView$updateIndicatorPosition$lambda$0$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    ChargersOrderTabsView.this.currentAnimator = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            ofFloat.start();
            this.currentAnimator = ofFloat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateIndicatorPosition$lambda$0$0(float f, float f2, int i, int i2, GoView goView, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        goView.setX(g8e.b(f2, f, floatValue, f));
        ViewGroup.LayoutParams layoutParams = goView.getLayoutParams();
        layoutParams.width = (int) (((i2 - i) * floatValue) + i);
        goView.setLayoutParams(layoutParams);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackground(createBackgroundDrawable());
        GoView goView = this.selectedIndicator;
        if (goView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(this.shapeCornerRadius);
            gradientDrawable.setColor(qje.t(xng0.controlMinor, getContext()));
            goView.setBackground(gradientDrawable);
        }
        renderTabs();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimator = null;
    }

    public final void setOnTabSelectedListener(wda listener) {
        this.listener = listener;
    }

    public final void setTabs(List<uda> modes, String defaultModeId) {
        Object obj;
        if (jl40.l(modes, this.modes)) {
            return;
        }
        this.modes = modes;
        Iterator<T> it = modes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((uda) obj).a, defaultModeId)) {
                    break;
                }
            }
        }
        uda udaVar = (uda) obj;
        if (udaVar == null) {
            udaVar = (uda) a.P(modes);
        }
        this.selectedMode = udaVar;
        renderTabs();
    }

    public ChargersOrderTabsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersOrderTabsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersOrderTabsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
