package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.bb1;
import defpackage.g8e;
import defpackage.ooc;
import defpackage.unr0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR;
    static final List zza = Collections.EMPTY_LIST;
    static final DeviceOrientationRequest zzb;
    final DeviceOrientationRequest zzc;
    final List zzd;
    final String zze;

    static {
        new StringBuilder(String.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).length() + 102).append("Invalid interval: 20000 should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        zzb = new DeviceOrientationRequest(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, false);
        CREATOR = new zzi();
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.zzc = deviceOrientationRequest;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return ooc.m(this.zzc, zzhVar.zzc) && ooc.m(this.zzd, zzhVar.zzd) && ooc.m(this.zze, zzhVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.zze;
        StringBuilder sb = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        g8e.D(sb, "DeviceOrientationRequestInternal[deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return unr0.r(sb, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zzc, i, false);
        bb1.k0(parcel, 2, this.zzd, false);
        bb1.g0(parcel, 3, this.zze, false);
        bb1.o0(parcel, n0);
    }
}
