package com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.search;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transfer.version2.internal.network.dto.budgetcharges.StatusInfoDto;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse$Status;", "statusInfo", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "action", "", "<init>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse$Status;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse$Status;", "getStatusInfo", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/StatusInfoDto;", "getAction", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetStatusChargeSearchResponse {
    private final String action;
    private final Status status;
    private final StatusInfoDto statusInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/budgetcharges/search/GetStatusChargeSearchResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "IN_PROGRESS", "FAILED", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status IN_PROGRESS = new Status("IN_PROGRESS", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, IN_PROGRESS, FAILED};
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

    public GetStatusChargeSearchResponse(@Json(name = "status") Status status, @Json(name = "status_info") StatusInfoDto statusInfoDto, @Json(name = "action") String str) {
        this.status = status;
        this.statusInfo = statusInfoDto;
        this.action = str;
    }

    public static /* synthetic */ GetStatusChargeSearchResponse copy$default(GetStatusChargeSearchResponse getStatusChargeSearchResponse, Status status, StatusInfoDto statusInfoDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            status = getStatusChargeSearchResponse.status;
        }
        if ((i & 2) != 0) {
            statusInfoDto = getStatusChargeSearchResponse.statusInfo;
        }
        if ((i & 4) != 0) {
            str = getStatusChargeSearchResponse.action;
        }
        return getStatusChargeSearchResponse.copy(status, statusInfoDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final StatusInfoDto getStatusInfo() {
        return this.statusInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final GetStatusChargeSearchResponse copy(@Json(name = "status") Status status, @Json(name = "status_info") StatusInfoDto statusInfo, @Json(name = "action") String action) {
        return new GetStatusChargeSearchResponse(status, statusInfo, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetStatusChargeSearchResponse)) {
            return false;
        }
        GetStatusChargeSearchResponse getStatusChargeSearchResponse = (GetStatusChargeSearchResponse) other;
        return this.status == getStatusChargeSearchResponse.status && jl40.l(this.statusInfo, getStatusChargeSearchResponse.statusInfo) && jl40.l(this.action, getStatusChargeSearchResponse.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final StatusInfoDto getStatusInfo() {
        return this.statusInfo;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        StatusInfoDto statusInfoDto = this.statusInfo;
        int hashCode2 = (hashCode + (statusInfoDto == null ? 0 : statusInfoDto.hashCode())) * 31;
        String str = this.action;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Status status = this.status;
        StatusInfoDto statusInfoDto = this.statusInfo;
        String str = this.action;
        StringBuilder sb = new StringBuilder("GetStatusChargeSearchResponse(status=");
        sb.append(status);
        sb.append(", statusInfo=");
        sb.append(statusInfoDto);
        sb.append(", action=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
