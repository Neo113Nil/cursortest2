package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import defpackage.tb91;

/* loaded from: classes11.dex */
public final class zzw extends zza implements IInterface {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzv zzvVar, RegisterRequestParams registerRequestParams) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = tb91.a;
        zza.writeStrongBinder(zzvVar);
        tb91.c(zza, registerRequestParams);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzv zzvVar, SignRequestParams signRequestParams) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = tb91.a;
        zza.writeStrongBinder(zzvVar);
        tb91.c(zza, signRequestParams);
        zzb(2, zza);
    }
}
