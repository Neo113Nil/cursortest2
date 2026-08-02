package com.yandex.go.intentprocessor;

import android.net.Uri;
import defpackage.a611;
import defpackage.evu0;
import defpackage.jst;
import defpackage.jzz;
import defpackage.k4l0;
import defpackage.nq30;
import defpackage.ny61;
import defpackage.o4l0;
import defpackage.pj40;
import defpackage.s7z;
import defpackage.t7z;
import defpackage.tq30;
import defpackage.w411;
import defpackage.xby;
import defpackage.z7w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class q implements z7w {
    public final jzz a;
    public final ru.yandex.taxi.masstransit.deeplink.g b;
    public final tq30 c;

    public q(jzz jzzVar, ru.yandex.taxi.masstransit.deeplink.g gVar, tq30 tq30Var) {
        this.a = jzzVar;
        this.b = gVar;
        this.c = tq30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[Catch: all -> 0x0038, CancellationException -> 0x00ba, TryCatch #2 {CancellationException -> 0x00ba, all -> 0x0038, blocks: (B:11:0x0034, B:12:0x006f, B:15:0x009c, B:19:0x007a, B:21:0x0088, B:23:0x0097, B:25:0x0090, B:35:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.z7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t7z t7zVar, Continuation continuation) {
        TransportRoutesIntentProcessor$process$1 transportRoutesIntentProcessor$process$1;
        int i;
        k4l0 k4l0Var;
        s7z s7zVar;
        w411 w411Var;
        Uri uri;
        try {
            if (continuation instanceof TransportRoutesIntentProcessor$process$1) {
                transportRoutesIntentProcessor$process$1 = (TransportRoutesIntentProcessor$process$1) continuation;
                int i2 = transportRoutesIntentProcessor$process$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    transportRoutesIntentProcessor$process$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = transportRoutesIntentProcessor$process$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transportRoutesIntentProcessor$process$1.label;
                    k4l0Var = k4l0.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        s7z s7zVar2 = t7zVar instanceof s7z ? (s7z) t7zVar : null;
                        if (s7zVar2 == null) {
                            return k4l0Var;
                        }
                        w411 j = this.a.j(s7zVar2.a.a);
                        ru.yandex.taxi.masstransit.deeplink.g gVar = this.b;
                        transportRoutesIntentProcessor$process$1.L$0 = null;
                        transportRoutesIntentProcessor$process$1.L$1 = s7zVar2;
                        transportRoutesIntentProcessor$process$1.L$2 = j;
                        transportRoutesIntentProcessor$process$1.label = 1;
                        Object a = gVar.a(j, transportRoutesIntentProcessor$process$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        s7zVar = s7zVar2;
                        w411Var = j;
                        obj = a;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        w411Var = (w411) transportRoutesIntentProcessor$process$1.L$2;
                        s7zVar = (s7z) transportRoutesIntentProcessor$process$1.L$1;
                        kotlin.b.b(obj);
                    }
                    a611 a611Var = (a611) obj;
                    uri = s7zVar.a.a;
                    pj40 pj40Var = pj40.c;
                    if (uri == null) {
                        String queryParameter = uri.getQueryParameter("utm_source");
                        String queryParameter2 = uri.getQueryParameter("utm_medium");
                        if ((queryParameter != null && !evu0.J(queryParameter)) || (queryParameter2 != null && !evu0.J(queryParameter2))) {
                            pj40Var = new pj40(queryParameter, queryParameter2);
                        }
                    }
                    this.c.a(new nq30(pj40Var));
                    return new o4l0(a611Var, w411Var.c, pj40Var);
                }
            }
            if (i != 0) {
            }
            a611 a611Var2 = (a611) obj;
            uri = s7zVar.a.a;
            pj40 pj40Var2 = pj40.c;
            if (uri == null) {
            }
            this.c.a(new nq30(pj40Var2));
            return new o4l0(a611Var2, w411Var.c, pj40Var2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "INTENT_PROCESSOR_ERROR:TRANSPORT", null, th, "Error fetching data from transport deeplink", 2);
            return k4l0Var;
        }
        transportRoutesIntentProcessor$process$1 = new TransportRoutesIntentProcessor$process$1(this, (ContinuationImpl) continuation);
        Object obj2 = transportRoutesIntentProcessor$process$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportRoutesIntentProcessor$process$1.label;
        k4l0Var = k4l0.a;
    }
}
