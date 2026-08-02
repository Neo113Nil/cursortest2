package xsna;

import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: RxMviTaskExecutor.kt */
/* loaded from: classes3.dex */
public abstract class evg0<State extends lm50, TaskId extends on50, InTask extends hn50<TaskId>, OutTask extends hn50<TaskId>, Patch extends yl50, Event extends pk50> extends dl50<State, TaskId, InTask, OutTask, yvg0, Patch, Event> implements awg0 {
    public final jm50 d;
    public final bpn0 e;

    public evg0(jm50 jm50Var, nn50<State, TaskId, OutTask, Patch, Event> nn50Var) {
        super(nn50Var);
        this.d = jm50Var;
        this.e = new bpn0(new r010(this, 29));
    }

    @Override // xsna.awg0
    public final zvg0 g(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2) {
        n().getClass();
        final long d = pn50.d();
        io.reactivex.rxjava3.functions.a aVar = new io.reactivex.rxjava3.functions.a() { // from class: xsna.dvg0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                evg0.this.n().c(d);
            }
        };
        xVar.getClass();
        return new zvg0(d, new io.reactivex.rxjava3.internal.operators.single.j(xVar, aVar).subscribe(fVar2, fVar));
    }

    @Override // xsna.awg0
    public final zvg0 h(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar2) {
        n().getClass();
        final long d = pn50.d();
        io.reactivex.rxjava3.functions.a aVar3 = new io.reactivex.rxjava3.functions.a() { // from class: xsna.cvg0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                evg0.this.n().c(d);
            }
        };
        aVar.getClass();
        return new zvg0(d, new io.reactivex.rxjava3.internal.operators.completable.h(aVar, aVar3).subscribe(aVar2, fVar));
    }

    @Override // xsna.dl50, xsna.mn50
    public final pn50<TaskId, InTask, yvg0> n() {
        return (pn50) this.e.getValue();
    }

    @Override // xsna.awg0
    public final zvg0 q(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.f fVar2) {
        n().getClass();
        final long d = pn50.d();
        io.reactivex.rxjava3.functions.a aVar2 = new io.reactivex.rxjava3.functions.a() { // from class: xsna.bvg0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                evg0.this.n().c(d);
            }
        };
        qVar.getClass();
        return new zvg0(d, new io.reactivex.rxjava3.internal.operators.observable.a0(qVar, aVar2).subscribe(fVar2, fVar, aVar));
    }

    @Override // xsna.awg0
    public final jm50 r() {
        return this.d;
    }
}
