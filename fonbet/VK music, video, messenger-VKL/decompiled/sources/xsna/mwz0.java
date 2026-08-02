package xsna;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zzax;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class mwz0 extends com.google.android.gms.internal.cast.zza implements zwz0 {
    @Override // xsna.zwz0
    public final void l1(zzax zzaxVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zze(zza, zzaxVar);
        zzc(3, zza);
    }

    @Override // xsna.zwz0
    public final Bundle zze() throws RemoteException {
        Parcel zzb = zzb(1, zza());
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // xsna.zwz0
    public final g001 zzg() throws RemoteException {
        g001 e001Var;
        Parcel zzb = zzb(5, zza());
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            e001Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            e001Var = queryLocalInterface instanceof g001 ? (g001) queryLocalInterface : new e001(readStrongBinder, "com.google.android.gms.cast.framework.ISessionManager");
        }
        zzb.recycle();
        return e001Var;
    }

    @Override // xsna.zwz0
    public final kyz0 zzh() throws RemoteException {
        kyz0 jyz0Var;
        Parcel zzb = zzb(6, zza());
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            jyz0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            jyz0Var = queryLocalInterface instanceof kyz0 ? (kyz0) queryLocalInterface : new jyz0(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
        }
        zzb.recycle();
        return jyz0Var;
    }
}
