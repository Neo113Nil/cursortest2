package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.StatusInfoDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/StartChargeSearchResponse;", "", "requestId", "", "processingInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "timeoutInfo", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;)V", "getRequestId", "()Ljava/lang/String;", "getProcessingInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "getTimeoutInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StartChargeSearchResponse {
    private final StatusInfoDto processingInfo;
    private final String requestId;
    private final StatusInfoDto timeoutInfo;

    public StartChargeSearchResponse(@Json(name = "request_id") String str, @Json(name = "processing_info") StatusInfoDto statusInfoDto, @Json(name = "timeout_info") StatusInfoDto statusInfoDto2) {
        this.requestId = str;
        this.processingInfo = statusInfoDto;
        this.timeoutInfo = statusInfoDto2;
    }

    public static /* synthetic */ StartChargeSearchResponse copy$default(StartChargeSearchResponse startChargeSearchResponse, String str, StatusInfoDto statusInfoDto, StatusInfoDto statusInfoDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startChargeSearchResponse.requestId;
        }
        if ((i & 2) != 0) {
            statusInfoDto = startChargeSearchResponse.processingInfo;
        }
        if ((i & 4) != 0) {
            statusInfoDto2 = startChargeSearchResponse.timeoutInfo;
        }
        return startChargeSearchResponse.copy(str, statusInfoDto, statusInfoDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final StatusInfoDto getProcessingInfo() {
        return this.processingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final StatusInfoDto getTimeoutInfo() {
        return this.timeoutInfo;
    }

    public final StartChargeSearchResponse copy(@Json(name = "request_id") String requestId, @Json(name = "processing_info") StatusInfoDto processingInfo, @Json(name = "timeout_info") StatusInfoDto timeoutInfo) {
        return new StartChargeSearchResponse(requestId, processingInfo, timeoutInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartChargeSearchResponse)) {
            return false;
        }
        StartChargeSearchResponse startChargeSearchResponse = (StartChargeSearchResponse) other;
        return jl40.l(this.requestId, startChargeSearchResponse.requestId) && jl40.l(this.processingInfo, startChargeSearchResponse.processingInfo) && jl40.l(this.timeoutInfo, startChargeSearchResponse.timeoutInfo);
    }

    public final StatusInfoDto getProcessingInfo() {
        return this.processingInfo;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final StatusInfoDto getTimeoutInfo() {
        return this.timeoutInfo;
    }

    public int hashCode() {
        return this.timeoutInfo.hashCode() + ((this.processingInfo.hashCode() + (this.requestId.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "StartChargeSearchResponse(requestId=" + this.requestId + ", processingInfo=" + this.processingInfo + ", timeoutInfo=" + this.timeoutInfo + Extension.C_BRAKE;
    }
}
