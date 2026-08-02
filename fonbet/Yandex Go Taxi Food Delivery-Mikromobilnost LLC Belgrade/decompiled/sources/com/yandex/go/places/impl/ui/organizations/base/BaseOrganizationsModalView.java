package com.yandex.go.places.impl.ui.organizations.base;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView;
import com.yandex.go.places.impl.ui.organizations.d;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.c230;
import defpackage.c2x0;
import defpackage.d2x0;
import defpackage.dug0;
import defpackage.f02;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l76;
import defpackage.mqg0;
import defpackage.mw2;
import defpackage.n5;
import defpackage.p7c0;
import defpackage.qje;
import defpackage.t1w;
import defpackage.tje;
import defpackage.u370;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y5e;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0014¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00132\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0014¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u00132\u0006\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020/H\u0014¢\u0006\u0004\b6\u00103J\u0019\u00108\u001a\u00020\u00132\b\b\u0002\u00107\u001a\u00020\u0016H\u0004¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0004¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0018¨\u0006I"}, d2 = {"Lcom/yandex/go/places/impl/ui/organizations/base/BaseOrganizationsModalView;", "Lzo31;", "T", "Lcom/yandex/go/places/base/ui/base_old/BaseOrganizationDiscoveryModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/places/impl/ui/organizations/d;", "organizationsPresenter", "Lc2x0;", "systemBarsCoordinator", "Lu370;", "openAnimationType", "", "manualInit", "<init>", "(Landroid/content/Context;Lcom/yandex/go/places/impl/ui/organizations/d;Lc2x0;Lu370;Z)V", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "Lzy11;", "setInitialBehaviorState", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lc230;", "insetsType", "()Lc230;", "getTopPadding", "isArrowsPermanentlyHidden", "()Z", "isApplyShadow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", ClidProvider.STATE, "updateExpandedTopScrimForState", "(I)V", "", "slideOffset", "updateExpandedTopScrimForSlide", "(F)V", "Lcom/yandex/go/places/impl/ui/organizations/d;", "Lc2x0;", "Lu370;", "Lp7c0;", "expandedTopScrimController$delegate", "Li3y;", "getExpandedTopScrimController", "()Lp7c0;", "expandedTopScrimController", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseOrganizationsModalView<T extends zo31> extends BaseOrganizationDiscoveryModalView<T> {
    public static final int $stable = 8;

    /* renamed from: expandedTopScrimController$delegate, reason: from kotlin metadata */
    private final i3y expandedTopScrimController;
    private final u370 openAnimationType;
    private final d organizationsPresenter;
    private final c2x0 systemBarsCoordinator;

    public BaseOrganizationsModalView(Context context, d dVar, c2x0 c2x0Var, u370 u370Var, boolean z) {
        super(context, dVar, z, null, null, 24, null);
        this.organizationsPresenter = dVar;
        this.systemBarsCoordinator = c2x0Var;
        this.openAnimationType = u370Var;
        this.expandedTopScrimController = a.b(LazyThreadSafetyMode.NONE, new mw2(18, this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p7c0 expandedTopScrimController_delegate$lambda$0(BaseOrganizationsModalView baseOrganizationsModalView, Context context) {
        return new p7c0(baseOrganizationsModalView, new f02(27, baseOrganizationsModalView), new n5(context, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int expandedTopScrimController_delegate$lambda$0$1(Context context) {
        return qje.t(xng0.bgMain, context);
    }

    private final p7c0 getExpandedTopScrimController() {
        return (p7c0) this.expandedTopScrimController.getValue();
    }

    public static void updateExpandedTopScrimForState$default(BaseOrganizationsModalView baseOrganizationsModalView, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: updateExpandedTopScrimForState");
            return;
        }
        if ((i2 & 1) != 0) {
            i = baseOrganizationsModalView.getBottomSheetBehavior().E;
        }
        baseOrganizationsModalView.updateExpandedTopScrimForState(i);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        u370 u370Var = this.openAnimationType;
        if (jl40.l(u370Var, l76.I)) {
            y5e.c(this, startAction, endAction, null, 8);
        } else if (jl40.l(u370Var, vvb1.H)) {
            super.animateDismiss(startAction, endAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        u370 u370Var = this.openAnimationType;
        if (jl40.l(u370Var, l76.I)) {
            y5e.d(this, onAnimateShowStartAction, onAnimateShowEndAction, null, 8);
        } else if (jl40.l(u370Var, vvb1.H)) {
            super.animateShow(onAnimateShowStartAction, onAnimateShowEndAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getExpandedTopScrimController().a();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return this.organizationsPresenter.F.a ? mqg0.transparent : mqg0.black;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(dug0.discovery_organizations_search_header_radius, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return this.topSystemWindowInset;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(5);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((d2x0) this.systemBarsCoordinator).e(0, this);
        getExpandedTopScrimController().b();
        getExpandedTopScrimController().a();
        getExpandedTopScrimController().d(getCurrentInsets());
        updateExpandedTopScrimForState$default(this, 0, 1, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ((d2x0) this.systemBarsCoordinator).b(this);
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        getExpandedTopScrimController().d(insets);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return true;
        }
        if (!this.organizationsPresenter.F.a) {
            return super.onTouchEvent(event);
        }
        if (getBottomSheetBehavior().E != 6) {
            return false;
        }
        collapse();
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        bottomSheetBehavior.O(get_cardMode() != SlideableModalView.CardMode.SLIDEABLE_CARD ? 7 : 6);
        updateExpandedTopScrimForState(bottomSheetBehavior.E);
    }

    public final void updateExpandedTopScrimForSlide(float slideOffset) {
        getExpandedTopScrimController().e(convertToOffsetFromAnchored(slideOffset));
    }

    public final void updateExpandedTopScrimForState(int state) {
        getExpandedTopScrimController().f(state);
    }

    public /* synthetic */ BaseOrganizationsModalView(Context context, d dVar, c2x0 c2x0Var, u370 u370Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, c2x0Var, u370Var, (i & 16) != 0 ? false : z);
    }
}
