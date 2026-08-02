package xsna;

import com.vk.search.params.api.City;
import xsna.dyz;

/* compiled from: LocationSearchDatabaseItemActionsDelegate.kt */
/* loaded from: classes5.dex */
public final class lyz implements fph0<City> {
    public final myz a;

    public lyz(myz myzVar) {
        this.a = myzVar;
    }

    @Override // xsna.fph0
    public final void a(City city) {
        this.a.C(new dyz.b(city));
    }

    @Override // xsna.fph0
    public final void b() {
        this.a.C(new dyz.b(null));
    }

    @Override // xsna.fph0
    public final void c(cph0 cph0Var) {
        this.a.C(dyz.e.b);
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends nph0<City>> d() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new pa(this, 25));
    }

    @Override // xsna.fuq
    public final io.reactivex.rxjava3.core.q<? extends uph0<City>> e() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
