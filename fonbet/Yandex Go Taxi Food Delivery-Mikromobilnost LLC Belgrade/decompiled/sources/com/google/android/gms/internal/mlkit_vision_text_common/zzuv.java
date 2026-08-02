package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.cc91;

/* loaded from: classes11.dex */
public final class zzuv extends zza implements IInterface {
    public zzuv(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final zzvf zzd(IObjectWrapper iObjectWrapper, zzuq zzuqVar) throws RemoteException {
        Parcel zza = zza();
        cc91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzuqVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(3, zza);
        zzvf createFromParcel = zzb.readInt() == 0 ? null : zzvf.CREATOR.createFromParcel(zzb);
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
