package com.google.android.gms.internal.identity;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzy extends zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) wb91.a(parcel, Status.CREATOR);
        Location location = (Location) wb91.a(parcel, Location.CREATOR);
        wb91.d(parcel);
        zzb(status, location);
        return true;
    }

    public abstract /* synthetic */ void zzb(Status status, Location location) throws RemoteException;
}
