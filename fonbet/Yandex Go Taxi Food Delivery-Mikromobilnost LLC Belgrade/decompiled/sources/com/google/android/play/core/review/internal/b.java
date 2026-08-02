package com.google.android.play.core.review.internal;

import defpackage.zfa1;

/* loaded from: classes11.dex */
public final class b extends zfa1 {
    public final /* synthetic */ zzr b;

    public b(zzr zzrVar) {
        this.b = zzrVar;
    }

    @Override // defpackage.zfa1
    public final void a() {
        zzr zzrVar = this.b;
        c cVar = zzrVar.zza;
        cVar.b.a("unlinkToDeath", new Object[0]);
        cVar.m.asBinder().unlinkToDeath(cVar.j, 0);
        c cVar2 = zzrVar.zza;
        cVar2.m = null;
        cVar2.g = false;
    }
}
