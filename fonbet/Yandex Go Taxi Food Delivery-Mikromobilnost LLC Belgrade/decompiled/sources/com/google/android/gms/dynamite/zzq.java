package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import defpackage.uw51;
import defpackage.yc91;

/* loaded from: classes11.dex */
public final class zzq extends zza implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        yc91.d(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        yc91.d(zza, iObjectWrapper2);
        return uw51.f(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        yc91.d(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        yc91.d(zza, iObjectWrapper2);
        return uw51.f(zzB(3, zza));
    }
}
