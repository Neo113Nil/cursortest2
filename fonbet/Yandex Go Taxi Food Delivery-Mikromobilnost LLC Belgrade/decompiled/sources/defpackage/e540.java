package defpackage;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto$$serializer;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainFilter$$serializer;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainFilters;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainScheduleDto;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainSchedulerDateButtonBarDto;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainSchedulerDto;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainSchedulerDto$$serializer;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainSchedulerRequestPayloadDto;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.j;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.n;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.q;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.r;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.s;
import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.t;
import com.yandex.payment.common.result.ResultType;
import defpackage.qb40;
import defpackage.vb40;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.b;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.c;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;
import ru.yandex.taxi.masstransit.promo.models.b0;
import ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse;
import ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType;

/* loaded from: classes6.dex */
public final /* synthetic */ class e540 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ e540(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b0 b0Var = MtSummaryCommunicationsResponse.d.Companion;
                return new p53(auu0.a, 0);
            case 1:
                p840 p840Var = MtTicketsResponse.Companion;
                return new p53(b.a, 0);
            case 2:
                c cVar = MtTicketsResponse.a.Companion;
                return MtTicketsResponse.TicketType.Companion.serializer();
            case 3:
                c cVar2 = MtTicketsResponse.a.Companion;
                return new p53(auu0.a, 0);
            case 4:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse.TicketType", MtTicketsResponse.TicketType.values(), new String[]{"suburban", "aeroexpress", "masstransit", null}, new Annotation[][]{null, null, null, null});
            case 5:
                ca40 ca40Var = da40.Companion;
                return VehicleTypeType.Companion.serializer();
            case 6:
                return new o4o("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutInfoActionUnknown", ma40.INSTANCE, new Annotation[0]);
            case 7:
                oa40 oa40Var = pa40.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(qke.n(auu0Var), qke.n(auu0Var), 1);
            case 8:
                nb40 nb40Var = qb40.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(qke.n(auu0Var2), qke.n(auu0Var2), 1);
            case 9:
                pb40 pb40Var = qb40.a.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 10:
                rb40 rb40Var = MtTrainCheckoutResponse.Companion;
                return MtTrainCheckoutResponse.ResponseStatus.Companion.serializer();
            case 11:
                return vez0.g("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse.ResponseStatus", MtTrainCheckoutResponse.ResponseStatus.values(), new String[]{"processing", "success", ResultType.RESULT_TYPE_FAILURE, null}, new Annotation[][]{null, null, null, null});
            case 12:
                ac40 ac40Var = vb40.c.Companion;
                return new p53(bc40.a, 0);
            case 13:
                uc40 uc40Var = vb40.m.Companion;
                return new p53(vc40.a, 0);
            case 14:
                return new o4o("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainDateSelectorDto.Unknown", bf40.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto.Unknown", j.INSTANCE, new Annotation[0]);
            case 16:
                of40 of40Var = pf40.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, new p53(auu0Var3, 0), 1);
            case 17:
                n nVar = MtTrainFilters.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, new p53(auu0Var4, 0), 1);
            case 18:
                of40 of40Var2 = pf40.Companion;
                return new p53(cf40.a, 0);
            case 19:
                n nVar2 = MtTrainFilters.Companion;
                return new p53(MtTrainFilter$$serializer.INSTANCE, 0);
            case 20:
                ag40 ag40Var = bg40.Companion;
                return new p53(wg40.a, 0);
            case 21:
                q qVar = MtTrainScheduleDto.Companion;
                return new p53(MtTrainSchedulerDto$$serializer.INSTANCE, 0);
            case 22:
                ug40 ug40Var = vg40.Companion;
                return new p53(oe40.a, 0);
            case 23:
                r rVar = MtTrainSchedulerDateButtonBarDto.Companion;
                return new p53(MtTrainDateSelectorDto$$serializer.INSTANCE, 0);
            case 24:
                xg40 xg40Var = yg40.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(qke.n(auu0Var5), qke.n(auu0Var5), 1);
            case 25:
                s sVar = MtTrainSchedulerDto.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(qke.n(auu0Var6), qke.n(auu0Var6), 1);
            case 26:
                xg40 xg40Var2 = yg40.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(qke.n(auu0Var7), qke.n(auu0Var7), 1);
            case 27:
                s sVar2 = MtTrainSchedulerDto.Companion;
                auu0 auu0Var8 = auu0.a;
                return new k8u(qke.n(auu0Var8), qke.n(auu0Var8), 1);
            case 28:
                ch40 ch40Var = dh40.Companion;
                auu0 auu0Var9 = auu0.a;
                return new k8u(auu0Var9, new p53(auu0Var9, 0), 1);
            default:
                t tVar = MtTrainSchedulerRequestPayloadDto.Companion;
                auu0 auu0Var10 = auu0.a;
                return new k8u(auu0Var10, new p53(auu0Var10, 0), 1);
        }
    }
}
