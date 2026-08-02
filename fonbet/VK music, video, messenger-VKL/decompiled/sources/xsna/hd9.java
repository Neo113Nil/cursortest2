package xsna;

import xsna.dd9;

/* compiled from: CallsQueueUserIdDelegate.kt */
/* loaded from: classes11.dex */
public final class hd9 {
    public final nd9 a;
    public final cd9 b;
    public final io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public final io.reactivex.rxjava3.subjects.d<dd9.a> e;

    public hd9(b25 b25Var, cd9 cd9Var, mui0 mui0Var) {
        final nd9 nd9Var = new nd9(b25Var, mui0Var);
        this.a = nd9Var;
        this.b = cd9Var;
        this.e = io.reactivex.rxjava3.subjects.d.N0();
        this.c = io.reactivex.rxjava3.core.q.m(new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.kd9
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [xsna.ayi0, xsna.ld9] */
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(final io.reactivex.rxjava3.core.r rVar) {
                final nd9 nd9Var2 = nd9.this;
                rVar.onNext(nd9Var2.a.g());
                final ?? r1 = new ayi0() { // from class: xsna.ld9
                    @Override // xsna.ayi0
                    public final void a(uxi0 uxi0Var) {
                        io.reactivex.rxjava3.core.r.this.onNext(nd9Var2.a.g());
                    }
                };
                nd9Var2.b.f(r1);
                rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.md9
                    @Override // io.reactivex.rxjava3.functions.e
                    public final void cancel() {
                        nd9.this.b.k(r1);
                    }
                });
            }
        }).a0(asu0.a.d()), nd9Var.a.m(true), new jd9(new bs3(nd9Var, 1))).a0(asu0.a.d()).subscribe(new gd9(new fd9(this, 0), 0));
    }
}
