package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.api.OrderApi;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.a6y0;
import defpackage.a880;
import defpackage.cmt;
import defpackage.e3n;
import defpackage.ep21;
import defpackage.f8z0;
import defpackage.fmt;
import defpackage.g6y0;
import defpackage.h3y;
import defpackage.i6y0;
import defpackage.ky2;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.r1e0;
import defpackage.s630;
import defpackage.s8o;
import defpackage.v780;
import defpackage.vng;
import defpackage.wwg;
import defpackage.ym91;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class r {
    public final OrderApi a;
    public final ky2 b;
    public final a880 c;
    public final po21 d;
    public final h3y e;

    public r(OrderApi orderApi, ky2 ky2Var, a880 a880Var, po21 po21Var, h3y h3yVar) {
        this.a = orderApi;
        this.b = ky2Var;
        this.c = a880Var;
        this.d = po21Var;
        this.e = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae A[Catch: all -> 0x0035, CancellationException -> 0x0104, TryCatch #2 {CancellationException -> 0x0104, all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0098, B:15:0x00ae, B:16:0x00c4, B:19:0x00d2, B:20:0x00d7, B:24:0x00d5, B:28:0x004c, B:29:0x0072, B:31:0x007a, B:32:0x0080, B:38:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2 A[Catch: all -> 0x0035, CancellationException -> 0x0104, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0104, all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0098, B:15:0x00ae, B:16:0x00c4, B:19:0x00d2, B:20:0x00d7, B:24:0x00d5, B:28:0x004c, B:29:0x0072, B:31:0x007a, B:32:0x0080, B:38:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5 A[Catch: all -> 0x0035, CancellationException -> 0x0104, TryCatch #2 {CancellationException -> 0x0104, all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0098, B:15:0x00ae, B:16:0x00c4, B:19:0x00d2, B:20:0x00d7, B:24:0x00d5, B:28:0x004c, B:29:0x0072, B:31:0x007a, B:32:0x0080, B:38:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0035, CancellationException -> 0x0104, TryCatch #2 {CancellationException -> 0x0104, all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0098, B:15:0x00ae, B:16:0x00c4, B:19:0x00d2, B:20:0x00d7, B:24:0x00d5, B:28:0x004c, B:29:0x0072, B:31:0x007a, B:32:0x0080, B:38:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(OrderStatusParam orderStatusParam, ContinuationImpl continuationImpl) {
        LoadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1 loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        long a;
        OrderStatusParam orderStatusParam2;
        OrderApi orderApi;
        long j;
        i6y0 i6y0Var;
        boolean z;
        try {
            if (continuationImpl instanceof LoadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1) {
                loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1 = (LoadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1) continuationImpl;
                int i2 = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label = i2 - Integer.MIN_VALUE;
                    obj = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a = s630.a();
                        OrderApi orderApi2 = this.a;
                        po21 po21Var = this.d;
                        loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$0 = orderStatusParam;
                        loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$1 = null;
                        loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$2 = orderApi2;
                        loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.J$0 = a;
                        loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label = 1;
                        Object m = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).m(loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1);
                        if (m == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        orderStatusParam2 = orderStatusParam;
                        orderApi = orderApi2;
                        obj = m;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.J$0;
                            kotlin.b.b(obj);
                            fmt fmtVar = (fmt) obj;
                            long a2 = f8z0.a(j);
                            i6y0Var = (i6y0) ((g6y0) this.e.get());
                            if (i6y0Var.a()) {
                                i6y0Var.b(new a6y0(TaxiOrderSessionCheckpoint.TAXIONTHEWAY, e3n.e(a2), fmtVar.e.a("X-YaTraceId")));
                            }
                            r1e0 l = wwg.l(fmtVar);
                            z = this.b.a;
                            a880 a880Var = this.c;
                            Long l2 = l.b;
                            if (z) {
                                a880Var.b = l2;
                            } else {
                                a880Var.a = l2;
                            }
                            return new Pair(fmtVar.a, fmtVar.e);
                        }
                        a = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.J$0;
                        orderApi = (OrderApi) loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$2;
                        orderStatusParam2 = (OrderStatusParam) loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$0;
                        kotlin.b.b(obj);
                    }
                    mo21 A = vng.A((ep21) obj);
                    cmt<v780> a3 = orderApi.a(A == null ? vng.e(A) : null, orderStatusParam2, ym91.a);
                    loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$0 = null;
                    loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$1 = null;
                    loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$2 = null;
                    loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.J$0 = a;
                    loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.b(a3, null, loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1);
                    if (obj != coroutineSingletons) {
                        j = a;
                        fmt fmtVar2 = (fmt) obj;
                        long a22 = f8z0.a(j);
                        i6y0Var = (i6y0) ((g6y0) this.e.get());
                        if (i6y0Var.a()) {
                        }
                        r1e0 l3 = wwg.l(fmtVar2);
                        z = this.b.a;
                        a880 a880Var2 = this.c;
                        Long l22 = l3.b;
                        if (z) {
                        }
                        return new Pair(fmtVar2.a, fmtVar2.e);
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            mo21 A2 = vng.A((ep21) obj);
            cmt<v780> a32 = orderApi.a(A2 == null ? vng.e(A2) : null, orderStatusParam2, ym91.a);
            loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$0 = null;
            loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$1 = null;
            loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.L$2 = null;
            loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.J$0 = a;
            loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.b(a32, null, loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Long I = s8o.I(th);
            if (I == null) {
                throw th;
            }
            long longValue = I.longValue();
            boolean z2 = this.b.a;
            a880 a880Var3 = this.c;
            if (z2) {
                a880Var3.a = new Long(longValue);
            } else {
                a880Var3.b = new Long(longValue);
            }
            throw th;
        }
        loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1 = new LoadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1(this, continuationImpl);
        obj = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadTaxiOnTheWayInteractor$loadTaxiOnTheWay$1.label;
    }
}
