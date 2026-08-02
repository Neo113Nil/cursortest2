package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.ny00;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new zzw();
    String zza;
    boolean zzb;
    boolean zzc;
    boolean zzd;
    String zze;
    String zzf;
    String zzg;
    Cart zzh;
    boolean zzi;
    boolean zzj;
    CountrySpecification[] zzk;
    boolean zzl;
    boolean zzm;
    ArrayList zzn;
    PaymentMethodTokenizationParameters zzo;
    ArrayList zzp;
    String zzq;

    public MaskedWalletRequest(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList2, String str5) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = cart;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = countrySpecificationArr;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = arrayList;
        this.zzo = paymentMethodTokenizationParameters;
        this.zzp = arrayList2;
        this.zzq = str5;
    }

    public static ny00 newBuilder() {
        new MaskedWalletRequest();
        return new ny00();
    }

    public boolean allowDebitCard() {
        return this.zzm;
    }

    public boolean allowPrepaidCard() {
        return this.zzl;
    }

    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzp;
    }

    public ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> getAllowedCountrySpecificationsForShipping() {
        return this.zzn;
    }

    public CountrySpecification[] getAllowedShippingCountrySpecifications() {
        return this.zzk;
    }

    public Cart getCart() {
        return this.zzh;
    }

    public String getCountryCode() {
        return this.zzq;
    }

    public String getCurrencyCode() {
        return this.zzf;
    }

    public String getEstimatedTotalPrice() {
        return this.zze;
    }

    public String getMerchantName() {
        return this.zzg;
    }

    public String getMerchantTransactionId() {
        return this.zza;
    }

    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzo;
    }

    @Deprecated
    public boolean isBillingAgreement() {
        return this.zzj;
    }

    public boolean isPhoneNumberRequired() {
        return this.zzb;
    }

    public boolean isShippingAddressRequired() {
        return this.zzc;
    }

    @Deprecated
    public boolean useMinimalBillingAddress() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        boolean z = this.zzb;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z3 ? 1 : 0);
        bb1.g0(parcel, 6, this.zze, false);
        bb1.g0(parcel, 7, this.zzf, false);
        bb1.g0(parcel, 8, this.zzg, false);
        bb1.f0(parcel, 9, this.zzh, i, false);
        boolean z4 = this.zzi;
        bb1.m0(10, parcel, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzj;
        bb1.m0(11, parcel, 4);
        parcel.writeInt(z5 ? 1 : 0);
        bb1.j0(parcel, 12, this.zzk, i);
        boolean z6 = this.zzl;
        bb1.m0(13, parcel, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzm;
        bb1.m0(14, parcel, 4);
        parcel.writeInt(z7 ? 1 : 0);
        bb1.k0(parcel, 15, this.zzn, false);
        bb1.f0(parcel, 16, this.zzo, i, false);
        bb1.c0(parcel, 17, this.zzp);
        bb1.g0(parcel, 18, this.zzq, false);
        bb1.o0(parcel, n0);
    }

    public MaskedWalletRequest() {
        this.zzl = true;
        this.zzm = true;
    }
}
