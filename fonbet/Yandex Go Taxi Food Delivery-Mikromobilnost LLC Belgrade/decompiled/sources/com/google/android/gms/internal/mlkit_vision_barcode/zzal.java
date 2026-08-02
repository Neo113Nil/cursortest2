package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzal extends zzb implements zzam {
    public static zzam zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return queryLocalInterface instanceof zzam ? (zzam) queryLocalInterface : new zzak(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzam
    public abstract /* synthetic */ zzaj zzd(IObjectWrapper iObjectWrapper, zzah zzahVar) throws RemoteException;
}
