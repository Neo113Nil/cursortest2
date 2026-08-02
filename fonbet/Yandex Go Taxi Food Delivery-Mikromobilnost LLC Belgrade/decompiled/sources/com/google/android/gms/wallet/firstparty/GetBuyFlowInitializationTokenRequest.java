package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

@Deprecated
/* loaded from: classes11.dex */
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new zzc();
    byte[] zza;
    byte[] zzb;

    public GetBuyFlowInitializationTokenRequest(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public byte[] getEncryptedBuyFlowParameters() {
        return this.zza;
    }

    public byte[] getUnencryptedBuyFlowParameters() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, this.zza, false);
        bb1.V(parcel, 3, this.zzb, false);
        bb1.o0(parcel, n0);
    }

    public GetBuyFlowInitializationTokenRequest() {
        this(null, null);
    }
}
