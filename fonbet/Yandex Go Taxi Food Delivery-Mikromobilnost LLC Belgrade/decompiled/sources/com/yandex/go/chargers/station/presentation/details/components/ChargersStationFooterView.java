package com.yandex.go.chargers.station.presentation.details.components;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.chargers.design.components.ChargersButtonsView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.payment.common.result.ResultType;
import defpackage.cc6;
import defpackage.dc6;
import defpackage.nsa;
import defpackage.nya;
import defpackage.pav;
import defpackage.qje;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.uo9;
import defpackage.xng0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u00017B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\rJ%\u0010\u001c\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\rJ\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationFooterView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lkotlin/Function1;", "Luj9;", "Lzy11;", "onButtonClickListener", "<init>", "(Landroid/content/Context;Lpav;Ltls;)V", "onAttachedToWindow", "()V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parentToAttach", "attach", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "Lt1w;", "insets", "handleInsets", "(Lt1w;)V", ResultType.RESULT_TYPE_LOADING, "", "Luo9;", "buttons", "Lnya;", "termsPlate", "success", "(Ljava/util/List;Lnya;)V", "updateButtons", "(Ljava/util/List;)V", "", ClidProvider.STATE, "updatePlateBySheetState", "(I)V", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ldc6;", "bottomContainerShadow", "Ldc6;", "Lcom/yandex/go/chargers/station/presentation/details/components/ChargersTermsPlateView;", "chargersTermsPlateView", "Lcom/yandex/go/chargers/station/presentation/details/components/ChargersTermsPlateView;", "Lcom/yandex/go/chargers/design/components/ChargersButtonsView;", "chargersButtonsView", "Lcom/yandex/go/chargers/design/components/ChargersButtonsView;", "Companion", "nsa", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationFooterView extends GoLinearLayout {
    public static final int $stable = 8;
    private static final float BUTTONS_VIEW_Z_INDEX = 1.0f;
    public static final nsa Companion = new nsa();
    private final dc6 bottomContainerShadow;
    private final ChargersButtonsView chargersButtonsView;
    private final ChargersTermsPlateView chargersTermsPlateView;

    public ChargersStationFooterView(Context context, pav pavVar, tls tlsVar) {
        super(context, null, 0, 0, 14, null);
        dc6 dc6Var = new dc6(context);
        int i = xng0.bgFloating;
        dc6Var.c = i;
        dc6Var.d.setColor(qje.u(context.getTheme(), i));
        this.bottomContainerShadow = dc6Var;
        this.chargersTermsPlateView = new ChargersTermsPlateView(context, pavVar, tlsVar);
        this.chargersButtonsView = new ChargersButtonsView(context, tlsVar, false);
        setOrientation(1);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(300L);
        setLayoutTransition(layoutTransition);
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.bottomContainerShadow.c();
        invalidate();
    }

    public final void attach(CoordinatorLayout parentToAttach) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        parentToAttach.addView(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.bottomContainerShadow.b(canvas);
        super.dispatchDraw(canvas);
    }

    public final void handleInsets(t1w insets) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), tje.u(8, getContext()) + insets.g);
    }

    public final void loading() {
        this.chargersTermsPlateView.loading();
        this.chargersButtonsView.loading();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bottomContainerShadow.a(this);
        addView(this.chargersTermsPlateView);
        ChargersButtonsView chargersButtonsView = this.chargersButtonsView;
        chargersButtonsView.setZ(1.0f);
        addView(chargersButtonsView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dc6 dc6Var = this.bottomContainerShadow;
        dc6Var.g = null;
        cc6 cc6Var = dc6Var.h;
        if (cc6Var != null) {
            cc6Var.cancel();
        }
    }

    public final void success(List<uo9> buttons, nya termsPlate) {
        this.chargersTermsPlateView.success(termsPlate);
        this.chargersButtonsView.success(buttons);
    }

    public final void updateButtons(List<uo9> buttons) {
        this.chargersButtonsView.success(buttons);
    }

    public final void updatePlateBySheetState(int state) {
        this.chargersTermsPlateView.updatePlateBySheetState(state);
    }
}
