package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.bc91;

/* loaded from: classes11.dex */
public final class zzuc extends zza implements zzue {
    public zzuc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzue
    public final zzub zzd(IObjectWrapper iObjectWrapper, zzuj zzujVar) throws RemoteException {
        Parcel zza = zza();
        int i = bc91.a;
        zzub zzubVar = null;
        if (iObjectWrapper == null) {
            zza.writeStrongBinder(null);
        } else {
            zza.writeStrongBinder(iObjectWrapper.asBinder());
        }
        zza.writeInt(1);
        zzujVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            zzubVar = queryLocalInterface instanceof zzub ? (zzub) queryLocalInterface : new zzub(readStrongBinder);
        }
        zzb.recycle();
        return zzubVar;
    }
}
