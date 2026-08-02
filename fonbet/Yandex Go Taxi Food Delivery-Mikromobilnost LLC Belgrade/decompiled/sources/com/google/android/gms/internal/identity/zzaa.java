package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzaa extends zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) wb91.a(parcel, LocationSettingsResult.CREATOR);
        wb91.d(parcel);
        zzb(locationSettingsResult);
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzab
    public abstract /* synthetic */ void zzb(LocationSettingsResult locationSettingsResult) throws RemoteException;
}
