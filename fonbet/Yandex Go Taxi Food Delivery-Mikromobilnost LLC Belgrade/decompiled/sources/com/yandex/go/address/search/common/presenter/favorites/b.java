package com.yandex.go.address.search.common.presenter.favorites;

import com.yandex.go.address.models.Address;
import defpackage.cgf;
import defpackage.ic61;
import defpackage.itj0;
import defpackage.j61;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lcz;
import defpackage.m8v0;
import defpackage.mgf;
import defpackage.oep0;
import defpackage.pc60;
import defpackage.prj0;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.rwp0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.v7b0;
import defpackage.v7j0;
import defpackage.w51;
import defpackage.w6r;
import defpackage.wff;
import defpackage.x9v0;
import defpackage.xby;
import java.util.ArrayList;
import ru.yandex.taxi.analytics.Events$SuggestedCurrentLocation$ScreenType;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;
import ru.yandex.taxi.persuggest.source.f;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public final class b extends w51 {
    public final cgf L;
    public final v7j0 M;
    public final pc60 N;
    public final oep0 O;
    public final wff P;
    public final lcz Q;
    public final tt2 R;
    public final w6r S;
    public pv0 T;
    public pzt0 U;
    public pzt0 V;
    public pzt0 W;
    public boolean Z;

    public b(ru.yandex.taxi.design.utils.b bVar, v7b0 v7b0Var, rwp0 rwp0Var, c cVar, cgf cgfVar, v7j0 v7j0Var, pc60 pc60Var, oep0 oep0Var, wff wffVar, lcz lczVar, i iVar, prj0 prj0Var, tt2 tt2Var, w6r w6rVar) {
        super(bVar, v7b0Var, cVar, iVar, rwp0Var, prj0Var);
        this.L = cgfVar;
        this.M = v7j0Var;
        this.N = pc60Var;
        this.O = oep0Var;
        this.P = wffVar;
        this.Q = lczVar;
        this.R = tt2Var;
        this.S = w6rVar;
    }

    @Override // defpackage.w51, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.L.g.a(null);
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.V;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.W;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        i iVar = this.G;
        iVar.getClass();
        iVar.k = ic61.c;
    }

    @Override // ru.yandex.taxi.search.presenter.e, defpackage.zc5
    public final void Gg() {
        bh();
        if (this.Z) {
            n nVar = this.L.e;
            if (!nVar.b() && !nVar.c()) {
                xh();
            }
        }
        this.Z = false;
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Lg(String str) {
        super.Lg(str);
        if (str == null || str.length() == 0) {
            vh();
        }
    }

    @Override // defpackage.w51, ru.yandex.taxi.search.presenter.e
    public final void Qg(itj0 itj0Var) {
        x9v0 b;
        cgf cgfVar = this.L;
        mgf mgfVar = cgfVar.b;
        if (!mgfVar.isEnabled() || !mgfVar.f() || (b = cgfVar.b()) == null) {
            super.Qg(itj0Var);
            return;
        }
        ArrayList arrayList = new ArrayList(itj0Var.d);
        arrayList.add(b);
        super.Qg(new itj0(itj0Var.a, itj0Var.b, itj0Var.c, arrayList, itj0Var.e, itj0Var.f));
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public final void Zg() {
        ch();
        ((j61) Dg()).zd(this.T, false);
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        this.H.a();
        super.eh(j61Var);
        String filter = j61Var.getFilter();
        if (filter == null || filter.length() == 0) {
            vh();
        } else {
            j61Var.Rb(filter);
            showProgress();
            Sg(this.x.b(filter));
        }
        this.L.g.a(new a(this));
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void ih(x9v0 x9v0Var) {
        ((f) this.S).c(FinalSuggestScreen.ADDRESSES_SUFFIX);
        Address address = x9v0Var.u;
        cgf cgfVar = this.L;
        cgfVar.getClass();
        if (jl40.l(x9v0Var.w, m8v0.a)) {
            this.P.a(Events$SuggestedCurrentLocation$ScreenType.FAVORITES);
            cgfVar.c();
        } else if (this.J) {
            super.ih(x9v0Var);
        } else if (address != null) {
            ((j61) Dg()).P6(new pv0(address, null, null, null, null, null, null, null, 1022));
        } else {
            xby.l(jst.e, "FavoritesSearch.Error", null, null, "Unknown suggest click", 6);
        }
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void nh(pv0 pv0Var) {
        this.T = pv0Var;
    }

    public final void xh() {
        showProgress();
        pzt0 pzt0Var = this.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.U = tje.N(Jg(), null, null, new FavoritesSearchPresenter$redirectCurrentLocation$1(this, null), 3);
    }
}
