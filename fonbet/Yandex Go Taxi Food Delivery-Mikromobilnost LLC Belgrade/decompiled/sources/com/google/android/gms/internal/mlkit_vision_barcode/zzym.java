package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.zb91;

/* loaded from: classes11.dex */
public final class zzym extends zza implements zzyo {
    public zzym(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzyo
    public final zzyl zzd(IObjectWrapper iObjectWrapper, zzyd zzydVar) throws RemoteException {
        zzyl zzylVar;
        Parcel zza = zza();
        zb91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzydVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzylVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            zzylVar = queryLocalInterface instanceof zzyl ? (zzyl) queryLocalInterface : new zzyl(readStrongBinder);
        }
        zzb.recycle();
        return zzylVar;
    }
}
