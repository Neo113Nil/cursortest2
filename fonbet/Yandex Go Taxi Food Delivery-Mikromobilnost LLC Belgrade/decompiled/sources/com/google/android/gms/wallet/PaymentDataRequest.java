package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzad();
    boolean zza;
    boolean zzb;
    CardRequirements zzc;
    boolean zzd;
    ShippingAddressRequirements zze;
    ArrayList zzf;
    PaymentMethodTokenizationParameters zzg;
    TransactionInfo zzh;
    boolean zzi;
    String zzj;
    byte[] zzk;
    Bundle zzl;

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, byte[] bArr, Bundle bundle) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = cardRequirements;
        this.zzd = z3;
        this.zze = shippingAddressRequirements;
        this.zzf = arrayList;
        this.zzg = paymentMethodTokenizationParameters;
        this.zzh = transactionInfo;
        this.zzi = z4;
        this.zzj = str;
        this.zzk = bArr;
        this.zzl = bundle;
    }

    public static PaymentDataRequest fromJson(String str) {
        c newBuilder = newBuilder();
        cvw.m(str, "paymentDataRequestJson cannot be null!");
        newBuilder.a.zzj = str;
        return newBuilder.b();
    }

    @Deprecated
    public static c newBuilder() {
        return new c(new PaymentDataRequest());
    }

    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzf;
    }

    @Deprecated
    public CardRequirements getCardRequirements() {
        return this.zzc;
    }

    @Deprecated
    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzg;
    }

    public Bundle getSavedState() {
        return this.zzl;
    }

    @Deprecated
    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zze;
    }

    @Deprecated
    public TransactionInfo getTransactionInfo() {
        return this.zzh;
    }

    @Deprecated
    public boolean isEmailRequired() {
        return this.zza;
    }

    @Deprecated
    public boolean isPhoneNumberRequired() {
        return this.zzb;
    }

    @Deprecated
    public boolean isShippingAddressRequired() {
        return this.zzd;
    }

    @Deprecated
    public boolean isUiRequired() {
        return this.zzi;
    }

    public String toJson() {
        return this.zzj;
    }

    public PaymentDataRequest withSavedState(Bundle bundle) {
        this.zzl = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean z = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.f0(parcel, 3, this.zzc, i, false);
        boolean z3 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(z3 ? 1 : 0);
        bb1.f0(parcel, 5, this.zze, i, false);
        bb1.c0(parcel, 6, this.zzf);
        bb1.f0(parcel, 7, this.zzg, i, false);
        bb1.f0(parcel, 8, this.zzh, i, false);
        boolean z4 = this.zzi;
        bb1.m0(9, parcel, 4);
        parcel.writeInt(z4 ? 1 : 0);
        bb1.g0(parcel, 10, this.zzj, false);
        bb1.U(parcel, 11, this.zzl, false);
        bb1.V(parcel, 12, this.zzk, false);
        bb1.o0(parcel, n0);
    }

    private PaymentDataRequest() {
        this.zzi = true;
    }
}
