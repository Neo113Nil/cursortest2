package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0016\b\u0001\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003J\u0097\u0001\u00101\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\u0016\b\u0003\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0010HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Request;", "", "agreementId", "", "source", "autotopupId", "amount", "Ljava/math/BigDecimal;", "threshold", "limit", "showOnly", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ShowOnly;", "initialDeeplink", "communicationsShownInfo", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "sessionsCountWithoutFullscreen", "", "additionalData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ShowOnly;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;ILjava/util/Map;)V", "getAgreementId", "()Ljava/lang/String;", "getSource", "getAutotopupId", "getAmount", "()Ljava/math/BigDecimal;", "getThreshold", "getLimit", "getShowOnly", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ShowOnly;", "getInitialDeeplink", "getCommunicationsShownInfo", "()Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "getSessionsCountWithoutFullscreen", "()I", "getAdditionalData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2Request {
    private final Map<String, Object> additionalData;
    private final String agreementId;
    private final BigDecimal amount;
    private final String autotopupId;
    private final CommunicationsShownInfoDto communicationsShownInfo;
    private final String initialDeeplink;
    private final BigDecimal limit;
    private final int sessionsCountWithoutFullscreen;
    private final AutoTopupSettingsV2ShowOnly showOnly;
    private final String source;
    private final BigDecimal threshold;

    public AutoTopupSettingsV2Request(@Json(name = "agreement_id") String str, @Json(name = "source") String str2, @Json(name = "autotopup_id") String str3, @Json(name = "amount") BigDecimal bigDecimal, @Json(name = "threshold") BigDecimal bigDecimal2, @Json(name = "limit") BigDecimal bigDecimal3, @Json(name = "show_only") AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly, @Json(name = "initial_deeplink") String str4, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationsShownInfoDto, @Json(name = "sessions_count_without_fullscreen") int i, @Json(name = "additional_data") Map<String, ? extends Object> map) {
        this.agreementId = str;
        this.source = str2;
        this.autotopupId = str3;
        this.amount = bigDecimal;
        this.threshold = bigDecimal2;
        this.limit = bigDecimal3;
        this.showOnly = autoTopupSettingsV2ShowOnly;
        this.initialDeeplink = str4;
        this.communicationsShownInfo = communicationsShownInfoDto;
        this.sessionsCountWithoutFullscreen = i;
        this.additionalData = map;
    }

    public static /* synthetic */ AutoTopupSettingsV2Request copy$default(AutoTopupSettingsV2Request autoTopupSettingsV2Request, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly, String str4, CommunicationsShownInfoDto communicationsShownInfoDto, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = autoTopupSettingsV2Request.agreementId;
        }
        if ((i2 & 2) != 0) {
            str2 = autoTopupSettingsV2Request.source;
        }
        if ((i2 & 4) != 0) {
            str3 = autoTopupSettingsV2Request.autotopupId;
        }
        if ((i2 & 8) != 0) {
            bigDecimal = autoTopupSettingsV2Request.amount;
        }
        if ((i2 & 16) != 0) {
            bigDecimal2 = autoTopupSettingsV2Request.threshold;
        }
        if ((i2 & 32) != 0) {
            bigDecimal3 = autoTopupSettingsV2Request.limit;
        }
        if ((i2 & 64) != 0) {
            autoTopupSettingsV2ShowOnly = autoTopupSettingsV2Request.showOnly;
        }
        if ((i2 & 128) != 0) {
            str4 = autoTopupSettingsV2Request.initialDeeplink;
        }
        if ((i2 & 256) != 0) {
            communicationsShownInfoDto = autoTopupSettingsV2Request.communicationsShownInfo;
        }
        if ((i2 & 512) != 0) {
            i = autoTopupSettingsV2Request.sessionsCountWithoutFullscreen;
        }
        if ((i2 & 1024) != 0) {
            map = autoTopupSettingsV2Request.additionalData;
        }
        int i3 = i;
        Map map2 = map;
        String str5 = str4;
        CommunicationsShownInfoDto communicationsShownInfoDto2 = communicationsShownInfoDto;
        BigDecimal bigDecimal4 = bigDecimal3;
        AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly2 = autoTopupSettingsV2ShowOnly;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str6 = str3;
        return autoTopupSettingsV2Request.copy(str, str2, str6, bigDecimal, bigDecimal5, bigDecimal4, autoTopupSettingsV2ShowOnly2, str5, communicationsShownInfoDto2, i3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final Map<String, Object> component11() {
        return this.additionalData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutotopupId() {
        return this.autotopupId;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getLimit() {
        return this.limit;
    }

    /* renamed from: component7, reason: from getter */
    public final AutoTopupSettingsV2ShowOnly getShowOnly() {
        return this.showOnly;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    /* renamed from: component9, reason: from getter */
    public final CommunicationsShownInfoDto getCommunicationsShownInfo() {
        return this.communicationsShownInfo;
    }

    public final AutoTopupSettingsV2Request copy(@Json(name = "agreement_id") String agreementId, @Json(name = "source") String source, @Json(name = "autotopup_id") String autotopupId, @Json(name = "amount") BigDecimal amount, @Json(name = "threshold") BigDecimal threshold, @Json(name = "limit") BigDecimal limit, @Json(name = "show_only") AutoTopupSettingsV2ShowOnly showOnly, @Json(name = "initial_deeplink") String initialDeeplink, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationsShownInfo, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreen, @Json(name = "additional_data") Map<String, ? extends Object> additionalData) {
        return new AutoTopupSettingsV2Request(agreementId, source, autotopupId, amount, threshold, limit, showOnly, initialDeeplink, communicationsShownInfo, sessionsCountWithoutFullscreen, additionalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2Request)) {
            return false;
        }
        AutoTopupSettingsV2Request autoTopupSettingsV2Request = (AutoTopupSettingsV2Request) other;
        return jl40.l(this.agreementId, autoTopupSettingsV2Request.agreementId) && jl40.l(this.source, autoTopupSettingsV2Request.source) && jl40.l(this.autotopupId, autoTopupSettingsV2Request.autotopupId) && jl40.l(this.amount, autoTopupSettingsV2Request.amount) && jl40.l(this.threshold, autoTopupSettingsV2Request.threshold) && jl40.l(this.limit, autoTopupSettingsV2Request.limit) && this.showOnly == autoTopupSettingsV2Request.showOnly && jl40.l(this.initialDeeplink, autoTopupSettingsV2Request.initialDeeplink) && jl40.l(this.communicationsShownInfo, autoTopupSettingsV2Request.communicationsShownInfo) && this.sessionsCountWithoutFullscreen == autoTopupSettingsV2Request.sessionsCountWithoutFullscreen && jl40.l(this.additionalData, autoTopupSettingsV2Request.additionalData);
    }

    public final Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAutotopupId() {
        return this.autotopupId;
    }

    public final CommunicationsShownInfoDto getCommunicationsShownInfo() {
        return this.communicationsShownInfo;
    }

    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    public final BigDecimal getLimit() {
        return this.limit;
    }

    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final AutoTopupSettingsV2ShowOnly getShowOnly() {
        return this.showOnly;
    }

    public final String getSource() {
        return this.source;
    }

    public final BigDecimal getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        String str = this.agreementId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.autotopupId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.threshold;
        int hashCode5 = (hashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.limit;
        int hashCode6 = (hashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly = this.showOnly;
        int hashCode7 = (hashCode6 + (autoTopupSettingsV2ShowOnly == null ? 0 : autoTopupSettingsV2ShowOnly.hashCode())) * 31;
        String str4 = this.initialDeeplink;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationsShownInfo;
        int b = oyr.b(this.sessionsCountWithoutFullscreen, (hashCode8 + (communicationsShownInfoDto == null ? 0 : communicationsShownInfoDto.hashCode())) * 31, 31);
        Map<String, Object> map = this.additionalData;
        return b + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.source;
        String str3 = this.autotopupId;
        BigDecimal bigDecimal = this.amount;
        BigDecimal bigDecimal2 = this.threshold;
        BigDecimal bigDecimal3 = this.limit;
        AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly = this.showOnly;
        String str4 = this.initialDeeplink;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationsShownInfo;
        int i = this.sessionsCountWithoutFullscreen;
        Map<String, Object> map = this.additionalData;
        StringBuilder v = b64.v("AutoTopupSettingsV2Request(agreementId=", str, ", source=", str2, ", autotopupId=");
        v.append(str3);
        v.append(", amount=");
        v.append(bigDecimal);
        v.append(", threshold=");
        v.append(bigDecimal2);
        v.append(", limit=");
        v.append(bigDecimal3);
        v.append(", showOnly=");
        v.append(autoTopupSettingsV2ShowOnly);
        v.append(", initialDeeplink=");
        v.append(str4);
        v.append(", communicationsShownInfo=");
        v.append(communicationsShownInfoDto);
        v.append(", sessionsCountWithoutFullscreen=");
        v.append(i);
        v.append(", additionalData=");
        return b64.r(v, map, Extension.C_BRAKE);
    }
}
