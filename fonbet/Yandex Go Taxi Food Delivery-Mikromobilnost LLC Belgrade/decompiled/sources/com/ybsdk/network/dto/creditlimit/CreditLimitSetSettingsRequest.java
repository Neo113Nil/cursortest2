package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitSetSettingsRequest;", "", "settings", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitSettings;", "matchingData", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitSplitMatchingData;", "<init>", "(Lcom/ybsdk/network/dto/creditlimit/CreditLimitSettings;Lcom/ybsdk/network/dto/creditlimit/CreditLimitSplitMatchingData;)V", "getSettings", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitSettings;", "getMatchingData", "()Lcom/ybsdk/network/dto/creditlimit/CreditLimitSplitMatchingData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreditLimitSetSettingsRequest {
    private final CreditLimitSplitMatchingData matchingData;
    private final CreditLimitSettings settings;

    public CreditLimitSetSettingsRequest(@Json(name = "settings") CreditLimitSettings creditLimitSettings, @Json(name = "matching_data") CreditLimitSplitMatchingData creditLimitSplitMatchingData) {
        this.settings = creditLimitSettings;
        this.matchingData = creditLimitSplitMatchingData;
    }

    public static /* synthetic */ CreditLimitSetSettingsRequest copy$default(CreditLimitSetSettingsRequest creditLimitSetSettingsRequest, CreditLimitSettings creditLimitSettings, CreditLimitSplitMatchingData creditLimitSplitMatchingData, int i, Object obj) {
        if ((i & 1) != 0) {
            creditLimitSettings = creditLimitSetSettingsRequest.settings;
        }
        if ((i & 2) != 0) {
            creditLimitSplitMatchingData = creditLimitSetSettingsRequest.matchingData;
        }
        return creditLimitSetSettingsRequest.copy(creditLimitSettings, creditLimitSplitMatchingData);
    }

    /* renamed from: component1, reason: from getter */
    public final CreditLimitSettings getSettings() {
        return this.settings;
    }

    /* renamed from: component2, reason: from getter */
    public final CreditLimitSplitMatchingData getMatchingData() {
        return this.matchingData;
    }

    public final CreditLimitSetSettingsRequest copy(@Json(name = "settings") CreditLimitSettings settings, @Json(name = "matching_data") CreditLimitSplitMatchingData matchingData) {
        return new CreditLimitSetSettingsRequest(settings, matchingData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitSetSettingsRequest)) {
            return false;
        }
        CreditLimitSetSettingsRequest creditLimitSetSettingsRequest = (CreditLimitSetSettingsRequest) other;
        return jl40.l(this.settings, creditLimitSetSettingsRequest.settings) && jl40.l(this.matchingData, creditLimitSetSettingsRequest.matchingData);
    }

    public final CreditLimitSplitMatchingData getMatchingData() {
        return this.matchingData;
    }

    public final CreditLimitSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.matchingData.hashCode() + (this.settings.hashCode() * 31);
    }

    public String toString() {
        return "CreditLimitSetSettingsRequest(settings=" + this.settings + ", matchingData=" + this.matchingData + Extension.C_BRAKE;
    }
}
