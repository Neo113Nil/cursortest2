package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.lza1;

/* loaded from: classes11.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    private final boolean zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    public zzr(boolean z, String str, int i, int i2, long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = lza1.l(i) - 1;
        int i3 = 1;
        int[] iArr = {1, 2, 3};
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            int i5 = iArr[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == i2) {
                i3 = i5;
                break;
            }
            i4++;
        }
        this.zzd = i3 - 1;
        this.zze = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean z = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 2, this.zzb, false);
        int i2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i3);
        long j = this.zze;
        bb1.m0(5, parcel, 8);
        parcel.writeLong(j);
        bb1.o0(parcel, n0);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final long zzc() {
        return this.zze;
    }

    public final int zzd() {
        return lza1.l(this.zzc);
    }

    public final int zze() {
        int i = this.zzd;
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
