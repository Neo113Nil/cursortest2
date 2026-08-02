package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.tc91;

/* loaded from: classes11.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() throws RemoteException {
        Parcel zzb = zzb(1, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws RemoteException {
        Parcel zzb = zzb(6, zza());
        int i = tc91.a;
        boolean z = zzb.readInt() != 0;
        zzb.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = tc91.a;
        zza.writeInt(1);
        Parcel zzb = zzb(2, zza);
        boolean z2 = zzb.readInt() != 0;
        zzb.recycle();
        return z2;
    }
}
