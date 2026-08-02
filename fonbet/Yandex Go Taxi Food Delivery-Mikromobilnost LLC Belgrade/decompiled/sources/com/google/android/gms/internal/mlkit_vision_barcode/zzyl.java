package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.zb91;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzyl extends zza implements IInterface {
    public zzyl(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List zzd(IObjectWrapper iObjectWrapper, zzyu zzyuVar) throws RemoteException {
        Parcel zza = zza();
        zb91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzyuVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(3, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzyb.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zze() throws RemoteException {
        zzc(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzc(2, zza());
    }
}
