package com.yandex.go.masstransit.sdk.order.impl.tickets;

import com.yandex.go.masstransit.sdk.order.api.tickets.analytics.MtTicketActivationType;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto$CppkSuburbanActivationDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.x;
import defpackage.bvf0;
import defpackage.cwq;
import defpackage.f310;
import defpackage.g310;
import defpackage.gw00;
import defpackage.h310;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r640;
import defpackage.tcc;
import defpackage.v4r0;
import defpackage.v740;
import defpackage.w740;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class i {
    public final com.yandex.go.masstransit.sdk.order.impl.orders.k a;
    public final w740 b;
    public final com.yandex.go.masstransit.sdk.order.impl.orders.c c;
    public final r0 d = bvf0.c(g310.a);
    public final r0 e;
    public final r0 f;

    public i(com.yandex.go.masstransit.sdk.order.impl.orders.k kVar, w740 w740Var, com.yandex.go.masstransit.sdk.order.impl.orders.c cVar) {
        this.a = kVar;
        this.b = w740Var;
        this.c = cVar;
        EmptySet emptySet = EmptySet.a;
        this.e = bvf0.c(emptySet);
        this.f = bvf0.c(emptySet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r3.a(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MtTicketsRepository$consumeExpirationAnimation$1 mtTicketsRepository$consumeExpirationAnimation$1;
        int i;
        if (continuationImpl instanceof MtTicketsRepository$consumeExpirationAnimation$1) {
            mtTicketsRepository$consumeExpirationAnimation$1 = (MtTicketsRepository$consumeExpirationAnimation$1) continuationImpl;
            int i2 = mtTicketsRepository$consumeExpirationAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsRepository$consumeExpirationAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsRepository$consumeExpirationAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsRepository$consumeExpirationAnimation$1.label;
                com.yandex.go.masstransit.sdk.order.impl.orders.c cVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = this.e;
                    r0Var.m(null, v4r0.i((Set) r0Var.getValue(), str));
                    r0 r0Var2 = this.f;
                    r0Var2.m(null, v4r0.f((Set) r0Var2.getValue(), str));
                    mtTicketsRepository$consumeExpirationAnimation$1.L$0 = str;
                    mtTicketsRepository$consumeExpirationAnimation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) mtTicketsRepository$consumeExpirationAnimation$1.L$0;
                    kotlin.b.b(obj);
                }
                mtTicketsRepository$consumeExpirationAnimation$1.L$0 = null;
                mtTicketsRepository$consumeExpirationAnimation$1.label = 2;
                Object f = cVar.f(str, mtTicketsRepository$consumeExpirationAnimation$1);
                return f != coroutineSingletons ? coroutineSingletons : f;
            }
        }
        mtTicketsRepository$consumeExpirationAnimation$1 = new MtTicketsRepository$consumeExpirationAnimation$1(this, continuationImpl);
        Object obj2 = mtTicketsRepository$consumeExpirationAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsRepository$consumeExpirationAnimation$1.label;
        com.yandex.go.masstransit.sdk.order.impl.orders.c cVar2 = this.c;
        if (i != 0) {
        }
        mtTicketsRepository$consumeExpirationAnimation$1.L$0 = null;
        mtTicketsRepository$consumeExpirationAnimation$1.label = 2;
        Object f2 = cVar2.f(str, mtTicketsRepository$consumeExpirationAnimation$1);
        if (f2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ea, code lost:
    
        if (r5 == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MtTicketsRepository$getOrder$1 mtTicketsRepository$getOrder$1;
        int i;
        String str2;
        String str3;
        MasstransitOrderDto masstransitOrderDto;
        Iterator it;
        Object obj;
        MasstransitOrderDto masstransitOrderDto2;
        Map f;
        Object f310Var;
        MasstransitOrderDto masstransitOrderDto3;
        MasstransitOrderDto masstransitOrderDto4;
        Map map;
        Map map2;
        if (continuationImpl instanceof MtTicketsRepository$getOrder$1) {
            mtTicketsRepository$getOrder$1 = (MtTicketsRepository$getOrder$1) continuationImpl;
            int i2 = mtTicketsRepository$getOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsRepository$getOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTicketsRepository$getOrder$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsRepository$getOrder$1.label;
                Object obj4 = zy11.a;
                r0 r0Var = this.d;
                com.yandex.go.masstransit.sdk.order.impl.orders.k kVar = this.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        str2 = str;
                        mtTicketsRepository$getOrder$1.L$0 = str2;
                        mtTicketsRepository$getOrder$1.label = 1;
                        r0Var.emit(g310.a, mtTicketsRepository$getOrder$1);
                        break;
                    case 1:
                        String str4 = (String) mtTicketsRepository$getOrder$1.L$0;
                        kotlin.b.b(obj2);
                        str2 = str4;
                        mtTicketsRepository$getOrder$1.L$0 = str2;
                        mtTicketsRepository$getOrder$1.label = 2;
                        Object f2 = kVar.f(str2, mtTicketsRepository$getOrder$1);
                        if (f2 != obj3) {
                            str3 = str2;
                            obj2 = f2;
                            cwq cwqVar = (cwq) obj2;
                            masstransitOrderDto = cwqVar.a;
                            String str5 = cwqVar.b;
                            it = ((Iterable) kVar.k.getValue()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                } else {
                                    obj = it.next();
                                    if (jl40.l(((MasstransitOrderDto) obj).a, str3)) {
                                    }
                                }
                            }
                            masstransitOrderDto2 = (MasstransitOrderDto) obj;
                            String str6 = (String) kVar.l.getValue();
                            if (masstransitOrderDto2 == null) {
                                List<MasstransitTicketDto> list = masstransitOrderDto2.b;
                                int d = gw00.d(tcc.n(list, 10));
                                if (d < 16) {
                                    d = 16;
                                }
                                f = new LinkedHashMap(d);
                                for (MasstransitTicketDto masstransitTicketDto : list) {
                                    String str7 = masstransitTicketDto.a;
                                    x xVar = masstransitTicketDto.c;
                                    TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto = xVar instanceof TransportPassDto$CppkSuburbanActivationDto ? (TransportPassDto$CppkSuburbanActivationDto) xVar : null;
                                    Pair pair = new Pair(str7, transportPassDto$CppkSuburbanActivationDto != null ? transportPassDto$CppkSuburbanActivationDto.b : null);
                                    f.put(pair.c(), pair.f());
                                }
                            } else {
                                f = kotlin.collections.b.f();
                            }
                            if (masstransitOrderDto == null) {
                                f(masstransitOrderDto, str5);
                                mtTicketsRepository$getOrder$1.L$0 = null;
                                mtTicketsRepository$getOrder$1.L$1 = null;
                                mtTicketsRepository$getOrder$1.L$2 = masstransitOrderDto;
                                mtTicketsRepository$getOrder$1.L$3 = null;
                                mtTicketsRepository$getOrder$1.L$4 = null;
                                mtTicketsRepository$getOrder$1.L$5 = f;
                                mtTicketsRepository$getOrder$1.label = 3;
                                if (d(masstransitOrderDto, mtTicketsRepository$getOrder$1) != obj3) {
                                    masstransitOrderDto4 = masstransitOrderDto;
                                    mtTicketsRepository$getOrder$1.L$0 = null;
                                    mtTicketsRepository$getOrder$1.L$1 = null;
                                    mtTicketsRepository$getOrder$1.L$2 = masstransitOrderDto4;
                                    mtTicketsRepository$getOrder$1.L$3 = null;
                                    mtTicketsRepository$getOrder$1.L$4 = null;
                                    mtTicketsRepository$getOrder$1.L$5 = f;
                                    mtTicketsRepository$getOrder$1.label = 4;
                                    if (e(masstransitOrderDto4, mtTicketsRepository$getOrder$1) != obj3) {
                                        map = f;
                                        f310Var = new h310(masstransitOrderDto4, map, false);
                                        mtTicketsRepository$getOrder$1.L$0 = null;
                                        mtTicketsRepository$getOrder$1.L$1 = null;
                                        mtTicketsRepository$getOrder$1.L$2 = null;
                                        mtTicketsRepository$getOrder$1.L$3 = null;
                                        mtTicketsRepository$getOrder$1.L$4 = null;
                                        mtTicketsRepository$getOrder$1.L$5 = null;
                                        mtTicketsRepository$getOrder$1.L$6 = null;
                                        mtTicketsRepository$getOrder$1.label = 7;
                                        r0Var.emit(f310Var, mtTicketsRepository$getOrder$1);
                                        if (obj4 == obj3) {
                                            return obj4;
                                        }
                                    }
                                }
                            } else if (masstransitOrderDto2 != null) {
                                f(masstransitOrderDto2, str6);
                                mtTicketsRepository$getOrder$1.L$0 = null;
                                mtTicketsRepository$getOrder$1.L$1 = null;
                                mtTicketsRepository$getOrder$1.L$2 = null;
                                mtTicketsRepository$getOrder$1.L$3 = masstransitOrderDto2;
                                mtTicketsRepository$getOrder$1.L$4 = null;
                                mtTicketsRepository$getOrder$1.L$5 = f;
                                mtTicketsRepository$getOrder$1.label = 5;
                                if (d(masstransitOrderDto2, mtTicketsRepository$getOrder$1) != obj3) {
                                    masstransitOrderDto3 = masstransitOrderDto2;
                                    mtTicketsRepository$getOrder$1.L$0 = null;
                                    mtTicketsRepository$getOrder$1.L$1 = null;
                                    mtTicketsRepository$getOrder$1.L$2 = null;
                                    mtTicketsRepository$getOrder$1.L$3 = masstransitOrderDto3;
                                    mtTicketsRepository$getOrder$1.L$4 = null;
                                    mtTicketsRepository$getOrder$1.L$5 = f;
                                    mtTicketsRepository$getOrder$1.label = 6;
                                    if (e(masstransitOrderDto3, mtTicketsRepository$getOrder$1) != obj3) {
                                        map2 = f;
                                        f310Var = new h310(masstransitOrderDto3, map2, true);
                                        mtTicketsRepository$getOrder$1.L$0 = null;
                                        mtTicketsRepository$getOrder$1.L$1 = null;
                                        mtTicketsRepository$getOrder$1.L$2 = null;
                                        mtTicketsRepository$getOrder$1.L$3 = null;
                                        mtTicketsRepository$getOrder$1.L$4 = null;
                                        mtTicketsRepository$getOrder$1.L$5 = null;
                                        mtTicketsRepository$getOrder$1.L$6 = null;
                                        mtTicketsRepository$getOrder$1.label = 7;
                                        r0Var.emit(f310Var, mtTicketsRepository$getOrder$1);
                                        if (obj4 == obj3) {
                                        }
                                    }
                                }
                            } else {
                                w740 w740Var = this.b;
                                w740Var.a = new v740(str3, w740Var.a.b, str5);
                                f310Var = new f310(str3);
                                mtTicketsRepository$getOrder$1.L$0 = null;
                                mtTicketsRepository$getOrder$1.L$1 = null;
                                mtTicketsRepository$getOrder$1.L$2 = null;
                                mtTicketsRepository$getOrder$1.L$3 = null;
                                mtTicketsRepository$getOrder$1.L$4 = null;
                                mtTicketsRepository$getOrder$1.L$5 = null;
                                mtTicketsRepository$getOrder$1.L$6 = null;
                                mtTicketsRepository$getOrder$1.label = 7;
                                r0Var.emit(f310Var, mtTicketsRepository$getOrder$1);
                                if (obj4 == obj3) {
                                }
                            }
                        }
                        return obj3;
                    case 2:
                        str3 = (String) mtTicketsRepository$getOrder$1.L$0;
                        kotlin.b.b(obj2);
                        cwq cwqVar2 = (cwq) obj2;
                        masstransitOrderDto = cwqVar2.a;
                        String str52 = cwqVar2.b;
                        it = ((Iterable) kVar.k.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        masstransitOrderDto2 = (MasstransitOrderDto) obj;
                        String str62 = (String) kVar.l.getValue();
                        if (masstransitOrderDto2 == null) {
                        }
                        if (masstransitOrderDto == null) {
                        }
                        return obj3;
                    case 3:
                        Map map3 = (Map) mtTicketsRepository$getOrder$1.L$5;
                        MasstransitOrderDto masstransitOrderDto5 = (MasstransitOrderDto) mtTicketsRepository$getOrder$1.L$2;
                        kotlin.b.b(obj2);
                        f = map3;
                        masstransitOrderDto4 = masstransitOrderDto5;
                        mtTicketsRepository$getOrder$1.L$0 = null;
                        mtTicketsRepository$getOrder$1.L$1 = null;
                        mtTicketsRepository$getOrder$1.L$2 = masstransitOrderDto4;
                        mtTicketsRepository$getOrder$1.L$3 = null;
                        mtTicketsRepository$getOrder$1.L$4 = null;
                        mtTicketsRepository$getOrder$1.L$5 = f;
                        mtTicketsRepository$getOrder$1.label = 4;
                        if (e(masstransitOrderDto4, mtTicketsRepository$getOrder$1) != obj3) {
                        }
                        return obj3;
                    case 4:
                        map = (Map) mtTicketsRepository$getOrder$1.L$5;
                        masstransitOrderDto4 = (MasstransitOrderDto) mtTicketsRepository$getOrder$1.L$2;
                        kotlin.b.b(obj2);
                        f310Var = new h310(masstransitOrderDto4, map, false);
                        mtTicketsRepository$getOrder$1.L$0 = null;
                        mtTicketsRepository$getOrder$1.L$1 = null;
                        mtTicketsRepository$getOrder$1.L$2 = null;
                        mtTicketsRepository$getOrder$1.L$3 = null;
                        mtTicketsRepository$getOrder$1.L$4 = null;
                        mtTicketsRepository$getOrder$1.L$5 = null;
                        mtTicketsRepository$getOrder$1.L$6 = null;
                        mtTicketsRepository$getOrder$1.label = 7;
                        r0Var.emit(f310Var, mtTicketsRepository$getOrder$1);
                        if (obj4 == obj3) {
                            return obj3;
                        }
                        break;
                    case 5:
                        Map map4 = (Map) mtTicketsRepository$getOrder$1.L$5;
                        MasstransitOrderDto masstransitOrderDto6 = (MasstransitOrderDto) mtTicketsRepository$getOrder$1.L$3;
                        kotlin.b.b(obj2);
                        f = map4;
                        masstransitOrderDto3 = masstransitOrderDto6;
                        mtTicketsRepository$getOrder$1.L$0 = null;
                        mtTicketsRepository$getOrder$1.L$1 = null;
                        mtTicketsRepository$getOrder$1.L$2 = null;
                        mtTicketsRepository$getOrder$1.L$3 = masstransitOrderDto3;
                        mtTicketsRepository$getOrder$1.L$4 = null;
                        mtTicketsRepository$getOrder$1.L$5 = f;
                        mtTicketsRepository$getOrder$1.label = 6;
                        if (e(masstransitOrderDto3, mtTicketsRepository$getOrder$1) != obj3) {
                        }
                        return obj3;
                    case 6:
                        map2 = (Map) mtTicketsRepository$getOrder$1.L$5;
                        masstransitOrderDto3 = (MasstransitOrderDto) mtTicketsRepository$getOrder$1.L$3;
                        kotlin.b.b(obj2);
                        f310Var = new h310(masstransitOrderDto3, map2, true);
                        mtTicketsRepository$getOrder$1.L$0 = null;
                        mtTicketsRepository$getOrder$1.L$1 = null;
                        mtTicketsRepository$getOrder$1.L$2 = null;
                        mtTicketsRepository$getOrder$1.L$3 = null;
                        mtTicketsRepository$getOrder$1.L$4 = null;
                        mtTicketsRepository$getOrder$1.L$5 = null;
                        mtTicketsRepository$getOrder$1.L$6 = null;
                        mtTicketsRepository$getOrder$1.label = 7;
                        r0Var.emit(f310Var, mtTicketsRepository$getOrder$1);
                        if (obj4 == obj3) {
                        }
                        break;
                    case 7:
                        kotlin.b.b(obj2);
                        return obj2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        mtTicketsRepository$getOrder$1 = new MtTicketsRepository$getOrder$1(this, continuationImpl);
        Object obj22 = mtTicketsRepository$getOrder$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsRepository$getOrder$1.label;
        Object obj42 = zy11.a;
        r0 r0Var2 = this.d;
        com.yandex.go.masstransit.sdk.order.impl.orders.k kVar2 = this.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MtTicketsRepository$loadConsumedAnimations$1 mtTicketsRepository$loadConsumedAnimations$1;
        int i;
        pz40 pz40Var;
        pz40 pz40Var2;
        if (continuationImpl instanceof MtTicketsRepository$loadConsumedAnimations$1) {
            mtTicketsRepository$loadConsumedAnimations$1 = (MtTicketsRepository$loadConsumedAnimations$1) continuationImpl;
            int i2 = mtTicketsRepository$loadConsumedAnimations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsRepository$loadConsumedAnimations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsRepository$loadConsumedAnimations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsRepository$loadConsumedAnimations$1.label;
                com.yandex.go.masstransit.sdk.order.impl.orders.c cVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40Var = this.e;
                    mtTicketsRepository$loadConsumedAnimations$1.L$0 = pz40Var;
                    mtTicketsRepository$loadConsumedAnimations$1.label = 1;
                    obj = cVar.c(mtTicketsRepository$loadConsumedAnimations$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pz40Var2 = (pz40) mtTicketsRepository$loadConsumedAnimations$1.L$0;
                        kotlin.b.b(obj);
                        ((r0) pz40Var2).l(obj);
                        return zy11.a;
                    }
                    pz40Var = (pz40) mtTicketsRepository$loadConsumedAnimations$1.L$0;
                    kotlin.b.b(obj);
                }
                ((r0) pz40Var).l(obj);
                pz40Var2 = this.f;
                mtTicketsRepository$loadConsumedAnimations$1.L$0 = pz40Var2;
                mtTicketsRepository$loadConsumedAnimations$1.label = 2;
                obj = cVar.e(mtTicketsRepository$loadConsumedAnimations$1);
            }
        }
        mtTicketsRepository$loadConsumedAnimations$1 = new MtTicketsRepository$loadConsumedAnimations$1(this, continuationImpl);
        Object obj2 = mtTicketsRepository$loadConsumedAnimations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsRepository$loadConsumedAnimations$1.label;
        com.yandex.go.masstransit.sdk.order.impl.orders.c cVar2 = this.c;
        if (i != 0) {
        }
        ((r0) pz40Var).l(obj2);
        pz40Var2 = this.f;
        mtTicketsRepository$loadConsumedAnimations$1.L$0 = pz40Var2;
        mtTicketsRepository$loadConsumedAnimations$1.label = 2;
        obj2 = cVar2.e(mtTicketsRepository$loadConsumedAnimations$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(MasstransitOrderDto masstransitOrderDto, ContinuationImpl continuationImpl) {
        MtTicketsRepository$pruneConsumedAnimations$1 mtTicketsRepository$pruneConsumedAnimations$1;
        int i;
        Set N0;
        if (continuationImpl instanceof MtTicketsRepository$pruneConsumedAnimations$1) {
            mtTicketsRepository$pruneConsumedAnimations$1 = (MtTicketsRepository$pruneConsumedAnimations$1) continuationImpl;
            int i2 = mtTicketsRepository$pruneConsumedAnimations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTicketsRepository$pruneConsumedAnimations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTicketsRepository$pruneConsumedAnimations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTicketsRepository$pruneConsumedAnimations$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = masstransitOrderDto.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MasstransitTicketDto) it.next()).a);
                    }
                    N0 = kotlin.collections.a.N0(arrayList);
                    mtTicketsRepository$pruneConsumedAnimations$1.L$0 = null;
                    mtTicketsRepository$pruneConsumedAnimations$1.L$1 = N0;
                    mtTicketsRepository$pruneConsumedAnimations$1.label = 1;
                    if (this.c.g(N0, mtTicketsRepository$pruneConsumedAnimations$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    N0 = (Set) mtTicketsRepository$pruneConsumedAnimations$1.L$1;
                    kotlin.b.b(obj);
                }
                r0 r0Var = this.e;
                Set set = N0;
                LinkedHashSet U = kotlin.collections.a.U((Iterable) r0Var.getValue(), set);
                r0Var.getClass();
                r0Var.m(null, U);
                r0 r0Var2 = this.f;
                LinkedHashSet U2 = kotlin.collections.a.U((Iterable) r0Var2.getValue(), set);
                r0Var2.getClass();
                r0Var2.m(null, U2);
                return zy11.a;
            }
        }
        mtTicketsRepository$pruneConsumedAnimations$1 = new MtTicketsRepository$pruneConsumedAnimations$1(this, continuationImpl);
        Object obj2 = mtTicketsRepository$pruneConsumedAnimations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTicketsRepository$pruneConsumedAnimations$1.label;
        if (i != 0) {
        }
        r0 r0Var3 = this.e;
        Set set2 = N0;
        LinkedHashSet U3 = kotlin.collections.a.U((Iterable) r0Var3.getValue(), set2);
        r0Var3.getClass();
        r0Var3.m(null, U3);
        r0 r0Var22 = this.f;
        LinkedHashSet U22 = kotlin.collections.a.U((Iterable) r0Var22.getValue(), set2);
        r0Var22.getClass();
        r0Var22.m(null, U22);
        return zy11.a;
    }

    public final Object e(MasstransitOrderDto masstransitOrderDto, ContinuationImpl continuationImpl) {
        List list = masstransitOrderDto.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            MasstransitTicketDto masstransitTicketDto = (MasstransitTicketDto) obj;
            if (!jl40.l(masstransitTicketDto.i, Boolean.FALSE) && masstransitTicketDto.f != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MasstransitTicketDto) it.next()).a);
        }
        Set N0 = kotlin.collections.a.N0(arrayList2);
        if (N0.isEmpty()) {
            return zy11.a;
        }
        r0 r0Var = this.f;
        r0Var.m(null, v4r0.h((Set) r0Var.getValue(), N0));
        return this.c.b(N0, continuationImpl);
    }

    public final void f(MasstransitOrderDto masstransitOrderDto, String str) {
        List list = masstransitOrderDto.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new r640(((MasstransitTicketDto) it.next()).a, MtTicketActivationType.QR));
        }
        w740 w740Var = this.b;
        v740 v740Var = w740Var.a;
        String str2 = masstransitOrderDto.a;
        v740Var.getClass();
        w740Var.a = new v740(str2, arrayList, str);
    }
}
