package xsna;

import xsna.uph0;

/* compiled from: DefaultSearchDatabaseItemActionsDelegate.kt */
/* loaded from: classes5.dex */
public final class cml<Item> implements fph0<Item> {
    public final io.reactivex.rxjava3.subjects.f<uph0<Item>> a = new io.reactivex.rxjava3.subjects.f<>();

    @Override // xsna.fph0
    public final void a(Item item) {
        this.a.onNext(new uph0.a(item));
    }

    @Override // xsna.fph0
    public final void b() {
        this.a.onNext(new uph0.a(null));
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends nph0<Item>> d() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends uph0<Item>> e() {
        io.reactivex.rxjava3.subjects.f<uph0<Item>> fVar = this.a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }

    @Override // xsna.fph0
    public final void c(cph0 cph0Var) {
    }
}
