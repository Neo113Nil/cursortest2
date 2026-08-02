package com.ybsdk.feature.transfer.internal.network.dto;

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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse;", "", "ybCheckResult", "Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult;", ACSPConstants.STATUS, "Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse$Status;", "error", "", "<init>", "(Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult;Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse$Status;Ljava/lang/String;)V", "getYbCheckResult", "()Lcom/ybsdk/feature/transfer/internal/network/dto/YbCheckResult;", "getStatus", "()Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse$Status;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckUserTransferTargetResponse {
    private final String error;
    private final Status status;
    private final YbCheckResult ybCheckResult;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/CheckUserTransferTargetResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "SUCCESS", "FAIL", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status PENDING = new Status("PENDING", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);
        public static final Status FAIL = new Status("FAIL", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{PENDING, SUCCESS, FAIL};
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

    public CheckUserTransferTargetResponse(@Json(name = "JSON_FIELD_MEMBER_CHECK_RESULT") YbCheckResult ybCheckResult, @Json(name = "status") Status status, @Json(name = "error") String str) {
        this.ybCheckResult = ybCheckResult;
        this.status = status;
        this.error = str;
    }

    public static /* synthetic */ CheckUserTransferTargetResponse copy$default(CheckUserTransferTargetResponse checkUserTransferTargetResponse, YbCheckResult ybCheckResult, Status status, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ybCheckResult = checkUserTransferTargetResponse.ybCheckResult;
        }
        if ((i & 2) != 0) {
            status = checkUserTransferTargetResponse.status;
        }
        if ((i & 4) != 0) {
            str = checkUserTransferTargetResponse.error;
        }
        return checkUserTransferTargetResponse.copy(ybCheckResult, status, str);
    }

    /* renamed from: component1, reason: from getter */
    public final YbCheckResult getYbCheckResult() {
        return this.ybCheckResult;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final CheckUserTransferTargetResponse copy(@Json(name = "JSON_FIELD_MEMBER_CHECK_RESULT") YbCheckResult ybCheckResult, @Json(name = "status") Status status, @Json(name = "error") String error) {
        return new CheckUserTransferTargetResponse(ybCheckResult, status, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckUserTransferTargetResponse)) {
            return false;
        }
        CheckUserTransferTargetResponse checkUserTransferTargetResponse = (CheckUserTransferTargetResponse) other;
        return jl40.l(this.ybCheckResult, checkUserTransferTargetResponse.ybCheckResult) && this.status == checkUserTransferTargetResponse.status && jl40.l(this.error, checkUserTransferTargetResponse.error);
    }

    public final String getError() {
        return this.error;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final YbCheckResult getYbCheckResult() {
        return this.ybCheckResult;
    }

    public int hashCode() {
        YbCheckResult ybCheckResult = this.ybCheckResult;
        int hashCode = (this.status.hashCode() + ((ybCheckResult == null ? 0 : ybCheckResult.hashCode()) * 31)) * 31;
        String str = this.error;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        YbCheckResult ybCheckResult = this.ybCheckResult;
        Status status = this.status;
        String str = this.error;
        StringBuilder sb = new StringBuilder("CheckUserTransferTargetResponse(ybCheckResult=");
        sb.append(ybCheckResult);
        sb.append(", status=");
        sb.append(status);
        sb.append(", error=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
