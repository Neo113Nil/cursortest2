package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.RemoteException;
import defpackage.cub1;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class a extends cub1 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ zzae c;

    public a(zzae zzaeVar, IBinder iBinder) {
        this.c = zzaeVar;
        this.b = iBinder;
    }

    @Override // defpackage.cub1
    public final void a() {
        zzae zzaeVar = this.c;
        zzaeVar.zza.m = zzbn.zzb(this.b);
        c cVar = zzaeVar.zza;
        cVar.b.d("linkToDeath", new Object[0]);
        try {
            cVar.m.asBinder().linkToDeath(cVar.j, 0);
        } catch (RemoteException e) {
            cVar.b.c(e, "linkToDeath failed", new Object[0]);
        }
        c cVar2 = zzaeVar.zza;
        cVar2.g = false;
        Iterator it = cVar2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzaeVar.zza.d.clear();
    }
}
