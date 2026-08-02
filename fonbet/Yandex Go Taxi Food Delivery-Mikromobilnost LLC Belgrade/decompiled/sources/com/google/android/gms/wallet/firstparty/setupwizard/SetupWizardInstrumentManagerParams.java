package com.google.android.gms.wallet.firstparty.setupwizard;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class SetupWizardInstrumentManagerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupWizardInstrumentManagerParams> CREATOR = new zzb();
    final Account zza;
    final byte[] zzb;
    final BuyFlowConfig zzc;
    final String zzd;
    final byte[] zze;
    final boolean zzf;
    final boolean zzg;

    public SetupWizardInstrumentManagerParams(Account account, byte[] bArr, BuyFlowConfig buyFlowConfig, String str, byte[] bArr2, boolean z, boolean z2) {
        this.zza = account;
        this.zzb = bArr;
        this.zzc = buyFlowConfig;
        this.zzd = str;
        this.zze = bArr2;
        this.zzf = z;
        this.zzg = z2;
    }

    public Account getAccount() {
        return this.zza;
    }

    public byte[] getActionToken() {
        return this.zzb;
    }

    public BuyFlowConfig getBuyFlowConfig() {
        return this.zzc;
    }

    public byte[] getGlifIconBytes() {
        return this.zze;
    }

    public boolean getIsSuwOcr() {
        return this.zzf;
    }

    public boolean getLockOrientation() {
        return this.zzg;
    }

    public String getTheme() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, this.zza, i, false);
        bb1.V(parcel, 2, this.zzb, false);
        bb1.f0(parcel, 3, this.zzc, i, false);
        bb1.g0(parcel, 4, this.zzd, false);
        bb1.V(parcel, 5, this.zze, false);
        boolean z = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzg;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bb1.o0(parcel, n0);
    }
}
