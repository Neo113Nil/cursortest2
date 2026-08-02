package xsna;

import xsna.cse;
import xsna.hg1;

/* compiled from: ClipsPlaylistsEventsSourceImpl.kt */
/* loaded from: classes16.dex */
public final class hse implements cse {
    public final io.reactivex.rxjava3.subjects.f<cse.a> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.cse
    public final void a(cse.a aVar) {
        this.a.onNext(aVar);
    }

    @Override // xsna.cse
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b() {
        hg1.p0 p0Var = new hg1.p0(dse.b);
        io.reactivex.rxjava3.subjects.f<cse.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, p0Var).U(new hg1.o0(ese.c));
    }

    @Override // xsna.cse
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c() {
        hg1.p0 p0Var = new hg1.p0(fse.c);
        io.reactivex.rxjava3.subjects.f<cse.a> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, p0Var).U(new hg1.o0(gse.c));
    }
}
