package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();
    private final RootTelemetryConfiguration zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    public int getMaxMethodInvocationsLogged() {
        return this.zze;
    }

    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.zzd;
    }

    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.zzf;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zza, i, false);
        boolean methodInvocationTelemetryEnabled = getMethodInvocationTelemetryEnabled();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(methodInvocationTelemetryEnabled ? 1 : 0);
        boolean methodTimingTelemetryEnabled = getMethodTimingTelemetryEnabled();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(methodTimingTelemetryEnabled ? 1 : 0);
        bb1.b0(parcel, 4, getMethodInvocationMethodKeyAllowlist(), false);
        int maxMethodInvocationsLogged = getMaxMethodInvocationsLogged();
        bb1.m0(5, parcel, 4);
        parcel.writeInt(maxMethodInvocationsLogged);
        bb1.b0(parcel, 6, getMethodInvocationMethodKeyDisallowlist(), false);
        bb1.o0(parcel, n0);
    }

    public final RootTelemetryConfiguration zza() {
        return this.zza;
    }
}
