package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.ec91;
import defpackage.uw51;

/* loaded from: classes11.dex */
public final class zzc extends com.google.android.gms.internal.wallet.zza implements IInterface {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final IObjectWrapper zzd(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) throws RemoteException {
        Parcel zza = zza();
        ec91.c(zza, iObjectWrapper);
        ec91.b(zza, buttonOptions);
        return uw51.f(zzb(1, zza));
    }
}
