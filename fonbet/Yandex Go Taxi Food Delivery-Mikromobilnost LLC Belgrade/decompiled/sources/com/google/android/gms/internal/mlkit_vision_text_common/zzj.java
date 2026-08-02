package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzj extends zzb implements zzk {
    public static zzk zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        return queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzi(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzk
    public abstract /* synthetic */ zzh zzd(IObjectWrapper iObjectWrapper, zzp zzpVar) throws RemoteException;
}
