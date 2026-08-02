package com.yandex.go.taxi.order.jobs;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.y;
import defpackage.a3y0;
import defpackage.e3n;
import defpackage.h6r;
import defpackage.hst;
import defpackage.huy;
import defpackage.iuy;
import defpackage.jst;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ooc;
import defpackage.p2y0;
import defpackage.qoi0;
import defpackage.r041;
import defpackage.r85;
import defpackage.t041;
import defpackage.tcc;
import defpackage.vnt;
import defpackage.z121;
import defpackage.zr01;
import defpackage.zy11;
import defpackage.zzf;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.a;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/jobs/UpdateOrderStatusJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UpdateOrderStatusJob extends GoCoroutineJob<h6r> {
    public static final long e;
    public static final /* synthetic */ int f = 0;
    public final a3y0 d;

    static {
        o430 o430Var = e3n.b;
        e = e3n.e(kp50.U(5, DurationUnit.MINUTES));
    }

    public UpdateOrderStatusJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
        this.d = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "UpdateOrderStatusJob");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdateOrderStatusJob$doWork$1 updateOrderStatusJob$doWork$1;
        int i;
        Closeable closeable;
        if (continuationImpl instanceof UpdateOrderStatusJob$doWork$1) {
            updateOrderStatusJob$doWork$1 = (UpdateOrderStatusJob$doWork$1) continuationImpl;
            int i2 = updateOrderStatusJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateOrderStatusJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateOrderStatusJob$doWork$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateOrderStatusJob$doWork$1.label;
                a3y0 a3y0Var = this.d;
                if (i != 0) {
                    b.b(obj);
                    try {
                        h6r h6rVar = (h6r) b();
                        t041 t041Var = (t041) ((zzf) h6rVar).n4.get();
                        long b = r85.b(Collections.unmodifiableMap(getInputData().a));
                        r041 a = t041Var.a(e, "UpdateOrderStatusJobWakeLock");
                        try {
                            updateOrderStatusJob$doWork$1.L$0 = null;
                            updateOrderStatusJob$doWork$1.L$1 = null;
                            updateOrderStatusJob$doWork$1.L$2 = a;
                            updateOrderStatusJob$doWork$1.L$3 = null;
                            updateOrderStatusJob$doWork$1.J$0 = b;
                            updateOrderStatusJob$doWork$1.label = 1;
                            if (c(h6rVar, b, updateOrderStatusJob$doWork$1) == obj2) {
                                return obj2;
                            }
                            closeable = a;
                        } catch (Throwable th) {
                            th = th;
                            closeable = a;
                            throw th;
                        }
                    } catch (Exception e2) {
                        a.k(updateOrderStatusJob$doWork$1.get_context());
                        a3y0Var.b("doWork", e2, new z121(7));
                        return new huy();
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    closeable = (Closeable) updateOrderStatusJob$doWork$1.L$2;
                    try {
                        b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            ooc.g(closeable, th);
                            throw th3;
                        }
                    }
                }
                ooc.g(closeable, null);
                a3y0Var.getClass();
                a3y0.h(new String[]{"doWork"});
                hst hstVar = jst.e;
                return new iuy();
            }
        }
        updateOrderStatusJob$doWork$1 = new UpdateOrderStatusJob$doWork$1(this, continuationImpl);
        Object obj3 = updateOrderStatusJob$doWork$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateOrderStatusJob$doWork$1.label;
        a3y0 a3y0Var2 = this.d;
        if (i != 0) {
        }
        ooc.g(closeable, null);
        a3y0Var2.getClass();
        a3y0.h(new String[]{"doWork"});
        hst hstVar2 = jst.e;
        return new iuy();
    }

    public final Object c(h6r h6rVar, long j, Continuation continuation) {
        zzf zzfVar = (zzf) h6rVar;
        List A = ((e0) ((p2y0) zzfVar.J2.get())).A();
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (((TaxiOrder) obj).l.getA()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return zy11.a;
        }
        y yVar = (y) zzfVar.r6.get();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.d.f(new zr01(17, (TaxiOrder) it.next(), yVar), "updateActiveOrders");
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TaxiOrder) it2.next()).a);
        }
        return yVar.q(j, "UpdateOrderStatusJob", arrayList2, (ContinuationImpl) continuation);
    }
}
