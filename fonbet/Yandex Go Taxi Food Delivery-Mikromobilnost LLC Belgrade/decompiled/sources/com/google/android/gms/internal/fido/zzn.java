package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import defpackage.tb91;

/* loaded from: classes11.dex */
public final class zzn extends zza implements IInterface {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = tb91.a;
        zza.writeStrongBinder(zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = tb91.a;
        zza.writeStrongBinder(zzmVar);
        tb91.c(zza, browserPublicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = tb91.a;
        zza.writeStrongBinder(zzmVar);
        tb91.c(zza, browserPublicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        ClassLoader classLoader = tb91.a;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
