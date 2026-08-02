package com.google.android.play.core.splitinstall.internal;

import defpackage.cub1;

/* loaded from: classes11.dex */
public final class b extends cub1 {
    public final /* synthetic */ zzae b;

    public b(zzae zzaeVar) {
        this.b = zzaeVar;
    }

    @Override // defpackage.cub1
    public final void a() {
        zzae zzaeVar = this.b;
        c cVar = zzaeVar.zza;
        cVar.b.d("unlinkToDeath", new Object[0]);
        cVar.m.asBinder().unlinkToDeath(cVar.j, 0);
        c cVar2 = zzaeVar.zza;
        cVar2.m = null;
        cVar2.g = false;
    }
}
