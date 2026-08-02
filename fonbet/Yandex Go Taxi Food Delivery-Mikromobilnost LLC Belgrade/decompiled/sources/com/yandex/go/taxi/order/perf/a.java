package com.yandex.go.taxi.order.perf;

import android.os.SystemClock;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.a3y0;
import defpackage.g6y0;
import defpackage.hst;
import defpackage.i6y0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.sls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final g6y0 a;
    public final a3y0 b = new a3y0(TaxiOrderLogGroup.PERF.getTag(), "PerfSessionWatchdog");

    public a(g6y0 g6y0Var) {
        this.a = g6y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, sls slsVar, ContinuationImpl continuationImpl) {
        TaxiOrderPerfSessionWatchdog$awaitCheckpoint$1 taxiOrderPerfSessionWatchdog$awaitCheckpoint$1;
        int i;
        if (continuationImpl instanceof TaxiOrderPerfSessionWatchdog$awaitCheckpoint$1) {
            taxiOrderPerfSessionWatchdog$awaitCheckpoint$1 = (TaxiOrderPerfSessionWatchdog$awaitCheckpoint$1) continuationImpl;
            int i2 = taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.label;
                zy11 zy11Var = zy11.a;
                a3y0 a3y0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    if (taxiOrderSessionCheckpoint == null) {
                        a3y0Var.getClass();
                        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                        hst hstVar = jst.e;
                        return zy11Var;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    a3y0Var.getClass();
                    a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                    hst hstVar2 = jst.e;
                    r0 r0Var = ((i6y0) this.a).d;
                    TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4 taxiOrderPerfSessionWatchdog$awaitCheckpoint$4 = new TaxiOrderPerfSessionWatchdog$awaitCheckpoint$4(taxiOrderSessionCheckpoint, null);
                    taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.L$0 = taxiOrderSessionCheckpoint;
                    taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.L$1 = slsVar;
                    taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.L$2 = null;
                    taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.J$0 = elapsedRealtime;
                    taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.label = 1;
                    if (e.x(r0Var, taxiOrderPerfSessionWatchdog$awaitCheckpoint$4, taxiOrderPerfSessionWatchdog$awaitCheckpoint$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                a3y0Var.getClass();
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                hst hstVar3 = jst.e;
                return zy11Var;
            }
        }
        taxiOrderPerfSessionWatchdog$awaitCheckpoint$1 = new TaxiOrderPerfSessionWatchdog$awaitCheckpoint$1(this, continuationImpl);
        Object obj2 = taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderPerfSessionWatchdog$awaitCheckpoint$1.label;
        zy11 zy11Var2 = zy11.a;
        a3y0 a3y0Var2 = this.b;
        if (i != 0) {
        }
        a3y0Var2.getClass();
        a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
        hst hstVar32 = jst.e;
        return zy11Var2;
    }
}
