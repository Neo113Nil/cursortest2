package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import defpackage.gaa1;
import defpackage.zfa1;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a extends zfa1 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ zzr c;

    public a(zzr zzrVar, IBinder iBinder) {
        this.b = iBinder;
        this.c = zzrVar;
    }

    @Override // defpackage.zfa1
    public final void a() {
        zzf zzb = zze.zzb(this.b);
        zzr zzrVar = this.c;
        c cVar = zzrVar.zza;
        cVar.m = zzb;
        gaa1 gaa1Var = cVar.b;
        gaa1Var.a("linkToDeath", new Object[0]);
        try {
            cVar.m.asBinder().linkToDeath(cVar.j, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            gaa1Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", gaa1.c(gaa1Var.a, "linkToDeath failed", objArr), e);
            }
        }
        c cVar2 = zzrVar.zza;
        cVar2.g = false;
        Iterator it = cVar2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzrVar.zza.d.clear();
    }
}
