package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) wb91.a(parcel, Status.CREATOR);
        boolean z = parcel.readInt() != 0;
        wb91.d(parcel);
        zzb(status, z);
        return true;
    }

    public abstract /* synthetic */ void zzb(Status status, boolean z) throws RemoteException;
}
