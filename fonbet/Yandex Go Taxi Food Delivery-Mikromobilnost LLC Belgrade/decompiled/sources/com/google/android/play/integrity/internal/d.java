package com.google.android.play.integrity.internal;

import defpackage.ue81;

/* loaded from: classes11.dex */
public final class d extends ue81 {
    public final /* synthetic */ ad b;

    public d(ad adVar) {
        this.b = adVar;
    }

    @Override // defpackage.ue81
    public final void b() {
        ad adVar = this.b;
        e eVar = adVar.a;
        eVar.b.a("unlinkToDeath", new Object[0]);
        eVar.n.asBinder().unlinkToDeath(eVar.k, 0);
        e eVar2 = adVar.a;
        eVar2.n = null;
        eVar2.g = false;
    }
}
