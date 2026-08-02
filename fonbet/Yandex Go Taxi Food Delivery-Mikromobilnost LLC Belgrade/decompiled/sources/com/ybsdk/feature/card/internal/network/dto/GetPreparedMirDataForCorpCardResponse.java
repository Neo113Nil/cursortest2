package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/GetPreparedMirDataForCorpCardResponse;", "", "responseStatus", "Lcom/ybsdk/feature/card/internal/network/dto/CorpCardResponseStatus;", "successData", "Lcom/ybsdk/feature/card/internal/network/dto/CorpCardDataSuccessDto;", "failureData", "Lcom/ybsdk/feature/card/internal/network/dto/CorpCardDataFailureDto;", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/CorpCardResponseStatus;Lcom/ybsdk/feature/card/internal/network/dto/CorpCardDataSuccessDto;Lcom/ybsdk/feature/card/internal/network/dto/CorpCardDataFailureDto;)V", "getResponseStatus", "()Lcom/ybsdk/feature/card/internal/network/dto/CorpCardResponseStatus;", "getSuccessData", "()Lcom/ybsdk/feature/card/internal/network/dto/CorpCardDataSuccessDto;", "getFailureData", "()Lcom/ybsdk/feature/card/internal/network/dto/CorpCardDataFailureDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPreparedMirDataForCorpCardResponse {
    private final CorpCardDataFailureDto failureData;
    private final CorpCardResponseStatus responseStatus;
    private final CorpCardDataSuccessDto successData;

    public GetPreparedMirDataForCorpCardResponse(@Json(name = "status") CorpCardResponseStatus corpCardResponseStatus, @Json(name = "data") CorpCardDataSuccessDto corpCardDataSuccessDto, @Json(name = "error") CorpCardDataFailureDto corpCardDataFailureDto) {
        this.responseStatus = corpCardResponseStatus;
        this.successData = corpCardDataSuccessDto;
        this.failureData = corpCardDataFailureDto;
    }

    public static /* synthetic */ GetPreparedMirDataForCorpCardResponse copy$default(GetPreparedMirDataForCorpCardResponse getPreparedMirDataForCorpCardResponse, CorpCardResponseStatus corpCardResponseStatus, CorpCardDataSuccessDto corpCardDataSuccessDto, CorpCardDataFailureDto corpCardDataFailureDto, int i, Object obj) {
        if ((i & 1) != 0) {
            corpCardResponseStatus = getPreparedMirDataForCorpCardResponse.responseStatus;
        }
        if ((i & 2) != 0) {
            corpCardDataSuccessDto = getPreparedMirDataForCorpCardResponse.successData;
        }
        if ((i & 4) != 0) {
            corpCardDataFailureDto = getPreparedMirDataForCorpCardResponse.failureData;
        }
        return getPreparedMirDataForCorpCardResponse.copy(corpCardResponseStatus, corpCardDataSuccessDto, corpCardDataFailureDto);
    }

    /* renamed from: component1, reason: from getter */
    public final CorpCardResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final CorpCardDataSuccessDto getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final CorpCardDataFailureDto getFailureData() {
        return this.failureData;
    }

    public final GetPreparedMirDataForCorpCardResponse copy(@Json(name = "status") CorpCardResponseStatus responseStatus, @Json(name = "data") CorpCardDataSuccessDto successData, @Json(name = "error") CorpCardDataFailureDto failureData) {
        return new GetPreparedMirDataForCorpCardResponse(responseStatus, successData, failureData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPreparedMirDataForCorpCardResponse)) {
            return false;
        }
        GetPreparedMirDataForCorpCardResponse getPreparedMirDataForCorpCardResponse = (GetPreparedMirDataForCorpCardResponse) other;
        return this.responseStatus == getPreparedMirDataForCorpCardResponse.responseStatus && jl40.l(this.successData, getPreparedMirDataForCorpCardResponse.successData) && jl40.l(this.failureData, getPreparedMirDataForCorpCardResponse.failureData);
    }

    public final CorpCardDataFailureDto getFailureData() {
        return this.failureData;
    }

    public final CorpCardResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    public final CorpCardDataSuccessDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.responseStatus.hashCode() * 31;
        CorpCardDataSuccessDto corpCardDataSuccessDto = this.successData;
        int hashCode2 = (hashCode + (corpCardDataSuccessDto == null ? 0 : corpCardDataSuccessDto.hashCode())) * 31;
        CorpCardDataFailureDto corpCardDataFailureDto = this.failureData;
        return hashCode2 + (corpCardDataFailureDto != null ? corpCardDataFailureDto.hashCode() : 0);
    }

    public String toString() {
        return "GetPreparedMirDataForCorpCardResponse(responseStatus=" + this.responseStatus + ", successData=" + this.successData + ", failureData=" + this.failureData + Extension.C_BRAKE;
    }
}
