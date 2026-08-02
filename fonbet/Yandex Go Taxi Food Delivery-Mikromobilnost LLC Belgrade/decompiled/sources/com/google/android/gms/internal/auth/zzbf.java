package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import defpackage.vc91;

/* loaded from: classes11.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) vc91.a(parcel, ProxyResponse.CREATOR);
            vc91.b(parcel);
            zzb(proxyResponse);
        } else {
            if (i != 2) {
                return false;
            }
            String readString = parcel.readString();
            vc91.b(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(ProxyResponse proxyResponse) throws RemoteException;

    public abstract /* synthetic */ void zzc(String str) throws RemoteException;
}
