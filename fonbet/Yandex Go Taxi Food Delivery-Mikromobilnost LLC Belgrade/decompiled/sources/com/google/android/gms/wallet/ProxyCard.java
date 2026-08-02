package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

@Deprecated
/* loaded from: classes11.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyCard> CREATOR = new zzam();
    final String zza;
    final String zzb;
    final int zzc;
    final int zzd;

    public ProxyCard(String str, String str2, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    public String getCvn() {
        return this.zzb;
    }

    public int getExpirationMonth() {
        return this.zzc;
    }

    public int getExpirationYear() {
        return this.zzd;
    }

    public String getPan() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, str, false);
        bb1.g0(parcel, 3, this.zzb, false);
        int i2 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }
}
