package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.s841;

/* loaded from: classes11.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzj();
    String zza;
    String zzb;
    TimeInterval zzc;

    @Deprecated
    UriData zzd;

    @Deprecated
    UriData zze;

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }

    public static s841 newBuilder() {
        new WalletObjectMessage();
        return new s841();
    }

    @Deprecated
    public UriData getActionUri() {
        return this.zzd;
    }

    public String getBody() {
        return this.zzb;
    }

    public TimeInterval getDisplayInterval() {
        return this.zzc;
    }

    public String getHeader() {
        return this.zza;
    }

    @Deprecated
    public UriData getImageUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zza, false);
        bb1.g0(parcel, 3, this.zzb, false);
        bb1.f0(parcel, 4, this.zzc, i, false);
        bb1.f0(parcel, 5, this.zzd, i, false);
        bb1.f0(parcel, 6, this.zze, i, false);
        bb1.o0(parcel, n0);
    }

    public WalletObjectMessage() {
    }
}
