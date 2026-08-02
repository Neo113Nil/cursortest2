package com.yandex.go.places.impl.domain.interactors.discovery.map;

import android.content.Context;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.go80;
import defpackage.ike;
import defpackage.jtj;
import defpackage.mth;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.ytj;
import defpackage.ztj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final ah00 a;
    public final go80 b;
    public final ytj c;
    public final Context d;
    public final jtj e = new jtj();
    public final r0 f = bvf0.c(null);

    public a(ah00 ah00Var, go80 go80Var, ytj ytjVar, Context context) {
        this.a = ah00Var;
        this.b = go80Var;
        this.c = ytjVar;
        this.d = context;
    }

    public final pzt0 a(ike ikeVar) {
        return tje.N(ikeVar, null, null, new PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$$inlined$safeCollectIn$1(e.t(new m0(new mth(this.f, 6), e.p(((ztj) this.c).b, 300L), new PlacesDiscoveryMapBboxInteractor$startUpdatingBbox$1(this, null))), null, this), 3);
    }
}
