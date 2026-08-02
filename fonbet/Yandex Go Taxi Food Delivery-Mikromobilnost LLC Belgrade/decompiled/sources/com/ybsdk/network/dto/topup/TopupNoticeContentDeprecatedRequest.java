package com.ybsdk.network.dto.topup;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedRequest;", "", "agreementId", "", "topupValue", "Lcom/ybsdk/network/dto/topup/TopupValueDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/network/dto/topup/TopupValueDto;)V", "getAgreementId", "()Ljava/lang/String;", "getTopupValue", "()Lcom/ybsdk/network/dto/topup/TopupValueDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TopupNoticeContentDeprecatedRequest {
    private final String agreementId;
    private final TopupValueDto topupValue;

    public TopupNoticeContentDeprecatedRequest(@Json(name = "agreement_id") String str, @Json(name = "topup_value") TopupValueDto topupValueDto) {
        this.agreementId = str;
        this.topupValue = topupValueDto;
    }

    public static /* synthetic */ TopupNoticeContentDeprecatedRequest copy$default(TopupNoticeContentDeprecatedRequest topupNoticeContentDeprecatedRequest, String str, TopupValueDto topupValueDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topupNoticeContentDeprecatedRequest.agreementId;
        }
        if ((i & 2) != 0) {
            topupValueDto = topupNoticeContentDeprecatedRequest.topupValue;
        }
        return topupNoticeContentDeprecatedRequest.copy(str, topupValueDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final TopupValueDto getTopupValue() {
        return this.topupValue;
    }

    public final TopupNoticeContentDeprecatedRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "topup_value") TopupValueDto topupValue) {
        return new TopupNoticeContentDeprecatedRequest(agreementId, topupValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupNoticeContentDeprecatedRequest)) {
            return false;
        }
        TopupNoticeContentDeprecatedRequest topupNoticeContentDeprecatedRequest = (TopupNoticeContentDeprecatedRequest) other;
        return jl40.l(this.agreementId, topupNoticeContentDeprecatedRequest.agreementId) && jl40.l(this.topupValue, topupNoticeContentDeprecatedRequest.topupValue);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final TopupValueDto getTopupValue() {
        return this.topupValue;
    }

    public int hashCode() {
        return this.topupValue.hashCode() + (this.agreementId.hashCode() * 31);
    }

    public String toString() {
        return "TopupNoticeContentDeprecatedRequest(agreementId=" + this.agreementId + ", topupValue=" + this.topupValue + Extension.C_BRAKE;
    }
}
