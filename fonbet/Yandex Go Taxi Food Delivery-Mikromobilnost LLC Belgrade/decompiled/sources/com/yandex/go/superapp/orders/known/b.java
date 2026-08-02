package com.yandex.go.superapp.orders.known;

import defpackage.bvf0;
import defpackage.cd80;
import defpackage.cvw;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hk20;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.omx;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tls;
import defpackage.xvz;
import defpackage.zko;
import defpackage.zl50;
import defpackage.zy11;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executors;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class b {
    public final omx a;
    public final ike b = bvf0.a(cvw.U(jl40.a(), new zko(Executors.newSingleThreadExecutor())));
    public final kotlinx.coroutines.sync.a c = gtq0.a();

    public b(omx omxVar) {
        this.a = omxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:25:0x0064, B:26:0x00c1, B:30:0x00d5, B:36:0x00a5), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, tls] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v6, types: [g050, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v7, types: [T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, tls tlsVar, ContinuationImpl continuationImpl) {
        OrdersRepository$updateOrders$1 ordersRepository$updateOrders$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Throwable th;
        g050 g050Var;
        Ref$ObjectRef ref$ObjectRef;
        tls tlsVar2;
        Object obj;
        Ref$ObjectRef ref$ObjectRef2;
        Object a;
        Ref$ObjectRef ref$ObjectRef3;
        ?? r12;
        Optional optional;
        omx omxVar = bVar.a;
        try {
            if (continuationImpl instanceof OrdersRepository$updateOrders$1) {
                ordersRepository$updateOrders$1 = (OrdersRepository$updateOrders$1) continuationImpl;
                int i2 = ordersRepository$updateOrders$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ordersRepository$updateOrders$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = ordersRepository$updateOrders$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ordersRepository$updateOrders$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        Ref$ObjectRef z = qv10.z(obj2);
                        ref$ObjectRef = new Ref$ObjectRef();
                        kotlinx.coroutines.sync.a aVar = bVar.c;
                        ordersRepository$updateOrders$1.L$0 = tlsVar;
                        ordersRepository$updateOrders$1.L$1 = z;
                        ordersRepository$updateOrders$1.L$2 = ref$ObjectRef;
                        ordersRepository$updateOrders$1.L$3 = aVar;
                        ordersRepository$updateOrders$1.label = 1;
                        if (aVar.a(ordersRepository$updateOrders$1) != coroutineSingletons) {
                            tlsVar2 = tlsVar;
                            obj = aVar;
                            ref$ObjectRef2 = z;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) ordersRepository$updateOrders$1.L$3;
                            try {
                                kotlin.b.b(obj2);
                                g050Var.d(null);
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ref$ObjectRef2 = (Ref$ObjectRef) ordersRepository$updateOrders$1.L$4;
                        g050 g050Var2 = (g050) ordersRepository$updateOrders$1.L$3;
                        ref$ObjectRef = (Ref$ObjectRef) ordersRepository$updateOrders$1.L$2;
                        ref$ObjectRef3 = (Ref$ObjectRef) ordersRepository$updateOrders$1.L$1;
                        tlsVar2 = (tls) ordersRepository$updateOrders$1.L$0;
                        kotlin.b.b(obj2);
                        tlsVar = g050Var2;
                        r12 = obj2;
                        ref$ObjectRef2.element = r12;
                        optional = (Optional) tlsVar2.invoke(ref$ObjectRef3.element);
                        if (!xvz.D(optional)) {
                            tlsVar.d(null);
                            return zy11Var;
                        }
                        ?? r10 = optional.get();
                        ref$ObjectRef.element = r10;
                        ordersRepository$updateOrders$1.L$0 = null;
                        ordersRepository$updateOrders$1.L$1 = null;
                        ordersRepository$updateOrders$1.L$2 = null;
                        ordersRepository$updateOrders$1.L$3 = tlsVar;
                        ordersRepository$updateOrders$1.L$4 = null;
                        ordersRepository$updateOrders$1.label = 3;
                        if (((hk20) omxVar.a.getValue()).d((List) r10, ordersRepository$updateOrders$1) != coroutineSingletons) {
                            g050Var = tlsVar;
                            g050Var.d(null);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                    Object obj3 = (g050) ordersRepository$updateOrders$1.L$3;
                    Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) ordersRepository$updateOrders$1.L$2;
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) ordersRepository$updateOrders$1.L$1;
                    tlsVar2 = (tls) ordersRepository$updateOrders$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj3;
                    ref$ObjectRef2 = ref$ObjectRef5;
                    ref$ObjectRef = ref$ObjectRef4;
                    ordersRepository$updateOrders$1.L$0 = tlsVar2;
                    ordersRepository$updateOrders$1.L$1 = ref$ObjectRef2;
                    ordersRepository$updateOrders$1.L$2 = ref$ObjectRef;
                    ordersRepository$updateOrders$1.L$3 = obj;
                    ordersRepository$updateOrders$1.L$4 = ref$ObjectRef2;
                    ordersRepository$updateOrders$1.label = 2;
                    a = ((hk20) omxVar.a.getValue()).a(ordersRepository$updateOrders$1);
                    if (a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef3 = ref$ObjectRef2;
                    tlsVar = obj;
                    r12 = a;
                    ref$ObjectRef2.element = r12;
                    optional = (Optional) tlsVar2.invoke(ref$ObjectRef3.element);
                    if (!xvz.D(optional)) {
                    }
                }
            }
            if (i != 0) {
            }
            ordersRepository$updateOrders$1.L$0 = tlsVar2;
            ordersRepository$updateOrders$1.L$1 = ref$ObjectRef2;
            ordersRepository$updateOrders$1.L$2 = ref$ObjectRef;
            ordersRepository$updateOrders$1.L$3 = obj;
            ordersRepository$updateOrders$1.L$4 = ref$ObjectRef2;
            ordersRepository$updateOrders$1.label = 2;
            a = ((hk20) omxVar.a.getValue()).a(ordersRepository$updateOrders$1);
            if (a != coroutineSingletons) {
            }
        } catch (Throwable th3) {
            g050 g050Var3 = tlsVar;
            th = th3;
            g050Var = g050Var3;
        }
        ordersRepository$updateOrders$1 = new OrdersRepository$updateOrders$1(bVar, continuationImpl);
        Object obj22 = ordersRepository$updateOrders$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ordersRepository$updateOrders$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    public final void b(String str, String str2, String str3) {
        tje.N(this.b, null, null, new OrdersRepository$updateOrdersAsync$1(this, new cd80(str, str2, str3, 0), null), 3);
    }

    public final void c(String str, String str2) {
        tje.N(this.b, null, null, new OrdersRepository$updateOrdersAsync$1(this, new zl50(19, str2, Collections.singleton(str)), null), 3);
    }

    public final void d(String str, Collection collection) {
        tje.N(this.b, null, null, new OrdersRepository$updateOrdersAsync$1(this, new zl50(19, str, collection), null), 3);
    }

    public final void e(String str, String str2, String str3) {
        tje.N(this.b, null, null, new OrdersRepository$updateOrdersAsync$1(this, new cd80(str, str2, str3, 1), null), 3);
    }
}
