package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class zb01 extends com.google.android.gms.internal.maps.zza implements dnv {
    @Override // xsna.dnv
    public final void A(i101 i101Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, i101Var);
        zzc(31, zza);
    }

    @Override // xsna.dnv
    public final void A1(vnv vnvVar, int i, euz0 euz0Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, vnvVar);
        zza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zzf(zza, euz0Var);
        zzc(7, zza);
    }

    @Override // xsna.dnv
    public final void C1(ssz0 ssz0Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, ssz0Var);
        zzc(30, zza);
    }

    @Override // xsna.dnv
    public final ynv H0() throws RemoteException {
        ynv i401Var;
        Parcel zzH = zzH(26, zza());
        IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            i401Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            i401Var = queryLocalInterface instanceof ynv ? (ynv) queryLocalInterface : new i401(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
        }
        zzH.recycle();
        return i401Var;
    }

    @Override // xsna.dnv
    public final yov I() throws RemoteException {
        yov q401Var;
        Parcel zzH = zzH(25, zza());
        IBinder readStrongBinder = zzH.readStrongBinder();
        if (readStrongBinder == null) {
            q401Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            q401Var = queryLocalInterface instanceof yov ? (yov) queryLocalInterface : new q401(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
        }
        zzH.recycle();
        return q401Var;
    }

    @Override // xsna.dnv
    public final void L0(vq01 vq01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, vq01Var);
        zzc(97, zza);
    }

    @Override // xsna.dnv
    public final void N(yb01 yb01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, yb01Var);
        zzc(36, zza);
    }

    @Override // xsna.dnv
    public final void O0(vnv vnvVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, vnvVar);
        zzc(4, zza);
    }

    @Override // xsna.dnv
    public final void U0(boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, z);
        zzc(22, zza);
    }

    @Override // xsna.dnv
    public final void Y0(od01 od01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, od01Var);
        zzc(37, zza);
    }

    @Override // xsna.dnv
    public final void clear() throws RemoteException {
        zzc(14, zza());
    }

    @Override // xsna.dnv
    public final void d0(vnv vnvVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, vnvVar);
        zzc(5, zza);
    }

    @Override // xsna.dnv
    public final CameraPosition h() throws RemoteException {
        Parcel zzH = zzH(1, zza());
        CameraPosition cameraPosition = (CameraPosition) com.google.android.gms.internal.maps.zzc.zza(zzH, CameraPosition.CREATOR);
        zzH.recycle();
        return cameraPosition;
    }

    @Override // xsna.dnv
    public final void i1(j501 j501Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, j501Var);
        zzc(32, zza);
    }

    @Override // xsna.dnv
    public final boolean k0(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, mapStyleOptions);
        Parcel zzH = zzH(91, zza);
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // xsna.dnv
    public final void n(ug01 ug01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, ug01Var);
        zzc(42, zza);
    }

    @Override // xsna.dnv
    public final void p(ca01 ca01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, ca01Var);
        zzc(33, zza);
    }

    @Override // xsna.dnv
    public final zzaa r(PolygonOptions polygonOptions) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, polygonOptions);
        Parcel zzH = zzH(10, zza);
        zzaa zzb = com.google.android.gms.internal.maps.zzz.zzb(zzH.readStrongBinder());
        zzH.recycle();
        return zzb;
    }

    @Override // xsna.dnv
    public final void r0() throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, false);
        zzc(18, zza);
    }

    @Override // xsna.dnv
    public final void t(tq01 tq01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, tq01Var);
        zzc(96, zza);
    }

    @Override // xsna.dnv
    public final void u(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zza.writeInt(0);
        zza.writeInt(0);
        zza.writeInt(i);
        zzc(39, zza);
    }

    @Override // xsna.dnv
    public final com.google.android.gms.internal.maps.zzx w(MarkerOptions markerOptions) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, markerOptions);
        Parcel zzH = zzH(11, zza);
        com.google.android.gms.internal.maps.zzx zzb = com.google.android.gms.internal.maps.zzw.zzb(zzH.readStrongBinder());
        zzH.recycle();
        return zzb;
    }

    @Override // xsna.dnv
    public final boolean x1() throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzc(zza, false);
        Parcel zzH = zzH(20, zza);
        boolean zzg = com.google.android.gms.internal.maps.zzc.zzg(zzH);
        zzH.recycle();
        return zzg;
    }

    @Override // xsna.dnv
    public final void y1(t601 t601Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, t601Var);
        zzc(84, zza);
    }

    @Override // xsna.dnv
    public final void z(js01 js01Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, js01Var);
        zzc(99, zza);
    }
}
