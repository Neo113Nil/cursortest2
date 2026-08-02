package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.yandex.go.flex.common.api.actions.OpenSettingsAction;
import com.yandex.go.network.connectivity.NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1$callback$1;
import com.yandex.go.network.connectivity.a;
import com.yandex.go.payments.sbp.ui.opening_bank_dialog.OpeningBankDialogModalView;
import com.yandex.go.places.base.ui.base_old.map.MapControlButtonsContainerView;
import com.yandex.go.places.common.ui.FilterButtonView;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.buttons.OrganizationActionButtonComponent;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardsSliderModalView;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.b;
import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final /* synthetic */ class bm50 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm50(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 bindPersonalInfo$lambda$0$0;
        zy11 uiActionInteractor$lambda$0$1;
        zy11 bind$lambda$2;
        rg80 _init_$lambda$1;
        FilterButtonView organizationsListFilterButtonView_delegate$lambda$0;
        MapControlButtonsContainerView rightSideButtonsContainer_delegate$lambda$0;
        qui quiVar;
        zy11 render$lambda$19$lambda$17$lambda$15;
        switch (this.a) {
            case 0:
                ((yd00) this.b).a((l7f) this.c);
                return zy11.a;
            case 1:
                a aVar = (a) this.b;
                NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1$callback$1 networkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1$callback$1 = (NetworkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1$callback$1) this.c;
                ConnectivityManager connectivityManager = (ConnectivityManager) aVar.b.getValue();
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(networkConnectivityRestoredRepositoryImpl$networkConnectionFlow$1$callback$1);
                }
                return zy11.a;
            case 2:
                bindPersonalInfo$lambda$0$0 = NewBindFragment.bindPersonalInfo$lambda$0$0((NewBindFragment) this.b, (PersonalInfoView) this.c);
                return bindPersonalInfo$lambda$0$0;
            case 3:
                ((tls) this.b).invoke(((uo9) this.c).d);
                return zy11.a;
            case 4:
                u61 u61Var = (u61) this.b;
                a570 a570Var = (a570) this.c;
                u1n u1nVar = u61Var.a;
                a570Var.getClass();
                u1n.m(u1nVar, null);
                r9x0 r9x0Var = a570Var.a;
                if (r9x0Var != null) {
                    ((c) u61Var.d.get()).b(r9x0Var);
                } else {
                    ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a.a((ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a) u61Var.c.get(), null, a570Var.b, 1);
                }
                return zy11.a;
            case 5:
                OpenSettingsAction openSettingsAction = (OpenSettingsAction) this.b;
                n6u n6uVar = (n6u) this.c;
                kr krVar = openSettingsAction.a;
                if (krVar != null) {
                    n6uVar.d.a(new gxl(krVar));
                }
                return zy11.a;
            case 6:
                OpeningBankDialogModalView openingBankDialogModalView = (OpeningBankDialogModalView) this.b;
                sa70 sa70Var = (sa70) this.c;
                qa70 qa70Var = openingBankDialogModalView.presenter;
                String str = sa70Var.e.a;
                dt41 dt41Var = qa70Var.A;
                CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                aVar2.b = str;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, true, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194296, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                ((ft41) dt41Var).Q(uiWebViewConfig);
                return zy11.a;
            case 7:
                uiActionInteractor$lambda$0$1 = OrderCardView.setUiActionInteractor$lambda$0$1((t501) this.b, (OrderCardView) this.c);
                return uiActionInteractor$lambda$0$1;
            case 8:
                wrr wrrVar = (wrr) this.b;
                TaxiOrder taxiOrder = (TaxiOrder) this.c;
                d49 d49Var = (d49) wrrVar.c;
                d49Var.getClass();
                d49.d(d49Var, CashbackCardContext.ORDER_STATUS_NOTIFICATION);
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.M();
                }
                wrrVar.g();
                return zy11.a;
            case 9:
                ((wd80) ((b) this.b).Dg()).j0((m58) this.c);
                return zy11.a;
            case 10:
                bind$lambda$2 = OrganizationActionButtonComponent.bind$lambda$2((tls) this.b, (sj80) this.c);
                return bind$lambda$2;
            case 11:
                z7c0 z7c0Var = (z7c0) this.b;
                ke80 ke80Var = (ke80) this.c;
                z7c0Var.invoke();
                ke80Var.d.Nb();
                return zy11.a;
            case 12:
                z7c0 z7c0Var2 = (z7c0) this.b;
                yg80 yg80Var = (yg80) this.c;
                z7c0Var2.invoke();
                yg80Var.b.Nb();
                return zy11.a;
            case 13:
                _init_$lambda$1 = OrganizationCardsSliderModalView._init_$lambda$1((OrganizationCardsSliderModalView) this.b, (Context) this.c);
                return _init_$lambda$1;
            case 14:
                b65 b65Var = (b65) this.b;
                com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a aVar3 = (com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a) this.c;
                fr frVar = b65Var.i;
                if (frVar != null) {
                    aVar3.a0.invoke(frVar);
                }
                return zy11.a;
            case 15:
                ((com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a) this.b).a0.invoke((fr) this.c);
                return zy11.a;
            case 16:
                com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a aVar4 = (com.yandex.go.places.impl.ui.organizations.recycler.viewholders.a) this.b;
                hk80 hk80Var = (hk80) this.c;
                aVar4.b0.invoke(hk80Var.c, hk80Var.b);
                return zy11.a;
            case 17:
                a65 a65Var = (a65) this.b;
                com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b bVar = (com.yandex.go.places.impl.ui.organizations.recycler.viewholders.b) this.c;
                fr frVar2 = a65Var.g;
                if (frVar2 != null) {
                    bVar.Z.invoke(frVar2);
                }
                return zy11.a;
            case 18:
                ((com.yandex.go.places.impl.ui.filters.recycler.a) this.b).U.invoke((mqb) this.c);
                return zy11.a;
            case 19:
                organizationsListFilterButtonView_delegate$lambda$0 = OrganizationsListV2ModalView.organizationsListFilterButtonView_delegate$lambda$0((Context) this.b, (OrganizationsListV2ModalView) this.c);
                return organizationsListFilterButtonView_delegate$lambda$0;
            case 20:
                rightSideButtonsContainer_delegate$lambda$0 = OrganizationsModalView.rightSideButtonsContainer_delegate$lambda$0((OrganizationsModalView) this.b, (Context) this.c);
                return rightSideButtonsContainer_delegate$lambda$0;
            case 21:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.b;
                vo80 vo80Var = (vo80) this.c;
                if (ref$BooleanRef.element) {
                    avi aviVar = vo80Var.e;
                    aviVar.d = false;
                    aviVar.c = false;
                    WeakReference weakReference = aviVar.a;
                    if (weakReference == null || (quiVar = (qui) weakReference.get()) == null) {
                        WeakReference weakReference2 = aviVar.b;
                        quiVar = weakReference2 != null ? (qui) weakReference2.get() : null;
                    }
                    if (quiVar != null) {
                        quiVar.setHidden(false, false);
                    }
                    aviVar.b = null;
                    ref$BooleanRef.element = false;
                }
                return zy11.a;
            case 22:
                render$lambda$19$lambda$17$lambda$15 = PartnersFragment.render$lambda$19$lambda$17$lambda$15((m861) this.b, (qj90) this.c);
                return render$lambda$19$lambda$17$lambda$15;
            case 23:
                return (cn90) ((Method) this.b).invoke(this.c, null);
            case 24:
                ((tls) this.b).invoke(((n07) this.c).g);
                return zy11.a;
            case 25:
                ((tls) this.b).invoke(((l2a0) this.c).h);
                return zy11.a;
            case 26:
                j jVar = (j) this.b;
                xn xnVar = (xn) this.c;
                jVar.c.a(new v370(xnVar.c, xnVar.e, new bm50(27, xnVar.f, jVar)));
                return zy11.a;
            case 27:
                String str2 = (String) this.b;
                j jVar2 = (j) this.c;
                if (str2 != null) {
                    jVar2.h.x(str2.concat(".Closed"), null);
                }
                return zy11.a;
            case 28:
                ((tls) this.b).invoke(((dx90) this.c).i);
                return zy11.a;
            default:
                ((tls) this.b).invoke(new ae31((lv90) this.c));
                return zy11.a;
        }
    }
}
