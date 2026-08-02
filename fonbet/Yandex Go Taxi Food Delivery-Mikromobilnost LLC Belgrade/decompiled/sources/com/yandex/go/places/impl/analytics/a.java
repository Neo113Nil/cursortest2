package com.yandex.go.places.impl.analytics;

import defpackage.evu0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.lx4;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vy;
import defpackage.wbc0;
import defpackage.wwp0;
import defpackage.xz4;

/* loaded from: classes13.dex */
public final class a extends xz4 {
    public final hit c;
    public final tt2 w;
    public final vy x;

    public a(lx4 lx4Var, wbc0 wbc0Var, hit hitVar, tt2 tt2Var, vy vyVar) {
        super(lx4Var, wbc0Var);
        this.c = hitVar;
        this.w = tt2Var;
        this.x = vyVar;
    }

    public static String n(CharSequence charSequence) {
        return evu0.J(charSequence) ? "zerosuggest" : "suggest";
    }

    public final void m(wwp0 wwp0Var, String str) {
        hbp0 hbp0Var = this.c.a;
        this.w.getClass();
        tje.N(hbp0Var, uyj.a, null, new DiscoveryPlacesSearchAnalytics$discoveryPlacesSearchShow$1(wwp0Var, this, str, null), 2);
    }
}
