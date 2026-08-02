package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzpa extends zzb implements zzpb {
    public static zzpb zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return queryLocalInterface instanceof zzpb ? (zzpb) queryLocalInterface : new zzoz(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzpb
    public abstract /* synthetic */ zzoy zzd(IObjectWrapper iObjectWrapper, zzou zzouVar) throws RemoteException;
}
