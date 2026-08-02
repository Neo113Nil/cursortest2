package com.ybsdk.core.utils.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001dB)\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse;", "T", "", "successData", "failData", "Lcom/ybsdk/core/utils/dto/OldFailDataResponse;", ACSPConstants.STATUS, "Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse$Status;", "<init>", "(Ljava/lang/Object;Lcom/ybsdk/core/utils/dto/OldFailDataResponse;Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse$Status;)V", "getSuccessData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFailData", "()Lcom/ybsdk/core/utils/dto/OldFailDataResponse;", "getStatus", "()Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse$Status;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Lcom/ybsdk/core/utils/dto/OldFailDataResponse;Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse$Status;)Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse;", "equals", "", "other", "hashCode", "", "toString", "", "Status", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OldDataWithStatusResponse<T> {
    private final OldFailDataResponse failData;
    private final Status status;
    private final T successData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/utils/dto/OldDataWithStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILED", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status FAILED = new Status("FAILED", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, FAILED};
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

    public OldDataWithStatusResponse(@Json(name = "success_data") T t, @Json(name = "fail_data") OldFailDataResponse oldFailDataResponse, @Json(name = "status") Status status) {
        this.successData = t;
        this.failData = oldFailDataResponse;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OldDataWithStatusResponse copy$default(OldDataWithStatusResponse oldDataWithStatusResponse, Object obj, OldFailDataResponse oldFailDataResponse, Status status, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = oldDataWithStatusResponse.successData;
        }
        if ((i & 2) != 0) {
            oldFailDataResponse = oldDataWithStatusResponse.failData;
        }
        if ((i & 4) != 0) {
            status = oldDataWithStatusResponse.status;
        }
        return oldDataWithStatusResponse.copy(obj, oldFailDataResponse, status);
    }

    public final T component1() {
        return this.successData;
    }

    /* renamed from: component2, reason: from getter */
    public final OldFailDataResponse getFailData() {
        return this.failData;
    }

    /* renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final OldDataWithStatusResponse<T> copy(@Json(name = "success_data") T successData, @Json(name = "fail_data") OldFailDataResponse failData, @Json(name = "status") Status status) {
        return new OldDataWithStatusResponse<>(successData, failData, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OldDataWithStatusResponse)) {
            return false;
        }
        OldDataWithStatusResponse oldDataWithStatusResponse = (OldDataWithStatusResponse) other;
        return jl40.l(this.successData, oldDataWithStatusResponse.successData) && jl40.l(this.failData, oldDataWithStatusResponse.failData) && this.status == oldDataWithStatusResponse.status;
    }

    public final OldFailDataResponse getFailData() {
        return this.failData;
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
        OldFailDataResponse oldFailDataResponse = this.failData;
        return this.status.hashCode() + ((hashCode + (oldFailDataResponse != null ? oldFailDataResponse.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "OldDataWithStatusResponse(successData=" + this.successData + ", failData=" + this.failData + ", status=" + this.status + Extension.C_BRAKE;
    }
}
