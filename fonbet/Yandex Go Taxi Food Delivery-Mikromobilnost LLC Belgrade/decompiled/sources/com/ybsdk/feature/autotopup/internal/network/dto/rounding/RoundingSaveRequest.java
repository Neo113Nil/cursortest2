package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSaveRequest;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;", "targetAgreementId", "", "sourceAgreementId", "stepId", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingStatusDto;", "getTargetAgreementId", "()Ljava/lang/String;", "getSourceAgreementId", "getStepId", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundingSaveRequest {
    private final HmacDto hmac;
    private final String sourceAgreementId;
    private final RoundingStatusDto status;
    private final String stepId;
    private final String targetAgreementId;

    public RoundingSaveRequest(@Json(name = "status") RoundingStatusDto roundingStatusDto, @Json(name = "target_agreement_id") String str, @Json(name = "source_agreement_id") String str2, @Json(name = "step_id") String str3, @Json(name = "hmac") HmacDto hmacDto) {
        this.status = roundingStatusDto;
        this.targetAgreementId = str;
        this.sourceAgreementId = str2;
        this.stepId = str3;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ RoundingSaveRequest copy$default(RoundingSaveRequest roundingSaveRequest, RoundingStatusDto roundingStatusDto, String str, String str2, String str3, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            roundingStatusDto = roundingSaveRequest.status;
        }
        if ((i & 2) != 0) {
            str = roundingSaveRequest.targetAgreementId;
        }
        if ((i & 4) != 0) {
            str2 = roundingSaveRequest.sourceAgreementId;
        }
        if ((i & 8) != 0) {
            str3 = roundingSaveRequest.stepId;
        }
        if ((i & 16) != 0) {
            hmacDto = roundingSaveRequest.hmac;
        }
        HmacDto hmacDto2 = hmacDto;
        String str4 = str2;
        return roundingSaveRequest.copy(roundingStatusDto, str, str4, str3, hmacDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final RoundingStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    /* renamed from: component5, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final RoundingSaveRequest copy(@Json(name = "status") RoundingStatusDto status, @Json(name = "target_agreement_id") String targetAgreementId, @Json(name = "source_agreement_id") String sourceAgreementId, @Json(name = "step_id") String stepId, @Json(name = "hmac") HmacDto hmac) {
        return new RoundingSaveRequest(status, targetAgreementId, sourceAgreementId, stepId, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundingSaveRequest)) {
            return false;
        }
        RoundingSaveRequest roundingSaveRequest = (RoundingSaveRequest) other;
        return this.status == roundingSaveRequest.status && jl40.l(this.targetAgreementId, roundingSaveRequest.targetAgreementId) && jl40.l(this.sourceAgreementId, roundingSaveRequest.sourceAgreementId) && jl40.l(this.stepId, roundingSaveRequest.stepId) && jl40.l(this.hmac, roundingSaveRequest.hmac);
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final RoundingStatusDto getStatus() {
        return this.status;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public int hashCode() {
        return this.hmac.hashCode() + unr0.b(unr0.b(unr0.b(this.status.hashCode() * 31, 31, this.targetAgreementId), 31, this.sourceAgreementId), 31, this.stepId);
    }

    public String toString() {
        RoundingStatusDto roundingStatusDto = this.status;
        String str = this.targetAgreementId;
        String str2 = this.sourceAgreementId;
        String str3 = this.stepId;
        HmacDto hmacDto = this.hmac;
        StringBuilder sb = new StringBuilder("RoundingSaveRequest(status=");
        sb.append(roundingStatusDto);
        sb.append(", targetAgreementId=");
        sb.append(str);
        sb.append(", sourceAgreementId=");
        g8e.D(sb, str2, ", stepId=", str3, ", hmac=");
        sb.append(hmacDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
