package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class vj01 extends com.google.android.gms.internal.maps.zza implements nnv {
    @Override // xsna.nnv
    public final void b(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, bundle);
        Parcel zzH = zzH(7, zza);
        if (zzH.readInt() != 0) {
            bundle.readFromParcel(zzH);
        }
        zzH.recycle();
    }

    @Override // xsna.nnv
    public final vnv getView() throws RemoteException {
        return y57.c(zzH(8, zza()));
    }

    @Override // xsna.nnv
    public final void l(czz0 czz0Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, czz0Var);
        zzc(9, zza);
    }

    @Override // xsna.nnv
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, bundle);
        zzc(2, zza);
    }

    @Override // xsna.nnv
    public final void onDestroy() throws RemoteException {
        zzc(5, zza());
    }

    @Override // xsna.nnv
    public final void onLowMemory() throws RemoteException {
        zzc(6, zza());
    }

    @Override // xsna.nnv
    public final void onPause() throws RemoteException {
        zzc(4, zza());
    }

    @Override // xsna.nnv
    public final void onResume() throws RemoteException {
        zzc(3, zza());
    }

    @Override // xsna.nnv
    public final void onStart() throws RemoteException {
        zzc(12, zza());
    }

    @Override // xsna.nnv
    public final void onStop() throws RemoteException {
        zzc(13, zza());
    }
}
