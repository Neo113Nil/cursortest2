package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzl();
    String zza;
    String zzb;
    ProxyCard zzc;
    String zzd;
    zza zze;
    zza zzf;
    String[] zzg;
    UserAddress zzh;
    UserAddress zzi;
    InstrumentInfo[] zzj;
    PaymentMethodToken zzk;

    public FullWallet(String str, String str2, ProxyCard proxyCard, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = proxyCard;
        this.zzd = str3;
        this.zze = zzaVar;
        this.zzf = zzaVar2;
        this.zzg = strArr;
        this.zzh = userAddress;
        this.zzi = userAddress2;
        this.zzj = instrumentInfoArr;
        this.zzk = paymentMethodToken;
    }

    public UserAddress getBuyerBillingAddress() {
        return this.zzh;
    }

    public UserAddress getBuyerShippingAddress() {
        return this.zzi;
    }

    public String getEmail() {
        return this.zzd;
    }

    public String getGoogleTransactionId() {
        return this.zza;
    }

    public InstrumentInfo[] getInstrumentInfos() {
        return this.zzj;
    }

    public String getMerchantTransactionId() {
        return this.zzb;
    }

    public String[] getPaymentDescriptions() {
        return this.zzg;
    }

    public PaymentMethodToken getPaymentMethodToken() {
        return this.zzk;
    }

    public ProxyCard getProxyCard() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.g0(parcel, 5, this.zzd, false);
        bb1.f0(parcel, 6, this.zze, i, false);
        bb1.f0(parcel, 7, this.zzf, i, false);
        bb1.h0(parcel, 8, this.zzg, false);
        bb1.f0(parcel, 9, this.zzh, i, false);
        bb1.f0(parcel, 10, this.zzi, i, false);
        bb1.j0(parcel, 11, this.zzj, i);
        bb1.f0(parcel, 12, this.zzk, i, false);
        bb1.o0(parcel, n0);
    }

    private FullWallet() {
    }
}
