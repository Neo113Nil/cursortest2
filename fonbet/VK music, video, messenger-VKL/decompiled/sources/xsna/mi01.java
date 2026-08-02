package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class mi01 extends com.google.android.gms.internal.maps.zza implements mnv {
    @Override // xsna.mnv
    public final void X(bq70 bq70Var, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        com.google.android.gms.internal.maps.zzc.zzd(zza, googleMapOptions);
        com.google.android.gms.internal.maps.zzc.zzd(zza, bundle);
        zzc(2, zza);
    }

    @Override // xsna.mnv
    public final void b(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, bundle);
        Parcel zzH = zzH(10, zza);
        if (zzH.readInt() != 0) {
            bundle.readFromParcel(zzH);
        }
        zzH.recycle();
    }

    @Override // xsna.mnv
    public final void l(czz0 czz0Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, czz0Var);
        zzc(12, zza);
    }

    @Override // xsna.mnv
    public final vnv n1(bq70 bq70Var, bq70 bq70Var2, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var2);
        com.google.android.gms.internal.maps.zzc.zzd(zza, bundle);
        return y57.c(zzH(4, zza));
    }

    @Override // xsna.mnv
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, bundle);
        zzc(3, zza);
    }

    @Override // xsna.mnv
    public final void onDestroy() throws RemoteException {
        zzc(8, zza());
    }

    @Override // xsna.mnv
    public final void onDestroyView() throws RemoteException {
        zzc(7, zza());
    }

    @Override // xsna.mnv
    public final void onLowMemory() throws RemoteException {
        zzc(9, zza());
    }

    @Override // xsna.mnv
    public final void onPause() throws RemoteException {
        zzc(6, zza());
    }

    @Override // xsna.mnv
    public final void onResume() throws RemoteException {
        zzc(5, zza());
    }

    @Override // xsna.mnv
    public final void onStart() throws RemoteException {
        zzc(15, zza());
    }

    @Override // xsna.mnv
    public final void onStop() throws RemoteException {
        zzc(16, zza());
    }
}
