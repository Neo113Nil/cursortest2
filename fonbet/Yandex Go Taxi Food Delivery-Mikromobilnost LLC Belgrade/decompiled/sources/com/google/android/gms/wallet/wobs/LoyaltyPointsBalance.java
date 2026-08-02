package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvz;

/* loaded from: classes11.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zze();
    int zza;
    String zzb;
    double zzc;
    String zzd;
    long zze;
    int zzf;

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = d;
        this.zzd = str2;
        this.zze = j;
        this.zzf = i2;
    }

    public static cvz newBuilder() {
        new LoyaltyPointsBalance();
        return new cvz();
    }

    public String getCurrencyCode() {
        return this.zzd;
    }

    public long getCurrencyMicros() {
        return this.zze;
    }

    public double getDouble() {
        return this.zzc;
    }

    public int getInt() {
        return this.zza;
    }

    public String getString() {
        return this.zzb;
    }

    public int getType() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 3, this.zzb, false);
        double d = this.zzc;
        bb1.m0(4, parcel, 8);
        parcel.writeDouble(d);
        bb1.g0(parcel, 5, this.zzd, false);
        long j = this.zze;
        bb1.m0(6, parcel, 8);
        parcel.writeLong(j);
        int i3 = this.zzf;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }

    public LoyaltyPointsBalance() {
        this.zzf = -1;
        this.zza = -1;
        this.zzc = -1.0d;
    }
}
