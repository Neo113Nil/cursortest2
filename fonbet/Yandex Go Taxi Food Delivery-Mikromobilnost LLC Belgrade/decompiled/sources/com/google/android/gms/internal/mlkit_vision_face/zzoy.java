package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.ac91;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzoy extends zza implements IInterface {
    public zzoy(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    public final List zzd(IObjectWrapper iObjectWrapper, zzoq zzoqVar) throws RemoteException {
        Parcel zza = zza();
        ac91.a(zza, iObjectWrapper);
        zza.writeInt(1);
        zzoqVar.writeToParcel(zza, 0);
        Parcel zzb = zzb(3, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzow.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    public final void zze() throws RemoteException {
        zzc(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzc(2, zza());
    }
}
