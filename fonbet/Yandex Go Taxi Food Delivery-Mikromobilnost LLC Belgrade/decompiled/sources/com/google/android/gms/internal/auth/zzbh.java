package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import defpackage.vc91;

/* loaded from: classes11.dex */
public final class zzbh extends zza implements IInterface {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, ProxyRequest proxyRequest) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzbgVar);
        vc91.c(zza, proxyRequest);
        zzc(1, zza);
    }
}
