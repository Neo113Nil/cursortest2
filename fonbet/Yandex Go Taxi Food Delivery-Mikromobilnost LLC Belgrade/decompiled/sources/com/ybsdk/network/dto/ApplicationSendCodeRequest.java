package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationSendCodeRequest;", "", "applicationId", "", "phone", "phoneId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "getPhone", "getPhoneId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApplicationSendCodeRequest {
    private final String applicationId;
    private final String phone;
    private final String phoneId;

    public /* synthetic */ ApplicationSendCodeRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ ApplicationSendCodeRequest copy$default(ApplicationSendCodeRequest applicationSendCodeRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationSendCodeRequest.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = applicationSendCodeRequest.phone;
        }
        if ((i & 4) != 0) {
            str3 = applicationSendCodeRequest.phoneId;
        }
        return applicationSendCodeRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    public final ApplicationSendCodeRequest copy(@Json(name = "application_id") String applicationId, @Json(name = "phone") String phone, @Json(name = "phone_id") String phoneId) {
        return new ApplicationSendCodeRequest(applicationId, phone, phoneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationSendCodeRequest)) {
            return false;
        }
        ApplicationSendCodeRequest applicationSendCodeRequest = (ApplicationSendCodeRequest) other;
        return jl40.l(this.applicationId, applicationSendCodeRequest.applicationId) && jl40.l(this.phone, applicationSendCodeRequest.phone) && jl40.l(this.phoneId, applicationSendCodeRequest.phoneId);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneId() {
        return this.phoneId;
    }

    public int hashCode() {
        int hashCode = this.applicationId.hashCode() * 31;
        String str = this.phone;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.phone;
        return oyr.t(b64.v("ApplicationSendCodeRequest(applicationId=", str, ", phone=", str2, ", phoneId="), this.phoneId, Extension.C_BRAKE);
    }

    public ApplicationSendCodeRequest(@Json(name = "application_id") String str, @Json(name = "phone") String str2, @Json(name = "phone_id") String str3) {
        this.applicationId = str;
        this.phone = str2;
        this.phoneId = str3;
    }
}
