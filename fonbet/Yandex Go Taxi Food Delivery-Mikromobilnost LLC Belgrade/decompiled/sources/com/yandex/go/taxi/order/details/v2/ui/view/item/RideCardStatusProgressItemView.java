package com.yandex.go.taxi.order.details.v2.ui.view.item;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.details.v2.state.elements.status_progress.RideCardStatusProgressItemUiState$State;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.ProgressBarView;
import defpackage.aok0;
import defpackage.bdc;
import defpackage.cma1;
import defpackage.cok0;
import defpackage.eja1;
import defpackage.k2y;
import defpackage.mzh0;
import defpackage.n4h0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.p9y0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.up11;
import defpackage.vnk0;
import defpackage.w511;
import defpackage.wnk0;
import defpackage.wrs0;
import defpackage.xng0;
import defpackage.xnk0;
import defpackage.ynk0;
import defpackage.zkh0;
import defpackage.znk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/RideCardStatusProgressItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "defStyleRes", "Lp9y0;", "actionHandler", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILp9y0;)V", "Lynk0;", "trail", "Lzy11;", "renderBoldTimer", "(Lynk0;)V", "renderRegularTimer", "()V", "Lru/yandex/taxi/widget/RobotoTextView;", "createTimerView", "()Lru/yandex/taxi/widget/RobotoTextView;", "Lcom/yandex/go/taxi/order/details/v2/state/elements/status_progress/RideCardStatusProgressItemUiState$State;", ClidProvider.STATE, "renderState", "(Lcom/yandex/go/taxi/order/details/v2/state/elements/status_progress/RideCardStatusProgressItemUiState$State;)V", "Lwnk0;", "text", "Lwrs0;", "analytics", "renderTitle", "(Lwnk0;Lwrs0;)V", "renderSubtitle", "Lxnk0;", "timer", "renderTimer", "(Lxnk0;)V", "Laok0;", "renderTrail", "(Laok0;)V", "Lvnk0;", "progressBarData", "renderProgressBar", "(Lvnk0;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lp9y0;", "activeTimer", "Lru/yandex/taxi/widget/RobotoTextView;", "Lk2y;", "binding", "Lk2y;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardStatusProgressItemView extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;
    private final p9y0 actionHandler;
    private RobotoTextView activeTimer;
    private k2y binding;

    public RideCardStatusProgressItemView(Context context, AttributeSet attributeSet, int i, int i2, p9y0 p9y0Var) {
        super(context, attributeSet, i);
        this.actionHandler = p9y0Var;
        LayoutInflater.from(context).inflate(zkh0.layout_status_progress_view, this);
        int i3 = p8h0.bottom_barrier;
        if (((Barrier) cma1.O(i3, this)) != null) {
            i3 = p8h0.progress_bar;
            ProgressBarView progressBarView = (ProgressBarView) cma1.O(i3, this);
            if (progressBarView != null) {
                i3 = p8h0.shimmering_bar;
                ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i3, this);
                if (shimmeringFrameLayout != null) {
                    i3 = p8h0.space_bottom;
                    Space space = (Space) cma1.O(i3, this);
                    if (space != null) {
                        i3 = p8h0.status_title_container;
                        if (((GoLinearLayout) cma1.O(i3, this)) != null) {
                            i3 = p8h0.trail_container;
                            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i3, this);
                            if (goFrameLayout != null) {
                                i3 = p8h0.tv_subtitle;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, this);
                                if (robotoTextView != null) {
                                    i3 = p8h0.tv_title;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, this);
                                    if (robotoTextView2 != null) {
                                        this.binding = new k2y(this, progressBarView, shimmeringFrameLayout, space, goFrameLayout, robotoTextView, robotoTextView2);
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

    private final RobotoTextView createTimerView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        robotoTextView.setLayoutParams(layoutParams);
        robotoTextView.setPadding(tje.u(6, robotoTextView.getContext()), tje.u(5, robotoTextView.getContext()), tje.u(6, robotoTextView.getContext()), tje.u(5, robotoTextView.getContext()));
        robotoTextView.setMaxLines(1);
        robotoTextView.setGravity(16);
        robotoTextView.setFontFeatureSettings(robotoTextView.getContext().getString(mzh0.go_tabular_font_settings));
        robotoTextView.setIncludeFontPadding(false);
        return robotoTextView;
    }

    private final void renderBoldTimer(ynk0 trail) {
        Drawable background;
        if (this.activeTimer == null) {
            RobotoTextView createTimerView = createTimerView();
            createTimerView.setTextSize(20.0f);
            int[] iArr = up11.a;
            createTimerView.setTypeface(eja1.w(5, 0));
            createTimerView.setTextColor(new bdc(xng0.textInvert));
            createTimerView.setBackgroundResource(n4h0.bg_ride_status_timer_rounded);
            this.activeTimer = createTimerView;
            GoFrameLayout goFrameLayout = this.binding.e;
            goFrameLayout.removeAllViews();
            goFrameLayout.addView(this.activeTimer);
        }
        RobotoTextView robotoTextView = this.activeTimer;
        Drawable mutate = (robotoTextView == null || (background = robotoTextView.getBackground()) == null) ? null : background.mutate();
        GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColorFilter(new PorterDuffColorFilter(s8o.m(trail.a, getContext()), PorterDuff.Mode.SRC_ATOP));
        }
    }

    private final void renderRegularTimer() {
        if (this.activeTimer == null) {
            RobotoTextView createTimerView = createTimerView();
            createTimerView.setTextSize(16.0f);
            int[] iArr = up11.a;
            createTimerView.setTypeface(eja1.w(3, 0));
            createTimerView.setTextColor(new bdc(xng0.textMain));
            this.activeTimer = createTimerView;
            GoFrameLayout goFrameLayout = this.binding.e;
            goFrameLayout.removeAllViews();
            goFrameLayout.addView(this.activeTimer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderSubtitle$lambda$0$0(wnk0 wnk0Var, RideCardStatusProgressItemView rideCardStatusProgressItemView, wrs0 wrs0Var) {
        rideCardStatusProgressItemView.actionHandler.a(wnk0Var.b, wrs0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderTitle$lambda$0$0(wnk0 wnk0Var, RideCardStatusProgressItemView rideCardStatusProgressItemView, wrs0 wrs0Var) {
        rideCardStatusProgressItemView.actionHandler.a(wnk0Var.b, wrs0Var);
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.binding.c.setCenterColor(qje.t(xng0.bgMain, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void renderProgressBar(vnk0 progressBarData) {
        ProgressBarView progressBarView = this.binding.b;
        if (progressBarData == null) {
            progressBarView.setVisibility(8);
            this.binding.d.setVisibility(8);
            return;
        }
        progressBarView.setVisibility(0);
        this.binding.d.setVisibility(0);
        Long l = progressBarData.d;
        Long l2 = progressBarData.e;
        progressBarView.setStrokeColorAttr(progressBarData.b);
        float u = tje.u(10, progressBarView.getContext());
        progressBarView.setStrokeCornerRadius(new float[]{u, u, u, u, u, u, u, u});
        progressBarView.setIncrease(progressBarData.c);
        if (progressBarData.g) {
            progressBarView.setLoading(true);
        } else {
            if (l == null || l2 == null) {
                return;
            }
            progressBarView.start(l2.longValue(), l.longValue(), true, progressBarData.f.d());
        }
    }

    public final void renderState(RideCardStatusProgressItemUiState$State state) {
        ShimmeringFrameLayout shimmeringFrameLayout = this.binding.c;
        shimmeringFrameLayout.setCenterColor(qje.t(xng0.bgMain, shimmeringFrameLayout.getContext()));
        shimmeringFrameLayout.setShimmering(state == RideCardStatusProgressItemUiState$State.LOADING);
    }

    public final void renderSubtitle(wnk0 text, wrs0 analytics) {
        RobotoTextView robotoTextView = this.binding.f;
        if (text == null) {
            robotoTextView.setVisibility(8);
            return;
        }
        robotoTextView.setVisibility(0);
        robotoTextView.setText(text.a);
        int i = 1;
        boolean z = text.b != null;
        if (z) {
            c.z(new cok0(text, this, analytics, i), robotoTextView);
        } else {
            robotoTextView.setOnClickListener(null);
        }
        robotoTextView.setClickable(z);
    }

    public final void renderTimer(xnk0 timer) {
        RobotoTextView robotoTextView = this.activeTimer;
        if (timer == null) {
            if (robotoTextView != null) {
                this.binding.e.removeView(robotoTextView);
                this.activeTimer = null;
                return;
            }
            return;
        }
        if (robotoTextView != null) {
            robotoTextView.setText(timer.a);
        }
        RobotoTextView robotoTextView2 = this.activeTimer;
        if (robotoTextView2 != null) {
            robotoTextView2.setContentDescription(timer.b);
        }
        RobotoTextView robotoTextView3 = this.activeTimer;
        if (robotoTextView3 != null) {
            robotoTextView3.setTextColor(timer.c);
        }
    }

    public final void renderTitle(wnk0 text, wrs0 analytics) {
        RobotoTextView robotoTextView = this.binding.g;
        robotoTextView.setText(text.a);
        int i = 0;
        boolean z = text.b != null;
        if (z) {
            c.z(new cok0(text, this, analytics, i), robotoTextView);
        } else {
            robotoTextView.setOnClickListener(null);
        }
        robotoTextView.setClickable(z);
    }

    public final void renderTrail(aok0 trail) {
        if (trail == null) {
            this.activeTimer = null;
            this.binding.e.removeAllViews();
        } else if (trail instanceof ynk0) {
            renderBoldTimer((ynk0) trail);
        } else if (trail instanceof znk0) {
            renderRegularTimer();
        } else {
            w511.b();
        }
    }

    public /* synthetic */ RideCardStatusProgressItemView(Context context, AttributeSet attributeSet, int i, int i2, p9y0 p9y0Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, p9y0Var);
    }
}
