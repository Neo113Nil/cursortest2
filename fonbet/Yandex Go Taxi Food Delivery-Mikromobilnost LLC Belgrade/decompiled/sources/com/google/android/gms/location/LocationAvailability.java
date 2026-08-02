package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.xra1;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    final int zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;
    private final zzal[] zzg;
    public static final LocationAvailability zza = new LocationAvailability(0, 1, 1, 0, null, true);
    public static final LocationAvailability zzb = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzab();

    public LocationAvailability(int i, int i2, int i3, long j, zzal[] zzalVarArr, boolean z) {
        this.zzc = i < 1000 ? 0 : 1000;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = j;
        this.zzg = zzalVarArr;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(Intent intent) {
        return intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && Arrays.equals(this.zzg, locationAvailability.zzg)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzc)});
    }

    public boolean isLocationAvailable() {
        return this.zzc < 1000;
    }

    public String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        return xra1.a(new StringBuilder(String.valueOf(isLocationAvailable).length() + 22), "LocationAvailability[", isLocationAvailable, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzd;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zze;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        long j = this.zzf;
        bb1.m0(3, parcel, 8);
        parcel.writeLong(j);
        int i4 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i4);
        bb1.j0(parcel, 5, this.zzg, i);
        boolean isLocationAvailable = isLocationAvailable();
        bb1.m0(6, parcel, 4);
        parcel.writeInt(isLocationAvailable ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
