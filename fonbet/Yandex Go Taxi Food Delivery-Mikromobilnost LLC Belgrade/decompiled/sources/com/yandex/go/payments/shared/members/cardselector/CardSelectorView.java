package com.yandex.go.payments.shared.members.cardselector;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import defpackage.dn7;
import defpackage.e32;
import defpackage.e6h0;
import defpackage.g1a0;
import defpackage.g5c;
import defpackage.gca0;
import defpackage.kyh0;
import defpackage.lq31;
import defpackage.luh0;
import defpackage.m4a0;
import defpackage.mys;
import defpackage.nsa1;
import defpackage.pav;
import defpackage.rp31;
import defpackage.rxz;
import defpackage.tje;
import defpackage.tse0;
import defpackage.u0a0;
import defpackage.un8;
import defpackage.vn8;
import defpackage.vnr0;
import defpackage.vo51;
import defpackage.x4c;
import defpackage.xyi;
import defpackage.y9p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;
import ru.yandex.taxi.widget.ToolbarModalView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'(B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001a\u0010\u0014J'\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/yandex/go/payments/shared/members/cardselector/CardSelectorView;", "Lru/yandex/taxi/widget/ToolbarModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/payments/shared/members/cardselector/a;", "presenter", "Lg1a0;", "paymentImageLoader", "Lpav;", "imageLoader", "Lvo51;", "yangoPaySdkPaymentRouterFactory", "Lrxz;", "loyaltyTabletFactory", "Lu0a0;", "paymentIconInfoFactory", "<init>", "(Landroid/content/Context;Lcom/yandex/go/payments/shared/members/cardselector/a;Lg1a0;Lpav;Lvo51;Lrxz;Lu0a0;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onTouchOutside", "", "getContentLayoutRes", "()I", "onBackPressed", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lcom/yandex/go/payments/shared/members/cardselector/a;", "Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserView;", "paymentChooser", "Lcom/yandex/go/payments/paymentlist/ui/PaymentMethodChooserView;", "Companion", "vn8", "un8", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardSelectorView extends ToolbarModalView {
    public static final int $stable;
    public static final un8 Companion = new un8();
    private static final g5c MODAL_VIEW_BACK_PRESSED_REASON;
    private final PaymentMethodChooserView paymentChooser;
    private final a presenter;

    static {
        int i = ToolbarModalView.$stable | PaymentMethodChooserView.$stable;
        int i2 = a.K;
        $stable = i | 8;
        MODAL_VIEW_BACK_PRESSED_REASON = new mys(SharedPaymentAnalytics$Button.BACK.getAnalyticsName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardSelectorView(Context context, a aVar, g1a0 g1a0Var, pav pavVar, vo51 vo51Var, rxz rxzVar, u0a0 u0a0Var) {
        super(context, null, 2, 0 == true ? 1 : 0);
        this.presenter = aVar;
        int i = e6h0.payment_method_chooser_view;
        WeakHashMap weakHashMap = b.a;
        PaymentMethodChooserView paymentMethodChooserView = (PaymentMethodChooserView) ((View) rp31.d(this, i));
        this.paymentChooser = paymentMethodChooserView;
        getToolbar().setOnNavigationClickListener(new dn7(14, this));
        getToolbar().setTitle(kyh0.shared_payments_choose_card);
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setAnimateOnAppearing(false);
        View findViewById = findViewById(e6h0.title_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        setAnalyticsContext(new e32("FamilyAccount.SelectCard", AnalyticsContext$ElementState.CARD, nsa1.d()));
        ((x4c) vo51Var).getClass();
        paymentMethodChooserView.init(g1a0Var, pavVar, kotlin.a.a(new xyi(7)), rxzVar, aVar, u0a0Var);
        paymentMethodChooserView.setAddCardAnalyticsName(SharedPaymentAnalytics$Button.ADD_CARD.getAnalyticsName());
        getToolbar().setNavigationButtonAnalyticsName(SharedPaymentAnalytics$Button.BACK.getAnalyticsName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CardSelectorView cardSelectorView) {
        cardSelectorView.setCloseTransitionReason(MODAL_VIEW_BACK_PRESSED_REASON);
        cardSelectorView.presenter.onBack();
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView
    public int getContentLayoutRes() {
        return luh0.payment_method_chooser;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        a aVar = this.presenter;
        vnr0 vnr0Var = aVar.A;
        String str = aVar.E.b;
        SharedPaymentContext sharedPaymentContext = aVar.F;
        LinkedHashMap linkedHashMap = vnr0Var.v;
        linkedHashMap.put("context", sharedPaymentContext.getValue());
        linkedHashMap.put("type_group", vnr0Var.k(str));
        linkedHashMap.put("group_id", str);
        return linkedHashMap;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        vn8 vn8Var = new vn8(this);
        aVar.Bg(vn8Var);
        vnr0 vnr0Var = aVar.A;
        String str = aVar.E.b;
        SharedPaymentContext sharedPaymentContext = aVar.F;
        y9p y9pVar = vnr0Var.l;
        String k = vnr0Var.k(str);
        String value = sharedPaymentContext.getValue();
        HashMap n = tse0.n(y9pVar);
        if (k != null) {
            n.put("type_group", k);
        }
        if (str != null) {
            n.put("group_id", str);
        }
        if (value != null) {
            n.put("context", value);
        }
        y9pVar.a.a("FamilyAccount.SelectCard.Shown", n, 1, new HashMap());
        i iVar = aVar.H;
        iVar.getClass();
        vn8Var.x(new gca0(m4a0.h, iVar.k(), "", true));
        tje.N(aVar.Jg(), null, null, new CardSelectorPresenter$attachView$1(aVar, vn8Var, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.presenter.onBack();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView, ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.presenter.onBack();
    }
}
