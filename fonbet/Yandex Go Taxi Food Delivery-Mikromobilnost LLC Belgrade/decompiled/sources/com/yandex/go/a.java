package com.yandex.go;

import defpackage.tje;
import defpackage.tse;
import defpackage.yw60;

/* loaded from: classes.dex */
public final class a implements yw60 {
    public final g a;
    public final tse b;

    public a(g gVar, tse tseVar) {
        this.a = gVar;
        this.b = tseVar;
    }

    @Override // defpackage.yw60
    public final void e() {
        tje.N(this.b, null, null, new LocationSdkApplicationStarter$onAppCreated$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LocationSdkApplicationStarter";
    }
}
