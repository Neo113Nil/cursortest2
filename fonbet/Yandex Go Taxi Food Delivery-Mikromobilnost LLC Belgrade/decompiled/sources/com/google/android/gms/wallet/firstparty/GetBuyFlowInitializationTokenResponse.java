package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenResponse> CREATOR = new zzd();
    byte[] zza;

    public GetBuyFlowInitializationTokenResponse() {
        this(new byte[0]);
    }

    public byte[] getBuyFlowInitializationToken() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, this.zza, false);
        bb1.o0(parcel, n0);
    }

    public GetBuyFlowInitializationTokenResponse(byte[] bArr) {
        this.zza = bArr;
    }
}
