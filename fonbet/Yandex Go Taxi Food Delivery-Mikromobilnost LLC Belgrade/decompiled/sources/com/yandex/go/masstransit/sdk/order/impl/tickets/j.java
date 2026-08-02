package com.yandex.go.masstransit.sdk.order.impl.tickets;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto;
import defpackage.gw00;
import defpackage.h310;
import defpackage.i310;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar, l lVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTicketsUiStateInteractor$special$$inlined$map$1$2$1 mtTicketsUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        Map f;
        MasstransitOrderDto masstransitOrderDto;
        if (continuation instanceof MtTicketsUiStateInteractor$special$$inlined$map$1$2$1) {
            mtTicketsUiStateInteractor$special$$inlined$map$1$2$1 = (MtTicketsUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i310 i310Var = (i310) obj;
                    h310 h310Var = i310Var instanceof h310 ? (h310) i310Var : null;
                    if (h310Var == null || (masstransitOrderDto = h310Var.a) == null) {
                        f = kotlin.collections.b.f();
                    } else {
                        List list = masstransitOrderDto.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            MasstransitTicketDto masstransitTicketDto = (MasstransitTicketDto) obj3;
                            if (!jl40.l(masstransitTicketDto.i, Boolean.FALSE) && masstransitTicketDto.f != null) {
                                arrayList.add(obj3);
                            }
                        }
                        int d = gw00.d(tcc.n(arrayList, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        f = new LinkedHashMap(d);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            MasstransitTicketDto masstransitTicketDto2 = (MasstransitTicketDto) it.next();
                            Pair pair = new Pair(masstransitTicketDto2.a, masstransitTicketDto2.f);
                            f.put(pair.c(), pair.f());
                        }
                    }
                    mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, mtTicketsUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtTicketsUiStateInteractor$special$$inlined$map$1$2$1 = new MtTicketsUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
