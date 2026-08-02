package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.zb91;

/* loaded from: classes11.dex */
public final class zzaj extends zza implements IInterface {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void zzd() throws RemoteException {
        zzc(3, zza());
    }

    public final zzu[] zze(IObjectWrapper iObjectWrapper, zzan zzanVar) throws RemoteException {
        Parcel zza = zza();
        zb91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzanVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(1, zza);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }

    public final zzu[] zzf(IObjectWrapper iObjectWrapper, zzan zzanVar) throws RemoteException {
        Parcel zza = zza();
        zb91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzanVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(2, zza);
        zzu[] zzuVarArr = (zzu[]) zzb.createTypedArray(zzu.CREATOR);
        zzb.recycle();
        return zzuVarArr;
    }
}
