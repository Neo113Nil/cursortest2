package com.yandex.go.scooters.ignition.domain;

import defpackage.h3y;
import defpackage.hbp0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vqn0;
import org.altbeacon.beacon.Region;

/* loaded from: classes8.dex */
public final class b {
    public final tt2 a;
    public final h3y b;
    public final vqn0 c;
    public final h3y d;

    static {
        Region region = k.p;
    }

    public b(tt2 tt2Var, h3y h3yVar, vqn0 vqn0Var, h3y h3yVar2) {
        this.a = tt2Var;
        this.b = h3yVar;
        this.c = vqn0Var;
        this.d = h3yVar2;
    }

    public final void a() {
        hbp0 a = this.c.a();
        this.a.getClass();
        sjh sjhVar = uyj.a;
        hbp0.e(a, mdh.b, null, new ScootersIgnitionApplicationInteractor$onAppCreate$1(this, null), 2);
    }
}
