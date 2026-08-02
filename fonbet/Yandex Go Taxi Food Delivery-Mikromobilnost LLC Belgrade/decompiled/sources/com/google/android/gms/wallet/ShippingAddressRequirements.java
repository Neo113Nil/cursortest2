package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.rvr0;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzan();
    ArrayList zza;

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public static rvr0 newBuilder() {
        new ShippingAddressRequirements();
        return new rvr0();
    }

    public ArrayList<String> getAllowedCountryCodes() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.i0(parcel, 1, this.zza);
        bb1.o0(parcel, n0);
    }

    private ShippingAddressRequirements() {
    }
}
