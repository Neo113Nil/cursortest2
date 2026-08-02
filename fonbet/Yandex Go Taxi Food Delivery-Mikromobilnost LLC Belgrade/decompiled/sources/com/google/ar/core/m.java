package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes11.dex */
public final class m implements l {
    public final /* synthetic */ q a;

    public m(q qVar) {
        this.a = qVar;
    }

    @Override // com.google.ar.core.l
    public final void a(ArCoreApk.Availability availability) {
        synchronized (this.a) {
            q qVar = this.a;
            qVar.g = availability;
            qVar.h = false;
        }
    }
}
