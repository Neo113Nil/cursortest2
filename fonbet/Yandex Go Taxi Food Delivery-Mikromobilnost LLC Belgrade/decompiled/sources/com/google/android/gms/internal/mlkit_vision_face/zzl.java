package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzl extends zzb implements zzm {
    public static zzm zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return queryLocalInterface instanceof zzm ? (zzm) queryLocalInterface : new zzk(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzm
    public abstract /* synthetic */ zzj zzd(IObjectWrapper iObjectWrapper, zzh zzhVar) throws RemoteException;
}
