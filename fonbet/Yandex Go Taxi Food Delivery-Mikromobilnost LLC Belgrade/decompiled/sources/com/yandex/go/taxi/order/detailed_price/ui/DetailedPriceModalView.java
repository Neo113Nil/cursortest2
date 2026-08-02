package com.yandex.go.taxi.order.detailed_price.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.amh;
import defpackage.bdc;
import defpackage.c230;
import defpackage.c57;
import defpackage.cma1;
import defpackage.d4j;
import defpackage.e230;
import defpackage.f4j;
import defpackage.g0c;
import defpackage.g3j;
import defpackage.g4j;
import defpackage.gvz0;
import defpackage.he7;
import defpackage.i3j;
import defpackage.k5r0;
import defpackage.lki;
import defpackage.mr31;
import defpackage.my6;
import defpackage.n3j;
import defpackage.nni;
import defpackage.ny61;
import defpackage.o3j;
import defpackage.p2j;
import defpackage.p3j;
import defpackage.p8h0;
import defpackage.pm5;
import defpackage.q3j;
import defpackage.q47;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qr31;
import defpackage.qu;
import defpackage.s3j;
import defpackage.s57;
import defpackage.sc6;
import defpackage.scc;
import defpackage.t2j;
import defpackage.tje;
import defpackage.u2j;
import defpackage.uj70;
import defpackage.uxh;
import defpackage.uzx;
import defpackage.v2j;
import defpackage.w2j;
import defpackage.xng0;
import defpackage.y2j;
import defpackage.zkh0;
import defpackage.zxs;
import defpackage.zy6;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.common_models.ui.TextStyle;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.tooltips.SummaryTooltipAlignment;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00016\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003ABCB-\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001a\u0010\u0016J\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0014¢\u0006\u0004\b1\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/yandex/go/taxi/order/detailed_price/ui/DetailedPriceModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Luzx;", "Lnwy0;", "Landroid/content/Context;", "context", "Lg3j;", "presenter", "Ld4j;", "detailedPriceViewFactory", "Lgvz0;", "tooltipPlacementRepository", "<init>", "(Landroid/content/Context;Lg3j;Ld4j;Lgvz0;)V", "Landroid/view/View;", "anchor", "", "text", "Lzy11;", "showTooltip", "(Landroid/view/View;Ljava/lang/String;)V", "hideTooltip", "()V", "buttonTitle", "renderButton", "(Ljava/lang/String;)V", "onAttachedToWindow", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "newOffset", "onDialogSlide", "(F)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Luzx;", "onDetachedFromWindow", "Lg3j;", "Lqr31;", "viewGroupTooltipContainer", "Lqr31;", "q3j", "dismissTooltipPopupScrollListener", "Lq3j;", "Lp2j;", "adapter", "Lp2j;", "Lc57;", "Lzy6;", "actionButtons", "Lc57;", "Companion", "n3j", "p3j", "o3j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DetailedPriceModalView extends SlideableBindingModalView<uzx> {
    public static final int $stable = 8;
    public static final o3j Companion = new o3j();
    private static final String TOOLTIP_ANALYTIC_NAME = "DetailedPriceModal";
    private final c57 actionButtons;
    private final p2j adapter;
    private final q3j dismissTooltipPopupScrollListener;
    private final g3j presenter;
    private final qr31 viewGroupTooltipContainer;

    public DetailedPriceModalView(Context context, g3j g3jVar, d4j d4jVar, gvz0 gvz0Var) {
        super(context);
        this.presenter = g3jVar;
        this.viewGroupTooltipContainer = new qr31(getBinding().f, gvz0Var);
        this.dismissTooltipPopupScrollListener = new q3j(this);
        DetailedPriceModalView$adapter$1 detailedPriceModalView$adapter$1 = new DetailedPriceModalView$adapter$1(2, this, DetailedPriceModalView.class, "showTooltip", "showTooltip(Landroid/view/View;Ljava/lang/String;)V", 0);
        int i = 1;
        lki lkiVar = new lki(i);
        int i2 = g4j.W;
        g0c a = qoi0.a(t2j.class);
        nni nniVar = new nni(14);
        f4j f4jVar = new f4j(d4jVar, detailedPriceModalView$adapter$1, i);
        Class a2 = a.a();
        he7 he7Var = new he7(i, f4jVar);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, nniVar, emptyList, he7Var, null);
        int i3 = sc6.S;
        g0c a3 = qoi0.a(v2j.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new nni(9), emptyList, new he7(i, new nni(10)), null);
        int i4 = k5r0.V;
        g0c a4 = qoi0.a(w2j.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new nni(11), emptyList, new he7(i, new nni(12)), null);
        int i5 = uj70.V;
        g0c a5 = qoi0.a(u2j.class);
        p2j p2jVar = new p2j(lkiVar, scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a5.a(), 0, new nni(7), emptyList, new he7(i, new nni(8)), null)));
        this.adapter = p2jVar;
        c57 buttonsContract = getBinding().b.buttonsContract();
        this.actionButtons = buttonsContract;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        RecyclerView recyclerView = getBinding().e;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(p2jVar);
        recyclerView.setItemAnimator(null);
        ((pm5) buttonsContract).f(new s57(3, this));
        qdb1.c(this, new uxh(13, g3jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$goBack(g3j g3jVar) {
        g3jVar.z.a.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DetailedPriceModalView detailedPriceModalView, zy6 zy6Var) {
        detailedPriceModalView.presenter.z.a.r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTooltip() {
        this.viewGroupTooltipContainer.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(DetailedPriceModalView detailedPriceModalView) {
        return detailedPriceModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderButton(String buttonTitle) {
        cma1.J(getBinding().b);
        ((pm5) this.actionButtons).d(new q47(Collections.singletonList(new my6(buttonTitle, new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, n3j.a, null, null, false, false, 16292)), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTooltip(View anchor, String text) {
        this.viewGroupTooltipContainer.d(anchor, new mr31(text, TOOLTIP_ANALYTIC_NAME, true, Integer.MAX_VALUE, 1, new bdc(xng0.bgInvert), SummaryTooltipAlignment.CENTER, null, 7808), TooltipPlacement.SURGE_INFO_MODAL);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((GoLinearLayout) getBinding().c.b).invalidate();
        getBinding().e.invalidate();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public uzx bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(zkh0.layout_detailed_price_modal_view, parent, false);
        parent.addView(inflate);
        int i = p8h0.buttons_view;
        ButtonsView buttonsView = (ButtonsView) cma1.O(i, inflate);
        if (buttonsView != null && (O = cma1.O((i = p8h0.detailed_price_error_content), inflate)) != null) {
            y2j y2jVar = new y2j((GoLinearLayout) O, 0);
            i = p8h0.detailed_price_loading;
            View O2 = cma1.O(i, inflate);
            if (O2 != null) {
                int i2 = p8h0.detailed_price_loading_1;
                if (((PlaceholderView) cma1.O(i2, O2)) != null) {
                    i2 = p8h0.detailed_price_loading_2;
                    if (((PlaceholderView) cma1.O(i2, O2)) != null) {
                        i2 = p8h0.detailed_price_loading_3;
                        if (((PlaceholderView) cma1.O(i2, O2)) != null) {
                            y2j y2jVar2 = new y2j((GoConstraintLayout) O2, 1);
                            i = p8h0.detailed_price_rv;
                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                            if (recyclerView != null) {
                                i = p8h0.tooltip_container;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                                if (goFrameLayout != null) {
                                    return new uzx((GoFrameLayout) inflate, buttonsView, y2jVar, y2jVar2, recyclerView, goFrameLayout);
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i2)));
                return null;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new amh(17, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g3j g3jVar = this.presenter;
        g3jVar.Bg(new p3j(this));
        i3j i3jVar = g3jVar.x;
        s3j s3jVar = i3jVar.a;
        String str = s3jVar.b;
        tje.N(g3jVar.Jg(), null, null, new DetailedPriceModalPresenter$loadDetailedPrice$$inlined$safeCollectIn$1(new o(g3jVar.y.a(s3jVar.a, i3jVar.b, str), new DetailedPriceModalPresenter$loadDetailedPrice$1(g3jVar, str, null)), null, g3jVar), 3);
        getBinding().e.addOnScrollListener(this.dismissTooltipPopupScrollListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        getBinding().e.removeOnScrollListener(this.dismissTooltipPopupScrollListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        hideTooltip();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (ev != null && ev.getAction() == 1) {
            hideTooltip();
        }
        return super.onInterceptTouchEvent(ev);
    }
}
