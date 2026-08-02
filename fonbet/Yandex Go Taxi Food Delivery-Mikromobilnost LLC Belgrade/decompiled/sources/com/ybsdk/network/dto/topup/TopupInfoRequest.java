package com.ybsdk.network.dto.topup;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupInfoRequest;", "", "agreementId", "", "applicationId", "topupValue", "Lcom/ybsdk/network/dto/topup/TopupValueDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/topup/TopupValueDto;)V", "getAgreementId", "()Ljava/lang/String;", "getApplicationId", "getTopupValue", "()Lcom/ybsdk/network/dto/topup/TopupValueDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupInfoRequest {
    private final String agreementId;
    private final String applicationId;
    private final TopupValueDto topupValue;

    public TopupInfoRequest(@Json(name = "agreement_id") String str, @Json(name = "application_id") String str2, @Json(name = "topup_value") TopupValueDto topupValueDto) {
        this.agreementId = str;
        this.applicationId = str2;
        this.topupValue = topupValueDto;
    }

    public static /* synthetic */ TopupInfoRequest copy$default(TopupInfoRequest topupInfoRequest, String str, String str2, TopupValueDto topupValueDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topupInfoRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = topupInfoRequest.applicationId;
        }
        if ((i & 4) != 0) {
            topupValueDto = topupInfoRequest.topupValue;
        }
        return topupInfoRequest.copy(str, str2, topupValueDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component3, reason: from getter */
    public final TopupValueDto getTopupValue() {
        return this.topupValue;
    }

    public final TopupInfoRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "application_id") String applicationId, @Json(name = "topup_value") TopupValueDto topupValue) {
        return new TopupInfoRequest(agreementId, applicationId, topupValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupInfoRequest)) {
            return false;
        }
        TopupInfoRequest topupInfoRequest = (TopupInfoRequest) other;
        return jl40.l(this.agreementId, topupInfoRequest.agreementId) && jl40.l(this.applicationId, topupInfoRequest.applicationId) && jl40.l(this.topupValue, topupInfoRequest.topupValue);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final TopupValueDto getTopupValue() {
        return this.topupValue;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.applicationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TopupValueDto topupValueDto = this.topupValue;
        return hashCode2 + (topupValueDto != null ? topupValueDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.applicationId;
        TopupValueDto topupValueDto = this.topupValue;
        StringBuilder v = b64.v("TopupInfoRequest(agreementId=", str, ", applicationId=", str2, ", topupValue=");
        v.append(topupValueDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
