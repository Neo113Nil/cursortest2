package com.yandex.go.chargers.order.domain;

import com.yandex.go.chargers.analytics.ChargersError;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrdersResponse;
import defpackage.cy9;
import defpackage.fmt;
import defpackage.kl9;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.tt2;
import defpackage.yvi0;
import defpackage.yx9;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final tt2 a;
    public final com.yandex.go.chargers.error.data.a b;
    public final kl9 c;
    public final com.yandex.go.chargers.data.e d;
    public final g e;
    public final com.yandex.go.chargers.order.data.e f;
    public final yvi0 g;

    public a(tt2 tt2Var, com.yandex.go.chargers.error.data.a aVar, kl9 kl9Var, com.yandex.go.chargers.data.e eVar, g gVar, com.yandex.go.chargers.order.data.e eVar2, yvi0 yvi0Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = kl9Var;
        this.d = eVar;
        this.e = gVar;
        this.f = eVar2;
        this.g = yvi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersActiveOrdersResponse chargersActiveOrdersResponse, String str, ContinuationImpl continuationImpl) {
        ChargersActiveOrdersInteractor$handleResponse$1 chargersActiveOrdersInteractor$handleResponse$1;
        int i;
        rl9 rl9Var;
        if (continuationImpl instanceof ChargersActiveOrdersInteractor$handleResponse$1) {
            chargersActiveOrdersInteractor$handleResponse$1 = (ChargersActiveOrdersInteractor$handleResponse$1) continuationImpl;
            int i2 = chargersActiveOrdersInteractor$handleResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersInteractor$handleResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersInteractor$handleResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersInteractor$handleResponse$1.label;
                com.yandex.go.chargers.data.e eVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rl9 d = this.c.d(chargersActiveOrdersResponse, str);
                    rl9 rl9Var2 = (rl9) kotlinx.coroutines.flow.e.d(eVar.d).a.getValue();
                    chargersActiveOrdersInteractor$handleResponse$1.L$0 = null;
                    chargersActiveOrdersInteractor$handleResponse$1.L$1 = null;
                    chargersActiveOrdersInteractor$handleResponse$1.L$2 = d;
                    chargersActiveOrdersInteractor$handleResponse$1.label = 1;
                    if (this.e.a(rl9Var2, d, chargersActiveOrdersInteractor$handleResponse$1) != coroutineSingletons) {
                        rl9Var = d;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                rl9Var = (rl9) chargersActiveOrdersInteractor$handleResponse$1.L$2;
                kotlin.b.b(obj);
                chargersActiveOrdersInteractor$handleResponse$1.L$0 = null;
                chargersActiveOrdersInteractor$handleResponse$1.L$1 = null;
                chargersActiveOrdersInteractor$handleResponse$1.L$2 = null;
                chargersActiveOrdersInteractor$handleResponse$1.label = 2;
                Object c = eVar.c(rl9Var, chargersActiveOrdersInteractor$handleResponse$1);
                return c != coroutineSingletons ? coroutineSingletons : c;
            }
        }
        chargersActiveOrdersInteractor$handleResponse$1 = new ChargersActiveOrdersInteractor$handleResponse$1(this, continuationImpl);
        Object obj2 = chargersActiveOrdersInteractor$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersInteractor$handleResponse$1.label;
        com.yandex.go.chargers.data.e eVar2 = this.d;
        if (i != 0) {
        }
        chargersActiveOrdersInteractor$handleResponse$1.L$0 = null;
        chargersActiveOrdersInteractor$handleResponse$1.L$1 = null;
        chargersActiveOrdersInteractor$handleResponse$1.L$2 = null;
        chargersActiveOrdersInteractor$handleResponse$1.label = 2;
        Object c2 = eVar2.c(rl9Var, chargersActiveOrdersInteractor$handleResponse$1);
        if (c2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(3:21|22|(2:24|25))|18|19))|32|6|7|(0)(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        defpackage.whb1.c(null, r7);
        r2 = com.yandex.go.chargers.analytics.ChargersError.Companion;
        r4 = com.yandex.go.chargers.analytics.ChargersError.ActiveOrderRequest;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = r4;
        r0.L$3 = r2;
        r0.label = 2;
        r7 = r6.b.a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r6 = r2;
        r1 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ChargersActiveOrdersInteractor$requestActiveOrdersResponse$1 chargersActiveOrdersInteractor$requestActiveOrdersResponse$1;
        int i;
        if (continuationImpl instanceof ChargersActiveOrdersInteractor$requestActiveOrdersResponse$1) {
            chargersActiveOrdersInteractor$requestActiveOrdersResponse$1 = (ChargersActiveOrdersInteractor$requestActiveOrdersResponse$1) continuationImpl;
            int i2 = chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.chargers.order.data.e eVar = this.f;
                    chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.label = 1;
                    obj = eVar.a(chargersActiveOrdersInteractor$requestActiveOrdersResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        yx9 yx9Var = (yx9) chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.L$3;
                        ChargersError chargersError = (ChargersError) chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.L$2;
                        kotlin.b.b(obj);
                        yx9.a(yx9Var, chargersError, ((cy9) obj).a(), 4);
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (fmt) obj;
            }
        }
        chargersActiveOrdersInteractor$requestActiveOrdersResponse$1 = new ChargersActiveOrdersInteractor$requestActiveOrdersResponse$1(this, continuationImpl);
        Object obj2 = chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersInteractor$requestActiveOrdersResponse$1.label;
        if (i != 0) {
        }
        return (fmt) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ChargersActiveOrdersInteractor$requestAndHandleActiveOrders$1 chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1;
        int i;
        fmt fmtVar;
        if (continuationImpl instanceof ChargersActiveOrdersInteractor$requestAndHandleActiveOrders$1) {
            chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1 = (ChargersActiveOrdersInteractor$requestAndHandleActiveOrders$1) continuationImpl;
            int i2 = chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.label = 1;
                    obj = b(chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fmt fmtVar2 = (fmt) chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.L$0;
                        kotlin.b.b(obj);
                        return fmtVar2;
                    }
                    kotlin.b.b(obj);
                }
                fmtVar = (fmt) obj;
                if (fmtVar != null) {
                    ChargersActiveOrdersResponse chargersActiveOrdersResponse = (ChargersActiveOrdersResponse) fmtVar.a;
                    String a = fmtVar.e.a("X-YaTraceId");
                    chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.L$0 = fmtVar;
                    chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.label = 2;
                    if (a(chargersActiveOrdersResponse, a, chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1) == obj2) {
                        return obj2;
                    }
                }
                return fmtVar;
            }
        }
        chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1 = new ChargersActiveOrdersInteractor$requestAndHandleActiveOrders$1(this, continuationImpl);
        Object obj3 = chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersInteractor$requestAndHandleActiveOrders$1.label;
        if (i != 0) {
        }
        fmtVar = (fmt) obj3;
        if (fmtVar != null) {
        }
        return fmtVar;
    }
}
