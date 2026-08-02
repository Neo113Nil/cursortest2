package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class SetUpBiometricAuthenticationKeysRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpBiometricAuthenticationKeysRequest> CREATOR = new zzk();
    final byte[] zza;

    public SetUpBiometricAuthenticationKeysRequest() {
        this.zza = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 1, bArr, false);
        bb1.o0(parcel, n0);
    }

    public SetUpBiometricAuthenticationKeysRequest(byte[] bArr) {
        this.zza = bArr;
    }
}
