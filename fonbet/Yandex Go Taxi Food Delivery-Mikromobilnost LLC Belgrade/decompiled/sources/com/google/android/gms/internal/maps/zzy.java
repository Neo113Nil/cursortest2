package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import defpackage.uw51;
import defpackage.xb91;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzy extends zza implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzA(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzB(zzaa zzaaVar) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, zzaaVar);
        Parcel zzH = zzH(19, zza);
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzC() throws RemoteException {
        Parcel zzH = zzH(22, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzD() throws RemoteException {
        Parcel zzH = zzH(18, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzE() throws RemoteException {
        Parcel zzH = zzH(16, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final float zzd() throws RemoteException {
        Parcel zzH = zzH(8, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final float zze() throws RemoteException {
        Parcel zzH = zzH(14, zza());
        float readFloat = zzH.readFloat();
        zzH.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzf() throws RemoteException {
        Parcel zzH = zzH(12, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzg() throws RemoteException {
        Parcel zzH = zzH(10, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzh() throws RemoteException {
        Parcel zzH = zzH(24, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzi() throws RemoteException {
        Parcel zzH = zzH(20, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final IObjectWrapper zzj() throws RemoteException {
        return uw51.f(zzH(28, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final String zzk() throws RemoteException {
        Parcel zzH = zzH(2, zza());
        String readString = zzH.readString();
        zzH.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List zzl() throws RemoteException {
        Parcel zzH = zzH(6, zza());
        ArrayList readArrayList = zzH.readArrayList(xb91.a);
        zzH.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List<LatLng> zzm() throws RemoteException {
        Parcel zzH = zzH(4, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(LatLng.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final List<PatternItem> zzn() throws RemoteException {
        Parcel zzH = zzH(26, zza());
        ArrayList createTypedArrayList = zzH.createTypedArrayList(PatternItem.CREATOR);
        zzH.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzo() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = xb91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzq(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzr(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = xb91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzs(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeList(list);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzt(List<LatLng> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzu(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzv(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzw(List<PatternItem> list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzx(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, iObjectWrapper);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final void zzz(boolean z) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = xb91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(15, zza);
    }
}
