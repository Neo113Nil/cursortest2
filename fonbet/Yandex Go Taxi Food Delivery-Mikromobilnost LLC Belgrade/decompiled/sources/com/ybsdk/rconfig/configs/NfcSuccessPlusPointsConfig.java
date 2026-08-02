package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0004\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcSuccessPlusPointsConfig;", "", "", "isEnabled", "isEnabledOnlyForPlusCard", "", Constants.DEEPLINK, "<init>", "(ZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/String;)Lcom/ybsdk/rconfig/configs/NfcSuccessPlusPointsConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getDeeplink", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NfcSuccessPlusPointsConfig {

    @Json(name = Constants.DEEPLINK)
    private final String deeplink;

    @Json(name = "is_enabled")
    private final boolean isEnabled;

    @Json(name = "is_enabled_only_for_plus_card")
    private final boolean isEnabledOnlyForPlusCard;

    public NfcSuccessPlusPointsConfig(boolean z, boolean z2, String str) {
        this.isEnabled = z;
        this.isEnabledOnlyForPlusCard = z2;
        this.deeplink = str;
    }

    public static /* synthetic */ NfcSuccessPlusPointsConfig copy$default(NfcSuccessPlusPointsConfig nfcSuccessPlusPointsConfig, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nfcSuccessPlusPointsConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = nfcSuccessPlusPointsConfig.isEnabledOnlyForPlusCard;
        }
        if ((i & 4) != 0) {
            str = nfcSuccessPlusPointsConfig.deeplink;
        }
        return nfcSuccessPlusPointsConfig.copy(z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabledOnlyForPlusCard() {
        return this.isEnabledOnlyForPlusCard;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final NfcSuccessPlusPointsConfig copy(boolean isEnabled, boolean isEnabledOnlyForPlusCard, String deeplink) {
        return new NfcSuccessPlusPointsConfig(isEnabled, isEnabledOnlyForPlusCard, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcSuccessPlusPointsConfig)) {
            return false;
        }
        NfcSuccessPlusPointsConfig nfcSuccessPlusPointsConfig = (NfcSuccessPlusPointsConfig) other;
        return this.isEnabled == nfcSuccessPlusPointsConfig.isEnabled && this.isEnabledOnlyForPlusCard == nfcSuccessPlusPointsConfig.isEnabledOnlyForPlusCard && jl40.l(this.deeplink, nfcSuccessPlusPointsConfig.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        return this.deeplink.hashCode() + unr0.e(Boolean.hashCode(this.isEnabled) * 31, 31, this.isEnabledOnlyForPlusCard);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isEnabledOnlyForPlusCard() {
        return this.isEnabledOnlyForPlusCard;
    }

    public String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isEnabledOnlyForPlusCard;
        return oyr.t(qv10.u("NfcSuccessPlusPointsConfig(isEnabled=", ", isEnabledOnlyForPlusCard=", ", deeplink=", z, z2), this.deeplink, Extension.C_BRAKE);
    }
}
