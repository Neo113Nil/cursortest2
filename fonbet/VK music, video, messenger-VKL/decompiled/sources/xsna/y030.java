package xsna;

import com.ironsource.C4504q2;
import com.vk.api.generated.donut.dto.DonutGetOneTimePaymentsOrderDto;
import com.vk.api.generated.donut.dto.DonutGetOneTimePaymentsPaymentTypeDto;
import com.vk.api.generated.donut.dto.DonutGetOneTimePaymentsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;

/* compiled from: ModalPostDonutDataProvider.kt */
/* loaded from: classes4.dex */
public final class y030 implements c.m<DonutGetOneTimePaymentsResponseDto> {
    public final iid b;
    public final UserId c;
    public final int d;
    public final hue e;
    public final atm f;
    public final io.reactivex.rxjava3.disposables.b g;

    public y030(iid iidVar, UserId userId, int i, hue hueVar, atm atmVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = iidVar;
        this.c = userId;
        this.d = i;
        this.e = hueVar;
        this.f = atmVar;
        this.g = bVar;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<DonutGetOneTimePaymentsResponseDto> O9(String str, com.vk.lists.c cVar) {
        Integer valueOf = Integer.valueOf(cVar.k());
        this.b.getClass();
        DonutGetOneTimePaymentsPaymentTypeDto donutGetOneTimePaymentsPaymentTypeDto = DonutGetOneTimePaymentsPaymentTypeDto.DONUT_BADGES;
        DonutGetOneTimePaymentsOrderDto donutGetOneTimePaymentsOrderDto = DonutGetOneTimePaymentsOrderDto.BY_DONUT_AMOUNT_FRIENDS_FIRST;
        tfx tfxVar = new tfx("donut.getOneTimePayments", new pn(17), new mr(15));
        tfx.n(tfxVar, "owner_id", this.c, 0L, 0L, 12);
        tfx.o(tfxVar, "payment_type", donutGetOneTimePaymentsPaymentTypeDto.i(), 0, 0, 12);
        tfx.l(tfxVar, "object_id", this.d, 0, 0, 12);
        if (donutGetOneTimePaymentsOrderDto != null) {
            tfx.o(tfxVar, C4504q2.u, donutGetOneTimePaymentsOrderDto.i(), 0, 0, 12);
        }
        tfxVar.j("extended", true);
        tfxVar.f(valueOf.intValue(), 1, 100, "count");
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar));
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<DonutGetOneTimePaymentsResponseDto> hj(com.vk.lists.c cVar, boolean z) {
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<DonutGetOneTimePaymentsResponseDto> qVar, boolean z, com.vk.lists.c cVar) {
        this.g.b(qVar.subscribe(new sh6(new x030(cVar, z, this), 22), new sf(new dn20(this, 2), 29)));
    }
}
