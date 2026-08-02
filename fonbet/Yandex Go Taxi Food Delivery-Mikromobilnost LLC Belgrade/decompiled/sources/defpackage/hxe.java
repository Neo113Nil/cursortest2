package defpackage;

import com.yandex.go.payments.data.model.CostCenters;
import com.yandex.go.payments.data.model.CostCenters$CostCenterInfo$$serializer;
import com.yandex.go.payments.data.model.l;
import com.yandex.go.scooters.data.model.CreateOffersV1Params;
import com.yandex.go.scooters.data.model.CreateOffersV1Params$Vehicle$$serializer;
import com.yandex.go.scooters.data.model.CreateOffersV1Response;
import com.yandex.go.scooters.data.model.e;
import com.yandex.go.scooters.data.model.g;
import com.yandex.go.scooters.payments.api.data.ScootersPaymentMethod$$serializer;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy$$serializer;
import com.yandex.go.shortcuts.dto.response.p;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam$$serializer;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterRideStatus;
import com.yandex.go.taxi.order.models.api.cost_center.b;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.i0;
import com.yandex.payment.common.result.ResultType;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse;
import ru.yandex.taxi.scooters.data.model.CreateOfferType;
import ru.yandex.taxi.scooters.data.model.ScootersCard;

/* loaded from: classes13.dex */
public final /* synthetic */ class hxe implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ hxe(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        zy11 zy11Var5;
        zy11 zy11Var6;
        zy11 zy11Var7;
        zy11 zy11Var8;
        switch (this.a) {
            case 0:
                b bVar = CostCenterRideStatus.Companion;
                return new p53(CostCenterParam$$serializer.INSTANCE, 0);
            case 1:
                l lVar = CostCenters.Companion;
                return CostCenters.InputFormat.Companion.serializer();
            case 2:
                l lVar2 = CostCenters.Companion;
                return new p53(CostCenters$CostCenterInfo$$serializer.INSTANCE, 0);
            case 3:
                return vez0.g("com.yandex.go.payments.data.model.CostCenters.InputFormat", CostCenters.InputFormat.values(), new String[]{"text", "mixed", "select"}, new Annotation[][]{null, null, null});
            case 4:
                return new p53(yze.a, 0);
            case 5:
                return new p53(k3k0.a, 0);
            case 6:
                return new p53(auu0.a, 0);
            case 7:
                p pVar = Counters.Companion;
                return new p53(CountersShowPolicy$$serializer.INSTANCE, 0);
            case 8:
                i0 i0Var = CouponCheckResult.Companion;
                return new p53(auu0.a, 0);
            case 9:
                zy11Var = zy11.a;
                return zy11Var;
            case 10:
                return vez0.g("ru.yandex.taxi.scooters.data.model.CreateOfferType", CreateOfferType.values(), new String[]{"fix_offer", "to_destination_offer"}, new Annotation[][]{null, null});
            case 11:
                e eVar = CreateOffersV1Params.Companion;
                return new p53(CreateOffersV1Params$Vehicle$$serializer.INSTANCE, 0);
            case 12:
                e eVar2 = CreateOffersV1Params.Companion;
                return new p53(ScootersPaymentMethod$$serializer.INSTANCE, 0);
            case 13:
                e eVar3 = CreateOffersV1Params.Companion;
                return CreateOfferType.Companion.serializer();
            case 14:
                e eVar4 = CreateOffersV1Params.Companion;
                return ScootersCard.Companion.serializer();
            case 15:
                g gVar = CreateOffersV1Response.Companion;
                return new p53(o531.a, 0);
            case 16:
                g gVar2 = CreateOffersV1Response.Companion;
                return new p53(pr60.a, 0);
            case 17:
                q6f q6fVar = CreatePaymentResponse.Companion;
                return CreatePaymentResponse.Status.Companion.serializer();
            case 18:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentResponse.Status", CreatePaymentResponse.Status.values(), new String[]{"processing", ResultType.RESULT_TYPE_FAILURE, "success"}, new Annotation[][]{null, null, null});
            case 19:
                zff zffVar = agf.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 20:
                return r3x0.a("ro.miui.ui.version.name");
            case 21:
                return r3x0.a("ro.build.version.emui");
            case 22:
                return r3x0.a("ro.build.version.magic");
            case 23:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 24:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 25:
                zy11Var4 = zy11.a;
                return zy11Var4;
            case 26:
                zy11Var5 = zy11.a;
                return zy11Var5;
            case 27:
                zy11Var6 = zy11.a;
                return zy11Var6;
            case 28:
                zy11Var7 = zy11.a;
                return zy11Var7;
            default:
                zy11Var8 = zy11.a;
                return zy11Var8;
        }
    }
}
