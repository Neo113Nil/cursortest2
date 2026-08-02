package com.yandex.go.taxi.order.details.v2.analytics.perf;

import android.os.SystemClock;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.mlk0;
import defpackage.nlk0;
import defpackage.tt2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final mlk0 b;
    public final hbp0 c;
    public final r0 d = bvf0.c(new nlk0(null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false));
    public final kotlinx.coroutines.sync.a e = gtq0.a();

    /* JADX WARN: Multi-variable type inference failed */
    public a(tt2 tt2Var, mlk0 mlk0Var) {
        this.a = tt2Var;
        this.b = mlk0Var;
        this.c = new hbp0(new RideCardPerfAnalyticsTracer$scopeDelegate$1(0, tt2Var, tt2.class, "computation", "computation()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public static final void a(a aVar) {
        Object value;
        r0 r0Var = aVar.d;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, nlk0.a((nlk0) value, null, null, 0L, 0L, 0L, 0L, null, null, null, null, null, null, 12287)));
    }

    public final void b(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - j;
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new RideCardPerfAnalyticsTracer$componentCreated$1(this, elapsedRealtime, j2, null), 3);
    }

    public final void c(RideCardPresentationType rideCardPresentationType, String str) {
        nlk0 nlk0Var = (nlk0) this.d.getValue();
        if (nlk0Var.n || nlk0Var.m) {
            return;
        }
        hbp0.e(this.c, null, null, new RideCardPerfAnalyticsTracer$stateCompositionStarted$1$1(this, str, rideCardPresentationType, SystemClock.elapsedRealtime(), null), 3);
    }

    public final void d(RideCardState$ProcessingStep rideCardState$ProcessingStep, RideCardState$ProcessingStep rideCardState$ProcessingStep2, int i) {
        nlk0 nlk0Var = (nlk0) this.d.getValue();
        if (nlk0Var.n || nlk0Var.m) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (rideCardState$ProcessingStep2.compareTo(rideCardState$ProcessingStep) <= 0) {
            return;
        }
        hbp0.e(this.c, null, null, new RideCardPerfAnalyticsTracer$stateUpdate$1$1(this, rideCardState$ProcessingStep2, elapsedRealtime, i, null), 3);
    }

    public final void e(RideCardState$ProcessingStep rideCardState$ProcessingStep, int i) {
        nlk0 nlk0Var = (nlk0) this.d.getValue();
        if (nlk0Var.n || nlk0Var.m) {
            return;
        }
        hbp0.e(this.c, null, null, new RideCardPerfAnalyticsTracer$submitListEnded$1$1(this, rideCardState$ProcessingStep, SystemClock.elapsedRealtime(), i, null), 3);
    }

    public final void f(RideCardState$ProcessingStep rideCardState$ProcessingStep, int i) {
        nlk0 nlk0Var = (nlk0) this.d.getValue();
        if (nlk0Var.n || nlk0Var.m) {
            return;
        }
        hbp0.e(this.c, null, null, new RideCardPerfAnalyticsTracer$submitListStarted$1$1(this, rideCardState$ProcessingStep, SystemClock.elapsedRealtime(), i, null), 3);
    }

    public final void g() {
        nlk0 nlk0Var = (nlk0) this.d.getValue();
        if (nlk0Var.n || nlk0Var.m) {
            return;
        }
        hbp0.e(this.c, null, null, new RideCardPerfAnalyticsTracer$viewAttached$1$1(this, SystemClock.elapsedRealtime(), null), 3);
    }

    public final void h() {
        nlk0 nlk0Var = (nlk0) this.d.getValue();
        boolean z = nlk0Var.n;
        hbp0 hbp0Var = this.c;
        if (!z || nlk0Var.m) {
            hbp0.e(hbp0Var, null, null, new RideCardPerfAnalyticsTracer$viewDetached$1(nlk0Var, this, null), 3);
        } else {
            hbp0Var.b();
        }
    }
}
