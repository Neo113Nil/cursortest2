package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.bvz;

/* loaded from: classes11.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzf();
    String zza;
    LoyaltyPointsBalance zzb;

    @Deprecated
    TimeInterval zzc;

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.zza = str;
        this.zzb = loyaltyPointsBalance;
        this.zzc = timeInterval;
    }

    public static bvz newBuilder() {
        new LoyaltyPoints();
        return new bvz();
    }

    public LoyaltyPointsBalance getBalance() {
        return this.zzb;
    }

    public String getLabel() {
        return this.zza;
    }

    @Deprecated
    public String getType() {
        return "";
    }

    @Deprecated
    public TimeInterval getValidTimeInterval() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.f0(parcel, 3, this.zzb, i, false);
        bb1.f0(parcel, 5, this.zzc, i, false);
        bb1.o0(parcel, n0);
    }

    public LoyaltyPoints() {
    }
}
