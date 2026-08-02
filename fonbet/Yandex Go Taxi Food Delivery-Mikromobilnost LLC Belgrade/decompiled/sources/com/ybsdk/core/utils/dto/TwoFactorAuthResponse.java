package com.ybsdk.core.utils.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013JB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "T", "", ACSPConstants.STATUS, "Lcom/ybsdk/core/utils/dto/RequestStatus;", "authenticationInfo", "Lcom/ybsdk/core/utils/dto/AuthenticationTrackInfo;", "failData", "Lcom/ybsdk/core/utils/dto/FailDataResponse;", "successData", "<init>", "(Lcom/ybsdk/core/utils/dto/RequestStatus;Lcom/ybsdk/core/utils/dto/AuthenticationTrackInfo;Lcom/ybsdk/core/utils/dto/FailDataResponse;Ljava/lang/Object;)V", "getStatus", "()Lcom/ybsdk/core/utils/dto/RequestStatus;", "getAuthenticationInfo", "()Lcom/ybsdk/core/utils/dto/AuthenticationTrackInfo;", "getFailData", "()Lcom/ybsdk/core/utils/dto/FailDataResponse;", "getSuccessData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/core/utils/dto/RequestStatus;Lcom/ybsdk/core/utils/dto/AuthenticationTrackInfo;Lcom/ybsdk/core/utils/dto/FailDataResponse;Ljava/lang/Object;)Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "equals", "", "other", "hashCode", "", "toString", "", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TwoFactorAuthResponse<T> {
    private final AuthenticationTrackInfo authenticationInfo;
    private final FailDataResponse failData;
    private final RequestStatus status;
    private final T successData;

    public TwoFactorAuthResponse(@Json(name = "status") RequestStatus requestStatus, @Json(name = "authentication_data") AuthenticationTrackInfo authenticationTrackInfo, @Json(name = "fail_data") FailDataResponse failDataResponse, @Json(name = "success_data") T t) {
        this.status = requestStatus;
        this.authenticationInfo = authenticationTrackInfo;
        this.failData = failDataResponse;
        this.successData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TwoFactorAuthResponse copy$default(TwoFactorAuthResponse twoFactorAuthResponse, RequestStatus requestStatus, AuthenticationTrackInfo authenticationTrackInfo, FailDataResponse failDataResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            requestStatus = twoFactorAuthResponse.status;
        }
        if ((i & 2) != 0) {
            authenticationTrackInfo = twoFactorAuthResponse.authenticationInfo;
        }
        if ((i & 4) != 0) {
            failDataResponse = twoFactorAuthResponse.failData;
        }
        if ((i & 8) != 0) {
            obj = twoFactorAuthResponse.successData;
        }
        return twoFactorAuthResponse.copy(requestStatus, authenticationTrackInfo, failDataResponse, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthenticationTrackInfo getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final FailDataResponse getFailData() {
        return this.failData;
    }

    public final T component4() {
        return this.successData;
    }

    public final TwoFactorAuthResponse<T> copy(@Json(name = "status") RequestStatus status, @Json(name = "authentication_data") AuthenticationTrackInfo authenticationInfo, @Json(name = "fail_data") FailDataResponse failData, @Json(name = "success_data") T successData) {
        return new TwoFactorAuthResponse<>(status, authenticationInfo, failData, successData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoFactorAuthResponse)) {
            return false;
        }
        TwoFactorAuthResponse twoFactorAuthResponse = (TwoFactorAuthResponse) other;
        return this.status == twoFactorAuthResponse.status && jl40.l(this.authenticationInfo, twoFactorAuthResponse.authenticationInfo) && jl40.l(this.failData, twoFactorAuthResponse.failData) && jl40.l(this.successData, twoFactorAuthResponse.successData);
    }

    public final AuthenticationTrackInfo getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public final FailDataResponse getFailData() {
        return this.failData;
    }

    public final RequestStatus getStatus() {
        return this.status;
    }

    public final T getSuccessData() {
        return this.successData;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        AuthenticationTrackInfo authenticationTrackInfo = this.authenticationInfo;
        int hashCode2 = (hashCode + (authenticationTrackInfo == null ? 0 : authenticationTrackInfo.hashCode())) * 31;
        FailDataResponse failDataResponse = this.failData;
        int hashCode3 = (hashCode2 + (failDataResponse == null ? 0 : failDataResponse.hashCode())) * 31;
        T t = this.successData;
        return hashCode3 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "TwoFactorAuthResponse(status=" + this.status + ", authenticationInfo=" + this.authenticationInfo + ", failData=" + this.failData + ", successData=" + this.successData + Extension.C_BRAKE;
    }
}
