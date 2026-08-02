package com.yandex.go.call_order_fallback.domain;

import android.os.SystemClock;
import com.yandex.go.call_order_fallback.experiments.CallOrderFallbackExperiment;
import defpackage.c2t;
import defpackage.d6z;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.hay0;
import defpackage.jj7;
import defpackage.jst;
import defpackage.kp50;
import defpackage.lj7;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tt2;
import defpackage.xby;
import defpackage.z1t;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.call_order_fallback.experiments.b a;
    public final hay0 b;
    public final tt2 c;

    public c(com.yandex.go.call_order_fallback.experiments.b bVar, hay0 hay0Var, tt2 tt2Var) {
        this.a = bVar;
        this.b = hay0Var;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, jj7 jj7Var, c2t c2tVar, ContinuationImpl continuationImpl) {
        CallOrderFallbackInteractor$applyState$1 callOrderFallbackInteractor$applyState$1;
        int i;
        e3n e3nVar;
        Long l;
        Long l2;
        CallOrderFallbackExperiment callOrderFallbackExperiment;
        Integer num;
        cVar.getClass();
        if (continuationImpl instanceof CallOrderFallbackInteractor$applyState$1) {
            callOrderFallbackInteractor$applyState$1 = (CallOrderFallbackInteractor$applyState$1) continuationImpl;
            int i2 = callOrderFallbackInteractor$applyState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callOrderFallbackInteractor$applyState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callOrderFallbackInteractor$applyState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callOrderFallbackInteractor$applyState$1.label;
                e3nVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (c2tVar instanceof z1t) {
                        Long l3 = jj7Var.c;
                        l = new Long(l3 != null ? l3.longValue() : SystemClock.elapsedRealtime());
                    } else {
                        l = null;
                    }
                    e3n e3nVar2 = jj7Var.b;
                    if (e3nVar2 != null) {
                        e3nVar = e3nVar2;
                        jj7Var.getClass();
                        return new jj7(c2tVar, e3nVar, l);
                    }
                    com.yandex.go.call_order_fallback.experiments.b bVar = cVar.a;
                    callOrderFallbackInteractor$applyState$1.L$0 = null;
                    callOrderFallbackInteractor$applyState$1.L$1 = null;
                    callOrderFallbackInteractor$applyState$1.L$2 = l;
                    callOrderFallbackInteractor$applyState$1.L$3 = jj7Var;
                    callOrderFallbackInteractor$applyState$1.L$4 = c2tVar;
                    callOrderFallbackInteractor$applyState$1.label = 1;
                    Object a = bVar.a(callOrderFallbackInteractor$applyState$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Long l4 = l;
                    obj = a;
                    l2 = l4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c2tVar = (c2t) callOrderFallbackInteractor$applyState$1.L$4;
                    jj7Var = (jj7) callOrderFallbackInteractor$applyState$1.L$3;
                    l2 = (Long) callOrderFallbackInteractor$applyState$1.L$2;
                    kotlin.b.b(obj);
                }
                callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj;
                if (callOrderFallbackExperiment != null && (num = callOrderFallbackExperiment.h) != null) {
                    o430 o430Var = e3n.b;
                    e3nVar = new e3n(kp50.U(num.intValue(), DurationUnit.SECONDS));
                }
                l = l2;
                jj7Var.getClass();
                return new jj7(c2tVar, e3nVar, l);
            }
        }
        callOrderFallbackInteractor$applyState$1 = new CallOrderFallbackInteractor$applyState$1(cVar, continuationImpl);
        Object obj2 = callOrderFallbackInteractor$applyState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callOrderFallbackInteractor$applyState$1.label;
        e3nVar = null;
        if (i != 0) {
        }
        callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj2;
        if (callOrderFallbackExperiment != null) {
            o430 o430Var2 = e3n.b;
            e3nVar = new e3n(kp50.U(num.intValue(), DurationUnit.SECONDS));
        }
        l = l2;
        jj7Var.getClass();
        return new jj7(c2tVar, e3nVar, l);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, ContinuationImpl continuationImpl) {
        CallOrderFallbackInteractor$payload$1 callOrderFallbackInteractor$payload$1;
        int i;
        CallOrderFallbackExperiment callOrderFallbackExperiment;
        cVar.getClass();
        if (continuationImpl instanceof CallOrderFallbackInteractor$payload$1) {
            callOrderFallbackInteractor$payload$1 = (CallOrderFallbackInteractor$payload$1) continuationImpl;
            int i2 = callOrderFallbackInteractor$payload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callOrderFallbackInteractor$payload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = callOrderFallbackInteractor$payload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callOrderFallbackInteractor$payload$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.call_order_fallback.experiments.b bVar = cVar.a;
                    callOrderFallbackInteractor$payload$1.label = 1;
                    obj = bVar.a(callOrderFallbackInteractor$payload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj;
                if (callOrderFallbackExperiment != null) {
                    Map map = callOrderFallbackExperiment.c;
                    String str = (String) map.get(callOrderFallbackExperiment.d);
                    if (str == null) {
                        str = "";
                    }
                    String str2 = callOrderFallbackExperiment.e;
                    String Y = str2 != null ? d6z.Y(callOrderFallbackExperiment, str2) : null;
                    String str3 = (String) map.get(callOrderFallbackExperiment.f);
                    String str4 = str3 != null ? str3 : "";
                    String str5 = callOrderFallbackExperiment.g;
                    lj7 lj7Var = new lj7(str, Y, str4, str5);
                    String[] strArr = {str, str4, str5};
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 3) {
                            break;
                        }
                        if (evu0.J(strArr[i3])) {
                            z = false;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        xby.l(jst.e, "CallOrderFallbackInteractor", null, null, "payload is not valid: " + lj7Var, 6);
                    }
                    if (z) {
                        return lj7Var;
                    }
                }
                return null;
            }
        }
        callOrderFallbackInteractor$payload$1 = new CallOrderFallbackInteractor$payload$1(cVar, continuationImpl);
        Object obj2 = callOrderFallbackInteractor$payload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callOrderFallbackInteractor$payload$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        callOrderFallbackExperiment = (CallOrderFallbackExperiment) obj2;
        if (callOrderFallbackExperiment != null) {
        }
        return null;
    }
}
