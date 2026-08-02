package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationRequest;", "", "type", "Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "<init>", "(Lcom/ybsdk/core/utils/dto/common/ApplicationType;)V", "getType", "()Lcom/ybsdk/core/utils/dto/common/ApplicationType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApplicationRequest {
    private final ApplicationType type;

    public ApplicationRequest(@Json(name = "type") ApplicationType applicationType) {
        this.type = applicationType;
    }

    public static /* synthetic */ ApplicationRequest copy$default(ApplicationRequest applicationRequest, ApplicationType applicationType, int i, Object obj) {
        if ((i & 1) != 0) {
            applicationType = applicationRequest.type;
        }
        return applicationRequest.copy(applicationType);
    }

    /* renamed from: component1, reason: from getter */
    public final ApplicationType getType() {
        return this.type;
    }

    public final ApplicationRequest copy(@Json(name = "type") ApplicationType type) {
        return new ApplicationRequest(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApplicationRequest) && this.type == ((ApplicationRequest) other).type;
    }

    public final ApplicationType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "ApplicationRequest(type=" + this.type + Extension.C_BRAKE;
    }
}
