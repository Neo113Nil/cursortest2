package defpackage;

import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.e0;
import com.yandex.go.payments.data.model.response.f0;
import com.yandex.go.places.models.data.entities.network.DeliveryOrderFormRoutePointDto;
import com.yandex.go.places.models.data.entities.network.DeliveryPointTypeDto;
import com.yandex.go.places.models.data.entities.network.actions.DeliveryOrderFormRoutePointFlexDto;
import com.yandex.go.places.models.data.entities.network.x;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TransportRouteBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.c;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.d;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$IconBodyAlignment;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$IconBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.e;
import com.yandex.go.trusted_contacts.data.entities.network.DeleteTrustedContactsRequest;
import com.yandex.go.trusted_contacts.data.entities.network.DeletedTrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.b;
import com.yandex.go.zone.dto.objects.ButtonStyle;
import com.yandex.go.zone.dto.objects.DeliveryCostDetailsItem$$serializer;
import com.yandex.go.zone.dto.objects.DeliveryCostDetailsScreen;
import com.yandex.go.zone.dto.objects.DeliveryExtra;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreen;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreenButton;
import com.yandex.go.zone.dto.objects.DeliveryPin$$serializer;
import com.yandex.go.zone.dto.objects.h1;
import com.yandex.go.zone.dto.objects.i1;
import com.yandex.go.zone.dto.objects.o0;
import com.yandex.go.zone.dto.objects.t0;
import com.yandex.go.zone.dto.objects.v0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final /* synthetic */ class b9h implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ b9h(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        switch (this.a) {
            case 0:
                return new yad0(new oed0(), new gdd0());
            case 1:
                c cVar = DefaultOfferBodyDto$TransportRouteBodyDto.Companion;
                return new p53(TransportRouteSection$$serializer.INSTANCE, 0);
            case 2:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto.Unsupported", d.INSTANCE, new Annotation[0]);
            case 3:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2.IconBodyAlignment", DefaultOfferBodyDtoV2$IconBodyAlignment.values(), new String[]{"bottom_start", "center"}, new Annotation[][]{null, null});
            case 4:
                a aVar = DefaultOfferBodyDtoV2$IconBodyDtoV2.Companion;
                return DefaultOfferBodyDtoV2$IconBodyAlignment.Companion.serializer();
            case 5:
                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.d dVar = DefaultOfferBodyDtoV2$TransportRouteBodyDtoV2.Companion;
                return new p53(TransportRouteSection$$serializer.INSTANCE, 0);
            case 6:
                return new o4o("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.DefaultOfferBodyDtoV2.Unsupported", e.INSTANCE, new Annotation[0]);
            case 7:
                return new mfd0();
            case 8:
                return new p53(ux70.a, 0);
            case 9:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 10:
                zy11Var = zy11.a;
                return zy11Var;
            case 11:
                b bVar = DeleteTrustedContactsRequest.Companion;
                return new p53(auu0.a, 0);
            case 12:
                b bVar2 = DeleteTrustedContactsRequest.Companion;
                return new p53(auu0.a, 0);
            case 13:
                com.yandex.go.trusted_contacts.data.entities.network.c cVar2 = DeletedTrustedContactsResponse.Companion;
                return new p53(auu0.a, 0);
            case 14:
                com.yandex.go.trusted_contacts.data.entities.network.c cVar3 = DeletedTrustedContactsResponse.Companion;
                return new p53(auu0.a, 0);
            case 15:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 16:
                o0 o0Var = DeliveryCostDetailsScreen.Companion;
                return new p53(DeliveryCostDetailsItem$$serializer.INSTANCE, 0);
            case 17:
                t0 t0Var = DeliveryExtra.Companion;
                return new p53(DeliveryPin$$serializer.INSTANCE, 0);
            case 18:
                t0 t0Var2 = DeliveryExtra.Companion;
                return DeliveryExtra.DeliveryFlowType.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.zone.dto.objects.DeliveryExtra.DeliveryFlowType", DeliveryExtra.DeliveryFlowType.values(), new String[]{"default", "ndd_form"}, new Annotation[][]{null, null});
            case 20:
                v0 v0Var = DeliveryExtra.DeliveryInformationForm.Companion;
                return DeliveryExtra.DeliveryInformationForm.FormType.Companion.serializer();
            case 21:
                x xVar = DeliveryOrderFormRoutePointDto.Companion;
                return DeliveryPointTypeDto.Companion.serializer();
            case 22:
                com.yandex.go.places.models.data.entities.network.actions.d dVar2 = DeliveryOrderFormRoutePointFlexDto.Companion;
                return DeliveryPointTypeDto.Companion.serializer();
            case 23:
                h1 h1Var = DeliveryPaidInsuranceScreen.Companion;
                return new p53(auu0.a, 0);
            case 24:
                h1 h1Var2 = DeliveryPaidInsuranceScreen.Companion;
                return new p53(w7s.a, 0);
            case 25:
                i1 i1Var = DeliveryPaidInsuranceScreenButton.Companion;
                return ButtonStyle.Companion.serializer();
            case 26:
                nhi nhiVar = ohi.Companion;
                return new p53(auu0.a, 0);
            case 27:
                return vez0.g("com.yandex.go.payments.data.model.response.DeliveryPaymentMethod.ClientType", DeliveryPaymentMethod.ClientType.values(), new String[]{"corpcard", "contract", null}, new Annotation[][]{null, null, null});
            case 28:
                e0 e0Var = DeliveryPaymentMethod.Details.Companion;
                return DeliveryPaymentMethod.ClientType.Companion.serializer();
            default:
                f0 f0Var = DeliveryPaymentMethod.DisableReason.Companion;
                return new k8u(auu0.a, qke.n(cm2.a), 1);
        }
    }
}
