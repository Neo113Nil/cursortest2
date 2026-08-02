package xsna;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class wa01 extends isz0 {

    @Nullable
    public final IBinder g;
    public final /* synthetic */ rd6 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa01(rd6 rd6Var, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(rd6Var, i, bundle);
        this.h = rd6Var;
        this.g = iBinder;
    }

    @Override // xsna.isz0
    public final boolean b() {
        String interfaceDescriptor;
        rd6 rd6Var;
        IBinder iBinder = this.g;
        try {
            exc0.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            rd6Var = this.h;
        } catch (RemoteException unused) {
        }
        if (!rd6Var.getServiceDescriptor().equals(interfaceDescriptor)) {
            new StringBuilder(String.valueOf(rd6Var.getServiceDescriptor()).length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface createServiceInterface = rd6Var.createServiceInterface(iBinder);
        if (createServiceInterface != null && (rd6Var.zze(2, 4, createServiceInterface) || rd6Var.zze(3, 4, createServiceInterface))) {
            rd6Var.zzn(null);
            rd6.a zzk = rd6Var.zzk();
            Bundle connectionHint = rd6Var.getConnectionHint();
            if (zzk == null) {
                return true;
            }
            rd6Var.zzk().f(connectionHint);
            return true;
        }
        return false;
    }

    @Override // xsna.isz0
    public final void c(ConnectionResult connectionResult) {
        rd6 rd6Var = this.h;
        if (rd6Var.zzl() != null) {
            rd6Var.zzl().g(connectionResult);
        }
        rd6Var.onConnectionFailed(connectionResult);
    }
}
