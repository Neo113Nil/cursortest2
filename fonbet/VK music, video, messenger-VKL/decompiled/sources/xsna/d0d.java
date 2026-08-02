package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ClipInternalStateRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class d0d implements b0d {
    public final io.reactivex.rxjava3.subjects.f<e0d> a = new io.reactivex.rxjava3.subjects.f<>();
    public final ConcurrentHashMap<String, a0d> b = new ConcurrentHashMap<>();

    @Override // xsna.b0d
    public final io.reactivex.rxjava3.core.q<a0d> a(String str) {
        y34 y34Var = new y34(new c0d(str, 0), 11);
        io.reactivex.rxjava3.subjects.f<e0d> fVar = this.a;
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, y34Var).D(new b00(new defpackage.b0(7, this, str), 11)).U(new lr(new sd4(8), 10));
        a0d remove = this.b.remove(str);
        return io.reactivex.rxjava3.core.q.q((remove != null ? io.reactivex.rxjava3.core.k.i(remove) : io.reactivex.rxjava3.internal.operators.maybe.i.b).r(), U);
    }

    @Override // xsna.b0d
    public final void b(e0d e0dVar) {
        this.b.put(e0dVar.a, e0dVar.b);
        this.a.onNext(e0dVar);
    }
}
