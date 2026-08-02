package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzyn extends zzb implements zzyo {
    public static zzyo zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof zzyo ? (zzyo) queryLocalInterface : new zzym(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzyo
    public abstract /* synthetic */ zzyl zzd(IObjectWrapper iObjectWrapper, zzyd zzydVar) throws RemoteException;
}
