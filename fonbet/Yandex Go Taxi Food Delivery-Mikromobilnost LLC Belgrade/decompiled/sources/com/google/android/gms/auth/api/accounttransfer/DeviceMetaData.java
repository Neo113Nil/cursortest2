package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzy();
    final int zza;
    private final boolean zzb;
    private final long zzc;
    private final boolean zzd;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        boolean isLockScreenSolved = isLockScreenSolved();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(isLockScreenSolved ? 1 : 0);
        long minAgeOfLockScreen = getMinAgeOfLockScreen();
        bb1.m0(3, parcel, 8);
        parcel.writeLong(minAgeOfLockScreen);
        boolean isChallengeAllowed = isChallengeAllowed();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(isChallengeAllowed ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
