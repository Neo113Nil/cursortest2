package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse$Status;", "statusData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse$Status;Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto;)V", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse$Status;", "getStatusData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/StatusDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Status", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupRetryPaymentResponse {
    private final Status status;
    private final StatusDataDto statusData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupRetryPaymentResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "INITIATED", "FAIL", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status INITIATED = new Status("INITIATED", 0);
        public static final Status FAIL = new Status("FAIL", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{INITIATED, FAIL};
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

    public AutotopupRetryPaymentResponse(@Json(name = "status") Status status, @Json(name = "status_data") StatusDataDto statusDataDto) {
        this.status = status;
        this.statusData = statusDataDto;
    }

    public static /* synthetic */ AutotopupRetryPaymentResponse copy$default(AutotopupRetryPaymentResponse autotopupRetryPaymentResponse, Status status, StatusDataDto statusDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            status = autotopupRetryPaymentResponse.status;
        }
        if ((i & 2) != 0) {
            statusDataDto = autotopupRetryPaymentResponse.statusData;
        }
        return autotopupRetryPaymentResponse.copy(status, statusDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final StatusDataDto getStatusData() {
        return this.statusData;
    }

    public final AutotopupRetryPaymentResponse copy(@Json(name = "status") Status status, @Json(name = "status_data") StatusDataDto statusData) {
        return new AutotopupRetryPaymentResponse(status, statusData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupRetryPaymentResponse)) {
            return false;
        }
        AutotopupRetryPaymentResponse autotopupRetryPaymentResponse = (AutotopupRetryPaymentResponse) other;
        return this.status == autotopupRetryPaymentResponse.status && jl40.l(this.statusData, autotopupRetryPaymentResponse.statusData);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final StatusDataDto getStatusData() {
        return this.statusData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        StatusDataDto statusDataDto = this.statusData;
        return hashCode + (statusDataDto == null ? 0 : statusDataDto.hashCode());
    }

    public String toString() {
        return "AutotopupRetryPaymentResponse(status=" + this.status + ", statusData=" + this.statusData + Extension.C_BRAKE;
    }
}
