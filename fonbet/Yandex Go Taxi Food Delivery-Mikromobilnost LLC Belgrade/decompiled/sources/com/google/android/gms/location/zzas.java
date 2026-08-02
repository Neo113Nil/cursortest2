package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    public zzas(int i, int i2, int i3, int i4) {
        cvw.n("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        cvw.n("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
        cvw.n("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
        cvw.n("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
        cvw.n("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.zza == zzasVar.zza && this.zzb == zzasVar.zzb && this.zzc == zzasVar.zzc && this.zzd == zzasVar.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length3 = String.valueOf(i3).length();
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i4).length() + 1);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cvw.l(parcel);
        int i2 = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i4);
        int i5 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i5);
        bb1.o0(parcel, n0);
    }
}
