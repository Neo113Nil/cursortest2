package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExecuteBuyFlowRequest> CREATOR = new zza();
    byte[] zza;
    byte[] zzb;
    WalletCustomTheme zzc;

    public ExecuteBuyFlowRequest(byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = walletCustomTheme;
    }

    public byte[] getClientParams() {
        return this.zzb;
    }

    public byte[] getEncryptedParams() {
        return this.zza;
    }

    public WalletCustomTheme getWalletCustomTheme() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 2, this.zza, false);
        bb1.V(parcel, 3, this.zzb, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.o0(parcel, n0);
    }

    public ExecuteBuyFlowRequest(byte[] bArr) {
        this(bArr, new byte[0], null);
    }
}
