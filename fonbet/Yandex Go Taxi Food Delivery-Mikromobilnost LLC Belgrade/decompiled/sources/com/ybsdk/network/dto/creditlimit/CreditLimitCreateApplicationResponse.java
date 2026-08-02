package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitCreateApplicationResponse;", "", "applicationId", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitCreateApplicationResponse {
    private final String action;
    private final String applicationId;

    public CreditLimitCreateApplicationResponse(@Json(name = "application_id") String str, @Json(name = "action") String str2) {
        this.applicationId = str;
        this.action = str2;
    }

    public static /* synthetic */ CreditLimitCreateApplicationResponse copy$default(CreditLimitCreateApplicationResponse creditLimitCreateApplicationResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitCreateApplicationResponse.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = creditLimitCreateApplicationResponse.action;
        }
        return creditLimitCreateApplicationResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final CreditLimitCreateApplicationResponse copy(@Json(name = "application_id") String applicationId, @Json(name = "action") String action) {
        return new CreditLimitCreateApplicationResponse(applicationId, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitCreateApplicationResponse)) {
            return false;
        }
        CreditLimitCreateApplicationResponse creditLimitCreateApplicationResponse = (CreditLimitCreateApplicationResponse) other;
        return jl40.l(this.applicationId, creditLimitCreateApplicationResponse.applicationId) && jl40.l(this.action, creditLimitCreateApplicationResponse.action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.applicationId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("CreditLimitCreateApplicationResponse(applicationId=", this.applicationId, ", action=", this.action, Extension.C_BRAKE);
    }
}
