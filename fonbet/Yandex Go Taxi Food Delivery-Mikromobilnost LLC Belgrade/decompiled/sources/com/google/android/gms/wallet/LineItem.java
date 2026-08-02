package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.phy;

/* loaded from: classes11.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LineItem> CREATOR = new zzt();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    int zze;
    String zzf;

    public LineItem(String str, String str2, String str3, String str4, int i, String str5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i;
        this.zzf = str5;
    }

    public static phy newBuilder() {
        new LineItem();
        return new phy();
    }

    public String getCurrencyCode() {
        return this.zzf;
    }

    public String getDescription() {
        return this.zza;
    }

    public String getQuantity() {
        return this.zzb;
    }

    public int getRole() {
        return this.zze;
    }

    public String getTotalPrice() {
        return this.zzd;
    }

    public String getUnitPrice() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.g0(parcel, 5, this.zzd, false);
        int i2 = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 7, this.zzf, false);
        bb1.o0(parcel, n0);
    }

    public LineItem() {
        this.zze = 0;
    }
}
