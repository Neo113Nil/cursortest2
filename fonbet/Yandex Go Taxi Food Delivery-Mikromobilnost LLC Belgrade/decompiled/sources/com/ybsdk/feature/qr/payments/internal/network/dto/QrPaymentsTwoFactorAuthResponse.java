package com.ybsdk.feature.qr.payments.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013JB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse;", "T", "", "resultStatus", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;", "authorizationInfo", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse$AuthorizationTrackInfo;", "failData", "Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;", "successData", "<init>", "(Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse$AuthorizationTrackInfo;Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;Ljava/lang/Object;)V", "getResultStatus", "()Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;", "getAuthorizationInfo", "()Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse$AuthorizationTrackInfo;", "getFailData", "()Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;", "getSuccessData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$RequestStatus;Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse$AuthorizationTrackInfo;Lcom/ybsdk/core/utils/dto/SecondAuthorizationResponse$FailData;Ljava/lang/Object;)Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse;", "equals", "", "other", "hashCode", "", "toString", "", "AuthorizationTrackInfo", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QrPaymentsTwoFactorAuthResponse<T> {
    private final AuthorizationTrackInfo authorizationInfo;
    private final SecondAuthorizationResponse.FailData failData;
    private final SecondAuthorizationResponse.RequestStatus resultStatus;
    private final T successData;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse$AuthorizationTrackInfo;", "", "trackId", "", "operationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTrackId", "()Ljava/lang/String;", "getOperationId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthorizationTrackInfo {
        private final String operationId;
        private final String trackId;

        public AuthorizationTrackInfo(@Json(name = "track_id") String str, @Json(name = "operation_id") String str2) {
            this.trackId = str;
            this.operationId = str2;
        }

        public static /* synthetic */ AuthorizationTrackInfo copy$default(AuthorizationTrackInfo authorizationTrackInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationTrackInfo.trackId;
            }
            if ((i & 2) != 0) {
                str2 = authorizationTrackInfo.operationId;
            }
            return authorizationTrackInfo.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }

        public final AuthorizationTrackInfo copy(@Json(name = "track_id") String trackId, @Json(name = "operation_id") String operationId) {
            return new AuthorizationTrackInfo(trackId, operationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationTrackInfo)) {
                return false;
            }
            AuthorizationTrackInfo authorizationTrackInfo = (AuthorizationTrackInfo) other;
            return jl40.l(this.trackId, authorizationTrackInfo.trackId) && jl40.l(this.operationId, authorizationTrackInfo.operationId);
        }

        public final String getOperationId() {
            return this.operationId;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            return this.operationId.hashCode() + (this.trackId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("AuthorizationTrackInfo(trackId=", this.trackId, ", operationId=", this.operationId, Extension.C_BRAKE);
        }
    }

    public QrPaymentsTwoFactorAuthResponse(@Json(name = "result_status") SecondAuthorizationResponse.RequestStatus requestStatus, @Json(name = "authorization_info") AuthorizationTrackInfo authorizationTrackInfo, @Json(name = "fail_data") SecondAuthorizationResponse.FailData failData, @Json(name = "success_data") T t) {
        this.resultStatus = requestStatus;
        this.authorizationInfo = authorizationTrackInfo;
        this.failData = failData;
        this.successData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QrPaymentsTwoFactorAuthResponse copy$default(QrPaymentsTwoFactorAuthResponse qrPaymentsTwoFactorAuthResponse, SecondAuthorizationResponse.RequestStatus requestStatus, AuthorizationTrackInfo authorizationTrackInfo, SecondAuthorizationResponse.FailData failData, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            requestStatus = qrPaymentsTwoFactorAuthResponse.resultStatus;
        }
        if ((i & 2) != 0) {
            authorizationTrackInfo = qrPaymentsTwoFactorAuthResponse.authorizationInfo;
        }
        if ((i & 4) != 0) {
            failData = qrPaymentsTwoFactorAuthResponse.failData;
        }
        if ((i & 8) != 0) {
            obj = qrPaymentsTwoFactorAuthResponse.successData;
        }
        return qrPaymentsTwoFactorAuthResponse.copy(requestStatus, authorizationTrackInfo, failData, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final SecondAuthorizationResponse.RequestStatus getResultStatus() {
        return this.resultStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthorizationTrackInfo getAuthorizationInfo() {
        return this.authorizationInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final SecondAuthorizationResponse.FailData getFailData() {
        return this.failData;
    }

    public final T component4() {
        return this.successData;
    }

    public final QrPaymentsTwoFactorAuthResponse<T> copy(@Json(name = "result_status") SecondAuthorizationResponse.RequestStatus resultStatus, @Json(name = "authorization_info") AuthorizationTrackInfo authorizationInfo, @Json(name = "fail_data") SecondAuthorizationResponse.FailData failData, @Json(name = "success_data") T successData) {
        return new QrPaymentsTwoFactorAuthResponse<>(resultStatus, authorizationInfo, failData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrPaymentsTwoFactorAuthResponse)) {
            return false;
        }
        QrPaymentsTwoFactorAuthResponse qrPaymentsTwoFactorAuthResponse = (QrPaymentsTwoFactorAuthResponse) other;
        return this.resultStatus == qrPaymentsTwoFactorAuthResponse.resultStatus && jl40.l(this.authorizationInfo, qrPaymentsTwoFactorAuthResponse.authorizationInfo) && jl40.l(this.failData, qrPaymentsTwoFactorAuthResponse.failData) && jl40.l(this.successData, qrPaymentsTwoFactorAuthResponse.successData);
    }

    public final AuthorizationTrackInfo getAuthorizationInfo() {
        return this.authorizationInfo;
    }

    public final SecondAuthorizationResponse.FailData getFailData() {
        return this.failData;
    }

    public final SecondAuthorizationResponse.RequestStatus getResultStatus() {
        return this.resultStatus;
    }

    public final T getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.resultStatus.hashCode() * 31;
        AuthorizationTrackInfo authorizationTrackInfo = this.authorizationInfo;
        int hashCode2 = (hashCode + (authorizationTrackInfo == null ? 0 : authorizationTrackInfo.hashCode())) * 31;
        SecondAuthorizationResponse.FailData failData = this.failData;
        int hashCode3 = (hashCode2 + (failData == null ? 0 : failData.hashCode())) * 31;
        T t = this.successData;
        return hashCode3 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "QrPaymentsTwoFactorAuthResponse(resultStatus=" + this.resultStatus + ", authorizationInfo=" + this.authorizationInfo + ", failData=" + this.failData + ", successData=" + this.successData + Extension.C_BRAKE;
    }
}
