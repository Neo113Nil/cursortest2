package com.yandex.fintechsdk.core.analytics.impl.internal.rum;

import defpackage.d5j0;
import defpackage.dvw;
import defpackage.g6j0;
import defpackage.j18;
import defpackage.jkl0;
import defpackage.kde;
import defpackage.keo;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.t4j0;
import defpackage.wdz;
import defpackage.wg10;
import defpackage.wms;
import defpackage.zy11;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final class a {
    public final OkHttpClient a = new OkHttpClient(new OkHttpClient.a());
    public final jkl0 b = new jkl0();

    public a(wdz wdzVar) {
    }

    public final Object a(String str, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h("https://pay.yandex.ru/cl/click");
        t4j0Var.c.a("Content-Type", "text/plain; charset=utf-8");
        t4j0Var.c.a("Connection", "keep-alive");
        int i = m5j0.a;
        Regex regex = wg10.e;
        t4j0Var.e("POST", wms.a(str, qje.o("text/plain; charset=utf-8")));
        nci0 nci0Var = (nci0) this.a.newCall(new d5j0(t4j0Var));
        nci0Var.I(new kde(j18Var, 5));
        j18Var.w(new g6j0(nci0Var, 1));
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21))|19))|29|6|7|(0)(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (a(r8, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(keo keoVar, Map map, ContinuationImpl continuationImpl) {
        RumReporter$sendEvent$1 rumReporter$sendEvent$1;
        int i;
        if (continuationImpl instanceof RumReporter$sendEvent$1) {
            rumReporter$sendEvent$1 = (RumReporter$sendEvent$1) continuationImpl;
            int i2 = rumReporter$sendEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rumReporter$sendEvent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rumReporter$sendEvent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rumReporter$sendEvent$1.label;
                jkl0 jkl0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    String str = keoVar.a;
                    jkl0Var.getClass();
                    String a = jkl0.a(str, "rum_events", map);
                    rumReporter$sendEvent$1.L$0 = keoVar;
                    rumReporter$sendEvent$1.L$1 = map;
                    rumReporter$sendEvent$1.label = 1;
                    if (a(a, rumReporter$sendEvent$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) rumReporter$sendEvent$1.L$1;
                    keoVar = (keo) rumReporter$sendEvent$1.L$0;
                    b.b(obj);
                }
                String str2 = keoVar.a;
                jkl0Var.getClass();
                String a2 = jkl0.a(str2, "trust_front", map);
                rumReporter$sendEvent$1.L$0 = null;
                rumReporter$sendEvent$1.L$1 = null;
                rumReporter$sendEvent$1.label = 2;
            }
        }
        rumReporter$sendEvent$1 = new RumReporter$sendEvent$1(this, continuationImpl);
        Object obj3 = rumReporter$sendEvent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rumReporter$sendEvent$1.label;
        jkl0 jkl0Var2 = this.b;
        if (i != 0) {
        }
        String str22 = keoVar.a;
        jkl0Var2.getClass();
        String a22 = jkl0.a(str22, "trust_front", map);
        rumReporter$sendEvent$1.L$0 = null;
        rumReporter$sendEvent$1.L$1 = null;
        rumReporter$sendEvent$1.label = 2;
    }
}
