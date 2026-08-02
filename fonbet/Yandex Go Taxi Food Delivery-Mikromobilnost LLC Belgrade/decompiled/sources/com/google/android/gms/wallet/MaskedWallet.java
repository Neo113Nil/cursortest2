package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.my00;

/* loaded from: classes11.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzv();
    String zza;
    String zzb;
    String[] zzc;
    String zzd;
    zza zze;
    zza zzf;
    LoyaltyWalletObject[] zzg;
    OfferWalletObject[] zzh;
    UserAddress zzi;
    UserAddress zzj;
    InstrumentInfo[] zzk;

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zzaVar, zza zzaVar2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = strArr;
        this.zzd = str3;
        this.zze = zzaVar;
        this.zzf = zzaVar2;
        this.zzg = loyaltyWalletObjectArr;
        this.zzh = offerWalletObjectArr;
        this.zzi = userAddress;
        this.zzj = userAddress2;
        this.zzk = instrumentInfoArr;
    }

    public static my00 newBuilderFrom(MaskedWallet maskedWallet) {
        cvw.l(maskedWallet);
        MaskedWallet maskedWallet2 = new MaskedWallet();
        my00 my00Var = new my00();
        maskedWallet2.zza = maskedWallet.getGoogleTransactionId();
        maskedWallet2.zzb = maskedWallet.getMerchantTransactionId();
        maskedWallet2.zzc = maskedWallet.getPaymentDescriptions();
        maskedWallet2.zzk = maskedWallet.getInstrumentInfos();
        maskedWallet2.zzd = maskedWallet.getEmail();
        maskedWallet2.zzg = maskedWallet.zzg;
        maskedWallet2.zzh = maskedWallet.zzh;
        maskedWallet2.zzi = maskedWallet.getBuyerBillingAddress();
        maskedWallet2.zzj = maskedWallet.getBuyerShippingAddress();
        return my00Var;
    }

    public UserAddress getBuyerBillingAddress() {
        return this.zzi;
    }

    public UserAddress getBuyerShippingAddress() {
        return this.zzj;
    }

    public String getEmail() {
        return this.zzd;
    }

    public String getGoogleTransactionId() {
        return this.zza;
    }

    public InstrumentInfo[] getInstrumentInfos() {
        return this.zzk;
    }

    public String getMerchantTransactionId() {
        return this.zzb;
    }

    public String[] getPaymentDescriptions() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.h0(parcel, 4, this.zzc, false);
        bb1.g0(parcel, 5, this.zzd, false);
        bb1.f0(parcel, 6, this.zze, i, false);
        bb1.f0(parcel, 7, this.zzf, i, false);
        bb1.j0(parcel, 8, this.zzg, i);
        bb1.j0(parcel, 9, this.zzh, i);
        bb1.f0(parcel, 10, this.zzi, i, false);
        bb1.f0(parcel, 11, this.zzj, i, false);
        bb1.j0(parcel, 12, this.zzk, i);
        bb1.o0(parcel, n0);
    }

    private MaskedWallet() {
    }
}
