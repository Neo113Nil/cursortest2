package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new zzn();
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;
    private final long zza;
    private final boolean zzb;

    public DeviceOrientationRequest(long j, boolean z) {
        this.zza = j;
        this.zzb = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.zza == deviceOrientationRequest.zza && this.zzb == deviceOrientationRequest.zzb;
    }

    public long getSamplingPeriodMicros() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    public String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        String str = true != this.zzb ? "" : ", withVelocity";
        StringBuilder sb = new StringBuilder(str.length() + length + 46 + 1);
        sb.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(j);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        long samplingPeriodMicros = getSamplingPeriodMicros();
        bb1.m0(2, parcel, 8);
        parcel.writeLong(samplingPeriodMicros);
        boolean z = this.zzb;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzb() {
        return this.zzb;
    }
}
