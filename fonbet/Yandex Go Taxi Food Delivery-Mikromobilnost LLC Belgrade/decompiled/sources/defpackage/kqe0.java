package defpackage;

import android.content.Context;
import android.view.View;
import com.squareup.moshi.Moshi;
import com.yandex.go.charity.models.OpenCharitySource;
import com.yandex.go.preorder.navigation.c;
import com.yandex.go.promocodes.f;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.b;
import com.yandex.go.scooters.d;
import com.yandex.go.scooters.discovery.m;
import com.yandex.go.scooters.insurance.e;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardAiBubbleView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.g;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.s;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.g0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.mapkit.transport.masstransit.Weight;
import com.yandex.messaging.ui.resolvelink.invitelink.ResolveInviteLinkDialogFragment;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.main.internal.screens.products.ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.scooters.presentation.finish_info.info.ScootersFinishInfoCard;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.a;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.summary.solid.interactor.p;

/* loaded from: classes13.dex */
public final /* synthetic */ class kqe0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ kqe0(b bVar, clo0 clo0Var, fcj0 fcj0Var, o4o0 o4o0Var) {
        this.a = 27;
        this.b = bVar;
        this.c = clo0Var;
        this.w = fcj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        View showBottomSheet$lambda$42;
        zy11 updateAmountWidgetContent$lambda$49$lambda$48;
        zy11 DialogContent$lambda$3$lambda$2$lambda$1;
        zy11 action$lambda$0;
        bkk0 itemsAdapter_delegate$lambda$0;
        bkk0 itemsAdapter_delegate$lambda$02;
        yss0 slotItem_delegate$lambda$0;
        RideCardTimelineBannerView rideCardTimelineBannerView_delegate$lambda$0;
        boolean data;
        zy11 itemV2Binding_delegate$lambda$0$0$0;
        RouteMetadata metadata;
        Weight weight;
        LocalizedValue walkingDistance;
        String str;
        RouteMetadata metadata2;
        TravelEstimation estimation;
        Time arrivalTime;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((c) obj3).T(new wht0(new yse0(new xse0(ghv0.a, (ijv0) obj2, (k9s0) obj, 56))));
                break;
            case 1:
                showBottomSheet$lambda$42 = ProductsFragment.showBottomSheet$lambda$42((ProductsFragment) obj3, (rr51) obj2, (ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType) obj);
                break;
            case 2:
                ((pep0) ((oep0) obj3)).f((m950) ((com.yandex.go.promocodes.b) obj2).c.get(), new qrf0((mrf0) obj), hxx.a);
                break;
            case 3:
                ((p) obj3).c.b((zkv0) obj2, SummaryPromotionsAnalytics$SummaryState.COLLAPSED, (ActionButton) obj);
                break;
            case 4:
                updateAmountWidgetContent$lambda$49$lambda$48 = QrPaymentsMainFragment.updateAmountWidgetContent$lambda$49$lambda$48((v9g0) obj3, (QrPaymentsMainFragment) obj2, (rr51) obj);
                break;
            case 5:
                fkg0 fkg0Var = (fkg0) obj3;
                fkg0Var.c.b((o2y0) obj2, ((gkg0) obj).d);
                fkg0Var.b.c("QueueNotification");
                break;
            case 6:
                ((pep0) ((oep0) obj3)).f((m950) ((f) obj2).c.get(), new qrf0((nrf0) obj), hxx.a);
                break;
            case 7:
                dfr dfrVar = (dfr) obj3;
                Moshi moshi = ((com.ybsdk.rconfig.b) obj2).c;
                String str2 = (String) ((Ref$ObjectRef) obj).element;
                if (str2 != null) {
                    break;
                } else {
                    dfrVar.getClass();
                    break;
                }
            case 8:
                g0 g0Var = (g0) obj3;
                String str3 = (String) obj;
                TaxiOrder i2 = ((e0) g0Var.e).i((String) obj2);
                if (i2 == null) {
                    break;
                }
                break;
            case 9:
                ((tls) obj3).invoke(new zgj0(((ahj0) obj2).a.a, (String) ((oz40) obj).getValue()));
                break;
            case 10:
                DialogContent$lambda$3$lambda$2$lambda$1 = ResolveInviteLinkDialogFragment.DialogContent$lambda$3$lambda$2$lambda$1((ResolveInviteLinkDialogFragment) obj3, (lsj0) obj2, (sfl0) obj);
                break;
            case 11:
                action$lambda$0 = RideCardAiBubbleView.setAction$lambda$0((nqs0) obj3, (RideCardAiBubbleView) obj2, (wrs0) obj);
                break;
            case 12:
                g gVar = (g) obj3;
                wrs0 wrs0Var = (wrs0) obj;
                ibk0 a = ijk0.a((nqs0) obj2);
                if (a != null) {
                    gVar.S.a(a, wrs0Var);
                    break;
                }
                break;
            case 13:
                itemsAdapter_delegate$lambda$0 = RideCardCompactView.itemsAdapter_delegate$lambda$0((ckk0) obj3, (ydk0) obj2, (RideCardCompactView) obj);
                break;
            case 14:
                itemsAdapter_delegate$lambda$02 = RideCardModalView.itemsAdapter_delegate$lambda$0((ckk0) obj3, (ydk0) obj2, (RideCardModalView) obj);
                break;
            case 15:
                s sVar = (s) obj3;
                wrs0 wrs0Var2 = (wrs0) obj;
                ibk0 a2 = ijk0.a((nqs0) obj2);
                if (a2 != null) {
                    sVar.S.a(a2, wrs0Var2);
                    break;
                }
                break;
            case 16:
                slotItem_delegate$lambda$0 = RideCardStatusItemView.slotItem_delegate$lambda$0((bts0) obj3, (Context) obj2, (RideCardStatusItemView) obj);
                break;
            case 17:
                rideCardTimelineBannerView_delegate$lambda$0 = RideCardTimelineView.rideCardTimelineBannerView_delegate$lambda$0((Context) obj3, (bts0) obj2, (RideCardTimelineView) obj);
                break;
            case 18:
                break;
            case 19:
                data = super/*com.yandex.div.core.view2.Div2View*/.setData((omk) obj2, (zmk) obj);
                break;
            case 20:
                n70 n70Var = (n70) obj2;
                ((tls) obj3).invoke(((x8m0) n70Var.Z()).c);
                ((tls) obj).invoke(n70Var.Z());
                break;
            case 21:
                iar iarVar = (iar) ((zzc) obj2);
                a.Q((a) obj3, iarVar.a, new b6o0((zuo0) obj), iarVar.b, null, false, null, 56);
                break;
            case 22:
                m mVar = (m) obj3;
                mVar.A((m950) mVar.H.get(), new pza(OpenCharitySource.SCOOTERS_BANNER, (String) obj2, (String) obj, kotlin.collections.b.f()), sy60.Q2);
                break;
            case 23:
                itemV2Binding_delegate$lambda$0$0$0 = ScootersFinishInfoCard.itemV2Binding_delegate$lambda$0$0$0((Ref$BooleanRef) obj3, (lmn0) obj2, (ScootersFinishInfoCard) obj);
                break;
            case 24:
                ((e) obj3).Kg((ScootersInsuranceType) obj2, (sls) obj);
                break;
            case 25:
                Navigation navigation = (Navigation) obj3;
                Ref$DoubleRef ref$DoubleRef = (Ref$DoubleRef) obj2;
                y6f0 y6f0Var = (y6f0) obj;
                Guidance guidance = navigation.getGuidance();
                Double remainingDistance = guidance.getRemainingDistance();
                if (remainingDistance != null) {
                    double doubleValue = remainingDistance.doubleValue();
                    Double timeToFinish = guidance.getTimeToFinish();
                    if (timeToFinish != null) {
                        double doubleValue2 = timeToFinish.doubleValue();
                        Route currentRoute = guidance.getCurrentRoute();
                        if (currentRoute != null && (metadata = currentRoute.getMetadata()) != null && (weight = metadata.getWeight()) != null && (walkingDistance = weight.getWalkingDistance()) != null) {
                            double value = walkingDistance.getValue();
                            if (value > ref$DoubleRef.element) {
                                ref$DoubleRef.element = value;
                            }
                            long j = (long) doubleValue2;
                            double d = ref$DoubleRef.element;
                            Route currentRoute2 = navigation.getGuidance().getCurrentRoute();
                            if (currentRoute2 == null || (metadata2 = currentRoute2.getMetadata()) == null || (estimation = metadata2.getEstimation()) == null || (arrivalTime = estimation.getArrivalTime()) == null || (str = arrivalTime.getText()) == null) {
                                str = "";
                            }
                            ((x6f0) y6f0Var).d(new s0o0(doubleValue, j, d, str));
                            break;
                        }
                    }
                }
                break;
            case 26:
                b bVar = (b) obj3;
                pxm0 pxm0Var = (pxm0) obj2;
                sls slsVar = (sls) obj;
                com.yandex.go.scooters.offer_on_camera.b bVar2 = bVar.h0;
                if (bVar2 == null) {
                    bVar2 = (com.yandex.go.scooters.offer_on_camera.b) bVar.O.get();
                    bVar.h0 = bVar2;
                }
                bVar.A(bVar2, new v3o0(pxm0Var, null), new klo0(bVar, pxm0Var, slsVar));
                break;
            case 27:
                ((b) obj3).S(new yko0(((clo0) obj2).a, new slo0(q1b1.d((vbn0) ((fcj0) obj).e).a), false));
                break;
            case 28:
                kfn0 kfn0Var = (kfn0) obj2;
                SwitchComponent switchComponent = (SwitchComponent) obj;
                lbb0 lbb0Var = ((ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.g) obj3).V;
                if (lbb0Var != null) {
                    lbb0Var.invoke(kfn0Var, Boolean.valueOf(!switchComponent.getIsChecked()));
                    break;
                }
                break;
            default:
                ((d) obj3).V((clo0) obj2, (sls) obj);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ kqe0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
