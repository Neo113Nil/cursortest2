package com.ybsdk.core.utils.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.w511;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB)\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "T", "", "successData", "failData", "Lcom/ybsdk/core/utils/dto/FailDataResponse;", ACSPConstants.STATUS, "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse$Status;", "<init>", "(Ljava/lang/Object;Lcom/ybsdk/core/utils/dto/FailDataResponse;Lcom/ybsdk/core/utils/dto/DataWithStatusResponse$Status;)V", "getSuccessData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFailData", "()Lcom/ybsdk/core/utils/dto/FailDataResponse;", "getStatus", "()Lcom/ybsdk/core/utils/dto/DataWithStatusResponse$Status;", "getOrThrow", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Lcom/ybsdk/core/utils/dto/FailDataResponse;Lcom/ybsdk/core/utils/dto/DataWithStatusResponse$Status;)Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "equals", "", "other", "hashCode", "", "toString", "", "Status", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DataWithStatusResponse<T> {
    private final FailDataResponse failData;
    private final Status status;
    private final T successData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/utils/dto/DataWithStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "UNKNOWN", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status FAIL = new Status("FAIL", 1);
        public static final Status UNKNOWN = new Status("UNKNOWN", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, FAIL, UNKNOWN};
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

    public DataWithStatusResponse(@Json(name = "success_data") T t, @Json(name = "fail_data") FailDataResponse failDataResponse, @Json(name = "status") Status status) {
        this.successData = t;
        this.failData = failDataResponse;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataWithStatusResponse copy$default(DataWithStatusResponse dataWithStatusResponse, Object obj, FailDataResponse failDataResponse, Status status, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = dataWithStatusResponse.successData;
        }
        if ((i & 2) != 0) {
            failDataResponse = dataWithStatusResponse.failData;
        }
        if ((i & 4) != 0) {
            status = dataWithStatusResponse.status;
        }
        return dataWithStatusResponse.copy(obj, failDataResponse, status);
    }

    public final T component1() {
        return this.successData;
    }

    /* renamed from: component2, reason: from getter */
    public final FailDataResponse getFailData() {
        return this.failData;
    }

    /* renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final DataWithStatusResponse<T> copy(@Json(name = "success_data") T successData, @Json(name = "fail_data") FailDataResponse failData, @Json(name = "status") Status status) {
        return new DataWithStatusResponse<>(successData, failData, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataWithStatusResponse)) {
            return false;
        }
        DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) other;
        return jl40.l(this.successData, dataWithStatusResponse.successData) && jl40.l(this.failData, dataWithStatusResponse.failData) && this.status == dataWithStatusResponse.status;
    }

    public final FailDataResponse getFailData() {
        return this.failData;
    }

    public final T getOrThrow() {
        int i = c.a[this.status.ordinal()];
        if (i == 1) {
            return this.successData;
        }
        if (i == 2) {
            throw new FailDataException(this.failData.getTitle(), this.failData.getDescription(), this.failData.getSupportUrl(), this.failData.getTechInfo(), 4, this.failData.getTraceId());
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        ny61.r("Can't return value when status is UNKNOWN");
        return null;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final T getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        T t = this.successData;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        FailDataResponse failDataResponse = this.failData;
        return this.status.hashCode() + ((hashCode + (failDataResponse != null ? failDataResponse.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DataWithStatusResponse(successData=" + this.successData + ", failData=" + this.failData + ", status=" + this.status + Extension.C_BRAKE;
    }
}
