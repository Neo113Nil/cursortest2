package com.yandex.go.chargers.offer.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.offer.data.model.ChargersCreateOrderResponse;
import defpackage.c06;
import defpackage.cy9;
import defpackage.fmt;
import defpackage.gp9;
import defpackage.hp9;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.whb1;
import defpackage.yx9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.chargers.error.data.a a;
    public final c06 b;
    public final com.yandex.go.chargers.data.a c;

    public c(com.yandex.go.chargers.error.data.a aVar, c06 c06Var, com.yandex.go.chargers.data.a aVar2) {
        this.a = aVar;
        this.b = c06Var;
        this.c = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(7:18|19|20|21|(3:28|(3:31|(3:33|34|35)(1:36)|29)|37)(1:25)|26|27))(2:38|39))(3:52|53|(2:55|48))|40|(2:45|(2:47|48)(8:49|21|(1:23)|28|(1:29)|37|26|27))|50|51))|62|6|7|(0)(0)|40|(3:42|45|(0)(0))|50|51|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0113, code lost:
    
        r1.L$0 = null;
        r1.L$1 = null;
        r1.L$2 = null;
        r1.L$3 = null;
        r1.label = 3;
        r0 = r14.a.a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0123, code lost:
    
        if (r0 != r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: all -> 0x0058, CancellationException -> 0x0138, TryCatch #2 {CancellationException -> 0x0138, all -> 0x0058, blocks: (B:19:0x0053, B:21:0x00a3, B:23:0x00ad, B:26:0x00d7, B:28:0x00b7, B:29:0x00bb, B:31:0x00c1, B:34:0x00d1, B:39:0x005f, B:40:0x0074, B:42:0x0086, B:45:0x008e, B:50:0x0104, B:53:0x0066), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ChargersCreateOrderInteractor$createOrder$1 chargersCreateOrderInteractor$createOrder$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        String a;
        String str3;
        List list;
        Iterator it;
        if (continuationImpl instanceof ChargersCreateOrderInteractor$createOrder$1) {
            chargersCreateOrderInteractor$createOrder$1 = (ChargersCreateOrderInteractor$createOrder$1) continuationImpl;
            int i2 = chargersCreateOrderInteractor$createOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCreateOrderInteractor$createOrder$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersCreateOrderInteractor$createOrder$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCreateOrderInteractor$createOrder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c06 c06Var = this.b;
                    chargersCreateOrderInteractor$createOrder$1.L$0 = null;
                    chargersCreateOrderInteractor$createOrder$1.label = 1;
                    obj = c06Var.k(str, chargersCreateOrderInteractor$createOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            cy9 cy9Var = (cy9) obj;
                            yx9.a(ChargersError.Companion, ChargersError.OfferCreateOrder, cy9Var.a, 4);
                            return new gp9(cy9Var);
                        }
                        String str4 = (String) chargersCreateOrderInteractor$createOrder$1.L$3;
                        str3 = (String) chargersCreateOrderInteractor$createOrder$1.L$2;
                        kotlin.b.b(obj);
                        a = str4;
                        list = ((rl9) obj).a;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (jl40.l(((taa) it.next()).a(), str3)) {
                                    return new hp9(str3);
                                }
                            }
                        }
                        whb1.c(null, new IllegalStateException("No order with orderId = '" + str3 + "' in active orders after order create"));
                        return new gp9(new cy9(7, null, a, null, null));
                    }
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                str2 = ((ChargersCreateOrderResponse) fmtVar.a).a;
                a = fmtVar.e.a("X-YaTraceId");
                if (str2 != null && str2.length() != 0) {
                    com.yandex.go.chargers.data.a aVar = this.c;
                    chargersCreateOrderInteractor$createOrder$1.L$0 = null;
                    chargersCreateOrderInteractor$createOrder$1.L$1 = null;
                    chargersCreateOrderInteractor$createOrder$1.L$2 = str2;
                    chargersCreateOrderInteractor$createOrder$1.L$3 = a;
                    chargersCreateOrderInteractor$createOrder$1.label = 2;
                    obj = aVar.a(chargersCreateOrderInteractor$createOrder$1);
                    if (obj != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str2;
                    list = ((rl9) obj).a;
                    if (list instanceof Collection) {
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    whb1.c(null, new IllegalStateException("No order with orderId = '" + str3 + "' in active orders after order create"));
                    return new gp9(new cy9(7, null, a, null, null));
                }
                return new gp9(new cy9(7, null, a, null, null));
            }
        }
        chargersCreateOrderInteractor$createOrder$1 = new ChargersCreateOrderInteractor$createOrder$1(this, continuationImpl);
        obj = chargersCreateOrderInteractor$createOrder$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCreateOrderInteractor$createOrder$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj;
        str2 = ((ChargersCreateOrderResponse) fmtVar2.a).a;
        a = fmtVar2.e.a("X-YaTraceId");
        if (str2 != null) {
            com.yandex.go.chargers.data.a aVar2 = this.c;
            chargersCreateOrderInteractor$createOrder$1.L$0 = null;
            chargersCreateOrderInteractor$createOrder$1.L$1 = null;
            chargersCreateOrderInteractor$createOrder$1.L$2 = str2;
            chargersCreateOrderInteractor$createOrder$1.L$3 = a;
            chargersCreateOrderInteractor$createOrder$1.label = 2;
            obj = aVar2.a(chargersCreateOrderInteractor$createOrder$1);
            if (obj != coroutineSingletons) {
            }
        }
        return new gp9(new cy9(7, null, a, null, null));
    }
}
