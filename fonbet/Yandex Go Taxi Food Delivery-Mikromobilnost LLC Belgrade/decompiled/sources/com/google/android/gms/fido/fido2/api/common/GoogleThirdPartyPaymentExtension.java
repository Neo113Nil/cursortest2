package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new zzaf();
    private final boolean zza;

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.zza = z;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.zza == ((GoogleThirdPartyPaymentExtension) obj).getThirdPartyPayment();
    }

    public boolean getThirdPartyPayment() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean thirdPartyPayment = getThirdPartyPayment();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(thirdPartyPayment ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
