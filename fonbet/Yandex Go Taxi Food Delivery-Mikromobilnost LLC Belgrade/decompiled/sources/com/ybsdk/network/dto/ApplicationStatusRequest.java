package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationStatusRequest;", "", "applicationId", "", "<init>", "(Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApplicationStatusRequest {
    private final String applicationId;

    public ApplicationStatusRequest(@Json(name = "application_id") String str) {
        this.applicationId = str;
    }

    public static /* synthetic */ ApplicationStatusRequest copy$default(ApplicationStatusRequest applicationStatusRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationStatusRequest.applicationId;
        }
        return applicationStatusRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    public final ApplicationStatusRequest copy(@Json(name = "application_id") String applicationId) {
        return new ApplicationStatusRequest(applicationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApplicationStatusRequest) && jl40.l(this.applicationId, ((ApplicationStatusRequest) other).applicationId);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        return this.applicationId.hashCode();
    }

    public String toString() {
        return oyr.p("ApplicationStatusRequest(applicationId=", this.applicationId, Extension.C_BRAKE);
    }
}
