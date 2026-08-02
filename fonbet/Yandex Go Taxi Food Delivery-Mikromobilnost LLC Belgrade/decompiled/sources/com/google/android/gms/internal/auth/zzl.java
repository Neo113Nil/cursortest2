package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import defpackage.vc91;

/* loaded from: classes11.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Status status = (Status) vc91.a(parcel, Status.CREATOR);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) vc91.a(parcel, AccountChangeEventsResponse.CREATOR);
        vc91.b(parcel);
        zzb(status, accountChangeEventsResponse);
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public abstract /* synthetic */ void zzb(Status status, AccountChangeEventsResponse accountChangeEventsResponse) throws RemoteException;
}
