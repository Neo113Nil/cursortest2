package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.yandex.go.delivery.rental_duration_selector.e;
import com.yandex.go.delivery.rental_duration_selector.experiment.BulletListDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.ButtonsDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.HeaderButtonDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.HeaderDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.PointDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.RentalDurationSelectorDto;
import com.yandex.go.delivery.tracking.courier_chat.DeliveryCourierChatModalView;
import com.yandex.go.places.experiments.gallery.DiscoveryOrganizationGalleryExperiment;
import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment;
import com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalView;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionView;
import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;
import ru.yandex.taxi.delivery.web.b;
import ru.yandex.taxi.favorites.data.api.FavoritesApi;
import ru.yandex.taxi.favorites.rides.delete_modal.data.a;
import ru.yandex.taxi.logistics.care.impl.router.f;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes10.dex */
public final /* synthetic */ class amh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ amh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // defpackage.sls
    public final Object invoke() {
        zy11 initInputField$lambda$0;
        View insetsType$lambda$0;
        c9u c9uVar;
        View insetsType$lambda$02;
        ValueAnimator createShowAnimator;
        View o;
        Object obj;
        bkf customInsetsHandlingBehaviourProvider_delegate$lambda$1;
        zy11 clickListeners$lambda$9$lambda$3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((lly0) obj2).close();
                return zy11Var;
            case 1:
                return ((oqh) obj2).z;
            case 2:
                on2 on2Var = ((a) obj2).a;
                on2Var.getClass();
                return (FavoritesApi) on2Var.a(GoApiName.TaxiV4, FavoritesApi.class);
            case 3:
                return ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.a) obj2).a;
            case 4:
                ((kvh) obj2).a.a.l(kl0.a);
                return zy11Var;
            case 5:
                initInputField$lambda$0 = DeliveryAddressCorrectionView.initInputField$lambda$0((DeliveryAddressCorrectionView) obj2);
                return initInputField$lambda$0;
            case 6:
                ((f) obj2).r(new qu(9));
                return zy11Var;
            case 7:
                return new myh((com.yandex.go.logistics.cargo_flow.a) obj2);
            case 8:
                ((g0i) obj2).i();
                return zy11Var;
            case 9:
                ((lzh) obj2).i();
                return zy11Var;
            case 10:
                ((zzh) obj2).r(new wth(8));
                return zy11Var;
            case 11:
                ru.yandex.taxi.delivery.contacts.a aVar = (ru.yandex.taxi.delivery.contacts.a) obj2;
                aVar.L = false;
                ((e1i) aVar.Dg()).g0();
                aVar.Qg();
                return zy11Var;
            case 12:
                insetsType$lambda$0 = DeliveryCourierChatModalView.insetsType$lambda$0((DeliveryCourierChatModalView) obj2);
                return insetsType$lambda$0;
            case 13:
                rgi rgiVar = (rgi) obj2;
                ((pep0) rgiVar.d).f((m950) rgiVar.b.get(), new ahi(PaidInsuranceScreenSource.REQUIREMENT), hxx.a);
                return zy11Var;
            case 14:
                bzi0 bzi0Var = ((e) obj2).y;
                RentalDurationSelectorDto rentalDurationSelectorDto = bzi0Var.b().g;
                HeaderDto headerDto = rentalDurationSelectorDto.a;
                ButtonsDto buttonsDto = rentalDurationSelectorDto.d;
                nt6 nt6Var = null;
                if (headerDto != null) {
                    String Y = d6z.Y(bzi0Var.b(), headerDto.a);
                    String str = headerDto.b;
                    String Y2 = str != null ? d6z.Y(bzi0Var.b(), str) : null;
                    String str2 = headerDto.c;
                    HeaderButtonDto headerButtonDto = headerDto.d;
                    c9uVar = new c9u(Y, Y2, str2, headerButtonDto != null ? new g9u(d6z.Y(bzi0Var.b(), headerButtonDto.a), headerButtonDto.b) : null);
                } else {
                    c9uVar = null;
                }
                xye xyeVar = new xye(d6z.Y(bzi0Var.b(), rentalDurationSelectorDto.b.a));
                BulletListDto bulletListDto = rentalDurationSelectorDto.c;
                if (bulletListDto != null) {
                    List<PointDto> list = bulletListDto.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (PointDto pointDto : list) {
                        String Y3 = d6z.Y(bzi0Var.b(), pointDto.a);
                        String str3 = pointDto.b;
                        arrayList.add(new tsd0(Y3, str3 != null ? d6z.Y(bzi0Var.b(), str3) : null));
                    }
                    nt6Var = new nt6(arrayList);
                }
                return new izi0(c9uVar, xyeVar, nt6Var, new s47(d6z.Y(bzi0Var.b(), buttonsDto.a), d6z.Y(bzi0Var.b(), buttonsDto.b)));
            case 15:
                ((g0i) ((myh) obj2).b).i();
                return zy11Var;
            case 16:
                return ((b) obj2).F.a();
            case 17:
                insetsType$lambda$02 = DetailedPriceModalView.insetsType$lambda$0((DetailedPriceModalView) obj2);
                return insetsType$lambda$02;
            case 18:
                return ((p4j) obj2).a.c();
            case 19:
                p4j p4jVar = (p4j) ((apf) obj2).w;
                p4jVar.b("Driver");
                p4jVar.b("CopyMenu");
                return zy11Var;
            case 20:
                createShowAnimator = ((DetailsCardHorizontalButtons) obj2).createShowAnimator();
                return createShowAnimator;
            case 21:
                o = ((j561) obj2).o();
                return o;
            case 22:
                return kotlin.collections.b.i(new Pair("type", "onAlternativesRequested"), new Pair("currentRoute", ((DrivingRoute) obj2).getRouteId()));
            case 23:
                Guidance guidance = ((Navigation) ((fmj) ((rmj) obj2).d).a).getGuidance();
                DrivingRoute currentRoute = guidance.getCurrentRoute();
                if (currentRoute != null) {
                    List<UpcomingManoeuvre> manoeuvres = guidance.getWindshield().getManoeuvres();
                    obj = new ArrayList(tcc.n(manoeuvres, 10));
                    Iterator<T> it = manoeuvres.iterator();
                    while (it.hasNext()) {
                        obj.add(rsq0.p((UpcomingManoeuvre) it.next(), currentRoute));
                    }
                } else {
                    obj = EmptyList.a;
                }
                return kotlin.collections.b.i(new Pair("type", "onManoeuvresChanged"), new Pair("manoeuvres", obj));
            case 24:
                rqo rqoVar = ((com.yandex.go.places.experiments.gallery.b) obj2).a;
                DiscoveryOrganizationGalleryExperiment.Companion.getClass();
                return ((jbh) rqoVar).e(DiscoveryOrganizationGalleryExperiment.e);
            case 25:
                rqo rqoVar2 = ((com.yandex.go.places.experiments.tabbar.b) obj2).a;
                DiscoveryTabbarExperiment.Companion.getClass();
                return ((jbh) rqoVar2).e(DiscoveryTabbarExperiment.f);
            case 26:
                return ((n6u) obj2).a;
            case 27:
                customInsetsHandlingBehaviourProvider_delegate$lambda$1 = DivBottomSheetView.customInsetsHandlingBehaviourProvider_delegate$lambda$1((DivBottomSheetView) obj2);
                return customInsetsHandlingBehaviourProvider_delegate$lambda$1;
            case 28:
                ((amh) obj2).invoke();
                return zy11Var;
            default:
                clickListeners$lambda$9$lambda$3 = DivEducationsV2View.setClickListeners$lambda$9$lambda$3((DivEducationsV2View) obj2);
                return clickListeners$lambda$9$lambda$3;
        }
    }
}
