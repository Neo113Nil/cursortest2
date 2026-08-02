package xsna;

import com.vk.search.params.api.City;

/* compiled from: CompositeLocationSearchDatabaseFeature.kt */
/* loaded from: classes5.dex */
public final class nti implements lph0<City> {
    public final myz b;
    public final eph0 c;

    public nti(myz myzVar, eph0 eph0Var) {
        this.b = myzVar;
        this.c = eph0Var;
    }

    @Override // xsna.zyw
    public final void A() {
        this.b.A();
        this.c.A();
    }

    @Override // xsna.vk50
    public final void C(bph0[] bph0VarArr) {
        this.c.C(bph0VarArr);
    }

    @Override // xsna.vk50
    public final ao50 g() {
        return (com.vk.search.params.impl.presentation.modal.database.mvi.model.b) this.c.c.g();
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        this.b.onDestroy();
        this.c.onDestroy();
    }

    @Override // xsna.lph0
    public final wj50<uph0<City>> x() {
        return this.c.h;
    }
}
