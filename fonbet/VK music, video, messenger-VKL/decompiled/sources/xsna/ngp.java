package xsna;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.InstrumentValueType;

/* compiled from: EmptyMetricStorage.java */
/* loaded from: classes8.dex */
public final class ngp implements gpn0 {
    public static final ngp c = new ngp();
    public final mn5 b;

    public ngp() {
        p8v a = ttt0.a();
        this.b = zk20.a(new fo5((x71) a.c, (u670) a.d, a.b), !p2l.a ? f470.INSTANCE : new ook0(Thread.currentThread().getStackTrace()), new ym5("", "", "", InstrumentType.OBSERVABLE_GAUGE, InstrumentValueType.DOUBLE, x41.a));
    }

    @Override // xsna.fl20
    public final yk20 b(gag0 gag0Var, q8x q8xVar, long j, long j2) {
        return mgp.a;
    }

    @Override // xsna.fl20
    public final zk20 d() {
        return this.b;
    }

    @Override // xsna.n3y0
    public final void a(long j, q94 q94Var, wmj wmjVar) {
    }

    @Override // xsna.n3y0
    public final void c(double d, q94 q94Var, wmj wmjVar) {
    }
}
