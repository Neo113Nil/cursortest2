package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.fay0;
import defpackage.g92;
import defpackage.h811;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu40;
import defpackage.rcc;
import defpackage.tpr;
import defpackage.uu40;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1", f = "MultimodalRouteTaxiTransportInfoInteractor.kt", l = {217, 230, 235, 237, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ qu40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1(qu40 qu40Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = qu40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1 = new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1.L$1 = obj2;
        return multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0275, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r0, r24) == r10) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0241, code lost:
    
        if (r2 == r10) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TaxiOrder taxiOrder;
        Address address;
        tpr g92Var;
        List list;
        String str;
        Route route;
        vpr vprVar;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto;
        vpr vprVar2;
        String str2;
        Object obj2;
        TaxiOrder taxiOrder2;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto2;
        Object b;
        vpr vprVar3;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto3;
        List list2;
        Route route2;
        AddressDTO address2;
        FormattedText formattedText;
        fay0 fay0Var;
        List list3;
        CharSequence charSequence;
        Object i;
        fay0 fay0Var2;
        List list4;
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto4;
        Object b2;
        vpr vprVar4 = (vpr) this.L$0;
        Object obj3 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        h811 h811Var = h811.a;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Triple triple = (Triple) obj3;
            taxiOrder = (TaxiOrder) triple.getFirst();
            TaxiTransportInfoResponseDto taxiTransportInfoResponseDto5 = (TaxiTransportInfoResponseDto) triple.getSecond();
            address = (Address) triple.getThird();
            if (taxiTransportInfoResponseDto5 != null && (list = taxiTransportInfoResponseDto5.e) != null && (str = (String) kotlin.collections.a.R(list)) != null) {
                route = (Route) this.this$0.k.get(str);
                if (route == null) {
                    uu40 uu40Var = this.this$0.c;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar4;
                    this.L$3 = null;
                    this.L$4 = taxiOrder;
                    this.L$5 = taxiTransportInfoResponseDto5;
                    this.L$6 = address;
                    this.L$7 = str;
                    this.label = 1;
                    Object b3 = ((com.yandex.go.multimodal_route.interactors.c) uu40Var).b(str, this);
                    if (b3 != coroutineSingletons) {
                        vprVar2 = vprVar4;
                        str2 = str;
                        obj2 = b3;
                        taxiOrder2 = taxiOrder;
                        taxiTransportInfoResponseDto2 = taxiTransportInfoResponseDto5;
                    }
                    return coroutineSingletons;
                }
                vprVar = vprVar4;
                taxiTransportInfoResponseDto = taxiTransportInfoResponseDto5;
                Route route3 = route;
                Address b4 = taxiOrder.t().b();
                ListBuilder a = rcc.a();
                a.add(b4);
                if (address != null) {
                    a.add(address);
                }
                List M = kotlin.collections.a.M(a.j());
                com.yandex.go.multimodal_route.interactors.d dVar = this.this$0.d;
                String x = taxiOrder.x();
                String str3 = (b4 != null || (address2 = b4.getAddress()) == null) ? null : address2.f;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = taxiTransportInfoResponseDto;
                this.L$6 = null;
                this.L$7 = route3;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = M;
                this.label = 2;
                TaxiTransportInfoResponseDto taxiTransportInfoResponseDto6 = taxiTransportInfoResponseDto;
                b = com.yandex.go.multimodal_route.interactors.d.b(dVar, x, str3, null, null, null, null, null, this, HProv.PP_SAME_MEDIA);
                if (b != coroutineSingletons) {
                    vprVar3 = vprVar;
                    taxiTransportInfoResponseDto3 = taxiTransportInfoResponseDto6;
                    list2 = M;
                    route2 = route3;
                    fay0 fay0Var3 = (fay0) b;
                    formattedText = taxiTransportInfoResponseDto3.b;
                    if (formattedText == null) {
                    }
                }
                return coroutineSingletons;
            }
            g92Var = new g92(2, h811Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.label = 5;
        } else if (i2 == 1) {
            str2 = (String) this.L$7;
            address = (Address) this.L$6;
            taxiTransportInfoResponseDto2 = (TaxiTransportInfoResponseDto) this.L$5;
            taxiOrder2 = (TaxiOrder) this.L$4;
            vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        } else if (i2 == 2) {
            List list5 = (List) this.L$10;
            Route route4 = (Route) this.L$7;
            TaxiTransportInfoResponseDto taxiTransportInfoResponseDto7 = (TaxiTransportInfoResponseDto) this.L$5;
            vpr vprVar5 = (vpr) this.L$2;
            kotlin.b.b(obj);
            vprVar3 = vprVar5;
            taxiTransportInfoResponseDto3 = taxiTransportInfoResponseDto7;
            route2 = route4;
            list2 = list5;
            b = obj;
            fay0 fay0Var32 = (fay0) b;
            formattedText = taxiTransportInfoResponseDto3.b;
            if (formattedText == null) {
                ru.yandex.taxi.widget.c cVar = this.this$0.e;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar3;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = taxiTransportInfoResponseDto3;
                this.L$6 = null;
                this.L$7 = route2;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = fay0Var32;
                this.L$11 = list2;
                this.L$12 = null;
                this.label = 3;
                i = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
                if (i != coroutineSingletons) {
                    List list6 = list2;
                    fay0Var2 = fay0Var32;
                    list4 = list6;
                    list3 = list4;
                    fay0Var = fay0Var2;
                    charSequence = (CharSequence) i;
                    Route route5 = route2;
                    taxiTransportInfoResponseDto4 = taxiTransportInfoResponseDto3;
                    qu40 qu40Var = this.this$0;
                    ru.yandex.taxi.masstransit.detailedroute.ui.f fVar = qu40Var.a;
                    boolean isEnabled = qu40Var.i.a.isEnabled();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar3;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = taxiTransportInfoResponseDto4;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = charSequence;
                    this.L$12 = null;
                    this.label = 4;
                    b2 = fVar.b(route5, list3, fay0Var, false, isEnabled, 0L);
                }
                return coroutineSingletons;
            }
            fay0Var = fay0Var32;
            list3 = list2;
            charSequence = null;
            Route route52 = route2;
            taxiTransportInfoResponseDto4 = taxiTransportInfoResponseDto3;
            qu40 qu40Var2 = this.this$0;
            ru.yandex.taxi.masstransit.detailedroute.ui.f fVar2 = qu40Var2.a;
            boolean isEnabled2 = qu40Var2.i.a.isEnabled();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar3;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = taxiTransportInfoResponseDto4;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = charSequence;
            this.L$12 = null;
            this.label = 4;
            b2 = fVar2.b(route52, list3, fay0Var, false, isEnabled2, 0L);
        } else if (i2 == 3) {
            list4 = (List) this.L$11;
            fay0Var2 = (fay0) this.L$10;
            route2 = (Route) this.L$7;
            taxiTransportInfoResponseDto3 = (TaxiTransportInfoResponseDto) this.L$5;
            vprVar3 = (vpr) this.L$2;
            kotlin.b.b(obj);
            i = obj;
            list3 = list4;
            fay0Var = fay0Var2;
            charSequence = (CharSequence) i;
            Route route522 = route2;
            taxiTransportInfoResponseDto4 = taxiTransportInfoResponseDto3;
            qu40 qu40Var22 = this.this$0;
            ru.yandex.taxi.masstransit.detailedroute.ui.f fVar22 = qu40Var22.a;
            boolean isEnabled22 = qu40Var22.i.a.isEnabled();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar3;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = taxiTransportInfoResponseDto4;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = charSequence;
            this.L$12 = null;
            this.label = 4;
            b2 = fVar22.b(route522, list3, fay0Var, false, isEnabled22, 0L);
        } else {
            if (i2 != 4) {
                if (i2 == 5) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence = (CharSequence) this.L$11;
            taxiTransportInfoResponseDto4 = (TaxiTransportInfoResponseDto) this.L$5;
            vpr vprVar6 = (vpr) this.L$2;
            kotlin.b.b(obj);
            vprVar3 = vprVar6;
            b2 = obj;
            g92Var = new f((tpr) b2, taxiTransportInfoResponseDto4, charSequence, this.this$0);
            vprVar4 = vprVar3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.label = 5;
        }
        if (obj2 instanceof Result.Failure) {
            obj2 = null;
        }
        route = (Route) obj2;
        this.this$0.k.put(str2, route);
        if (route != null) {
            taxiTransportInfoResponseDto = taxiTransportInfoResponseDto2;
            taxiOrder = taxiOrder2;
            vprVar = vprVar2;
            Route route32 = route;
            Address b42 = taxiOrder.t().b();
            ListBuilder a2 = rcc.a();
            a2.add(b42);
            if (address != null) {
            }
            List M2 = kotlin.collections.a.M(a2.j());
            com.yandex.go.multimodal_route.interactors.d dVar2 = this.this$0.d;
            String x2 = taxiOrder.x();
            if (b42 != null) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = taxiTransportInfoResponseDto;
            this.L$6 = null;
            this.L$7 = route32;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = M2;
            this.label = 2;
            TaxiTransportInfoResponseDto taxiTransportInfoResponseDto62 = taxiTransportInfoResponseDto;
            b = com.yandex.go.multimodal_route.interactors.d.b(dVar2, x2, str3, null, null, null, null, null, this, HProv.PP_SAME_MEDIA);
            if (b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        g92Var = new g92(2, h811Var);
        vprVar4 = vprVar2;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.L$10 = null;
        this.L$11 = null;
        this.L$12 = null;
        this.label = 5;
    }
}
