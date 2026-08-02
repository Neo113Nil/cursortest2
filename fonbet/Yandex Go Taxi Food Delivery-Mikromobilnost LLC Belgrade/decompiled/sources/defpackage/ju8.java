package defpackage;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.f;
import com.airbnb.lottie.compose.LottieAnimatableImpl;
import com.yandex.go.chargers.background.ChargersBackgroundModalView;
import com.yandex.go.chargers.discounts.list.ui.h;
import com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView;
import com.yandex.go.chargers.misc.support.b;
import com.yandex.go.chargers.notification.ChargersNotification;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferBottomComponent;
import com.yandex.go.logistics.cargo_flow.discovery_map.CargoFlowDiscoveryMapModalView;
import com.yandex.go.logistics.cargo_flow.discovery_map.a;
import com.yandex.go.morphlex.action.change_requirement.d;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.feature.change.payment.method.internal.ui.c;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;
import ru.yandex.tankerapp.go.models.HomeInitialModel;
import ru.yandex.tankerapp.go.presentation.CartechFragment;
import ru.yandex.tankerapp.go.presentation.CartechHomeActivity;
import ru.yandex.taxi.cashback.analytics.CashbackAnalyticsImpl$CashbackNotificationContext;
import ru.yandex.taxi.plus.badge.CashbackAmountView;

/* loaded from: classes12.dex */
public final /* synthetic */ class ju8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ju8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        xni screenEngine_delegate$lambda$0;
        HomeInitialModel initialModel_delegate$lambda$0;
        HomeInitialModel initialData_delegate$lambda$0;
        Rect initAnimationController$lambda$0;
        zy11 onViewCreated$lambda$3;
        zy11 viewBinding$lambda$3$lambda$0;
        zy11 onAttachedToWindow$lambda$2$0;
        View insetsType$lambda$0;
        zy11 onAttachedToWindow$lambda$0;
        zy11 paymentOptions$lambda$1;
        int i = this.a;
        int i2 = 9;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                screenEngine_delegate$lambda$0 = CargoFlowDiscoveryMapModalView.screenEngine_delegate$lambda$0((ltj) obj);
                return screenEngine_delegate$lambda$0;
            case 1:
                ((a) obj).r(new qu(9));
                return zy11Var;
            case 2:
                ((dy8) ((zo31) ((wx8) obj).R)).c.setImageResource(p0h0.ic_carousel_requirement_empty_image);
                return zy11Var;
            case 3:
                initialModel_delegate$lambda$0 = CartechFragment.initialModel_delegate$lambda$0((CartechFragment) obj);
                return initialModel_delegate$lambda$0;
            case 4:
                initialData_delegate$lambda$0 = CartechHomeActivity.initialData_delegate$lambda$0((CartechHomeActivity) obj);
                return initialData_delegate$lambda$0;
            case 5:
                initAnimationController$lambda$0 = CashbackAmountView.initAnimationController$lambda$0((CashbackAmountView) obj);
                return initAnimationController$lambda$0;
            case 6:
                onViewCreated$lambda$3 = CashbackCategoriesFragment.onViewCreated$lambda$3((CashbackCategoriesFragment) obj);
                return onViewCreated$lambda$3;
            case 7:
                viewBinding$lambda$3$lambda$0 = CashbackDashboardFragment.getViewBinding$lambda$3$lambda$0((n061) obj);
                return viewBinding$lambda$3$lambda$0;
            case 8:
                ((x39) obj).c.b.j(CashbackAnalyticsImpl$CashbackNotificationContext.PAYMENT_METHOD_CHANGE.getContext(), null);
                return zy11Var;
            case 9:
                PfmCategoriesView pfmCategoriesView = ((i59) obj).a;
                return com.ybsdk.feature.pfm.internal.ui.delegates.a.a(LayoutInflater.from(pfmCategoriesView.getContext()), pfmCategoriesView);
            case 10:
                return ((com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.change_current_address.a) obj).a;
            case 11:
                return "Unexpected ChangeResponse: " + ((va9) obj);
            case 12:
                return "Unexpected ChangeResponse: " + ((ConfirmChangeResponse) obj);
            case 13:
                return new ib9(new cx7(28, (com.yandex.go.places.organization.card.impl.ui.card.flex.actions.change_modal_state.a) obj));
            case 14:
                ((c) obj).f0();
                return zy11Var;
            case 15:
                return (dw) ((d) obj).a.get();
            case 16:
                return (dw) ((jg9) obj).b.get();
            case 17:
                ((com.yandex.go.taxi.order.change.tariff.a) obj).b.c("TariffChangeNotification");
                return zy11Var;
            case 18:
                HashMap hashMap = new HashMap();
                ((ph9) obj).c.d(e9h0.payload_chat_translation_changed, hashMap);
                return hashMap;
            case 19:
                return (x2a) ((com.yandex.go.chargers.misc.authorization.c) obj).E.get();
            case 20:
                onAttachedToWindow$lambda$2$0 = ChargersBackgroundModalView.onAttachedToWindow$lambda$2$0((ChargersBackgroundModalView) obj);
                return onAttachedToWindow$lambda$2$0;
            case 21:
                return (x2a) ((b) obj).J.get();
            case 22:
                String str = ((lt9) obj).d;
                String upperCase = str.toUpperCase(Locale.ROOT);
                int length = str.length();
                return f.j(new hoy0(upperCase, eja1.c(length, length), 4));
            case 23:
                lv9 lv9Var = (lv9) obj;
                h hVar = lv9Var.J;
                kgq0 kgq0Var = (kgq0) hVar.j.b.a.getValue();
                boolean z = kgq0Var == null ? true : kgq0Var.c;
                r0 r0Var = hVar.j.a;
                r0Var.l(null);
                if (z) {
                    lv9Var.r(new qu(i2));
                }
                return zy11Var;
            case 24:
                insetsType$lambda$0 = ChargersDiscoveryModalView.insetsType$lambda$0((ChargersDiscoveryModalView) obj);
                return insetsType$lambda$0;
            case 25:
                return Float.valueOf(((Number) ((LottieAnimatableImpl) ((yrz) obj)).getValue()).floatValue());
            case 26:
                onAttachedToWindow$lambda$0 = ChargersNotification.onAttachedToWindow$lambda$0((ChargersNotification) obj);
                return onAttachedToWindow$lambda$0;
            case 27:
                paymentOptions$lambda$1 = ChargersOfferBottomComponent.setPaymentOptions$lambda$1((ChargersOfferBottomComponent) obj);
                return paymentOptions$lambda$1;
            case 28:
                ((f9a) obj).r(new qu(i2));
                return zy11Var;
            default:
                return ((com.yandex.go.charity.a) obj).G.a().b();
        }
    }
}
