package com.ybsdk.core.utils.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\"#$B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013JB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "T", "", "resultStatus", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;", "authorizationInfo", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$AuthorizationInfo;", "failData", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;", "successData", "<init>", "(Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$AuthorizationInfo;Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;Ljava/lang/Object;)V", "getResultStatus", "()Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;", "getAuthorizationInfo", "()Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$AuthorizationInfo;", "getFailData", "()Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;", "getSuccessData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$AuthorizationInfo;Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;Ljava/lang/Object;)Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse;", "equals", "", "other", "hashCode", "", "toString", "", "AuthorizationInfo", "FailData", "RequestStatus", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@jxi
/* loaded from: classes2.dex */
public final /* data */ class SecondAuthorizationResponse<T> {
    private final AuthorizationInfo authorizationInfo;
    private final FailData failData;
    private final RequestStatus resultStatus;
    private final T successData;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$AuthorizationInfo;", "", "trackId", "", "<init>", "(Ljava/lang/String;)V", "getTrackId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthorizationInfo {
        private final String trackId;

        public AuthorizationInfo(@Json(name = "authorization_track_id") String str) {
            this.trackId = str;
        }

        public static /* synthetic */ AuthorizationInfo copy$default(AuthorizationInfo authorizationInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationInfo.trackId;
            }
            return authorizationInfo.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        public final AuthorizationInfo copy(@Json(name = "authorization_track_id") String trackId) {
            return new AuthorizationInfo(trackId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthorizationInfo) && jl40.l(this.trackId, ((AuthorizationInfo) other).trackId);
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            return this.trackId.hashCode();
        }

        public String toString() {
            return oyr.p("AuthorizationInfo(trackId=", this.trackId, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOWED", "AUTHORIZATION_REQUIRED", "DENIED", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RequestStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RequestStatus[] $VALUES;

        @Json(name = "ALLOWED")
        public static final RequestStatus ALLOWED = new RequestStatus("ALLOWED", 0);

        @Json(name = "AUTHORIZATION_REQUIRED")
        public static final RequestStatus AUTHORIZATION_REQUIRED = new RequestStatus("AUTHORIZATION_REQUIRED", 1);

        @Json(name = "DENIED")
        public static final RequestStatus DENIED = new RequestStatus("DENIED", 2);

        private static final /* synthetic */ RequestStatus[] $values() {
            return new RequestStatus[]{ALLOWED, AUTHORIZATION_REQUIRED, DENIED};
        }

        static {
            RequestStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private RequestStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static RequestStatus valueOf(String str) {
            return (RequestStatus) Enum.valueOf(RequestStatus.class, str);
        }

        public static RequestStatus[] values() {
            return (RequestStatus[]) $VALUES.clone();
        }
    }

    public SecondAuthorizationResponse(@Json(name = "result_status") RequestStatus requestStatus, @Json(name = "authorization_info") AuthorizationInfo authorizationInfo, @Json(name = "fail_data") FailData failData, @Json(name = "success_data") T t) {
        this.resultStatus = requestStatus;
        this.authorizationInfo = authorizationInfo;
        this.failData = failData;
        this.successData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecondAuthorizationResponse copy$default(SecondAuthorizationResponse secondAuthorizationResponse, RequestStatus requestStatus, AuthorizationInfo authorizationInfo, FailData failData, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            requestStatus = secondAuthorizationResponse.resultStatus;
        }
        if ((i & 2) != 0) {
            authorizationInfo = secondAuthorizationResponse.authorizationInfo;
        }
        if ((i & 4) != 0) {
            failData = secondAuthorizationResponse.failData;
        }
        if ((i & 8) != 0) {
            obj = secondAuthorizationResponse.successData;
        }
        return secondAuthorizationResponse.copy(requestStatus, authorizationInfo, failData, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestStatus getResultStatus() {
        return this.resultStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthorizationInfo getAuthorizationInfo() {
        return this.authorizationInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final FailData getFailData() {
        return this.failData;
    }

    public final T component4() {
        return this.successData;
    }

    public final SecondAuthorizationResponse<T> copy(@Json(name = "result_status") RequestStatus resultStatus, @Json(name = "authorization_info") AuthorizationInfo authorizationInfo, @Json(name = "fail_data") FailData failData, @Json(name = "success_data") T successData) {
        return new SecondAuthorizationResponse<>(resultStatus, authorizationInfo, failData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondAuthorizationResponse)) {
            return false;
        }
        SecondAuthorizationResponse secondAuthorizationResponse = (SecondAuthorizationResponse) other;
        return this.resultStatus == secondAuthorizationResponse.resultStatus && jl40.l(this.authorizationInfo, secondAuthorizationResponse.authorizationInfo) && jl40.l(this.failData, secondAuthorizationResponse.failData) && jl40.l(this.successData, secondAuthorizationResponse.successData);
    }

    public final AuthorizationInfo getAuthorizationInfo() {
        return this.authorizationInfo;
    }

    public final FailData getFailData() {
        return this.failData;
    }

    public final RequestStatus getResultStatus() {
        return this.resultStatus;
    }

    public final T getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.resultStatus.hashCode() * 31;
        AuthorizationInfo authorizationInfo = this.authorizationInfo;
        int hashCode2 = (hashCode + (authorizationInfo == null ? 0 : authorizationInfo.hashCode())) * 31;
        FailData failData = this.failData;
        int hashCode3 = (hashCode2 + (failData == null ? 0 : failData.hashCode())) * 31;
        T t = this.successData;
        return hashCode3 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "SecondAuthorizationResponse(resultStatus=" + this.resultStatus + ", authorizationInfo=" + this.authorizationInfo + ", failData=" + this.failData + ", successData=" + this.successData + Extension.C_BRAKE;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;", "", "supportUrl", "", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSupportUrl", "()Ljava/lang/String;", "getTraceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailData {
        private final String supportUrl;
        private final String traceId;

        public /* synthetic */ FailData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ FailData copy$default(FailData failData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failData.supportUrl;
            }
            if ((i & 2) != 0) {
                str2 = failData.traceId;
            }
            return failData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSupportUrl() {
            return this.supportUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTraceId() {
            return this.traceId;
        }

        public final FailData copy(@Json(name = "support_url") String supportUrl, @Json(ignore = true) String traceId) {
            return new FailData(supportUrl, traceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailData)) {
                return false;
            }
            FailData failData = (FailData) other;
            return jl40.l(this.supportUrl, failData.supportUrl) && jl40.l(this.traceId, failData.traceId);
        }

        public final String getSupportUrl() {
            return this.supportUrl;
        }

        public final String getTraceId() {
            return this.traceId;
        }

        public int hashCode() {
            int hashCode = this.supportUrl.hashCode() * 31;
            String str = this.traceId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("FailData(supportUrl=", this.supportUrl, ", traceId=", this.traceId, Extension.C_BRAKE);
        }

        public FailData(@Json(name = "support_url") String str, @Json(ignore = true) String str2) {
            this.supportUrl = str;
            this.traceId = str2;
        }
    }
}
