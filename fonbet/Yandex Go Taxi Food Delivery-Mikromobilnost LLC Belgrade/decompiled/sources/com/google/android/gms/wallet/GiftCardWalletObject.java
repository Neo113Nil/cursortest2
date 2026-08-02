package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import defpackage.bb1;
import defpackage.bht;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzn();
    CommonWalletObject zza;
    String zzb;
    String zzc;

    @Deprecated
    String zzd;
    long zze;
    String zzf;
    long zzg;
    String zzh;

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.zza();
        this.zza = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j;
        this.zzf = str4;
        this.zzg = j2;
        this.zzh = str5;
        this.zzd = str3;
    }

    public static bht newBuilder() {
        new GiftCardWalletObject();
        bht bhtVar = new bht();
        CommonWalletObject.zza();
        return bhtVar;
    }

    public String getBalanceCurrencyCode() {
        return this.zzf;
    }

    public long getBalanceMicros() {
        return this.zze;
    }

    public long getBalanceUpdateTime() {
        return this.zzg;
    }

    public String getBarcodeAlternateText() {
        return this.zza.zzf();
    }

    @Deprecated
    public String getBarcodeLabel() {
        return this.zza.zzi();
    }

    public String getBarcodeType() {
        return this.zza.zzg();
    }

    public String getBarcodeValue() {
        return this.zza.zzh();
    }

    @Deprecated
    public String getCardIdentifier() {
        return this.zzd;
    }

    public String getCardNumber() {
        return this.zzb;
    }

    public String getClassId() {
        return this.zza.zzc();
    }

    public String getEventNumber() {
        return this.zzh;
    }

    public String getId() {
        return this.zza.zzb();
    }

    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zza.zzr();
    }

    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zza.zzo();
    }

    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zza.zzn();
    }

    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zza.zzp();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zza.zzq();
    }

    public String getIssuerName() {
        return this.zza.zze();
    }

    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zza.zzt();
    }

    public ArrayList<LatLng> getLocations() {
        return this.zza.zzm();
    }

    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zza.zzk();
    }

    public String getPin() {
        return this.zzc;
    }

    public int getState() {
        return this.zza.zzj();
    }

    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zza.zzs();
    }

    public String getTitle() {
        return this.zza.zzd();
    }

    public TimeInterval getValidTimeInterval() {
        return this.zza.zzl();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, this.zza, i, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.g0(parcel, 5, this.zzd, false);
        long j = this.zze;
        bb1.m0(6, parcel, 8);
        parcel.writeLong(j);
        bb1.g0(parcel, 7, this.zzf, false);
        long j2 = this.zzg;
        bb1.m0(8, parcel, 8);
        parcel.writeLong(j2);
        bb1.g0(parcel, 9, this.zzh, false);
        bb1.o0(parcel, n0);
    }

    public GiftCardWalletObject() {
        this.zza = CommonWalletObject.zza().a;
    }
}
