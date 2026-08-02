package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.a;

/* loaded from: classes11.dex */
public final class fr91 extends q391 {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr91(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.q391
    public final boolean a() {
        String interfaceDescriptor;
        a aVar;
        IBinder iBinder = this.g;
        try {
            cvw.l(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            aVar = this.h;
        } catch (RemoteException unused) {
        }
        if (!aVar.j().equals(interfaceDescriptor)) {
            new StringBuilder(aVar.j().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface d = aVar.d(iBinder);
        if (d != null && (aVar.q(2, 4, d) || aVar.q(3, 4, d))) {
            aVar.R = null;
            z15 z15Var = aVar.M;
            if (z15Var == null) {
                return true;
            }
            z15Var.onConnected(null);
            return true;
        }
        return false;
    }

    @Override // defpackage.q391
    public final void b(ConnectionResult connectionResult) {
        a aVar = this.h;
        a25 a25Var = aVar.N;
        if (a25Var != null) {
            a25Var.onConnectionFailed(connectionResult);
        }
        aVar.n(connectionResult);
    }
}
