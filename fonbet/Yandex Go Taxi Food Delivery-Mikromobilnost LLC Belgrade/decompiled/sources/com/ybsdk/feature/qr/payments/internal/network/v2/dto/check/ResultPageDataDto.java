package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.payment.common.result.ResultType;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDto;", "", ResultType.RESULT_TYPE_LOADING, "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageLoadingDataDto;", "timeout", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/StatusPageDataDto;", "error", "<init>", "(Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageLoadingDataDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/StatusPageDataDto;Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/StatusPageDataDto;)V", "getLoading", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageLoadingDataDto;", "getTimeout", "()Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/StatusPageDataDto;", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResultPageDataDto {
    private final StatusPageDataDto error;
    private final ResultPageLoadingDataDto loading;
    private final StatusPageDataDto timeout;

    public ResultPageDataDto(@Json(name = "loading") ResultPageLoadingDataDto resultPageLoadingDataDto, @Json(name = "timeout") StatusPageDataDto statusPageDataDto, @Json(name = "error") StatusPageDataDto statusPageDataDto2) {
        this.loading = resultPageLoadingDataDto;
        this.timeout = statusPageDataDto;
        this.error = statusPageDataDto2;
    }

    public static /* synthetic */ ResultPageDataDto copy$default(ResultPageDataDto resultPageDataDto, ResultPageLoadingDataDto resultPageLoadingDataDto, StatusPageDataDto statusPageDataDto, StatusPageDataDto statusPageDataDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            resultPageLoadingDataDto = resultPageDataDto.loading;
        }
        if ((i & 2) != 0) {
            statusPageDataDto = resultPageDataDto.timeout;
        }
        if ((i & 4) != 0) {
            statusPageDataDto2 = resultPageDataDto.error;
        }
        return resultPageDataDto.copy(resultPageLoadingDataDto, statusPageDataDto, statusPageDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final ResultPageLoadingDataDto getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final StatusPageDataDto getTimeout() {
        return this.timeout;
    }

    /* renamed from: component3, reason: from getter */
    public final StatusPageDataDto getError() {
        return this.error;
    }

    public final ResultPageDataDto copy(@Json(name = "loading") ResultPageLoadingDataDto loading, @Json(name = "timeout") StatusPageDataDto timeout, @Json(name = "error") StatusPageDataDto error) {
        return new ResultPageDataDto(loading, timeout, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultPageDataDto)) {
            return false;
        }
        ResultPageDataDto resultPageDataDto = (ResultPageDataDto) other;
        return jl40.l(this.loading, resultPageDataDto.loading) && jl40.l(this.timeout, resultPageDataDto.timeout) && jl40.l(this.error, resultPageDataDto.error);
    }

    public final StatusPageDataDto getError() {
        return this.error;
    }

    public final ResultPageLoadingDataDto getLoading() {
        return this.loading;
    }

    public final StatusPageDataDto getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return this.error.hashCode() + ((this.timeout.hashCode() + (this.loading.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ResultPageDataDto(loading=" + this.loading + ", timeout=" + this.timeout + ", error=" + this.error + Extension.C_BRAKE;
    }
}
