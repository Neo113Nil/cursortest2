package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/GetUserInfoResponse;", "", "identificationStatus", "Lcom/ybsdk/network/dto/UserIdentificationStatus;", "phone", "", "<init>", "(Lcom/ybsdk/network/dto/UserIdentificationStatus;Ljava/lang/String;)V", "getIdentificationStatus", "()Lcom/ybsdk/network/dto/UserIdentificationStatus;", "getPhone", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetUserInfoResponse {
    private final UserIdentificationStatus identificationStatus;
    private final String phone;

    public /* synthetic */ GetUserInfoResponse(UserIdentificationStatus userIdentificationStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userIdentificationStatus, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ GetUserInfoResponse copy$default(GetUserInfoResponse getUserInfoResponse, UserIdentificationStatus userIdentificationStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userIdentificationStatus = getUserInfoResponse.identificationStatus;
        }
        if ((i & 2) != 0) {
            str = getUserInfoResponse.phone;
        }
        return getUserInfoResponse.copy(userIdentificationStatus, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UserIdentificationStatus getIdentificationStatus() {
        return this.identificationStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final GetUserInfoResponse copy(@Json(name = "auth_status") UserIdentificationStatus identificationStatus, @Json(name = "phone") String phone) {
        return new GetUserInfoResponse(identificationStatus, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserInfoResponse)) {
            return false;
        }
        GetUserInfoResponse getUserInfoResponse = (GetUserInfoResponse) other;
        return this.identificationStatus == getUserInfoResponse.identificationStatus && jl40.l(this.phone, getUserInfoResponse.phone);
    }

    public final UserIdentificationStatus getIdentificationStatus() {
        return this.identificationStatus;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int hashCode = this.identificationStatus.hashCode() * 31;
        String str = this.phone;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GetUserInfoResponse(identificationStatus=" + this.identificationStatus + ", phone=" + this.phone + Extension.C_BRAKE;
    }

    public GetUserInfoResponse(@Json(name = "auth_status") UserIdentificationStatus userIdentificationStatus, @Json(name = "phone") String str) {
        this.identificationStatus = userIdentificationStatus;
        this.phone = str;
    }
}
