package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.uyj0;

/* loaded from: classes11.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements uyj0 {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzai();
    private final Status zza;
    private final LocationSettingsStates zzb;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return this.zzb;
    }

    @Override // defpackage.uyj0
    public Status getStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getStatus(), i, false);
        bb1.f0(parcel, 2, getLocationSettingsStates(), i, false);
        bb1.o0(parcel, n0);
    }
}
