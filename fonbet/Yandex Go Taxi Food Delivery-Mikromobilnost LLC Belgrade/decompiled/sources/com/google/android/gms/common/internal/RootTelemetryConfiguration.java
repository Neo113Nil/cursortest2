package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzag();
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    public int getVersion() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int version = getVersion();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(version);
        boolean methodInvocationTelemetryEnabled = getMethodInvocationTelemetryEnabled();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(methodInvocationTelemetryEnabled ? 1 : 0);
        boolean methodTimingTelemetryEnabled = getMethodTimingTelemetryEnabled();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(methodTimingTelemetryEnabled ? 1 : 0);
        int batchPeriodMillis = getBatchPeriodMillis();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(batchPeriodMillis);
        int maxMethodInvocationsInBatch = getMaxMethodInvocationsInBatch();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(maxMethodInvocationsInBatch);
        bb1.o0(parcel, n0);
    }
}
