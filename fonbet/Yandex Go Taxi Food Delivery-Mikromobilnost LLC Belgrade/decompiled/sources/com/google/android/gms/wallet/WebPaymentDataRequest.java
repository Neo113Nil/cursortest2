package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.gi41;

/* loaded from: classes11.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WebPaymentDataRequest> CREATOR = new zzas();
    Cart zza;
    String zzb;
    String zzc;
    byte[] zzd;
    boolean zze;
    Bundle zzf;

    public WebPaymentDataRequest(Cart cart, String str, String str2, byte[] bArr, boolean z, Bundle bundle) {
        this.zza = cart;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = z;
        this.zzf = bundle;
    }

    public static gi41 newBuilder() {
        WebPaymentDataRequest webPaymentDataRequest = new WebPaymentDataRequest();
        gi41 gi41Var = new gi41();
        webPaymentDataRequest.zze = false;
        return gi41Var;
    }

    public Cart getCart() {
        return this.zza;
    }

    public byte[] getEncryptedParameters() {
        byte[] bArr = this.zzd;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return bArr;
    }

    public String getMerchantOrigin() {
        return this.zzb;
    }

    public Bundle getSavedState() {
        return this.zzf;
    }

    public Boolean getUseChromiumPaymentDetailsUpdate() {
        return Boolean.valueOf(this.zze);
    }

    public String getWalletParameters() {
        return this.zzc;
    }

    public WebPaymentDataRequest withSavedState(Bundle bundle) {
        this.zzf = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, this.zza, i, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.g0(parcel, 4, this.zzc, false);
        bb1.U(parcel, 5, this.zzf, false);
        bb1.V(parcel, 6, this.zzd, false);
        boolean z = this.zze;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    private WebPaymentDataRequest() {
    }
}
