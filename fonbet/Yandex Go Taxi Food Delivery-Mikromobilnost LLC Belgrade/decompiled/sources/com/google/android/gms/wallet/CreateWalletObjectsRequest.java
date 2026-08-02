package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.o8f;

/* loaded from: classes11.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new zzi();
    public static final int REQUEST_IMMEDIATE_SAVE = 1;
    public static final int SHOW_SAVE_PROMPT = 0;
    LoyaltyWalletObject zza;
    OfferWalletObject zzb;
    GiftCardWalletObject zzc;
    int zzd;

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.zza = loyaltyWalletObject;
        this.zzb = offerWalletObject;
        this.zzc = giftCardWalletObject;
        this.zzd = i;
    }

    public static o8f newBuilder() {
        new CreateWalletObjectsRequest();
        return new o8f();
    }

    public int getCreateMode() {
        return this.zzd;
    }

    public GiftCardWalletObject getGiftCardWalletObject() {
        return this.zzc;
    }

    public LoyaltyWalletObject getLoyaltyWalletObject() {
        return this.zza;
    }

    public OfferWalletObject getOfferWalletObject() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, this.zza, i, false);
        bb1.f0(parcel, 3, this.zzb, i, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        int i2 = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    @Deprecated
    public CreateWalletObjectsRequest(GiftCardWalletObject giftCardWalletObject) {
        this.zzc = giftCardWalletObject;
    }

    @Deprecated
    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject) {
        this.zza = loyaltyWalletObject;
    }

    public CreateWalletObjectsRequest() {
    }

    @Deprecated
    public CreateWalletObjectsRequest(OfferWalletObject offerWalletObject) {
        this.zzb = offerWalletObject;
    }
}
