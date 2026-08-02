package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionApplicationResponse;", "", "applicationId", "", "type", "Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "required", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/dto/common/ApplicationType;Z)V", "getApplicationId", "()Ljava/lang/String;", "getType", "()Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "getRequired", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StartSessionApplicationResponse {
    private final String applicationId;
    private final boolean required;
    private final ApplicationType type;

    public StartSessionApplicationResponse(@Json(name = "application_id") String str, @Json(name = "type") ApplicationType applicationType, @Json(name = "required") boolean z) {
        this.applicationId = str;
        this.type = applicationType;
        this.required = z;
    }

    public static /* synthetic */ StartSessionApplicationResponse copy$default(StartSessionApplicationResponse startSessionApplicationResponse, String str, ApplicationType applicationType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startSessionApplicationResponse.applicationId;
        }
        if ((i & 2) != 0) {
            applicationType = startSessionApplicationResponse.type;
        }
        if ((i & 4) != 0) {
            z = startSessionApplicationResponse.required;
        }
        return startSessionApplicationResponse.copy(str, applicationType, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApplicationType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final StartSessionApplicationResponse copy(@Json(name = "application_id") String applicationId, @Json(name = "type") ApplicationType type, @Json(name = "required") boolean required) {
        return new StartSessionApplicationResponse(applicationId, type, required);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartSessionApplicationResponse)) {
            return false;
        }
        StartSessionApplicationResponse startSessionApplicationResponse = (StartSessionApplicationResponse) other;
        return jl40.l(this.applicationId, startSessionApplicationResponse.applicationId) && this.type == startSessionApplicationResponse.type && this.required == startSessionApplicationResponse.required;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final ApplicationType getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.required) + ((this.type.hashCode() + (this.applicationId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.applicationId;
        ApplicationType applicationType = this.type;
        boolean z = this.required;
        StringBuilder sb = new StringBuilder("StartSessionApplicationResponse(applicationId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(applicationType);
        sb.append(", required=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }
}
