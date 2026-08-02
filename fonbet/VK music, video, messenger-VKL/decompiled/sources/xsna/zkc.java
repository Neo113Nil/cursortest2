package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import xsna.gnv;

/* compiled from: Client.java */
/* loaded from: classes12.dex */
public final class zkc implements ore0 {
    public final /* synthetic */ clc a;

    public zkc(clc clcVar, up upVar, ryt0 ryt0Var) {
        this.a = clcVar;
    }

    @Override // xsna.ore0
    public final y3j a() {
        return this.a.a;
    }

    @Override // xsna.ore0
    public final void c(IBinder iBinder) throws RemoteException {
        gnv gnvVar;
        clc clcVar = this.a;
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
        clcVar.e = Integer.valueOf(gnvVar.d()).intValue();
    }

    @Override // xsna.ore0
    public final ore0 b(pel pelVar) {
        return this;
    }

    @Override // xsna.ore0
    public final void d(Exception exc) {
    }
}
