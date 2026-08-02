package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$RouteSelectorCardState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.error.HubErrorView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.c;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import defpackage.a2i0;
import defpackage.b0b;
import defpackage.b0v;
import defpackage.bc31;
import defpackage.ca1;
import defpackage.cc31;
import defpackage.ce0;
import defpackage.clh0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.d0v;
import defpackage.e230;
import defpackage.ec31;
import defpackage.f0v;
import defpackage.f1h0;
import defpackage.fc31;
import defpackage.g0c;
import defpackage.gar0;
import defpackage.gc31;
import defpackage.gyu;
import defpackage.h0s;
import defpackage.h0v;
import defpackage.hc31;
import defpackage.he7;
import defpackage.i8r0;
import defpackage.ic31;
import defpackage.j01;
import defpackage.jc31;
import defpackage.jl40;
import defpackage.jt6;
import defpackage.jyu;
import defpackage.ke31;
import defpackage.kk31;
import defpackage.kyh0;
import defpackage.lc31;
import defpackage.lk31;
import defpackage.lo4;
import defpackage.mc31;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.ob31;
import defpackage.ofp0;
import defpackage.pav;
import defpackage.pw8;
import defpackage.qc31;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.s8h0;
import defpackage.scc;
import defpackage.sls;
import defpackage.szu;
import defpackage.t1w;
import defpackage.t601;
import defpackage.tje;
import defpackage.tqs;
import defpackage.uc31;
import defpackage.uyu;
import defpackage.uzu;
import defpackage.vng;
import defpackage.vu30;
import defpackage.w130;
import defpackage.w511;
import defpackage.w9u;
import defpackage.wpy0;
import defpackage.wx11;
import defpackage.xb31;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xzu;
import defpackage.y4;
import defpackage.yt60;
import defpackage.z9o;
import defpackage.zr01;
import defpackage.zrm;
import defpackage.zug0;
import defpackage.zxs;
import defpackage.zy11;
import defpackage.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.j0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002or\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002xyBA\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0014¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u001fH\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001fH\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020<2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u001fH\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010\u001cJ\u000f\u0010H\u001a\u00020\u0012H\u0002¢\u0006\u0004\bH\u0010\u001cJ\u000f\u0010I\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010\u001cJ\u0017\u0010L\u001a\u00020\u00122\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010P\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bP\u0010QJ+\u0010W\u001a\u00020\u00122\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0R2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120UH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0012H\u0002¢\u0006\u0004\bY\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ZR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010dR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006z"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/VerticalHubV1ModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxb31;", "", "initialState", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/c;", "presenter", "anchorFromConfig", "Lpav;", "imageLoader", "Landroid/content/Context;", "context", "Llk31;", "verticalsViewFactory", "<init>", "(ILcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/c;ILpav;Landroid/content/Context;Llk31;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxb31;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "anchoredHeight", "()I", "", "newOffset", "onDialogSlide", "(F)V", "onSlideOut", "canDragToExpandFromAnchored", "()Z", "Le230;", "insetsType", "()Le230;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/ActionButtonsState;", ClidProvider.STATE, "renderActionButtons", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/ActionButtonsState;)V", "Landroid/view/View;", "button", "isVisible", "updateButtonVisibility", "(Landroid/view/View;Z)V", "Lh0s;", "shadowState", "renderShadow", "(Lh0s;)V", "Landroid/graphics/drawable/Drawable;", "shadow", "createShadowWithBackground", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "isButtonVisible", "changeErrorStateVisibility", "(ZZ)V", "Lz9o;", "uiState", "renderErrorState", "(Lz9o;)V", "updateErrorSlide", "recalculateHeightForErrorState", "updateContentAnchor", "Lt1w;", "insets", "applyInsets", "(Lt1w;)V", "Lgyu;", "footer", "renderFooter", "(Lgyu;)V", "", "Lh0v;", "items", "Lkotlin/Function0;", "onComplete", "renderHubItems", "(Ljava/util/List;Lsls;)V", "updateModalState", CA20Status.STATUS_USER_I, "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/c;", "Lkk31;", "stickyVerticals", "Lkk31;", "Lbc31;", "hubItemsAdapter", "Lbc31;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "focusRouteButton", "Ljyu;", "buttonView", "Ljyu;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/footer/HubFooterView;", "footerView", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/footer/HubFooterView;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/a;", "shownItemsDelegate", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/a;", "ic31", "showItemsScrollListener", "Lic31;", "jc31", "stickyScrollListener", "Ljc31;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/b;", "userScrolledListener", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/b;", "kc31", "fc31", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VerticalHubV1ModalView extends SlideableBindingModalView<xb31> {
    public static final int $stable = 8;
    private final int anchorFromConfig;
    private final FloatButtonIconComponent backButton;
    private final jyu buttonView;
    private final FloatButtonIconComponent focusRouteButton;
    private final HubFooterView footerView;
    private final bc31 hubItemsAdapter;
    private final int initialState;
    private final c presenter;
    private final ic31 showItemsScrollListener;
    private final a shownItemsDelegate;
    private final jc31 stickyScrollListener;
    private final kk31 stickyVerticals;
    private final b userScrolledListener;

    public VerticalHubV1ModalView(int i, final c cVar, int i2, pav pavVar, Context context, lk31 lk31Var) {
        super(context, i);
        this.initialState = i;
        this.presenter = cVar;
        this.anchorFromConfig = i2;
        final int i3 = 1;
        kk31 a = lk31Var.a(new cc31(this, i3));
        View asView = a.asView();
        asView.setVisibility(8);
        asView.setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        ru.yandex.taxi.design.utils.c.w(((xb31) getBinding()).e, asView);
        this.stickyVerticals = a;
        VerticalHubV1ModalView$hubItemsAdapter$1 verticalHubV1ModalView$hubItemsAdapter$1 = new VerticalHubV1ModalView$hubItemsAdapter$1(1, cVar, c.class, "onItemClicked", "onItemClicked(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/HubItemUiState;)V", 0);
        hc31 hc31Var = new hc31(this);
        int i4 = 27;
        zr01 zr01Var = new zr01(i4, lk31Var, this);
        pw8 pw8Var = new pw8(4, verticalHubV1ModalView$hubItemsAdapter$1);
        int i5 = b0b.e0;
        g0c a2 = qoi0.a(d0v.class);
        i8r0 i8r0Var = new i8r0(19);
        Class a3 = a2.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a3, 0, null, emptyList, null, i8r0Var);
        int i6 = b0b.e0;
        g0c a4 = qoi0.a(uzu.class);
        int i7 = 7;
        zxs zxsVar2 = new zxs(a4.a(), 0, null, emptyList, null, new w9u(i7));
        int i8 = lo4.U;
        g0c a5 = qoi0.a(xzu.class);
        zxs zxsVar3 = new zxs(a5.a(), 0, null, emptyList, null, new jt6(pavVar, i7));
        int i9 = yt60.V;
        g0c a6 = qoi0.a(b0v.class);
        zxs zxsVar4 = new zxs(a6.a(), 0, null, emptyList, null, new jt6(pavVar, 8));
        int i10 = b0b.e0;
        g0c a7 = qoi0.a(zzu.class);
        zxs zxsVar5 = new zxs(a7.a(), 0, null, emptyList, null, new vu30(11));
        int i11 = ca1.g0;
        g0c a8 = qoi0.a(szu.class);
        y4 y4Var = new y4(i4, hc31Var);
        int i12 = 13;
        zxs zxsVar6 = new zxs(a8.a(), 0, y4Var, emptyList, new he7(i3, new j01(i12)), null);
        int i13 = gar0.T;
        g0c a9 = qoi0.a(f0v.class);
        bc31 bc31Var = new bc31(pw8Var, scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, zxsVar6, new zxs(a9.a(), 0, new wx11(28, zr01Var), emptyList, new he7(i3, new ke31(i12)), null)));
        this.hubItemsAdapter = bc31Var;
        final int i14 = 0;
        Runnable runnable = new Runnable() { // from class: dc31
            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i14;
                c cVar2 = cVar;
                switch (i15) {
                    case 0:
                        VerticalHubV1ModalView.backButton$onBackPressed(cVar2);
                        break;
                    default:
                        VerticalHubV1ModalView.focusRouteButton$focusOnRoute(cVar2);
                        break;
                }
            }
        };
        int i15 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet = null;
        int i16 = 0;
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), attributeSet, i16, a2i0.FloatButtonIconStyle, i15, defaultConstructorMarker);
        backButtonIconComponent.setDebounceClickListener(runnable);
        backButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, backButtonIconComponent.getContext())));
        backButton$lambda$0(backButtonIconComponent);
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        Runnable runnable2 = new Runnable() { // from class: dc31
            @Override // java.lang.Runnable
            public final void run() {
                int i152 = i3;
                c cVar2 = cVar;
                switch (i152) {
                    case 0:
                        VerticalHubV1ModalView.backButton$onBackPressed(cVar2);
                        break;
                    default:
                        VerticalHubV1ModalView.focusRouteButton$focusOnRoute(cVar2);
                        break;
                }
            }
        };
        int i17 = f1h0.ic_route;
        FloatButtonIconComponent floatButtonIconComponent = new FloatButtonIconComponent(getContext(), attributeSet, i16, a2i0.FloatButtonIconStyle, i15, defaultConstructorMarker);
        floatButtonIconComponent.setDebounceClickListener(runnable2);
        floatButtonIconComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, tje.u(90, floatButtonIconComponent.getContext())));
        floatButtonIconComponent.setIcon(i17);
        focusRouteButton$lambda$0(floatButtonIconComponent);
        addFloatButton(floatButtonIconComponent, 8388613);
        this.focusRouteButton = floatButtonIconComponent;
        View inflate = LayoutInflater.from(context).inflate(clh0.hub_footer_view, (ViewGroup) this, false);
        int i18 = s8h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i18, inflate);
        if (buttonComponent == null) {
            ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
            throw null;
        }
        GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
        this.buttonView = new jyu(goFrameLayout, buttonComponent);
        HubFooterView hubFooterView = new HubFooterView(context, null, 0, 6, null);
        hubFooterView.setOnFilterSelected(new VerticalHubV1ModalView$footerView$1$1(1, cVar, c.class, "onFilterSelected", "onFilterSelected(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/HubFilterUiState;)V", 0));
        this.footerView = hubFooterView;
        this.shownItemsDelegate = new a(new VerticalHubV1ModalView$shownItemsDelegate$1(1, cVar, c.class, "onItemShown", "onItemShown(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/ui/HubItemUiState;)V", 0), new ec31(i14, this));
        this.showItemsScrollListener = new ic31(this);
        this.stickyScrollListener = new jc31(this);
        this.userScrolledListener = new b(new VerticalHubV1ModalView$userScrolledListener$1(0, cVar, c.class, "onItemsScrolled", "onItemsScrolled()V", 0));
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        setClickable(false);
        getBottomSheetBehavior().W = false;
        getBottomSheetBehavior().Z = false;
        getBottomSheetBehavior().J(true);
        updateContentAnchor();
        setEnableBackgroundOnAppearing(false);
        RecyclerView recyclerView = ((xb31) getBinding()).d;
        recyclerView.setAdapter(bc31Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new uyu(tje.u(8, recyclerView.getContext())));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        addView(goFrameLayout, layoutParams);
        goFrameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        hubFooterView.setVisibility(8);
        addView(hubFooterView, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyInsets(t1w insets) {
        xw31.I(this, null, Integer.valueOf(insets.b), null, null);
        GoFrameLayout goFrameLayout = this.buttonView.a;
        int i = insets.g;
        xw31.y(i, goFrameLayout);
        this.footerView.updateBottomPadding(i);
    }

    private static final zy11 backButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setBadgeBackgroundColor(ru.yandex.taxi.design.utils.c.c(xng0.controlMain, floatButtonIconComponent));
        floatButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        ru.yandex.taxi.design.utils.c.y(floatButtonIconComponent, true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void backButton$onBackPressed(c cVar) {
        ((qc31) cVar.x.a).r(new qu(9));
    }

    private final void changeErrorStateVisibility(boolean isVisible, boolean isButtonVisible) {
        getBinding().c.setVisibility(isVisible ? 0 : 8);
        getBinding().b.setVisibility(isVisible ? 0 : 8);
        this.buttonView.a.setVisibility(isButtonVisible ? 0 : 8);
    }

    private final Drawable createShadowWithBackground(Drawable shadow) {
        return new LayerDrawable(new Drawable[]{shadow, vng.t(f1h0.footer_bg, getContext())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusRouteButton$focusOnRoute(c cVar) {
        cVar.K.a();
    }

    private static final zy11 focusRouteButton$lambda$0(FloatButtonIconComponent floatButtonIconComponent) {
        floatButtonIconComponent.setContentDescription(ru.yandex.taxi.design.utils.c.G(kyh0.summory_route_show_description, floatButtonIconComponent));
        floatButtonIconComponent.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kk31 hubItemsAdapter$lambda$0(lk31 lk31Var, VerticalHubV1ModalView verticalHubV1ModalView) {
        return lk31Var.a(new cc31(verticalHubV1ModalView, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 hubItemsAdapter$lambda$0$0(VerticalHubV1ModalView verticalHubV1ModalView, int i, ob31 ob31Var) {
        verticalHubV1ModalView.presenter.Ng(ob31Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(VerticalHubV1ModalView verticalHubV1ModalView, t1w t1wVar) {
        verticalHubV1ModalView.applyInsets(t1wVar);
        return zy11.a;
    }

    private final void recalculateHeightForErrorState() {
        if (getBinding().c.getVisibility() == 0) {
            int i = 0;
            int max = Math.max(0, getBinding().d.getHeight());
            int minContentHeight = getBinding().c.minContentHeight();
            if (this.buttonView.a.getVisibility() == 0 && (i = this.buttonView.a.getHeight() - this.buttonView.a.getPaddingTop()) <= 0) {
                i = tje.u(48, getContext());
            }
            setBehaviorAnchorHeight(Integer.valueOf(Math.max(max + minContentHeight + i, tje.u(100, getContext()) + minContentHeight + i)));
            getBinding().c.updateSlide(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderActionButtons(ActionButtonsState state) {
        int i = gc31.a[state.ordinal()];
        if (i == 1) {
            updateButtonVisibility(this.backButton, true);
            updateButtonVisibility(this.focusRouteButton, false);
        } else if (i == 2) {
            updateButtonVisibility(this.backButton, true);
            updateButtonVisibility(this.focusRouteButton, true);
        } else if (i != 3) {
            w511.b();
        } else {
            updateButtonVisibility(this.backButton, false);
            updateButtonVisibility(this.focusRouteButton, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderErrorState(z9o uiState) {
        if (uiState == null) {
            changeErrorStateVisibility(false, false);
            return;
        }
        zrm zrmVar = uiState.c;
        getBinding().c.render(uiState.a, uiState.b);
        if (zrmVar != null) {
            this.buttonView.b.setText((String) zrmVar.b);
            this.buttonView.b.setDebounceClickListener(new t601(21, this, uiState));
        }
        changeErrorStateVisibility(true, zrmVar != null);
        updateErrorSlide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderErrorState$lambda$0(VerticalHubV1ModalView verticalHubV1ModalView, z9o z9oVar) {
        c cVar = verticalHubV1ModalView.presenter;
        ErrorButtonAction errorButtonAction = (ErrorButtonAction) z9oVar.c.c;
        cVar.getClass();
        int i = mc31.a[errorButtonAction.ordinal()];
        if (i == 1) {
            qc31.T((qc31) cVar.x.a, PointType.DESTINATION);
        } else if (i == 2) {
            tje.N(cVar.Jg(), null, null, new VerticalHubV1Presenter$handleButtonAction$1(cVar, null), 3);
        } else if (i == 3) {
            tje.N(cVar.Jg(), null, null, new VerticalHubV1Presenter$handleButtonAction$2(cVar, null), 3);
        } else if (i == 4) {
            tje.N(cVar.Jg(), null, null, new VerticalHubV1Presenter$handleButtonAction$3(cVar, null), 3);
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            ((lc31) cVar.Dg()).expand();
        }
        cVar.Og();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderFooter(gyu footer) {
        this.footerView.render(footer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderHubItems(List<? extends h0v> items, sls onComplete) {
        this.shownItemsDelegate.c.clear();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof f0v) {
                arrayList.add(obj);
            }
        }
        f0v f0vVar = (f0v) kotlin.collections.a.R(arrayList);
        if (f0vVar != null) {
            this.stickyVerticals.render(f0vVar.a);
        }
        this.hubItemsAdapter.submitList(items, new t601(20, this, onComplete));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderHubItems$lambda$1(VerticalHubV1ModalView verticalHubV1ModalView, sls slsVar) {
        OneShotPreDrawListener.add(verticalHubV1ModalView.getBinding().d, new tqs(18, verticalHubV1ModalView, slsVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderShadow(h0s shadowState) {
        cvw.e0(this.buttonView.a, createShadowWithBackground(shadowState.a), null, Integer.valueOf(tje.r(zug0.mobility_hub_button_padding, getContext())), 10);
        this.footerView.setShadow(createShadowWithBackground(shadowState.a), getCurrentInsets().g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int shownItemsDelegate$lambda$0(VerticalHubV1ModalView verticalHubV1ModalView) {
        return ofp0.c + verticalHubV1ModalView.getCurrentInsets().b + verticalHubV1ModalView.getCurrentInsets().d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 stickyVerticals$lambda$0(VerticalHubV1ModalView verticalHubV1ModalView, int i, ob31 ob31Var) {
        verticalHubV1ModalView.presenter.Ng(ob31Var);
        return zy11.a;
    }

    private final void updateButtonVisibility(View button, boolean isVisible) {
        button.animate().cancel();
        if (button.getVisibility() == 0 && !isVisible) {
            cma1.b(0.0f, button).withEndAction(new ce0(button, 23));
        } else if (button.getVisibility() != 0 && isVisible) {
            cma1.b(1.0f, button).withEndAction(new ce0(button, 24));
        }
    }

    private final void updateContentAnchor() {
        int i = this.anchorFromConfig;
        if (i != 0) {
            setBehaviorAnchorHeight(Integer.valueOf(tje.u(i, getContext())));
        }
    }

    private final void updateErrorSlide() {
        float x = getBottomSheetBehavior().x();
        getBinding().c.updateSlide(x != 1.0f ? Math.max(0.0f, (getSlideOffset() - x) / (1.0f - x)) : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateModalState() {
        float x = getBottomSheetBehavior().x();
        float max = x != 1.0f ? Math.max(0.0f, (getSlideOffset() - x) / (1.0f - x)) : 1.0f;
        c cVar = this.presenter;
        uc31 uc31Var = cVar.H;
        ModalState modalState = (ModalState) uc31Var.b.a.getValue();
        ModalState modalState2 = max >= 0.9f ? ModalState.Expanded : max >= 0.5f ? ModalState.Other : ModalState.Anchored;
        uc31Var.a.l(modalState2);
        ModalState modalState3 = ModalState.Expanded;
        if (modalState != modalState3 || modalState2 == modalState3) {
            return;
        }
        cVar.Mg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int anchoredHeight() {
        int height = getContent().getHeight();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        return height - bottomSheetBehavior.w[bottomSheetBehavior.x];
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.stickyVerticals.asView().setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xb31 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(clh0.vertical_hub_modal_view, parent, false);
        int i = s8h0.empty_view;
        View O2 = cma1.O(i, inflate);
        if (O2 != null) {
            i = s8h0.error_state;
            HubErrorView hubErrorView = (HubErrorView) cma1.O(i, inflate);
            if (hubErrorView != null) {
                i = s8h0.hub_items;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null && (O = cma1.O((i = s8h0.sticky_verticals_view_stub), inflate)) != null) {
                    return new xb31((GoConstraintLayout) inflate, O2, hubErrorView, recyclerView, O);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new wx11(24, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setOnTouchOutsideListener(null);
        c cVar = this.presenter;
        fc31 fc31Var = new fc31(this);
        cVar.Bg(fc31Var);
        tje.N(cVar.Jg(), null, null, new VerticalHubV1Presenter$attachView$$inlined$safeCollectIn$1(new mth(new j0(null, cVar.G.b(), new VerticalHubV1Presenter$attachView$$inlined$withPreviousEmit$1(3, null)), 6), null, cVar, fc31Var), 3);
        cVar.C.b8(cVar);
        o7r0 o7r0Var = cVar.D;
        String analyticName = cVar.z.getAnalyticName();
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, analyticName);
        o7r0Var.a.a("TransitRoutesHub.RouteSelector.Shown", hashMap, 1, new HashMap());
        setSlideListener(new wpy0(23, this));
        int i = this.initialState;
        setBackgroundDimColor((i == 3 || i == 7) ? 1.0f : 0.0f);
        getBinding().d.addOnScrollListener(this.showItemsScrollListener);
        getBinding().d.addOnScrollListener(this.userScrolledListener);
        getBinding().d.addOnScrollListener(this.stickyScrollListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // ru.yandex.taxi.widget.SlideableModalView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        Boolean bool;
        TransitRoutesHubAnalytics$RouteSelectorCardState transitRoutesHubAnalytics$RouteSelectorCardState;
        super.onBehaviorStateChanged(newState, movedByUser);
        if (newState != 3) {
            if (newState == 4 || newState == 6) {
                bool = Boolean.FALSE;
            } else if (newState != 7) {
                bool = null;
            }
            if (jl40.l(bool, Boolean.FALSE) && getBinding().c.getVisibility() == 0 && (getBottomSheetBehavior().y() == 3 || newState == 6)) {
                recalculateHeightForErrorState();
            }
            c cVar = this.presenter;
            cVar.getClass();
            transitRoutesHubAnalytics$RouteSelectorCardState = bool != null ? bool.equals(Boolean.TRUE) ? TransitRoutesHubAnalytics$RouteSelectorCardState.Expanded : TransitRoutesHubAnalytics$RouteSelectorCardState.Collapsed : null;
            if (transitRoutesHubAnalytics$RouteSelectorCardState == null) {
                o7r0 o7r0Var = cVar.D;
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(ClidProvider.STATE, transitRoutesHubAnalytics$RouteSelectorCardState.getEventValue());
                o7r0Var.a.a("TransitRoutesHub.RouteSelector.State.Changed", hashMap, 1, new HashMap());
                return;
            }
            return;
        }
        bool = Boolean.TRUE;
        if (jl40.l(bool, Boolean.FALSE)) {
            recalculateHeightForErrorState();
        }
        c cVar2 = this.presenter;
        cVar2.getClass();
        if (bool != null) {
        }
        if (transitRoutesHubAnalytics$RouteSelectorCardState == null) {
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSlideListener(null);
        this.presenter.Cg();
        getBinding().d.removeOnScrollListener(this.showItemsScrollListener);
        getBinding().d.removeOnScrollListener(this.userScrolledListener);
        getBinding().d.removeOnScrollListener(this.stickyScrollListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        updateModalState();
        updateErrorSlide();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }
}
