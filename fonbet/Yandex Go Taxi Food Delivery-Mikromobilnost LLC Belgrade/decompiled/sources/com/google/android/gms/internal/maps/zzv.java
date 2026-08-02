package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import defpackage.uw51;
import defpackage.xb91;

/* loaded from: classes11.dex */
public final class zzv extends zza implements zzx {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzA(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzB() throws RemoteException {
        zzc(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzC(zzx zzxVar) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, zzxVar);
        Parcel zzH = zzH(16, zza);
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzD() throws RemoteException {
        Parcel zzH = zzH(10, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzE() throws RemoteException {
        Parcel zzH = zzH(21, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzF() throws RemoteException {
        Parcel zzH = zzH(13, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzG() throws RemoteException {
        Parcel zzH = zzH(15, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzd() throws RemoteException {
        Parcel zzH = zzH(26, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zze() throws RemoteException {
        Parcel zzH = zzH(23, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzf() throws RemoteException {
        Parcel zzH = zzH(28, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final int zzg() throws RemoteException {
        Parcel zzH = zzH(17, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final IObjectWrapper zzh() throws RemoteException {
        return uw51.f(zzH(30, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final LatLng zzi() throws RemoteException {
        Parcel zzH = zzH(4, zza());
        LatLng latLng = (LatLng) xb91.a(zzH, LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzj() throws RemoteException {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzk() throws RemoteException {
        Parcel zzH = zzH(8, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final String zzl() throws RemoteException {
        Parcel zzH = zzH(6, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzm() throws RemoteException {
        zzc(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzn() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzo(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzp(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzq(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = xb91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzr(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = xb91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, iObjectWrapper);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzt(float f, float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzu(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        xb91.b(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzv(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzw(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, iObjectWrapper);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzy(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzz(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = xb91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(14, zza);
    }
}
