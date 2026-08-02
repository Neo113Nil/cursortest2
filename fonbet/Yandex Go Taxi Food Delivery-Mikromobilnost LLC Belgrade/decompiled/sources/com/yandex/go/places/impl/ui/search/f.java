package com.yandex.go.places.impl.ui.search;

import defpackage.bvp0;
import defpackage.e350;
import defpackage.guj;
import defpackage.h75;
import defpackage.itp0;
import defpackage.juj;
import defpackage.lg80;
import defpackage.mg80;
import defpackage.pwy0;
import defpackage.qu;
import defpackage.quj;
import defpackage.ti80;
import defpackage.tje;
import defpackage.usp0;
import defpackage.vsp0;
import defpackage.w511;
import defpackage.wsp0;
import defpackage.xsp0;
import defpackage.ysp0;
import defpackage.zsp0;
import defpackage.zuj0;
import defpackage.zzs;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class f extends h75 {
    public final boolean A;
    public final ru.yandex.taxi.design.utils.b B;
    public final zuj0 C;
    public final pwy0 D;
    public final com.yandex.go.places.impl.ui.search.data.repositories.c E;
    public final com.yandex.go.places.impl.analytics.a F;
    public final a G;
    public final mg80 H;
    public final com.yandex.go.places.impl.navigation.search.a x;
    public final String y;
    public final boolean z;

    public f(com.yandex.go.places.impl.navigation.search.a aVar, String str, boolean z, boolean z2, ru.yandex.taxi.design.utils.b bVar, zuj0 zuj0Var, pwy0 pwy0Var, com.yandex.go.places.impl.ui.search.data.repositories.c cVar, com.yandex.go.places.impl.analytics.a aVar2, a aVar3, mg80 mg80Var) {
        super(bvp0.class);
        this.x = aVar;
        this.y = str;
        this.z = z;
        this.A = z2;
        this.B = bVar;
        this.C = zuj0Var;
        this.D = pwy0Var;
        this.E = cVar;
        this.F = aVar2;
        this.G = aVar3;
        this.H = mg80Var;
    }

    public final void Kg(zsp0 zsp0Var) {
        SearchPresenter$handleAction$doOnGoBack$1 searchPresenter$handleAction$doOnGoBack$1 = new SearchPresenter$handleAction$doOnGoBack$1(0, Dg(), bvp0.class, "showKeyboard", "showKeyboard()V", 0);
        boolean z = zsp0Var instanceof vsp0;
        com.yandex.go.places.impl.navigation.search.a aVar = this.x;
        if (z) {
            itp0 itp0Var = aVar.a;
            com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar = itp0Var.E;
            ti80 ti80Var = ((vsp0) zsp0Var).a;
            lg80 a = itp0Var.I.a();
            com.yandex.go.places.impl.navigation.common.navigator.internal.b.c(bVar, itp0Var.J.a() instanceof guj ? juj.b : quj.b, ti80Var, a, null, null, true, true, null, true, false, false, this.z, false, null, new e350(15, searchPresenter$handleAction$doOnGoBack$1), 13312);
            ((bvp0) Dg()).hideKeyboard();
            return;
        }
        boolean z2 = zsp0Var instanceof wsp0;
        boolean z3 = this.z;
        if (z2) {
            aVar.a((wsp0) zsp0Var, z3, this.A, searchPresenter$handleAction$doOnGoBack$1);
            ((bvp0) Dg()).hideKeyboard();
            return;
        }
        if (zsp0Var instanceof usp0) {
            if (!z3) {
                aVar.a.r(new qu(9));
            }
            aVar.a.E.f.a(((usp0) zsp0Var).a, DeeplinkSource.PLACES);
            ((bvp0) Dg()).hideKeyboard();
            return;
        }
        if (zsp0Var instanceof xsp0) {
            zzs zzsVar = ((xsp0) zsp0Var).a;
            if (zzsVar != null) {
                tje.N(Jg(), null, null, new SearchPresenter$handleAction$1$1(this, zzsVar, zsp0Var, null), 3);
                return;
            }
            return;
        }
        if (zsp0Var instanceof ysp0) {
            ((bvp0) Dg()).y(((ysp0) zsp0Var).a, true);
        } else {
            if (zsp0Var == null) {
                return;
            }
            w511.b();
        }
    }
}
