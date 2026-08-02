package com.yandex.go.address.address_map_picker.domain;

import defpackage.ah00;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.zzs;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class e {
    public final ah00 a;
    public final c b;
    public final i c;
    public f d;
    public tse e;
    public pzt0 f;
    public pzt0 g;
    public boolean h;
    public boolean i;

    public e(ah00 ah00Var, c cVar, i iVar) {
        this.a = ah00Var;
        this.b = cVar;
        this.c = iVar;
    }

    public final void a(tse tseVar, RoutePointType routePointType, f fVar) {
        this.e = tseVar;
        this.d = fVar;
        i iVar = this.c;
        pv0 pv0Var = (pv0) iVar.i().orElse(null);
        if (pv0Var != null) {
            if (jl40.l(pv0Var.a.B(), zzs.f)) {
                pv0Var = null;
            }
            if (pv0Var != null) {
                this.g = tje.N(tseVar, null, null, new AddressMapPickerMapInteractor$attach$2$1(fVar, pv0Var, null), 3);
            }
        }
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(iVar.k(routePointType, true), new AddressMapPickerMapInteractor$attach$3(this, tseVar, fVar, null), 3));
    }

    public final void b() {
        tse tseVar = this.e;
        if (tseVar == null) {
            return;
        }
        this.i = false;
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.g;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        tje.N(tseVar, null, null, new AddressMapPickerMapInteractor$onMapDragged$1(this, null), 3);
    }

    public final void c() {
        tse tseVar = this.e;
        if (tseVar == null) {
            return;
        }
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = tje.N(tseVar, null, null, new AddressMapPickerMapInteractor$startCameraFinishedJob$1(this, null), 3);
    }
}
