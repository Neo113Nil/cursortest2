package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.vc91;

/* loaded from: classes11.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Status status = (Status) vc91.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) vc91.a(parcel, Bundle.CREATOR);
        vc91.b(parcel);
        zzb(status, bundle);
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzo
    public abstract /* synthetic */ void zzb(Status status, Bundle bundle) throws RemoteException;
}
