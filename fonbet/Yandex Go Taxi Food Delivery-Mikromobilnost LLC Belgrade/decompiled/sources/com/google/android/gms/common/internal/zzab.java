package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.yc91;

/* loaded from: classes11.dex */
public final class zzab extends zza implements zzad {
    public zzab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zze(com.google.android.gms.common.zzt zztVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        yc91.c(zza, zztVar);
        yc91.d(zza, iObjectWrapper);
        Parcel zzB = zzB(5, zza);
        boolean a = yc91.a(zzB);
        zzB.recycle();
        return a;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final zzr zzf(com.google.android.gms.common.zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        yc91.c(zza, zzpVar);
        Parcel zzB = zzB(6, zza);
        zzr zzrVar = (zzr) yc91.b(zzB, zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean a = yc91.a(zzB);
        zzB.recycle();
        return a;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final zzr zzh(com.google.android.gms.common.zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        yc91.c(zza, zzpVar);
        Parcel zzB = zzB(8, zza);
        zzr zzrVar = (zzr) yc91.b(zzB, zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    public final boolean zzi() throws RemoteException {
        Parcel zzB = zzB(9, zza());
        boolean a = yc91.a(zzB);
        zzB.recycle();
        return a;
    }
}
