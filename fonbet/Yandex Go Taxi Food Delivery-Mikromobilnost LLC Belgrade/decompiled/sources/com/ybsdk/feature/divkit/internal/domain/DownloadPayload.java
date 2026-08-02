package com.ybsdk.feature.divkit.internal.domain;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002'(BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J`\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload;", "", "body", "", "headers", "", "idempotency", "Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$IdempotencyData;", "isGeneralResponse", "", "isPollingRequest", "hmacData", "Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$IdempotencyData;ZLjava/lang/Boolean;Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getIdempotency", "()Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$IdempotencyData;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHmacData", "()Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/Map;Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$IdempotencyData;ZLjava/lang/Boolean;Lcom/ybsdk/feature/divkit/internal/domain/hmac/HmacData;)Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload;", "equals", "other", "hashCode", "", "toString", "IdempotencyData", "PollingData", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DownloadPayload {
    private final String body;
    private final Map<String, String> headers;
    private final HmacData hmacData;
    private final IdempotencyData idempotency;
    private final boolean isGeneralResponse;
    private final Boolean isPollingRequest;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$IdempotencyData;", "", "operationKey", "", "<init>", "(Ljava/lang/String;)V", "getOperationKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdempotencyData {
        private final String operationKey;

        public IdempotencyData(@Json(name = "operation_key") String str) {
            this.operationKey = str;
        }

        public static /* synthetic */ IdempotencyData copy$default(IdempotencyData idempotencyData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idempotencyData.operationKey;
            }
            return idempotencyData.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOperationKey() {
            return this.operationKey;
        }

        public final IdempotencyData copy(@Json(name = "operation_key") String operationKey) {
            return new IdempotencyData(operationKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdempotencyData) && jl40.l(this.operationKey, ((IdempotencyData) other).operationKey);
        }

        public final String getOperationKey() {
            return this.operationKey;
        }

        public int hashCode() {
            return this.operationKey.hashCode();
        }

        public String toString() {
            return oyr.p("IdempotencyData(operationKey=", this.operationKey, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/domain/DownloadPayload$PollingData;", "", "timeoutMs", "", "intervalMs", "<init>", "(JJ)V", "getTimeoutMs", "()J", "getIntervalMs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PollingData {
        private final long intervalMs;
        private final long timeoutMs;

        public PollingData(@Json(name = "timeout_ms") long j, @Json(name = "interval_ms") long j2) {
            this.timeoutMs = j;
            this.intervalMs = j2;
        }

        public static /* synthetic */ PollingData copy$default(PollingData pollingData, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = pollingData.timeoutMs;
            }
            if ((i & 2) != 0) {
                j2 = pollingData.intervalMs;
            }
            return pollingData.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimeoutMs() {
            return this.timeoutMs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getIntervalMs() {
            return this.intervalMs;
        }

        public final PollingData copy(@Json(name = "timeout_ms") long timeoutMs, @Json(name = "interval_ms") long intervalMs) {
            return new PollingData(timeoutMs, intervalMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollingData)) {
                return false;
            }
            PollingData pollingData = (PollingData) other;
            return this.timeoutMs == pollingData.timeoutMs && this.intervalMs == pollingData.intervalMs;
        }

        public final long getIntervalMs() {
            return this.intervalMs;
        }

        public final long getTimeoutMs() {
            return this.timeoutMs;
        }

        public int hashCode() {
            return Long.hashCode(this.intervalMs) + (Long.hashCode(this.timeoutMs) * 31);
        }

        public String toString() {
            return oyr.n(this.intervalMs, Extension.C_BRAKE, unr0.w(this.timeoutMs, "PollingData(timeoutMs=", ", intervalMs="));
        }
    }

    public /* synthetic */ DownloadPayload(String str, Map map, IdempotencyData idempotencyData, boolean z, Boolean bool, HmacData hmacData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : idempotencyData, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : hmacData);
    }

    public static /* synthetic */ DownloadPayload copy$default(DownloadPayload downloadPayload, String str, Map map, IdempotencyData idempotencyData, boolean z, Boolean bool, HmacData hmacData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadPayload.body;
        }
        if ((i & 2) != 0) {
            map = downloadPayload.headers;
        }
        if ((i & 4) != 0) {
            idempotencyData = downloadPayload.idempotency;
        }
        if ((i & 8) != 0) {
            z = downloadPayload.isGeneralResponse;
        }
        if ((i & 16) != 0) {
            bool = downloadPayload.isPollingRequest;
        }
        if ((i & 32) != 0) {
            hmacData = downloadPayload.hmacData;
        }
        Boolean bool2 = bool;
        HmacData hmacData2 = hmacData;
        return downloadPayload.copy(str, map, idempotencyData, z, bool2, hmacData2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    /* renamed from: component3, reason: from getter */
    public final IdempotencyData getIdempotency() {
        return this.idempotency;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsGeneralResponse() {
        return this.isGeneralResponse;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsPollingRequest() {
        return this.isPollingRequest;
    }

    /* renamed from: component6, reason: from getter */
    public final HmacData getHmacData() {
        return this.hmacData;
    }

    public final DownloadPayload copy(@Json(name = "body") @RawJsonString String body, @Json(name = "headers") Map<String, String> headers, @Json(name = "idempotency_data") IdempotencyData idempotency, @Json(name = "is_general_response") boolean isGeneralResponse, @Json(name = "is_polling_request") Boolean isPollingRequest, @Json(name = "hmac_data") HmacData hmacData) {
        return new DownloadPayload(body, headers, idempotency, isGeneralResponse, isPollingRequest, hmacData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadPayload)) {
            return false;
        }
        DownloadPayload downloadPayload = (DownloadPayload) other;
        return jl40.l(this.body, downloadPayload.body) && jl40.l(this.headers, downloadPayload.headers) && jl40.l(this.idempotency, downloadPayload.idempotency) && this.isGeneralResponse == downloadPayload.isGeneralResponse && jl40.l(this.isPollingRequest, downloadPayload.isPollingRequest) && jl40.l(this.hmacData, downloadPayload.hmacData);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HmacData getHmacData() {
        return this.hmacData;
    }

    public final IdempotencyData getIdempotency() {
        return this.idempotency;
    }

    public int hashCode() {
        String str = this.body;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.headers;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        IdempotencyData idempotencyData = this.idempotency;
        int e = unr0.e((hashCode2 + (idempotencyData == null ? 0 : idempotencyData.hashCode())) * 31, 31, this.isGeneralResponse);
        Boolean bool = this.isPollingRequest;
        int hashCode3 = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        HmacData hmacData = this.hmacData;
        return hashCode3 + (hmacData != null ? hmacData.hashCode() : 0);
    }

    public final boolean isGeneralResponse() {
        return this.isGeneralResponse;
    }

    public final Boolean isPollingRequest() {
        return this.isPollingRequest;
    }

    public String toString() {
        return "DownloadPayload(body=" + this.body + ", headers=" + this.headers + ", idempotency=" + this.idempotency + ", isGeneralResponse=" + this.isGeneralResponse + ", isPollingRequest=" + this.isPollingRequest + ", hmacData=" + this.hmacData + Extension.C_BRAKE;
    }

    public DownloadPayload(@Json(name = "body") @RawJsonString String str, @Json(name = "headers") Map<String, String> map, @Json(name = "idempotency_data") IdempotencyData idempotencyData, @Json(name = "is_general_response") boolean z, @Json(name = "is_polling_request") Boolean bool, @Json(name = "hmac_data") HmacData hmacData) {
        this.body = str;
        this.headers = map;
        this.idempotency = idempotencyData;
        this.isGeneralResponse = z;
        this.isPollingRequest = bool;
        this.hmacData = hmacData;
    }

    public DownloadPayload() {
        this(null, null, null, false, null, null, 63, null);
    }
}
