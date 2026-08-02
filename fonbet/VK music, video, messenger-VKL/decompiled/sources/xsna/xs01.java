package xsna;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public abstract class xs01 extends com.google.android.gms.internal.common.zzb {
    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            l601 l601Var = (l601) this;
            exc0.j(l601Var.a, "onPostInitComplete can be called only once per call to getRemoteService");
            l601Var.a.onPostInitHandler(readInt, readStrongBinder, bundle, l601Var.b);
            l601Var.a = null;
        } else if (i == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.zzj zzjVar = (com.google.android.gms.common.internal.zzj) com.google.android.gms.internal.common.zzc.zzb(parcel, com.google.android.gms.common.internal.zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.zzf(parcel);
            l601 l601Var2 = (l601) this;
            rd6 rd6Var = l601Var2.a;
            exc0.j(rd6Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            exc0.i(zzjVar);
            rd6Var.zzc(zzjVar);
            Bundle bundle2 = zzjVar.b;
            exc0.j(l601Var2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            l601Var2.a.onPostInitHandler(readInt2, readStrongBinder2, bundle2, l601Var2.b);
            l601Var2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
