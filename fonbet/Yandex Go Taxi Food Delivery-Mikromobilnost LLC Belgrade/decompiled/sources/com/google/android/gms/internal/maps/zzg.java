package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.uw51;
import defpackage.xb91;

/* loaded from: classes11.dex */
public final class zzg extends zza implements zzi {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzd() throws RemoteException {
        return uw51.f(zzH(4, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zze(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        return uw51.f(zzH(5, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return uw51.f(zzH(2, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzg(Bitmap bitmap) throws RemoteException {
        Parcel zza = zza();
        xb91.b(zza, bitmap);
        return uw51.f(zzH(6, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return uw51.f(zzH(3, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return uw51.f(zzH(7, zza));
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public final IObjectWrapper zzj(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        return uw51.f(zzH(1, zza));
    }
}
