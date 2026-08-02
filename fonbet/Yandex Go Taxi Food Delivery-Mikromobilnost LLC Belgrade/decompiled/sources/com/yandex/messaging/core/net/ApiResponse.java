package com.yandex.messaging.core.net;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/ApiResponse;", "T", "", ACSPConstants.STATUS, "", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getStatus", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/messaging/core/net/ApiResponse;", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApiResponse<T> {
    private final T data;
    private final String status;

    public ApiResponse(@Json(name = "status") String str, @Json(name = "data") T t) {
        this.status = str;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = apiResponse.status;
        }
        if ((i & 2) != 0) {
            obj = apiResponse.data;
        }
        return apiResponse.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    public final ApiResponse<T> copy(@Json(name = "status") String status, @Json(name = "data") T data) {
        return new ApiResponse<>(status, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) other;
        return jl40.l(this.status, apiResponse.status) && jl40.l(this.data, apiResponse.data);
    }

    public final T getData() {
        return this.data;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        T t = this.data;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "ApiResponse(status=" + this.status + ", data=" + this.data + Extension.C_BRAKE;
    }
}
