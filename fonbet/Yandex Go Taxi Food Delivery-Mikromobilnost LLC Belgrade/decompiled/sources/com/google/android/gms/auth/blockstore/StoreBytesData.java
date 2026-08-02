package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new zze();
    private final byte[] zza;
    private final boolean zzb;
    private final String zzc;

    public StoreBytesData(byte[] bArr, boolean z, String str) {
        this.zza = bArr;
        this.zzb = z;
        this.zzc = str;
    }

    public byte[] getBytes() {
        return this.zza;
    }

    public String getKey() {
        return this.zzc;
    }

    public boolean shouldBackupToCloud() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 1, getBytes(), false);
        boolean shouldBackupToCloud = shouldBackupToCloud();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(shouldBackupToCloud ? 1 : 0);
        bb1.g0(parcel, 3, getKey(), false);
        bb1.o0(parcel, n0);
    }
}
