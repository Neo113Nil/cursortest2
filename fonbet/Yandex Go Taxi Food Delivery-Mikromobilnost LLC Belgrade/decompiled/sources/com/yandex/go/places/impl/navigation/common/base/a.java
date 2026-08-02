package com.yandex.go.places.impl.navigation.common.base;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import defpackage.a5g;
import defpackage.acc0;
import defpackage.ah00;
import defpackage.b75;
import defpackage.c0g;
import defpackage.c2x0;
import defpackage.c75;
import defpackage.d2x0;
import defpackage.dm80;
import defpackage.e2t;
import defpackage.gh00;
import defpackage.h0;
import defpackage.hfc0;
import defpackage.je80;
import defpackage.jj3;
import defpackage.jyh;
import defpackage.kc50;
import defpackage.kn80;
import defpackage.l4c0;
import defpackage.m9c0;
import defpackage.n3h;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.vgc0;
import defpackage.w030;
import defpackage.w511;
import defpackage.xl80;
import defpackage.z0j;
import defpackage.zbc0;

/* loaded from: classes13.dex */
public abstract class a extends d {
    public final zbc0 c0;
    public final c2x0 d0;
    public final z0j e0;
    public final w030 f0;

    public a(PlacesNavigationMode placesNavigationMode, PlacesMapMode placesMapMode, l4c0 l4c0Var, c2x0 c2x0Var, z0j z0jVar, w030 w030Var, z0j z0jVar2, com.yandex.go.places.experiments.flex.b bVar, kn80 kn80Var, n3h n3hVar, vgc0 vgc0Var, com.yandex.go.morphlex.router.b bVar2, m9c0 m9c0Var, jyh jyhVar, com.yandex.go.places.complaint.impl.navigation.a aVar, kc50 kc50Var, jj3 jj3Var, acc0 acc0Var) {
        super(bVar, kn80Var, placesNavigationMode, placesMapMode, n3hVar, vgc0Var, bVar2, m9c0Var, jyhVar, aVar, kc50Var, jj3Var, acc0Var, z0jVar2);
        this.c0 = l4c0Var;
        this.d0 = c2x0Var;
        this.e0 = z0jVar;
        this.f0 = w030Var;
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public void R(a5g a5gVar) {
        Object obj = this.x;
        xl80 xl80Var = obj instanceof xl80 ? (xl80) obj : null;
        je80 je80Var = xl80Var != null ? xl80Var.i : null;
        boolean z = je80Var != null ? je80Var.a : true;
        boolean z2 = je80Var != null && je80Var.o;
        if (z && !z2) {
            c0g c0gVar = (c0g) a5gVar.a;
            ah00 B = c0gVar.B();
            q5z.h(B);
            q5z.h(c0gVar.C6());
            q5z.h((e2t) c0gVar.z.t1.get());
            q5z.h(c0gVar.V5());
            c0gVar.D6();
            q5z.h((hfc0) c0gVar.vf.get());
            ((gh00) B).K(17.0f);
        }
        a5gVar.e().b();
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public abstract PlacesNavigationMode X();

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public void d0(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        r(new b75(openNavigatorActionSubtype, str, 0));
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public void g0(String str) {
        r(new h0(str, 11));
    }

    public void i0(dm80 dm80Var) {
        ((d2x0) this.d0).e(0, qoi0.a(getClass()));
        int i = c75.a[X().ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            this.e0.a(this);
        }
        b0(dm80Var);
        S(new BasePlacesInternalRouter$onAttach$1(this, null));
    }

    public void j0(dm80 dm80Var) {
        int i = c75.a[X().ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            this.e0.c(this);
        }
        c0();
        ((d2x0) this.d0).b(qoi0.a(getClass()));
    }
}
