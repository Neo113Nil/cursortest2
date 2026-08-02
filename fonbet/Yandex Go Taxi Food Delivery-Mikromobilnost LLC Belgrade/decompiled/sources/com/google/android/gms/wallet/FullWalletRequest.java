package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.gjs;

/* loaded from: classes11.dex */
public final class FullWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWalletRequest> CREATOR = new zzm();
    String zza;
    String zzb;
    Cart zzc;

    public FullWalletRequest(String str, String str2, Cart cart) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = cart;
    }

    public static gjs newBuilder() {
        new FullWalletRequest();
        return new gjs();
    }

    public Cart getCart() {
        return this.zzc;
    }

    public String getGoogleTransactionId() {
        return this.zza;
    }

    public String getMerchantTransactionId() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.o0(parcel, n0);
    }

    public FullWalletRequest() {
    }
}
