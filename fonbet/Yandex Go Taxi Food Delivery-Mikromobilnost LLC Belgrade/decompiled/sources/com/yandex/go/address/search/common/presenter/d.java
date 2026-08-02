package com.yandex.go.address.search.common.presenter;

import com.yandex.go.address.models.Address;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import defpackage.caq0;
import defpackage.d6v0;
import defpackage.dgf;
import defpackage.f3o;
import defpackage.fhf;
import defpackage.ftj0;
import defpackage.gbv0;
import defpackage.h4v0;
import defpackage.h51;
import defpackage.ic61;
import defpackage.igf;
import defpackage.itj0;
import defpackage.j61;
import defpackage.jl40;
import defpackage.k56;
import defpackage.kr0;
import defpackage.lcz;
import defpackage.m8t0;
import defpackage.m8v0;
import defpackage.mbv0;
import defpackage.mgf;
import defpackage.msi;
import defpackage.nbv0;
import defpackage.oc60;
import defpackage.oep0;
import defpackage.prj0;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.qoi;
import defpackage.rwp0;
import defpackage.s3o;
import defpackage.tje;
import defpackage.tt2;
import defpackage.v7b0;
import defpackage.v7j0;
import defpackage.w4l0;
import defpackage.w6r;
import defpackage.wb1;
import defpackage.wff;
import defpackage.x9v0;
import defpackage.y46;
import defpackage.yvf0;
import java.util.ArrayList;
import ru.yandex.taxi.analytics.Events$SuggestedCurrentLocation$ScreenType;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public class d extends i {
    public final tt2 A0;
    public final gbv0 B0;
    public final com.yandex.go.taxi.tariffs.interactor.b C0;
    public final w6r D0;
    public pzt0 E0;
    public pzt0 F0;
    public pzt0 G0;
    public pzt0 H0;
    public boolean I0;
    public final wff k0;
    public final lcz l0;
    public final com.yandex.go.zone.interactors.b m0;
    public final caq0 n0;
    public final w4l0 o0;
    public final v7j0 p0;
    public final ru.yandex.taxi.address.interactor.b q0;
    public final igf r0;
    public final dgf s0;
    public final oc60 t0;
    public final y46 u0;
    public final msi v0;
    public final oep0 w0;
    public final wb1 x0;
    public final ru.yandex.taxi.search.suggest.i y0;
    public final kr0 z0;

    public d(ru.yandex.taxi.design.utils.b bVar, ru.yandex.taxi.preorder.suggested.i iVar, v7b0 v7b0Var, mbv0 mbv0Var, wff wffVar, lcz lczVar, com.yandex.go.zone.interactors.b bVar2, com.yandex.go.address.search.common.domain.interactor.a aVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, caq0 caq0Var, w4l0 w4l0Var, v7j0 v7j0Var, ru.yandex.taxi.address.interactor.b bVar3, nbv0 nbv0Var, igf igfVar, dgf dgfVar, ru.yandex.taxi.search.c cVar, oc60 oc60Var, y46 y46Var, h51 h51Var, prj0 prj0Var, msi msiVar, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, wb1 wb1Var, h4v0 h4v0Var, ru.yandex.taxi.search.suggest.i iVar2, kr0 kr0Var, tt2 tt2Var, gbv0 gbv0Var, com.yandex.go.taxi.tariffs.interactor.b bVar4, w6r w6rVar) {
        super(bVar, iVar, v7b0Var, mbv0Var, aVar, fhfVar, rwp0Var, s3oVar, f3oVar, nbv0Var, cVar, prj0Var, h51Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var);
        this.k0 = wffVar;
        this.l0 = lczVar;
        this.m0 = bVar2;
        this.n0 = caq0Var;
        this.o0 = w4l0Var;
        this.p0 = v7j0Var;
        this.q0 = bVar3;
        this.r0 = igfVar;
        this.s0 = dgfVar;
        this.t0 = oc60Var;
        this.u0 = y46Var;
        this.v0 = msiVar;
        this.w0 = oep0Var;
        this.x0 = wb1Var;
        this.y0 = iVar2;
        this.z0 = kr0Var;
        this.A0 = tt2Var;
        this.B0 = gbv0Var;
        this.C0 = bVar4;
        this.D0 = w6rVar;
    }

    public static final void Gh(d dVar, pv0 pv0Var, boolean z) {
        dVar.u0.getClass();
        if (y46.a(pv0Var) && !dVar.x0.d()) {
            dVar.Ng(new ftj0(pv0Var));
            return;
        }
        pv0Var.a.G(GeoPointAcquisitionType.USER_LOCATION);
        ((com.yandex.go.clarify_address.a) dVar.z0).c(z, AddressClarificationReason.Suggest);
        if (dVar.Eg()) {
            ((j61) dVar.Dg()).Rb("");
            dVar.Hh(pv0Var);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public final void Bh(pv0 pv0Var) {
        if (Eg()) {
            Hh(pv0Var);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        Ih().g.a(null);
        ru.yandex.taxi.preorder.suggested.i iVar = this.G;
        iVar.getClass();
        iVar.k = ic61.c;
        pzt0 pzt0Var = this.j0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.H0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        ru.yandex.taxi.address.interactor.b bVar = this.q0;
        bVar.b.e = null;
        pzt0 pzt0Var3 = bVar.d;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e, defpackage.zc5
    public final void Gg() {
        super.Gg();
        gbv0 gbv0Var = this.B0;
        if (gbv0Var.b) {
            n nVar = Ih().e;
            if (!nVar.b() && !nVar.c()) {
                Jh();
            }
        }
        gbv0Var.b = false;
    }

    public final void Hh(pv0 pv0Var) {
        String a;
        NearestZoneResponse nearestZoneResponse = pv0Var.d;
        if (nearestZoneResponse != null && (a = nearestZoneResponse.a()) != null && a.length() != 0) {
            ((j61) Dg()).P6(pv0Var);
            return;
        }
        Address address = pv0Var.a;
        String zoneName = address.getZoneName();
        pzt0 pzt0Var = this.E0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E0 = tje.N(Jg(), null, null, new SuggestedSourcesPresenter$assignZone$1(this, zoneName, address, pv0Var, null), 3);
    }

    public final ru.yandex.taxi.interactors.a Ih() {
        return this.H.a == RoutePointType.SERVICE_NAVIGATOR_A ? this.s0 : this.r0;
    }

    public final void Jh() {
        showProgress();
        pzt0 pzt0Var = this.F0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.F0 = tje.N(Jg(), null, null, new SuggestedSourcesPresenter$redirectCurrentLocation$1(this, null), 3);
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public final void Lg(String str) {
        ru.yandex.taxi.address.interactor.b bVar = this.q0;
        bVar.b.e = null;
        pzt0 pzt0Var = bVar.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ((j61) Dg()).O();
        super.Lg(str);
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public void Ng(ftj0 ftj0Var) {
        pv0 pv0Var = ftj0Var.a;
        boolean z = this.x0.c() && this.c0;
        this.n0.getClass();
        if (!caq0.a(pv0Var) || z) {
            super.Ng(ftj0Var);
        } else {
            Bh(pv0Var);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51, ru.yandex.taxi.search.presenter.e
    public final void Qg(itj0 itj0Var) {
        x9v0 b;
        mgf mgfVar = Ih().b;
        boolean isEnabled = mgfVar.isEnabled();
        msi msiVar = this.v0;
        if (!isEnabled || !mgfVar.f() || (b = Ih().b()) == null) {
            super.Qg(itj0Var);
            msiVar.a(itj0Var);
        } else {
            ArrayList arrayList = new ArrayList(itj0Var.d);
            arrayList.add(b);
            super.Qg(new itj0(itj0Var.a, itj0Var.b, itj0Var.c, arrayList, itj0Var.e, itj0Var.f));
            msiVar.a(itj0Var);
        }
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final pv0 dh() {
        k56 k56Var;
        Address h = this.o0.h();
        if (h == null) {
            return null;
        }
        if (this.H.a != RoutePointType.POINT_A) {
            return new pv0(h, null, null, null, null, null, null, null, 1022);
        }
        pv0 pv0Var = (pv0) this.y0.i().orElse(null);
        if (pv0Var == null || (k56Var = pv0Var.b) == null) {
            k56Var = new k56(0);
        }
        pv0 pv0Var2 = new pv0(h, k56Var, null, null, null, null, pv0Var != null ? pv0Var.g : null, pv0Var != null ? pv0Var.i : null, 444);
        if (pv0Var != null) {
            pv0Var2.j = pv0Var.j;
        }
        return pv0Var2;
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public void eh(j61 j61Var) {
        super.eh(j61Var);
        ru.yandex.taxi.interactors.a Ih = Ih();
        Ih.g.a(new c(this, j61Var));
        String zh = zh();
        Ah();
        if (!this.I0) {
            if (zh == null || zh.length() == 0) {
                vh();
            } else {
                showProgress();
                Sg(this.x.b(zh));
            }
        }
        this.q0.a(new m8t0(25, j61Var), this.o0.h());
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public final void ih(x9v0 x9v0Var) {
        ((ru.yandex.taxi.persuggest.source.f) this.D0).c(FinalSuggestScreen.ADDRESSES_SUFFIX);
        ((com.yandex.go.clarify_address.a) this.z0).c(true, AddressClarificationReason.Suggest);
        Ih().getClass();
        if (jl40.l(x9v0Var.w, m8v0.a)) {
            this.k0.a(Events$SuggestedCurrentLocation$ScreenType.MAIN);
            Ih().c();
        } else {
            pzt0 pzt0Var = this.F0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            super.ih(x9v0Var);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public String zh() {
        Address h = this.o0.h();
        if (h == null) {
            return null;
        }
        return q5z.F(h);
    }
}
