package com.yandex.go.places.complaint.impl.navigation;

import com.yandex.go.coroutines.b;
import defpackage.d3a;
import defpackage.h55;
import defpackage.m950;
import defpackage.mxc;
import defpackage.st0;

/* loaded from: classes13.dex */
public final class a extends h55 implements m950 {
    public final d3a D;
    public final st0 E;

    public a(d3a d3aVar, st0 st0Var) {
        super(null);
        this.D = d3aVar;
        this.E = st0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        b.g(o(), null, null, new ComplaintRouterImpl$onLaunch$1(this, (mxc) obj, null), 3);
    }
}
