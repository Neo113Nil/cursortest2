package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.z57;

/* loaded from: classes11.dex */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BuyFlowConfig> CREATOR = new zzb();
    String zza;
    ApplicationParameters zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    int zzg;

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4, String str5, int i) {
        this.zza = str;
        this.zzb = applicationParameters;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = i;
    }

    public static z57 newBuilder() {
        return new z57(new BuyFlowConfig());
    }

    public static z57 newBuilderFrom(BuyFlowConfig buyFlowConfig) {
        z57 newBuilder = newBuilder();
        newBuilder.a.zzb = buyFlowConfig.getApplicationParams();
        String callingAppIdentifier = buyFlowConfig.getCallingAppIdentifier();
        BuyFlowConfig buyFlowConfig2 = newBuilder.a;
        buyFlowConfig2.zze = callingAppIdentifier;
        buyFlowConfig2.zzc = buyFlowConfig.getCallingPackage();
        buyFlowConfig2.zzd = buyFlowConfig.getFlowName();
        buyFlowConfig2.zza = buyFlowConfig.getTransactionId();
        buyFlowConfig2.zzf = buyFlowConfig.getSessionResumptionId();
        buyFlowConfig2.zzg = buyFlowConfig.getSessionResumptionType();
        return newBuilder;
    }

    public ApplicationParameters getApplicationParams() {
        return this.zzb;
    }

    public String getCallingAppIdentifier() {
        return TextUtils.isEmpty(this.zze) ? this.zzc : this.zze;
    }

    public String getCallingPackage() {
        return this.zzc;
    }

    public String getFlowName() {
        return this.zzd;
    }

    public String getSessionResumptionId() {
        return this.zzf;
    }

    public int getSessionResumptionType() {
        return this.zzg;
    }

    public String getTransactionId() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, getTransactionId(), false);
        bb1.f0(parcel, 3, getApplicationParams(), i, false);
        bb1.g0(parcel, 4, getCallingPackage(), false);
        bb1.g0(parcel, 5, getFlowName(), false);
        bb1.g0(parcel, 6, getCallingAppIdentifier(), false);
        bb1.g0(parcel, 7, getSessionResumptionId(), false);
        int sessionResumptionType = getSessionResumptionType();
        bb1.m0(8, parcel, 4);
        parcel.writeInt(sessionResumptionType);
        bb1.o0(parcel, n0);
    }

    public BuyFlowConfig() {
    }
}
