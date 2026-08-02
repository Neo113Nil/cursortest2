package com.yandex.go.places.organization.card.impl.ui.card.flex.v2;

import defpackage.jl40;
import defpackage.ne80;
import defpackage.nh80;
import defpackage.rg80;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ g a;
    public final /* synthetic */ rg80 b;

    public /* synthetic */ b(g gVar, rg80 rg80Var) {
        this.a = gVar;
        this.b = rg80Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        com.yandex.go.places.models.data.entities.network.map.e eVar;
        ti80 ti80Var = (ti80) obj;
        g gVar = this.a;
        ne80 ne80Var = (ne80) kotlin.collections.a.R(gVar.Z);
        if (jl40.l(ne80Var != null ? ne80Var.a : null, ti80Var) && !gVar.b0) {
            gVar.b0 = true;
            ((nh80) gVar.Dg()).p1();
        } else if (jl40.l(gVar.a0.a, ti80Var) && (eVar = this.b.g) != null) {
            tje.N(gVar.Jg(), null, null, new OrganizationCardsSliderPresenter$updateOrganizationCardMapObjectDto$1(gVar, eVar, ti80Var, null), 3);
        }
        return zy11.a;
    }
}
