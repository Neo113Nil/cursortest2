package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2Response;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2ResponseStatus;", "successData", "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2SuccessDto;", "failureData", "Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2FailureDto;", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2ResponseStatus;Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2SuccessDto;Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2FailureDto;)V", "getStatus", "()Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2ResponseStatus;", "getSuccessData", "()Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2SuccessDto;", "getFailureData", "()Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedYandexDataV2FailureDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPreparedYandexDataV2Response {
    private final GetPreparedYandexDataV2FailureDto failureData;
    private final GetPreparedYandexDataV2ResponseStatus status;
    private final GetPreparedYandexDataV2SuccessDto successData;

    public GetPreparedYandexDataV2Response(@Json(name = "status") GetPreparedYandexDataV2ResponseStatus getPreparedYandexDataV2ResponseStatus, @Json(name = "data") GetPreparedYandexDataV2SuccessDto getPreparedYandexDataV2SuccessDto, @Json(name = "error") GetPreparedYandexDataV2FailureDto getPreparedYandexDataV2FailureDto) {
        this.status = getPreparedYandexDataV2ResponseStatus;
        this.successData = getPreparedYandexDataV2SuccessDto;
        this.failureData = getPreparedYandexDataV2FailureDto;
    }

    public static /* synthetic */ GetPreparedYandexDataV2Response copy$default(GetPreparedYandexDataV2Response getPreparedYandexDataV2Response, GetPreparedYandexDataV2ResponseStatus getPreparedYandexDataV2ResponseStatus, GetPreparedYandexDataV2SuccessDto getPreparedYandexDataV2SuccessDto, GetPreparedYandexDataV2FailureDto getPreparedYandexDataV2FailureDto, int i, Object obj) {
        if ((i & 1) != 0) {
            getPreparedYandexDataV2ResponseStatus = getPreparedYandexDataV2Response.status;
        }
        if ((i & 2) != 0) {
            getPreparedYandexDataV2SuccessDto = getPreparedYandexDataV2Response.successData;
        }
        if ((i & 4) != 0) {
            getPreparedYandexDataV2FailureDto = getPreparedYandexDataV2Response.failureData;
        }
        return getPreparedYandexDataV2Response.copy(getPreparedYandexDataV2ResponseStatus, getPreparedYandexDataV2SuccessDto, getPreparedYandexDataV2FailureDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GetPreparedYandexDataV2ResponseStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final GetPreparedYandexDataV2SuccessDto getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final GetPreparedYandexDataV2FailureDto getFailureData() {
        return this.failureData;
    }

    public final GetPreparedYandexDataV2Response copy(@Json(name = "status") GetPreparedYandexDataV2ResponseStatus status, @Json(name = "data") GetPreparedYandexDataV2SuccessDto successData, @Json(name = "error") GetPreparedYandexDataV2FailureDto failureData) {
        return new GetPreparedYandexDataV2Response(status, successData, failureData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPreparedYandexDataV2Response)) {
            return false;
        }
        GetPreparedYandexDataV2Response getPreparedYandexDataV2Response = (GetPreparedYandexDataV2Response) other;
        return this.status == getPreparedYandexDataV2Response.status && jl40.l(this.successData, getPreparedYandexDataV2Response.successData) && jl40.l(this.failureData, getPreparedYandexDataV2Response.failureData);
    }

    public final GetPreparedYandexDataV2FailureDto getFailureData() {
        return this.failureData;
    }

    public final GetPreparedYandexDataV2ResponseStatus getStatus() {
        return this.status;
    }

    public final GetPreparedYandexDataV2SuccessDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        GetPreparedYandexDataV2SuccessDto getPreparedYandexDataV2SuccessDto = this.successData;
        int hashCode2 = (hashCode + (getPreparedYandexDataV2SuccessDto == null ? 0 : getPreparedYandexDataV2SuccessDto.hashCode())) * 31;
        GetPreparedYandexDataV2FailureDto getPreparedYandexDataV2FailureDto = this.failureData;
        return hashCode2 + (getPreparedYandexDataV2FailureDto != null ? getPreparedYandexDataV2FailureDto.hashCode() : 0);
    }

    public String toString() {
        return "GetPreparedYandexDataV2Response(status=" + this.status + ", successData=" + this.successData + ", failureData=" + this.failureData + Extension.C_BRAKE;
    }
}
