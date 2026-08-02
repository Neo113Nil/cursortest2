package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.RemoteException;
import defpackage.gnb1;
import defpackage.xfb1;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(zzp zzpVar, Object obj, int i) {
        this.a = i;
        this.b = zzpVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzp zzpVar = this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (zzpVar) {
                    if (iBinder == null) {
                        zzpVar.zza(0, "Null service connection");
                    } else {
                        try {
                            zzpVar.zzc = new xfb1(iBinder);
                            zzpVar.zza = 2;
                            zzpVar.zzc();
                        } catch (RemoteException e) {
                            zzpVar.zza(0, e.getMessage());
                        }
                    }
                }
                return;
            default:
                this.b.zze(((gnb1) this.c).a);
                return;
        }
    }
}
