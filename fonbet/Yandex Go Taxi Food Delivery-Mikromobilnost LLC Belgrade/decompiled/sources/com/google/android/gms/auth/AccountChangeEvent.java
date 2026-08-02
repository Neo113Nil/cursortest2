package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    final int zza;
    final long zzb;
    final String zzc;
    final int zzd;
    final int zze;
    final String zzf;

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.zza = 1;
        this.zzb = j;
        cvw.l(str);
        this.zzc = str;
        this.zzd = i;
        this.zze = i2;
        this.zzf = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && ooc.m(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && ooc.m(this.zzf, accountChangeEvent.zzf);
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf});
    }

    public String toString() {
        int i = this.zzd;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.zzc;
        String str3 = this.zzf;
        int i2 = this.zze;
        StringBuilder v = b64.v("AccountChangeEvent {accountName = ", str2, ", changeType = ", str, ", changeData = ");
        v.append(str3);
        v.append(", eventIndex = ");
        v.append(i2);
        v.append("}");
        return v.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        long j = this.zzb;
        bb1.m0(2, parcel, 8);
        parcel.writeLong(j);
        bb1.g0(parcel, 3, this.zzc, false);
        int i3 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i4);
        bb1.g0(parcel, 6, this.zzf, false);
        bb1.o0(parcel, n0);
    }

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.zza = i;
        this.zzb = j;
        cvw.l(str);
        this.zzc = str;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str2;
    }
}
