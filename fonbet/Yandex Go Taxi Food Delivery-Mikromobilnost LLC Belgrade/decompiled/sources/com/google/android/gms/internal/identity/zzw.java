package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzw extends zzb implements zzx {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) wb91.a(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) wb91.a(parcel, LocationAvailability.CREATOR);
        wb91.d(parcel);
        zzb(status, locationAvailability);
        return true;
    }

    public abstract /* synthetic */ void zzb(Status status, LocationAvailability locationAvailability) throws RemoteException;
}
