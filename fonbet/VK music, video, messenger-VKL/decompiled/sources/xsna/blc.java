package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import xsna.gnv;

/* compiled from: Client.java */
/* loaded from: classes12.dex */
public final class blc extends wl6 {
    public final /* synthetic */ ivf0 b;
    public final /* synthetic */ lzi0 c;
    public final /* synthetic */ clc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blc(clc clcVar, y3j y3jVar, ivf0 ivf0Var, lzi0 lzi0Var) {
        super(y3jVar);
        this.d = clcVar;
        this.b = ivf0Var;
        this.c = lzi0Var;
    }

    @Override // xsna.wl6, xsna.ore0
    public final ore0 b(pel pelVar) {
        lzi0 lzi0Var = this.c;
        synchronized (pelVar.a) {
            pelVar.a.add(lzi0Var);
            lzi0Var.addListener(new qye(2, pelVar, lzi0Var), kzm.INSTANCE);
        }
        return this;
    }

    @Override // xsna.wl6, xsna.ore0
    public final void c(IBinder iBinder) throws RemoteException {
        gnv gnvVar;
        this.d.c.getClass();
        int i = gnv.a.a;
        if (iBinder == null) {
            gnvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IHealthDataService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof gnv)) {
                gnv.a.C2951a c2951a = new gnv.a.C2951a();
                c2951a.a = iBinder;
                gnvVar = c2951a;
            } else {
                gnvVar = (gnv) queryLocalInterface;
            }
        }
        this.b.a(gnvVar, this.c);
    }

    @Override // xsna.wl6, xsna.ore0
    public final void d(Exception exc) {
        this.c.l(exc);
    }
}
