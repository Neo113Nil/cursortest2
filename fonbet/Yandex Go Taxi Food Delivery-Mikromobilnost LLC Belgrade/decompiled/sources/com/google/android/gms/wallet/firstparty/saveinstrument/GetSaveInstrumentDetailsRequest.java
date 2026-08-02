package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.zct;

/* loaded from: classes11.dex */
public class GetSaveInstrumentDetailsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSaveInstrumentDetailsRequest> CREATOR = new zzb();
    String zza;
    long zzb;

    public GetSaveInstrumentDetailsRequest(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public static zct newBuilder() {
        new GetSaveInstrumentDetailsRequest();
        return new zct();
    }

    public long getBillingCustomerNumber() {
        return this.zzb;
    }

    public String getMerchantAppPackageName() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, this.zza, false);
        long j = this.zzb;
        bb1.m0(2, parcel, 8);
        parcel.writeLong(j);
        bb1.o0(parcel, n0);
    }

    private GetSaveInstrumentDetailsRequest() {
    }
}
