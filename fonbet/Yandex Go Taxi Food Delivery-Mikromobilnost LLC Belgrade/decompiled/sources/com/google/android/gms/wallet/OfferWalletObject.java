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
import defpackage.vt60;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzy();
    String zza;
    String zzb;
    CommonWalletObject zzc;
    private final int zzd;

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i >= 3) {
            this.zzc = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.a zza = CommonWalletObject.zza();
        zza.a(str);
        this.zzc = zza.a;
    }

    public static vt60 newBuilder() {
        new OfferWalletObject();
        vt60 vt60Var = new vt60();
        CommonWalletObject.zza();
        return vt60Var;
    }

    public String getBarcodeAlternateText() {
        return this.zzc.zzf();
    }

    @Deprecated
    public String getBarcodeLabel() {
        return this.zzc.zzi();
    }

    public String getBarcodeType() {
        return this.zzc.zzg();
    }

    public String getBarcodeValue() {
        return this.zzc.zzh();
    }

    public String getClassId() {
        return this.zzc.zzc();
    }

    public String getId() {
        return this.zzc.zzb();
    }

    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzc.zzr();
    }

    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzc.zzo();
    }

    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzc.zzn();
    }

    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzc.zzp();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzc.zzq();
    }

    public String getIssuerName() {
        return this.zzc.zze();
    }

    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzc.zzt();
    }

    public ArrayList<LatLng> getLocations() {
        return this.zzc.zzm();
    }

    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzc.zzk();
    }

    public String getRedemptionCode() {
        return this.zzb;
    }

    public int getState() {
        return this.zzc.zzj();
    }

    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzc.zzs();
    }

    public String getTitle() {
        return this.zzc.zzd();
    }

    public TimeInterval getValidTimeInterval() {
        return this.zzc.zzl();
    }

    public int getVersionCode() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int versionCode = getVersionCode();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(versionCode);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.o0(parcel, n0);
    }

    public OfferWalletObject() {
        this.zzd = 3;
    }
}
