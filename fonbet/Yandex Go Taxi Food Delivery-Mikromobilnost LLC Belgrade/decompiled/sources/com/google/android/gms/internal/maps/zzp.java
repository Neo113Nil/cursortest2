package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.xb91;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzp extends zza implements zzr {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzd() throws RemoteException {
        Parcel zzH = zzH(1, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zze() throws RemoteException {
        Parcel zzH = zzH(2, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzf() throws RemoteException {
        Parcel zzH = zzH(6, zza());
        int readInt = zzH.readInt();
        zzH.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final List<IBinder> zzg() throws RemoteException {
        Parcel zzH = zzH(3, zza());
        ArrayList<IBinder> createBinderArrayList = zzH.createBinderArrayList();
        zzH.recycle();
        return createBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzh(zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, zzrVar);
        Parcel zzH = zzH(5, zza);
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final boolean zzi() throws RemoteException {
        Parcel zzH = zzH(4, zza());
        boolean d = xb91.d(zzH);
        zzH.recycle();
        return d;
    }
}
