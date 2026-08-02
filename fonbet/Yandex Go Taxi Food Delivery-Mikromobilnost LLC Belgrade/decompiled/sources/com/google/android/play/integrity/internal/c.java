package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import defpackage.sa81;
import defpackage.ue81;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class c extends ue81 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ ad c;

    public c(ad adVar, IBinder iBinder) {
        this.c = adVar;
        this.b = iBinder;
    }

    @Override // defpackage.ue81
    public final void b() {
        ad adVar = this.c;
        adVar.a.i.getClass();
        n b = m.b(this.b);
        e eVar = adVar.a;
        eVar.n = b;
        sa81 sa81Var = eVar.b;
        sa81Var.a("linkToDeath", new Object[0]);
        try {
            eVar.n.asBinder().linkToDeath(eVar.k, 0);
        } catch (RemoteException e) {
            Object[] objArr = new Object[0];
            sa81Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", sa81.b(sa81Var.a, "linkToDeath failed", objArr), e);
            }
        }
        e eVar2 = adVar.a;
        eVar2.g = false;
        Iterator it = eVar2.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        adVar.a.d.clear();
    }
}
