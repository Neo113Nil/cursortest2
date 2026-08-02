package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettings;", "", "paymentSettingType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettingsType;", "upToBalance", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/UpToBalanceSettings;", "autofund", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundSettings;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettingsType;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/UpToBalanceSettings;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundSettings;)V", "getPaymentSettingType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupPaymentSettingsType;", "getUpToBalance", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/UpToBalanceSettings;", "getAutofund", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoFundSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupPaymentSettings {
    private final AutoFundSettings autofund;
    private final AutoTopupPaymentSettingsType paymentSettingType;
    private final UpToBalanceSettings upToBalance;

    public AutoTopupPaymentSettings(@Json(name = "payment_setting_type") AutoTopupPaymentSettingsType autoTopupPaymentSettingsType, @Json(name = "up_to_balance") UpToBalanceSettings upToBalanceSettings, @Json(name = "autofund") AutoFundSettings autoFundSettings) {
        this.paymentSettingType = autoTopupPaymentSettingsType;
        this.upToBalance = upToBalanceSettings;
        this.autofund = autoFundSettings;
    }

    public static /* synthetic */ AutoTopupPaymentSettings copy$default(AutoTopupPaymentSettings autoTopupPaymentSettings, AutoTopupPaymentSettingsType autoTopupPaymentSettingsType, UpToBalanceSettings upToBalanceSettings, AutoFundSettings autoFundSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupPaymentSettingsType = autoTopupPaymentSettings.paymentSettingType;
        }
        if ((i & 2) != 0) {
            upToBalanceSettings = autoTopupPaymentSettings.upToBalance;
        }
        if ((i & 4) != 0) {
            autoFundSettings = autoTopupPaymentSettings.autofund;
        }
        return autoTopupPaymentSettings.copy(autoTopupPaymentSettingsType, upToBalanceSettings, autoFundSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupPaymentSettingsType getPaymentSettingType() {
        return this.paymentSettingType;
    }

    /* renamed from: component2, reason: from getter */
    public final UpToBalanceSettings getUpToBalance() {
        return this.upToBalance;
    }

    /* renamed from: component3, reason: from getter */
    public final AutoFundSettings getAutofund() {
        return this.autofund;
    }

    public final AutoTopupPaymentSettings copy(@Json(name = "payment_setting_type") AutoTopupPaymentSettingsType paymentSettingType, @Json(name = "up_to_balance") UpToBalanceSettings upToBalance, @Json(name = "autofund") AutoFundSettings autofund) {
        return new AutoTopupPaymentSettings(paymentSettingType, upToBalance, autofund);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupPaymentSettings)) {
            return false;
        }
        AutoTopupPaymentSettings autoTopupPaymentSettings = (AutoTopupPaymentSettings) other;
        return this.paymentSettingType == autoTopupPaymentSettings.paymentSettingType && jl40.l(this.upToBalance, autoTopupPaymentSettings.upToBalance) && jl40.l(this.autofund, autoTopupPaymentSettings.autofund);
    }

    public final AutoFundSettings getAutofund() {
        return this.autofund;
    }

    public final AutoTopupPaymentSettingsType getPaymentSettingType() {
        return this.paymentSettingType;
    }

    public final UpToBalanceSettings getUpToBalance() {
        return this.upToBalance;
    }

    public int hashCode() {
        int hashCode = this.paymentSettingType.hashCode() * 31;
        UpToBalanceSettings upToBalanceSettings = this.upToBalance;
        int hashCode2 = (hashCode + (upToBalanceSettings == null ? 0 : upToBalanceSettings.hashCode())) * 31;
        AutoFundSettings autoFundSettings = this.autofund;
        return hashCode2 + (autoFundSettings != null ? autoFundSettings.hashCode() : 0);
    }

    public String toString() {
        return "AutoTopupPaymentSettings(paymentSettingType=" + this.paymentSettingType + ", upToBalance=" + this.upToBalance + ", autofund=" + this.autofund + Extension.C_BRAKE;
    }
}
