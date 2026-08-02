package xsna;

import java.util.concurrent.atomic.AtomicLong;
import xsna.jm50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: DefaultRxMviInlineTaskExecutor.kt */
/* loaded from: classes3.dex */
public final class sll<State extends lm50, TaskId extends on50, Event extends pk50> extends cl50<Object, Object, yvg0, awg0, Object> implements awg0 {
    public final jm50.a c;
    public final bpn0 d;
    public final nn50<State, TaskId, ll50<TaskId, yvg0, awg0>, jl50<State>, Event> e;

    public sll(nn50 nn50Var) {
        super(nn50Var);
        this.c = jm50.a.a;
        new AtomicLong();
        this.d = new bpn0(new os30(this, 19));
        this.e = nn50Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return (yvg0) ((ll50) hn50Var).a(this);
    }

    @Override // xsna.awg0
    public final zvg0 g(io.reactivex.rxjava3.core.x xVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.f fVar2) {
        n().getClass();
        final long d = pn50.d();
        io.reactivex.rxjava3.functions.a aVar = new io.reactivex.rxjava3.functions.a() { // from class: xsna.yug0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                sll.this.n().c(d);
            }
        };
        xVar.getClass();
        return new zvg0(d, new io.reactivex.rxjava3.internal.operators.single.j(xVar, aVar).subscribe(fVar2, fVar));
    }

    @Override // xsna.awg0
    public final zvg0 h(io.reactivex.rxjava3.core.a aVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar2) {
        n().getClass();
        final long d = pn50.d();
        io.reactivex.rxjava3.functions.a aVar3 = new io.reactivex.rxjava3.functions.a() { // from class: xsna.avg0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                sll.this.n().c(d);
            }
        };
        aVar.getClass();
        return new zvg0(d, new io.reactivex.rxjava3.internal.operators.completable.h(aVar, aVar3).subscribe(aVar2, fVar));
    }

    @Override // xsna.mn50
    public final pn50<Object, ll50<Object, yvg0, awg0>, yvg0> n() {
        return (pn50) this.d.getValue();
    }

    @Override // xsna.awg0
    public final zvg0 q(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.functions.f fVar, io.reactivex.rxjava3.functions.a aVar, io.reactivex.rxjava3.functions.f fVar2) {
        n().getClass();
        final long d = pn50.d();
        io.reactivex.rxjava3.functions.a aVar2 = new io.reactivex.rxjava3.functions.a() { // from class: xsna.zug0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                sll.this.n().c(d);
            }
        };
        qVar.getClass();
        return new zvg0(d, new io.reactivex.rxjava3.internal.operators.observable.a0(qVar, aVar2).subscribe(fVar2, fVar, aVar));
    }

    @Override // xsna.awg0
    public final jm50 r() {
        return this.c;
    }

    @Override // xsna.mn50
    public final void init() {
    }
}
