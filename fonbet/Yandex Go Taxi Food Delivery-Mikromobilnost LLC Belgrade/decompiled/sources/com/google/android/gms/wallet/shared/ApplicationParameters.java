package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import defpackage.bb1;
import defpackage.j03;

/* loaded from: classes11.dex */
public final class ApplicationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationParameters> CREATOR = new zza();
    int zza;
    Account zzb;
    Bundle zzc;
    boolean zzd;
    int zze;
    WalletCustomTheme zzf;
    int zzg;
    double zzh;
    double zzi;
    int zzj;
    int zzk;

    public ApplicationParameters(int i, Account account, Bundle bundle, boolean z, int i2, WalletCustomTheme walletCustomTheme, int i3, double d, double d2, int i4, int i5) {
        this.zza = i;
        this.zzb = account;
        this.zzc = bundle;
        this.zzd = z;
        this.zze = i2;
        this.zzf = walletCustomTheme;
        this.zzg = i3;
        this.zzh = d;
        this.zzi = d2;
        this.zzj = i4;
        this.zzk = i5;
    }

    public static j03 newBuilder() {
        return new j03(new ApplicationParameters());
    }

    public static j03 newBuilderFrom(ApplicationParameters applicationParameters) {
        j03 newBuilder = newBuilder();
        newBuilder.a.zza = applicationParameters.getEnvironment();
        Account buyerAccount = applicationParameters.getBuyerAccount();
        ApplicationParameters applicationParameters2 = newBuilder.a;
        applicationParameters2.zzb = buyerAccount;
        applicationParameters2.zzc = applicationParameters.getArgs();
        applicationParameters2.zzd = applicationParameters.isAccountSelectionAllowed();
        applicationParameters2.zze = applicationParameters.getTheme();
        applicationParameters2.zzf = applicationParameters.getWalletCustomTheme();
        applicationParameters2.zzg = applicationParameters.getButtonStyle();
        applicationParameters2.zzh = applicationParameters.getPopoverInitialHeightFraction();
        applicationParameters2.zzi = applicationParameters.getPopoverAutoDismissThresholdFraction();
        applicationParameters2.zzj = applicationParameters.getPopoverLoadingStyle();
        applicationParameters2.zzk = applicationParameters.getLoadingUiStyle();
        return newBuilder;
    }

    public Bundle getArgs() {
        return this.zzc;
    }

    public int getButtonStyle() {
        return this.zzg;
    }

    public Account getBuyerAccount() {
        return this.zzb;
    }

    public int getEnvironment() {
        return this.zza;
    }

    public int getLoadingUiStyle() {
        return this.zzk;
    }

    public double getPopoverAutoDismissThresholdFraction() {
        return this.zzi;
    }

    public double getPopoverInitialHeightFraction() {
        return this.zzh;
    }

    public int getPopoverLoadingStyle() {
        return this.zzj;
    }

    public int getTheme() {
        return this.zze;
    }

    public WalletCustomTheme getWalletCustomTheme() {
        return this.zzf;
    }

    public boolean isAccountSelectionAllowed() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 3, this.zzb, i, false);
        bb1.U(parcel, 4, this.zzc, false);
        boolean z = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        int i3 = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i3);
        bb1.f0(parcel, 7, this.zzf, i, false);
        int i4 = this.zzg;
        bb1.m0(8, parcel, 4);
        parcel.writeInt(i4);
        double d = this.zzh;
        bb1.m0(9, parcel, 8);
        parcel.writeDouble(d);
        double d2 = this.zzi;
        bb1.m0(10, parcel, 8);
        parcel.writeDouble(d2);
        int i5 = this.zzj;
        bb1.m0(11, parcel, 4);
        parcel.writeInt(i5);
        int i6 = this.zzk;
        bb1.m0(12, parcel, 4);
        parcel.writeInt(i6);
        bb1.o0(parcel, n0);
    }

    public ApplicationParameters() {
        this.zzd = false;
        this.zza = 1;
        this.zze = 1;
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1;
    }
}
