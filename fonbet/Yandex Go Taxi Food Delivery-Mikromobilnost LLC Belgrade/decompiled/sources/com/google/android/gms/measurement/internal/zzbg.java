package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cvw;
import defpackage.g8e;
import defpackage.oyr;

/* loaded from: classes.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new zzbh();
    public final String zza;
    public final zzbe zzb;
    public final String zzc;
    public final long zzd;

    public zzbg(zzbg zzbgVar, long j) {
        cvw.l(zzbgVar);
        this.zza = zzbgVar.zza;
        this.zzb = zzbgVar.zzb;
        this.zzc = zzbgVar.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        g8e.D(sb, "origin=", str, ",name=", str2);
        return oyr.t(sb, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzbh.zza(this, parcel, i);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j) {
        this.zza = str;
        this.zzb = zzbeVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
