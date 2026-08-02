package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.dto.ErrorResponseDto;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse;", "", "successData", "Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportResponse;", "failData", "Lcom/ybsdk/core/utils/dto/ErrorResponseDto;", ACSPConstants.STATUS, "Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse$Status;", "<init>", "(Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportResponse;Lcom/ybsdk/core/utils/dto/ErrorResponseDto;Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse$Status;)V", "getSuccessData", "()Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportResponse;", "getFailData", "()Lcom/ybsdk/core/utils/dto/ErrorResponseDto;", "getStatus", "()Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse$Status;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Status", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GenerateReportStatusResponse {
    private final ErrorResponseDto failData;
    private final Status status;
    private final GenerateReportResponse successData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status FAIL = new Status("FAIL", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, FAIL};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public GenerateReportStatusResponse(@Json(name = "success_data") GenerateReportResponse generateReportResponse, @Json(name = "fail_data") ErrorResponseDto errorResponseDto, @Json(name = "status") Status status) {
        this.successData = generateReportResponse;
        this.failData = errorResponseDto;
        this.status = status;
    }

    public static /* synthetic */ GenerateReportStatusResponse copy$default(GenerateReportStatusResponse generateReportStatusResponse, GenerateReportResponse generateReportResponse, ErrorResponseDto errorResponseDto, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            generateReportResponse = generateReportStatusResponse.successData;
        }
        if ((i & 2) != 0) {
            errorResponseDto = generateReportStatusResponse.failData;
        }
        if ((i & 4) != 0) {
            status = generateReportStatusResponse.status;
        }
        return generateReportStatusResponse.copy(generateReportResponse, errorResponseDto, status);
    }

    /* renamed from: component1, reason: from getter */
    public final GenerateReportResponse getSuccessData() {
        return this.successData;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorResponseDto getFailData() {
        return this.failData;
    }

    /* renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final GenerateReportStatusResponse copy(@Json(name = "success_data") GenerateReportResponse successData, @Json(name = "fail_data") ErrorResponseDto failData, @Json(name = "status") Status status) {
        return new GenerateReportStatusResponse(successData, failData, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateReportStatusResponse)) {
            return false;
        }
        GenerateReportStatusResponse generateReportStatusResponse = (GenerateReportStatusResponse) other;
        return jl40.l(this.successData, generateReportStatusResponse.successData) && jl40.l(this.failData, generateReportStatusResponse.failData) && this.status == generateReportStatusResponse.status;
    }

    public final ErrorResponseDto getFailData() {
        return this.failData;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final GenerateReportResponse getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        GenerateReportResponse generateReportResponse = this.successData;
        int hashCode = (generateReportResponse == null ? 0 : generateReportResponse.hashCode()) * 31;
        ErrorResponseDto errorResponseDto = this.failData;
        return this.status.hashCode() + ((hashCode + (errorResponseDto != null ? errorResponseDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "GenerateReportStatusResponse(successData=" + this.successData + ", failData=" + this.failData + ", status=" + this.status + Extension.C_BRAKE;
    }
}
