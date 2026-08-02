package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.bc91;

/* loaded from: classes11.dex */
public final class zzub extends zza implements IInterface {
    public zzub(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
    }

    public final zzuh zzd(IObjectWrapper iObjectWrapper, zztz zztzVar) throws RemoteException {
        Parcel zza = zza();
        int i = bc91.a;
        if (iObjectWrapper == null) {
            zza.writeStrongBinder(null);
        } else {
            zza.writeStrongBinder(iObjectWrapper.asBinder());
        }
        zza.writeInt(1);
        zztzVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(3, zza);
        zzuh createFromParcel = zzb.readInt() != 0 ? zzuh.CREATOR.createFromParcel(zzb) : null;
        zzb.recycle();
        return createFromParcel;
    }

    public final void zze() throws RemoteException {
        zzc(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzc(2, zza());
    }
}
