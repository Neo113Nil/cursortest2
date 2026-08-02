package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class PaymentMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMetadata> CREATOR = new zzae();
    final String zza;

    public PaymentMetadata(String str) {
        cvw.m(str, "responseJson cannot be null!");
        this.zza = str;
    }

    public static PaymentMetadata fromJson(String str) {
        return new PaymentMetadata(str);
    }

    public String toJson() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        bb1.o0(parcel, n0);
    }
}
