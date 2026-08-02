package com.yandex.go.taxi.order.network;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.go.taxi.order.network.exception.DifferentOrderIdException;
import com.yandex.go.taxi.order.network.exception.ErrorDuringCommitButOrderCreatedException;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.a3y0;
import defpackage.a6y0;
import defpackage.cmt;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.fmt;
import defpackage.g6y0;
import defpackage.i6y0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.p2y0;
import defpackage.ro70;
import defpackage.s630;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.net.taxi.TaxiApi;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes14.dex */
public final class c {
    public final TaxiApi a;
    public final g6y0 b;
    public final p2y0 c;
    public final h d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderSender");

    public c(TaxiApi taxiApi, g6y0 g6y0Var, p2y0 p2y0Var, h hVar) {
        this.a = taxiApi;
        this.b = g6y0Var;
        this.c = p2y0Var;
        this.d = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[Catch: all -> 0x0038, CancellationException -> 0x00db, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:12:0x0034, B:13:0x007e, B:15:0x0086, B:16:0x00a0, B:18:0x00ae, B:21:0x00b3, B:22:0x00b8, B:37:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[Catch: all -> 0x0038, CancellationException -> 0x00db, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:12:0x0034, B:13:0x007e, B:15:0x0086, B:16:0x00a0, B:18:0x00ae, B:21:0x00b3, B:22:0x00b8, B:37:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[Catch: all -> 0x0038, CancellationException -> 0x00db, TryCatch #0 {CancellationException -> 0x00db, blocks: (B:12:0x0034, B:13:0x007e, B:15:0x0086, B:16:0x00a0, B:18:0x00ae, B:21:0x00b3, B:22:0x00b8, B:37:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        TaxiOrderCommitSender$orderCommitResponse$1 taxiOrderCommitSender$orderCommitResponse$1;
        int i;
        Throwable th;
        ro70 ro70Var;
        long j;
        TaxiOrder i2;
        fmt fmtVar;
        try {
            if (continuationImpl instanceof TaxiOrderCommitSender$orderCommitResponse$1) {
                taxiOrderCommitSender$orderCommitResponse$1 = (TaxiOrderCommitSender$orderCommitResponse$1) continuationImpl;
                int i3 = taxiOrderCommitSender$orderCommitResponse$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    taxiOrderCommitSender$orderCommitResponse$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = taxiOrderCommitSender$orderCommitResponse$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxiOrderCommitSender$orderCommitResponse$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ro70 ro70Var2 = new ro70(this.d.Hg(), str);
                        try {
                            this.e.f(new oew0(8, ro70Var2), "orderCommit");
                            long a = s630.a();
                            cmt<OrderCommitResponse> a2 = this.a.a(ro70Var2);
                            taxiOrderCommitSender$orderCommitResponse$1.L$0 = null;
                            taxiOrderCommitSender$orderCommitResponse$1.L$1 = ro70Var2;
                            taxiOrderCommitSender$orderCommitResponse$1.L$2 = null;
                            taxiOrderCommitSender$orderCommitResponse$1.Z$0 = z;
                            taxiOrderCommitSender$orderCommitResponse$1.J$0 = a;
                            taxiOrderCommitSender$orderCommitResponse$1.label = 1;
                            Object b = ru.yandex.taxi.network.api.a.b(a2, null, taxiOrderCommitSender$orderCommitResponse$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = b;
                            ro70Var = ro70Var2;
                            j = a;
                        } catch (Throwable th2) {
                            th = th2;
                            ro70Var = ro70Var2;
                            i2 = ((e0) this.c).i(ro70Var.b);
                            if (i2 != null) {
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = taxiOrderCommitSender$orderCommitResponse$1.J$0;
                        z = taxiOrderCommitSender$orderCommitResponse$1.Z$0;
                        ro70Var = (ro70) taxiOrderCommitSender$orderCommitResponse$1.L$1;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            i2 = ((e0) this.c).i(ro70Var.b);
                            if (i2 != null || i2.I() || (th instanceof DifferentOrderIdException)) {
                                throw th;
                            }
                            throw new ErrorDuringCommitButOrderCreatedException(i2);
                        }
                    }
                    fmtVar = (fmt) obj;
                    long a3 = f8z0.a(j);
                    if (z) {
                        ((i6y0) this.b).b(new a6y0(TaxiOrderSessionCheckpoint.ORDERCOMMIT, e3n.e(a3), fmtVar.e.a("X-YaTraceId")));
                    }
                    if (jl40.l(((OrderCommitResponse) fmtVar.a).a, ro70Var.b)) {
                        throw new DifferentOrderIdException();
                    }
                    return (OrderCommitResponse) fmtVar.a;
                }
            }
            if (i != 0) {
            }
            fmtVar = (fmt) obj;
            long a32 = f8z0.a(j);
            if (z) {
            }
            if (jl40.l(((OrderCommitResponse) fmtVar.a).a, ro70Var.b)) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        taxiOrderCommitSender$orderCommitResponse$1 = new TaxiOrderCommitSender$orderCommitResponse$1(this, continuationImpl);
        Object obj2 = taxiOrderCommitSender$orderCommitResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderCommitSender$orderCommitResponse$1.label;
    }
}
