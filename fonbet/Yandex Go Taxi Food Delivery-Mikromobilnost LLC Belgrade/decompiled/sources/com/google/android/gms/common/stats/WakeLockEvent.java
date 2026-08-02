package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.bb1;
import defpackage.g8e;
import java.util.List;

@Deprecated
/* loaded from: classes11.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        long j = this.zzb;
        bb1.m0(2, parcel, 8);
        parcel.writeLong(j);
        bb1.g0(parcel, 4, this.zzd, false);
        int i3 = this.zzg;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i3);
        bb1.i0(parcel, 6, this.zzh);
        long j2 = this.zzj;
        bb1.m0(8, parcel, 8);
        parcel.writeLong(j2);
        bb1.g0(parcel, 10, this.zze, false);
        int i4 = this.zzc;
        bb1.m0(11, parcel, 4);
        parcel.writeInt(i4);
        bb1.g0(parcel, 12, this.zzi, false);
        bb1.g0(parcel, 13, this.zzl, false);
        int i5 = this.zzk;
        bb1.m0(14, parcel, 4);
        parcel.writeInt(i5);
        float f = this.zzm;
        bb1.m0(15, parcel, 4);
        parcel.writeFloat(f);
        long j3 = this.zzn;
        bb1.m0(16, parcel, 8);
        parcel.writeLong(j3);
        bb1.g0(parcel, 17, this.zzf, false);
        boolean z = this.zzo;
        bb1.m0(18, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String join = list == null ? "" : TextUtils.join(",", list);
        int i = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f = this.zzm;
        String str3 = this.zzf;
        int i2 = this.zzg;
        String str4 = this.zzd;
        boolean z = this.zzo;
        int length = String.valueOf(i).length() + String.valueOf(i2).length() + String.valueOf(str4).length() + 2 + 1 + String.valueOf(join).length() + 1;
        if (str == null) {
            str = "";
        }
        int length2 = str.length() + length + 1 + 1;
        if (str2 == null) {
            str2 = "";
        }
        int length3 = String.valueOf(f).length() + str2.length() + length2 + 1 + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb = new StringBuilder(str5.length() + length3 + 1 + String.valueOf(z).length());
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i);
        g8e.D(sb, "\t", str, "\t", str2);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
