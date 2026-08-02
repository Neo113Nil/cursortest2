package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.hwa1;

/* loaded from: classes11.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzaj();
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        return (LocationSettingsStates) hwa1.b(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        return this.zzd || this.zze;
    }

    public boolean isLocationUsable() {
        return this.zza || this.zzb;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean isGpsUsable = isGpsUsable();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(isGpsUsable ? 1 : 0);
        boolean isNetworkLocationUsable = isNetworkLocationUsable();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(isNetworkLocationUsable ? 1 : 0);
        boolean isBleUsable = isBleUsable();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(isBleUsable ? 1 : 0);
        boolean isGpsPresent = isGpsPresent();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(isGpsPresent ? 1 : 0);
        boolean isNetworkLocationPresent = isNetworkLocationPresent();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(isNetworkLocationPresent ? 1 : 0);
        boolean isBlePresent = isBlePresent();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(isBlePresent ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
