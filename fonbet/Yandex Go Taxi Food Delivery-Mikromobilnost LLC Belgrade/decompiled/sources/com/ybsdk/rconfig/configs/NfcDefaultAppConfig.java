package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcDefaultAppConfig;", "", "", "isPromoEnabled", "", "defaultAppPromoIntervalInDays", "<init>", "(ZLjava/lang/Integer;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/ybsdk/rconfig/configs/NfcDefaultAppConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/Integer;", "getDefaultAppPromoIntervalInDays", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcDefaultAppConfig {

    @Json(name = "default_app_promo_interval_in_days")
    private final Integer defaultAppPromoIntervalInDays;

    @Json(name = "is_promo_enabled")
    private final boolean isPromoEnabled;

    public NfcDefaultAppConfig(boolean z, Integer num) {
        this.isPromoEnabled = z;
        this.defaultAppPromoIntervalInDays = num;
    }

    public static /* synthetic */ NfcDefaultAppConfig copy$default(NfcDefaultAppConfig nfcDefaultAppConfig, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcDefaultAppConfig.isPromoEnabled;
        }
        if ((i & 2) != 0) {
            num = nfcDefaultAppConfig.defaultAppPromoIntervalInDays;
        }
        return nfcDefaultAppConfig.copy(z, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPromoEnabled() {
        return this.isPromoEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getDefaultAppPromoIntervalInDays() {
        return this.defaultAppPromoIntervalInDays;
    }

    public final NfcDefaultAppConfig copy(boolean isPromoEnabled, Integer defaultAppPromoIntervalInDays) {
        return new NfcDefaultAppConfig(isPromoEnabled, defaultAppPromoIntervalInDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcDefaultAppConfig)) {
            return false;
        }
        NfcDefaultAppConfig nfcDefaultAppConfig = (NfcDefaultAppConfig) other;
        return this.isPromoEnabled == nfcDefaultAppConfig.isPromoEnabled && jl40.l(this.defaultAppPromoIntervalInDays, nfcDefaultAppConfig.defaultAppPromoIntervalInDays);
    }

    public final Integer getDefaultAppPromoIntervalInDays() {
        return this.defaultAppPromoIntervalInDays;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isPromoEnabled) * 31;
        Integer num = this.defaultAppPromoIntervalInDays;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final boolean isPromoEnabled() {
        return this.isPromoEnabled;
    }

    public String toString() {
        return "NfcDefaultAppConfig(isPromoEnabled=" + this.isPromoEnabled + ", defaultAppPromoIntervalInDays=" + this.defaultAppPromoIntervalInDays + Extension.C_BRAKE;
    }
}
