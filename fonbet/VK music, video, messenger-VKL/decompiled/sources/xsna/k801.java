package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class k801 extends com.google.android.gms.internal.maps.zza implements da01 {
    @Override // xsna.da01
    public final void G1(bq70 bq70Var, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        zza.writeInt(i);
        zzc(10, zza);
    }

    @Override // xsna.da01
    public final mnv U(bq70 bq70Var) throws RemoteException {
        mnv mi01Var;
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        Parcel zzH = zzH(2, zza);
        IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            mi01Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            mi01Var = queryLocalInterface instanceof mnv ? (mnv) queryLocalInterface : new mi01(readStrongBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
        }
        zzH.recycle();
        return mi01Var;
    }

    @Override // xsna.da01
    public final void b0(bq70 bq70Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        zza.writeInt(12451000);
        zzc(6, zza);
    }

    @Override // xsna.da01
    public final nnv v0(bq70 bq70Var, GoogleMapOptions googleMapOptions) throws RemoteException {
        nnv vj01Var;
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        com.google.android.gms.internal.maps.zzc.zzd(zza, googleMapOptions);
        Parcel zzH = zzH(3, zza);
        IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            vj01Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            vj01Var = queryLocalInterface instanceof nnv ? (nnv) queryLocalInterface : new vj01(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
        }
        zzH.recycle();
        return vj01Var;
    }

    @Override // xsna.da01
    public final int zzd() throws RemoteException {
        Parcel zzH = zzH(9, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // xsna.da01
    public final fmv zze() throws RemoteException {
        fmv j101Var;
        Parcel zzH = zzH(4, zza());
        IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            j101Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            j101Var = queryLocalInterface instanceof fmv ? (fmv) queryLocalInterface : new j101(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        }
        zzH.recycle();
        return j101Var;
    }

    @Override // xsna.da01
    public final com.google.android.gms.internal.maps.zzi zzj() throws RemoteException {
        Parcel zzH = zzH(5, zza());
        com.google.android.gms.internal.maps.zzi zzb = com.google.android.gms.internal.maps.zzh.zzb(zzH.readStrongBinder());
        zzH.recycle();
        return zzb;
    }
}
