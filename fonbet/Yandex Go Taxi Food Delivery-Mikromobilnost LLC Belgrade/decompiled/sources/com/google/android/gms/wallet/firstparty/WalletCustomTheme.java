package com.google.android.gms.wallet.firstparty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.bb1;

/* loaded from: classes11.dex */
public class WalletCustomTheme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletCustomTheme> CREATOR = new zzm();
    int zza;
    int zzb;
    int zzc;
    Bundle zzd;
    String zze;

    public WalletCustomTheme() {
        this.zzb = 0;
        this.zzc = 0;
        this.zza = 0;
        this.zzd = new Bundle();
        this.zze = "";
    }

    public static WalletCustomTheme from(WalletCustomTheme walletCustomTheme) {
        return new WalletCustomTheme(walletCustomTheme.getStyleResId(), walletCustomTheme.getAttributes(), walletCustomTheme.getPackageForThemingContext(), walletCustomTheme.getStyleResIdForLightMode(), walletCustomTheme.getStyleResIdForDarkMode());
    }

    public static WalletCustomTheme fromIntent(Intent intent) {
        BuyFlowConfig buyFlowConfig;
        if (intent == null || (buyFlowConfig = (BuyFlowConfig) intent.getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig")) == null) {
            return null;
        }
        return buyFlowConfig.getApplicationParams().getWalletCustomTheme();
    }

    public Bundle getAttributes() {
        if (this.zzd == null) {
            this.zzd = new Bundle();
        }
        return this.zzd;
    }

    public int getCustomThemeStyle() {
        return getAttributes().getInt("customThemeStyle", 0);
    }

    public int getInteractionMode() {
        return getAttributes().getInt("interactionMode", 0);
    }

    public String getPackageForThemingContext() {
        return this.zze;
    }

    public int getSetupWizardTheme() {
        return getAttributes().getInt("setupWizardGlifTheme", 0);
    }

    public int getStyleResId() {
        return this.zza;
    }

    public int getStyleResIdForDarkMode() {
        return this.zzc;
    }

    public int getStyleResIdForLightMode() {
        return this.zzb;
    }

    public int getWindowTransitionStyle() {
        return this.zzd.getInt("windowTransitionsStyle");
    }

    public int getWindowTransitionStyleForEndTransition() {
        return getAttributes().getInt("windowTransitionsStyleForEndTransition");
    }

    public int getWindowTransitionStyleForStartTransition() {
        return getAttributes().getInt("windowTransitionsStyleForStartTransition");
    }

    public void setAttributes(Bundle bundle) {
        this.zzd = bundle;
    }

    public WalletCustomTheme setCustomLayout(int i) {
        getAttributes().putInt("customLayout", i);
        return this;
    }

    public WalletCustomTheme setCustomThemeStyle(int i) {
        getAttributes().putInt("customThemeStyle", i);
        return this;
    }

    public WalletCustomTheme setInteractionMode(int i) {
        getAttributes().putInt("interactionMode", i);
        return this;
    }

    public WalletCustomTheme setPackageForThemingContext(String str) {
        this.zze = str;
        return this;
    }

    public WalletCustomTheme setSetupWizardTheme(int i) {
        getAttributes().putInt("setupWizardGlifTheme", i);
        return this;
    }

    public WalletCustomTheme setStyleResId(int i) {
        this.zza = i;
        setStyleResId(i, i);
        return this;
    }

    public WalletCustomTheme setToolbarTextColorStyle(int i) {
        getAttributes().putInt("toolbarTextColorStyle", i);
        return this;
    }

    public WalletCustomTheme setWindowTransitionsStyle(int i) {
        getAttributes().putInt("windowTransitionsStyle", i);
        return this;
    }

    public WalletCustomTheme setWindowTransitionsStyleForEndTransition(int i) {
        getAttributes().putInt("windowTransitionsStyleForEndTransition", i);
        return this;
    }

    public WalletCustomTheme setWindowTransitionsStyleForStartTransition(int i) {
        getAttributes().putInt("windowTransitionsStyleForStartTransition", i);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        bb1.U(parcel, 3, this.zzd, false);
        bb1.g0(parcel, 4, this.zze, false);
        int i3 = this.zzb;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i4);
        bb1.o0(parcel, n0);
    }

    public WalletCustomTheme setStyleResId(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        return this;
    }

    public WalletCustomTheme(int i, Bundle bundle, String str, int i2, int i3) {
        this.zzd = bundle;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zze = str;
    }
}
