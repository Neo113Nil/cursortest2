package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzux extends zzb implements zzuy {
    public static zzuy zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return queryLocalInterface instanceof zzuy ? (zzuy) queryLocalInterface : new zzuw(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuy
    public abstract /* synthetic */ zzuv zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuy
    public abstract /* synthetic */ zzuv zze(IObjectWrapper iObjectWrapper, zzvh zzvhVar) throws RemoteException;
}
