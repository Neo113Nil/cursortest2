package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.ac91;

/* loaded from: classes11.dex */
public final class zzk extends zza implements zzm {
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzm
    public final zzj zzd(IObjectWrapper iObjectWrapper, zzh zzhVar) throws RemoteException {
        zzj zzjVar;
        Parcel zza = zza();
        ac91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzhVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            zzjVar = queryLocalInterface instanceof zzj ? (zzj) queryLocalInterface : new zzj(readStrongBinder);
        }
        zzb.recycle();
        return zzjVar;
    }
}
