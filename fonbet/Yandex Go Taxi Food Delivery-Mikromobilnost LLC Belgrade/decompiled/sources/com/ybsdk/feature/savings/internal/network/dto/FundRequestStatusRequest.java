package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusRequest;", "", "requestId", "", "preselectedAgreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getPreselectedAgreementId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundRequestStatusRequest {

    @Json(name = "preselected_agreement_id")
    private final String preselectedAgreementId;

    @Json(name = "request_id")
    private final String requestId;

    public FundRequestStatusRequest(String str, String str2) {
        this.requestId = str;
        this.preselectedAgreementId = str2;
    }

    public static /* synthetic */ FundRequestStatusRequest copy$default(FundRequestStatusRequest fundRequestStatusRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundRequestStatusRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = fundRequestStatusRequest.preselectedAgreementId;
        }
        return fundRequestStatusRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreselectedAgreementId() {
        return this.preselectedAgreementId;
    }

    public final FundRequestStatusRequest copy(String requestId, String preselectedAgreementId) {
        return new FundRequestStatusRequest(requestId, preselectedAgreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundRequestStatusRequest)) {
            return false;
        }
        FundRequestStatusRequest fundRequestStatusRequest = (FundRequestStatusRequest) other;
        return jl40.l(this.requestId, fundRequestStatusRequest.requestId) && jl40.l(this.preselectedAgreementId, fundRequestStatusRequest.preselectedAgreementId);
    }

    public final String getPreselectedAgreementId() {
        return this.preselectedAgreementId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.preselectedAgreementId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("FundRequestStatusRequest(requestId=", this.requestId, ", preselectedAgreementId=", this.preselectedAgreementId, Extension.C_BRAKE);
    }
}
