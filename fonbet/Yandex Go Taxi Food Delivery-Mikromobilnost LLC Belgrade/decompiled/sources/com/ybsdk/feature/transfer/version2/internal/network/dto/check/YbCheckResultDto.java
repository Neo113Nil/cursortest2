package com.ybsdk.feature.transfer.version2.internal.network.dto.check;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultDto;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultDto$Status;", "receiverName", "", "error", "errorInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultErrorInfoDto;", "requestId", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultDto$Status;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultErrorInfoDto;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultDto$Status;", "getReceiverName", "()Ljava/lang/String;", "getError", "getErrorInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultErrorInfoDto;", "getRequestId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCheckResultDto {
    private final String error;
    private final YbCheckResultErrorInfoDto errorInfo;
    private final String receiverName;
    private final String requestId;
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/check/YbCheckResultDto$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "FOUND", "NOT_FOUND", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status("PENDING", 0);
        public static final Status FOUND = new Status("FOUND", 1);
        public static final Status NOT_FOUND = new Status("NOT_FOUND", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, FOUND, NOT_FOUND};
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

    public YbCheckResultDto(@Json(name = "status") Status status, @Json(name = "receiver_name") String str, @Json(name = "error") String str2, @Json(name = "error_info") YbCheckResultErrorInfoDto ybCheckResultErrorInfoDto, @Json(name = "request_id") String str3) {
        this.status = status;
        this.receiverName = str;
        this.error = str2;
        this.errorInfo = ybCheckResultErrorInfoDto;
        this.requestId = str3;
    }

    public static /* synthetic */ YbCheckResultDto copy$default(YbCheckResultDto ybCheckResultDto, Status status, String str, String str2, YbCheckResultErrorInfoDto ybCheckResultErrorInfoDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            status = ybCheckResultDto.status;
        }
        if ((i & 2) != 0) {
            str = ybCheckResultDto.receiverName;
        }
        if ((i & 4) != 0) {
            str2 = ybCheckResultDto.error;
        }
        if ((i & 8) != 0) {
            ybCheckResultErrorInfoDto = ybCheckResultDto.errorInfo;
        }
        if ((i & 16) != 0) {
            str3 = ybCheckResultDto.requestId;
        }
        String str4 = str3;
        String str5 = str2;
        return ybCheckResultDto.copy(status, str, str5, ybCheckResultErrorInfoDto, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiverName() {
        return this.receiverName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final YbCheckResultErrorInfoDto getErrorInfo() {
        return this.errorInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final YbCheckResultDto copy(@Json(name = "status") Status status, @Json(name = "receiver_name") String receiverName, @Json(name = "error") String error, @Json(name = "error_info") YbCheckResultErrorInfoDto errorInfo, @Json(name = "request_id") String requestId) {
        return new YbCheckResultDto(status, receiverName, error, errorInfo, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCheckResultDto)) {
            return false;
        }
        YbCheckResultDto ybCheckResultDto = (YbCheckResultDto) other;
        return this.status == ybCheckResultDto.status && jl40.l(this.receiverName, ybCheckResultDto.receiverName) && jl40.l(this.error, ybCheckResultDto.error) && jl40.l(this.errorInfo, ybCheckResultDto.errorInfo) && jl40.l(this.requestId, ybCheckResultDto.requestId);
    }

    public final String getError() {
        return this.error;
    }

    public final YbCheckResultErrorInfoDto getErrorInfo() {
        return this.errorInfo;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.receiverName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        YbCheckResultErrorInfoDto ybCheckResultErrorInfoDto = this.errorInfo;
        int hashCode4 = (hashCode3 + (ybCheckResultErrorInfoDto == null ? 0 : ybCheckResultErrorInfoDto.hashCode())) * 31;
        String str3 = this.requestId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        String str = this.receiverName;
        String str2 = this.error;
        YbCheckResultErrorInfoDto ybCheckResultErrorInfoDto = this.errorInfo;
        String str3 = this.requestId;
        StringBuilder sb = new StringBuilder("YbCheckResultDto(status=");
        sb.append(status);
        sb.append(", receiverName=");
        sb.append(str);
        sb.append(", error=");
        sb.append(str2);
        sb.append(", errorInfo=");
        sb.append(ybCheckResultErrorInfoDto);
        sb.append(", requestId=");
        return oyr.t(sb, str3, Extension.C_BRAKE);
    }
}
