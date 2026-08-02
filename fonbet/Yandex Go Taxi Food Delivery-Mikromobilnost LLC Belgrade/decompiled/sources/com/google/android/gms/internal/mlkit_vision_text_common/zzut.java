package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzut extends zzb implements zzuu {
    public static zzuu zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
        return queryLocalInterface instanceof zzuu ? (zzuu) queryLocalInterface : new zzus(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuu
    public abstract /* synthetic */ zzuv zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzvh zzvhVar) throws RemoteException;
}
