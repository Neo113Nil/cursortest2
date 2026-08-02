package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto$Status;", "successData", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDto;", "error", "", "errorInfo", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerErrorInfoDto;", "requestId", "<init>", "(Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto$Status;Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDto;Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerErrorInfoDto;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto$Status;", "getSuccessData", "()Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerSuccessDto;", "getError", "()Ljava/lang/String;", "getErrorInfo", "()Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerErrorInfoDto;", "getRequestId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderCheckUserPartnerResultDto {
    private final String error;
    private final CrossBorderCheckUserPartnerErrorInfoDto errorInfo;
    private final String requestId;
    private final Status status;
    private final CrossBorderCheckUserPartnerSuccessDto successData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerResultDto$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "FOUND", "SUCCESS", "NOT_FOUND", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status("PENDING", 0);
        public static final Status FOUND = new Status("FOUND", 1);
        public static final Status SUCCESS = new Status("SUCCESS", 2);
        public static final Status NOT_FOUND = new Status("NOT_FOUND", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, FOUND, SUCCESS, NOT_FOUND};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
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

    public CrossBorderCheckUserPartnerResultDto(@Json(name = "status") Status status, @Json(name = "success_data") CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto, @Json(name = "error") String str, @Json(name = "error_info") CrossBorderCheckUserPartnerErrorInfoDto crossBorderCheckUserPartnerErrorInfoDto, @Json(name = "request_id") String str2) {
        this.status = status;
        this.successData = crossBorderCheckUserPartnerSuccessDto;
        this.error = str;
        this.errorInfo = crossBorderCheckUserPartnerErrorInfoDto;
        this.requestId = str2;
    }

    public static /* synthetic */ CrossBorderCheckUserPartnerResultDto copy$default(CrossBorderCheckUserPartnerResultDto crossBorderCheckUserPartnerResultDto, Status status, CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto, String str, CrossBorderCheckUserPartnerErrorInfoDto crossBorderCheckUserPartnerErrorInfoDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            status = crossBorderCheckUserPartnerResultDto.status;
        }
        if ((i & 2) != 0) {
            crossBorderCheckUserPartnerSuccessDto = crossBorderCheckUserPartnerResultDto.successData;
        }
        if ((i & 4) != 0) {
            str = crossBorderCheckUserPartnerResultDto.error;
        }
        if ((i & 8) != 0) {
            crossBorderCheckUserPartnerErrorInfoDto = crossBorderCheckUserPartnerResultDto.errorInfo;
        }
        if ((i & 16) != 0) {
            str2 = crossBorderCheckUserPartnerResultDto.requestId;
        }
        String str3 = str2;
        String str4 = str;
        return crossBorderCheckUserPartnerResultDto.copy(status, crossBorderCheckUserPartnerSuccessDto, str4, crossBorderCheckUserPartnerErrorInfoDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final CrossBorderCheckUserPartnerSuccessDto getSuccessData() {
        return this.successData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final CrossBorderCheckUserPartnerErrorInfoDto getErrorInfo() {
        return this.errorInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final CrossBorderCheckUserPartnerResultDto copy(@Json(name = "status") Status status, @Json(name = "success_data") CrossBorderCheckUserPartnerSuccessDto successData, @Json(name = "error") String error, @Json(name = "error_info") CrossBorderCheckUserPartnerErrorInfoDto errorInfo, @Json(name = "request_id") String requestId) {
        return new CrossBorderCheckUserPartnerResultDto(status, successData, error, errorInfo, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderCheckUserPartnerResultDto)) {
            return false;
        }
        CrossBorderCheckUserPartnerResultDto crossBorderCheckUserPartnerResultDto = (CrossBorderCheckUserPartnerResultDto) other;
        return this.status == crossBorderCheckUserPartnerResultDto.status && jl40.l(this.successData, crossBorderCheckUserPartnerResultDto.successData) && jl40.l(this.error, crossBorderCheckUserPartnerResultDto.error) && jl40.l(this.errorInfo, crossBorderCheckUserPartnerResultDto.errorInfo) && jl40.l(this.requestId, crossBorderCheckUserPartnerResultDto.requestId);
    }

    public final String getError() {
        return this.error;
    }

    public final CrossBorderCheckUserPartnerErrorInfoDto getErrorInfo() {
        return this.errorInfo;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final CrossBorderCheckUserPartnerSuccessDto getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto = this.successData;
        int hashCode2 = (hashCode + (crossBorderCheckUserPartnerSuccessDto == null ? 0 : crossBorderCheckUserPartnerSuccessDto.hashCode())) * 31;
        String str = this.error;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CrossBorderCheckUserPartnerErrorInfoDto crossBorderCheckUserPartnerErrorInfoDto = this.errorInfo;
        int hashCode4 = (hashCode3 + (crossBorderCheckUserPartnerErrorInfoDto == null ? 0 : crossBorderCheckUserPartnerErrorInfoDto.hashCode())) * 31;
        String str2 = this.requestId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        CrossBorderCheckUserPartnerSuccessDto crossBorderCheckUserPartnerSuccessDto = this.successData;
        String str = this.error;
        CrossBorderCheckUserPartnerErrorInfoDto crossBorderCheckUserPartnerErrorInfoDto = this.errorInfo;
        String str2 = this.requestId;
        StringBuilder sb = new StringBuilder("CrossBorderCheckUserPartnerResultDto(status=");
        sb.append(status);
        sb.append(", successData=");
        sb.append(crossBorderCheckUserPartnerSuccessDto);
        sb.append(", error=");
        sb.append(str);
        sb.append(", errorInfo=");
        sb.append(crossBorderCheckUserPartnerErrorInfoDto);
        sb.append(", requestId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
