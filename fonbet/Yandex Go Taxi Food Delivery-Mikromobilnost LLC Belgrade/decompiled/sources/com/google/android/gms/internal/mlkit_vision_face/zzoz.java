package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.ac91;

/* loaded from: classes11.dex */
public final class zzoz extends zza implements zzpb {
    public zzoz(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzpb
    public final zzoy zzd(IObjectWrapper iObjectWrapper, zzou zzouVar) throws RemoteException {
        zzoy zzoyVar;
        Parcel zza = zza();
        ac91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzouVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzoyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            zzoyVar = queryLocalInterface instanceof zzoy ? (zzoy) queryLocalInterface : new zzoy(readStrongBinder);
        }
        zzb.recycle();
        return zzoyVar;
    }
}
