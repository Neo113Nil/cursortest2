package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;
    String zzj;
    String zzk;
    String zzl;
    boolean zzm;
    String zzn;
    String zzo;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z;
        this.zzn = str13;
        this.zzo = str14;
    }

    public static UserAddress fromIntent(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    public String getAddress1() {
        return this.zzb;
    }

    public String getAddress2() {
        return this.zzc;
    }

    public String getAddress3() {
        return this.zzd;
    }

    public String getAddress4() {
        return this.zze;
    }

    public String getAddress5() {
        return this.zzf;
    }

    public String getAdministrativeArea() {
        return this.zzg;
    }

    public String getCompanyName() {
        return this.zzn;
    }

    public String getCountryCode() {
        return this.zzi;
    }

    public String getEmailAddress() {
        return this.zzo;
    }

    public String getLocality() {
        return this.zzh;
    }

    public String getName() {
        return this.zza;
    }

    public String getPhoneNumber() {
        return this.zzl;
    }

    public String getPostalCode() {
        return this.zzj;
    }

    public String getSortingCode() {
        return this.zzk;
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.g0(parcel, 5, this.zzd, false);
        bb1.g0(parcel, 6, this.zze, false);
        bb1.g0(parcel, 7, this.zzf, false);
        bb1.g0(parcel, 8, this.zzg, false);
        bb1.g0(parcel, 9, this.zzh, false);
        bb1.g0(parcel, 10, this.zzi, false);
        bb1.g0(parcel, 11, this.zzj, false);
        bb1.g0(parcel, 12, this.zzk, false);
        bb1.g0(parcel, 13, this.zzl, false);
        boolean z = this.zzm;
        bb1.m0(14, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 15, this.zzn, false);
        bb1.g0(parcel, 16, this.zzo, false);
        bb1.o0(parcel, n0);
    }

    public UserAddress() {
    }
}
