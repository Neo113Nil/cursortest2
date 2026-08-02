package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.w7t;

/* loaded from: classes11.dex */
public final class GetInstrumentAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetInstrumentAvailabilityResponse> CREATOR = new zzb();
    String zza;
    int zzb;
    boolean zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;

    public GetInstrumentAvailabilityResponse(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = i;
        this.zzc = z;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = str7;
    }

    public static w7t newBuilder() {
        new GetInstrumentAvailabilityResponse();
        return new w7t();
    }

    public boolean getBnplEligibility() {
        return this.zzc;
    }

    public int getDefaultInstrumentCardNetwork() {
        return this.zzb;
    }

    public String getDefaultInstrumentImageUrl() {
        return this.zzd;
    }

    public String getDefaultInstrumentName() {
        return this.zze;
    }

    public String getDefaultInstrumentSuffix() {
        return this.zza;
    }

    public String getPrimaryBnplInstrumentBrand() {
        return this.zzg;
    }

    public String getPrimaryBnplInstrumentImageUrl() {
        return this.zzf;
    }

    public String getSecondaryBnplInstrumentBrand() {
        return this.zzi;
    }

    public String getSecondaryBnplInstrumentImageUrl() {
        return this.zzh;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, getDefaultInstrumentSuffix(), false);
        int defaultInstrumentCardNetwork = getDefaultInstrumentCardNetwork();
        bb1.m0(2, parcel, 4);
        parcel.writeInt(defaultInstrumentCardNetwork);
        boolean bnplEligibility = getBnplEligibility();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(bnplEligibility ? 1 : 0);
        bb1.g0(parcel, 4, getDefaultInstrumentImageUrl(), false);
        bb1.g0(parcel, 5, getDefaultInstrumentName(), false);
        bb1.g0(parcel, 6, getPrimaryBnplInstrumentImageUrl(), false);
        bb1.g0(parcel, 7, getPrimaryBnplInstrumentBrand(), false);
        bb1.g0(parcel, 8, getSecondaryBnplInstrumentImageUrl(), false);
        bb1.g0(parcel, 9, getSecondaryBnplInstrumentBrand(), false);
        bb1.o0(parcel, n0);
    }

    private GetInstrumentAvailabilityResponse() {
    }
}
