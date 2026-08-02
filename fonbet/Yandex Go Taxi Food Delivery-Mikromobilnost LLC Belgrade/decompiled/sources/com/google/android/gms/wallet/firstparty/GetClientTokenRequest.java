package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a5t;
import defpackage.bb1;
import defpackage.ny61;

/* loaded from: classes11.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetClientTokenRequest> CREATOR = new zzf();
    WalletCustomTheme zza;
    boolean zzb;
    int zzc;

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.zza = walletCustomTheme;
        this.zzb = z;
        this.zzc = i;
        if (walletCustomTheme != null) {
            return;
        }
        ny61.t("WalletCustomTheme is required");
        throw null;
    }

    public static a5t newBuilder() {
        new GetClientTokenRequest();
        return new a5t();
    }

    public int getDarkLightMode() {
        return this.zzc;
    }

    public boolean getEnableFacilitatedPayments() {
        return this.zzb;
    }

    public WalletCustomTheme getWalletCustomTheme() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 2, this.zza, i, false);
        boolean z = this.zzb;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme) {
        this(walletCustomTheme, false, 1);
    }

    public GetClientTokenRequest() {
        this.zzc = 1;
    }
}
