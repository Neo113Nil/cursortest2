package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import defpackage.bb1;
import defpackage.wxz;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzu();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;

    @Deprecated
    String zzi;
    String zzj;
    int zzk;
    final ArrayList zzl;
    TimeInterval zzm;
    final ArrayList zzn;

    @Deprecated
    String zzo;

    @Deprecated
    String zzp;
    final ArrayList zzq;
    boolean zzr;
    final ArrayList zzs;
    final ArrayList zzt;
    final ArrayList zzu;
    LoyaltyPoints zzv;

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
    }

    public static wxz newBuilder() {
        new LoyaltyWalletObject();
        return new wxz();
    }

    public String getAccountId() {
        return this.zzb;
    }

    public String getAccountName() {
        return this.zze;
    }

    public String getBarcodeAlternateText() {
        return this.zzf;
    }

    @Deprecated
    public String getBarcodeLabel() {
        return this.zzi;
    }

    public String getBarcodeType() {
        return this.zzg;
    }

    public String getBarcodeValue() {
        return this.zzh;
    }

    public String getClassId() {
        return this.zzj;
    }

    public String getId() {
        return this.zza;
    }

    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzs;
    }

    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzp;
    }

    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzo;
    }

    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzq;
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzr;
    }

    public String getIssuerName() {
        return this.zzc;
    }

    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzu;
    }

    public ArrayList<LatLng> getLocations() {
        return this.zzn;
    }

    public LoyaltyPoints getLoyaltyPoints() {
        return this.zzv;
    }

    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzl;
    }

    public String getProgramName() {
        return this.zzd;
    }

    public int getState() {
        return this.zzk;
    }

    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzt;
    }

    public TimeInterval getValidTimeInterval() {
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
        int i2 = this.zzk;
        bb1.m0(12, parcel, 4);
        parcel.writeInt(i2);
        bb1.k0(parcel, 13, this.zzl, false);
        bb1.f0(parcel, 14, this.zzm, i, false);
        bb1.k0(parcel, 15, this.zzn, false);
        bb1.g0(parcel, 16, this.zzo, false);
        bb1.g0(parcel, 17, this.zzp, false);
        bb1.k0(parcel, 18, this.zzq, false);
        boolean z = this.zzr;
        bb1.m0(19, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.k0(parcel, 20, this.zzs, false);
        bb1.k0(parcel, 21, this.zzt, false);
        bb1.k0(parcel, 22, this.zzu, false);
        bb1.f0(parcel, 23, this.zzv, i, false);
        bb1.o0(parcel, n0);
    }

    public LoyaltyWalletObject() {
        this.zzl = new ArrayList();
        this.zzn = new ArrayList();
        this.zzq = new ArrayList();
        this.zzs = new ArrayList();
        this.zzt = new ArrayList();
        this.zzu = new ArrayList();
    }
}
