package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzud extends zzb implements zzue {
    public static zzue zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenterCreator");
        return queryLocalInterface instanceof zzue ? (zzue) queryLocalInterface : new zzuc(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzue
    public abstract /* synthetic */ zzub zzd(IObjectWrapper iObjectWrapper, zzuj zzujVar) throws RemoteException;
}
