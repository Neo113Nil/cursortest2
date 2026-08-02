package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.hwa1;

/* loaded from: classes11.dex */
public final class WebPaymentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<WebPaymentData> CREATOR = new zzar();
    String zza;
    Bundle zzb;

    public WebPaymentData(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public static WebPaymentData getFromIntent(Intent intent) {
        return (WebPaymentData) hwa1.b(intent, "com.google.android.gms.wallet.WebPaymentData", CREATOR);
    }

    public static void putIntoIntent(Intent intent, WebPaymentData webPaymentData) {
        intent.putExtra("com.google.android.gms.wallet.WebPaymentData", hwa1.f(webPaymentData));
    }

    public String getWalletData() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.U(parcel, 3, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    private WebPaymentData() {
    }
}
