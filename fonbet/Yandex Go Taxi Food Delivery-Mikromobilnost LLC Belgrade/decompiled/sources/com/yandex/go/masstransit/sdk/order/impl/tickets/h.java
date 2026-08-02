package com.yandex.go.masstransit.sdk.order.impl.tickets;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$CppkSuburbanActivationDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.x;
import defpackage.gw00;
import defpackage.h310;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class h implements vpr {
    public final /* synthetic */ i a;
    public final /* synthetic */ String b;

    public h(i iVar, String str) {
        this.a = iVar;
        this.b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        if (r7.d(r14, r0) == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Map] */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(MasstransitOrderDto masstransitOrderDto, Continuation continuation) {
        MtTicketsRepository$observeOrderUpdates$2$emit$1 mtTicketsRepository$observeOrderUpdates$2$emit$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        i iVar;
        LinkedHashMap linkedHashMap;
        MasstransitOrderDto masstransitOrderDto2;
        int i2;
        MasstransitOrderDto masstransitOrderDto3;
        Map map;
        int i3;
        if (continuation instanceof MtTicketsRepository$observeOrderUpdates$2$emit$1) {
            mtTicketsRepository$observeOrderUpdates$2$emit$1 = (MtTicketsRepository$observeOrderUpdates$2$emit$1) continuation;
            int i4 = mtTicketsRepository$observeOrderUpdates$2$emit$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mtTicketsRepository$observeOrderUpdates$2$emit$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mtTicketsRepository$observeOrderUpdates$2$emit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsRepository$observeOrderUpdates$2$emit$1.label;
                iVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = (String) iVar.a.l.getValue();
                    List<MasstransitTicketDto> list = masstransitOrderDto.b;
                    int d = gw00.d(tcc.n(list, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    linkedHashMap = new LinkedHashMap(d);
                    for (MasstransitTicketDto masstransitTicketDto : list) {
                        String str2 = masstransitTicketDto.a;
                        x xVar = masstransitTicketDto.c;
                        TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto = xVar instanceof TransportPassDto$CppkSuburbanActivationDto ? (TransportPassDto$CppkSuburbanActivationDto) xVar : null;
                        Pair pair = new Pair(str2, transportPassDto$CppkSuburbanActivationDto != null ? transportPassDto$CppkSuburbanActivationDto.b : null);
                        linkedHashMap.put(pair.c(), pair.f());
                    }
                    Object value = iVar.d.getValue();
                    h310 h310Var = value instanceof h310 ? (h310) value : null;
                    int i5 = (jl40.l((h310Var == null || (masstransitOrderDto2 = h310Var.a) == null) ? null : masstransitOrderDto2.a, this.b) && jl40.l(h310Var.a, masstransitOrderDto)) ? h310Var.c : 0;
                    iVar.f(masstransitOrderDto, str);
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0 = masstransitOrderDto;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$1 = null;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2 = linkedHashMap;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$3 = null;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0 = i5;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.label = 1;
                    i2 = i5;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        int i6 = mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0;
                        map = (Map) mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2;
                        masstransitOrderDto3 = (MasstransitOrderDto) mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0;
                        kotlin.b.b(obj);
                        i3 = i6;
                        r0 r0Var = iVar.d;
                        h310 h310Var2 = new h310(masstransitOrderDto3, map, i3 != 0);
                        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0 = null;
                        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$1 = null;
                        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2 = null;
                        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$3 = null;
                        mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0 = i3;
                        mtTicketsRepository$observeOrderUpdates$2$emit$1.label = 3;
                        r0Var.emit(h310Var2, mtTicketsRepository$observeOrderUpdates$2$emit$1);
                        zy11 zy11Var = zy11.a;
                        return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    int i7 = mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0;
                    ?? r14 = (Map) mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2;
                    MasstransitOrderDto masstransitOrderDto4 = (MasstransitOrderDto) mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0;
                    kotlin.b.b(obj);
                    linkedHashMap = r14;
                    masstransitOrderDto = masstransitOrderDto4;
                    i2 = i7;
                }
                mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0 = masstransitOrderDto;
                mtTicketsRepository$observeOrderUpdates$2$emit$1.L$1 = null;
                mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2 = linkedHashMap;
                mtTicketsRepository$observeOrderUpdates$2$emit$1.L$3 = null;
                mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0 = i2;
                mtTicketsRepository$observeOrderUpdates$2$emit$1.label = 2;
                if (iVar.e(masstransitOrderDto, mtTicketsRepository$observeOrderUpdates$2$emit$1) != coroutineSingletons) {
                    masstransitOrderDto3 = masstransitOrderDto;
                    map = linkedHashMap;
                    i3 = i2;
                    r0 r0Var2 = iVar.d;
                    h310 h310Var22 = new h310(masstransitOrderDto3, map, i3 != 0);
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0 = null;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$1 = null;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2 = null;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.L$3 = null;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0 = i3;
                    mtTicketsRepository$observeOrderUpdates$2$emit$1.label = 3;
                    r0Var2.emit(h310Var22, mtTicketsRepository$observeOrderUpdates$2$emit$1);
                    zy11 zy11Var2 = zy11.a;
                    if (zy11Var2 != coroutineSingletons) {
                    }
                }
            }
        }
        mtTicketsRepository$observeOrderUpdates$2$emit$1 = new MtTicketsRepository$observeOrderUpdates$2$emit$1(this, continuation);
        Object obj2 = mtTicketsRepository$observeOrderUpdates$2$emit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsRepository$observeOrderUpdates$2$emit$1.label;
        iVar = this.a;
        if (i != 0) {
        }
        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$0 = masstransitOrderDto;
        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$1 = null;
        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$2 = linkedHashMap;
        mtTicketsRepository$observeOrderUpdates$2$emit$1.L$3 = null;
        mtTicketsRepository$observeOrderUpdates$2$emit$1.I$0 = i2;
        mtTicketsRepository$observeOrderUpdates$2$emit$1.label = 2;
        if (iVar.e(masstransitOrderDto, mtTicketsRepository$observeOrderUpdates$2$emit$1) != coroutineSingletons) {
        }
    }
}
