package com.yandex.go.multimodal_route.ui.transport_route_part;

import com.yandex.go.address.models.Address;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.ny61;
import defpackage.qu40;
import defpackage.vpr;
import defpackage.wr40;
import defpackage.zy11;
import java.util.Map;
import kotlin.Result;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qu40 b;

    public c(vpr vprVar, qu40 qu40Var) {
        this.a = vprVar;
        this.b = qu40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
    
        if (r2.emit(r4, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1 multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1;
        int i;
        TaxiOrder taxiOrder;
        Object a;
        vpr vprVar;
        Address address;
        if (continuation instanceof MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1) {
            multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1 = (MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1) continuation;
            int i2 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    taxiOrder = (TaxiOrder) obj;
                    qu40 qu40Var = this.b;
                    wr40 wr40Var = qu40Var.h;
                    String str = taxiOrder.a;
                    Preorder preorder = taxiOrder.b;
                    Address address2 = (Address) ((Map) wr40Var.c.getValue()).get(wr40Var.a.b(str, preorder.b));
                    if (address2 != null) {
                        qu40Var.g.l(address2);
                    }
                    String b = qu40Var.f.b(str, preorder.b);
                    com.yandex.go.multimodal_route.repositories.a aVar = qu40Var.b;
                    if (b != null) {
                        str = null;
                    }
                    boolean G = taxiOrder.G();
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$0 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$1 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$2 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$4 = vprVar2;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$5 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$6 = taxiOrder;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$7 = address2;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$8 = null;
                    multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label = 1;
                    a = aVar.a(str, b, multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1, G);
                    if (a != coroutineSingletons) {
                        vprVar = vprVar2;
                        address = address2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                address = (Address) multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$7;
                taxiOrder = (TaxiOrder) multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$6;
                vprVar = (vpr) multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                a = ((Result) obj2).getValue();
                if (a instanceof Result.Failure) {
                    a = null;
                }
                Triple triple = new Triple(taxiOrder, (TaxiTransportInfoResponseDto) a, address);
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$0 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$1 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$2 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$3 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$4 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$5 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$6 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$7 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$8 = null;
                multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label = 2;
            }
        }
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1 = new MultimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        Triple triple2 = new Triple(taxiOrder, (TaxiTransportInfoResponseDto) a, address);
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$0 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$1 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$2 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$3 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$4 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$5 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$6 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$7 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.L$8 = null;
        multimodalRouteTaxiTransportInfoInteractor$taxiTransportInfo$$inlined$map$1$2$1.label = 2;
    }
}
