package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/network/dto/RegistrationNextRequest;", "", "originDeeplink", "", "actionAfterSuccess", "registrationAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginDeeplink", "()Ljava/lang/String;", "getActionAfterSuccess", "getRegistrationAction", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RegistrationNextRequest {
    private final String actionAfterSuccess;
    private final String originDeeplink;
    private final String registrationAction;

    public RegistrationNextRequest(@Json(name = "origin_deeplink") String str, @Json(name = "action_after_success") String str2, @Json(name = "registration_action") String str3) {
        this.originDeeplink = str;
        this.actionAfterSuccess = str2;
        this.registrationAction = str3;
    }

    public static /* synthetic */ RegistrationNextRequest copy$default(RegistrationNextRequest registrationNextRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registrationNextRequest.originDeeplink;
        }
        if ((i & 2) != 0) {
            str2 = registrationNextRequest.actionAfterSuccess;
        }
        if ((i & 4) != 0) {
            str3 = registrationNextRequest.registrationAction;
        }
        return registrationNextRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginDeeplink() {
        return this.originDeeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActionAfterSuccess() {
        return this.actionAfterSuccess;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRegistrationAction() {
        return this.registrationAction;
    }

    public final RegistrationNextRequest copy(@Json(name = "origin_deeplink") String originDeeplink, @Json(name = "action_after_success") String actionAfterSuccess, @Json(name = "registration_action") String registrationAction) {
        return new RegistrationNextRequest(originDeeplink, actionAfterSuccess, registrationAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationNextRequest)) {
            return false;
        }
        RegistrationNextRequest registrationNextRequest = (RegistrationNextRequest) other;
        return jl40.l(this.originDeeplink, registrationNextRequest.originDeeplink) && jl40.l(this.actionAfterSuccess, registrationNextRequest.actionAfterSuccess) && jl40.l(this.registrationAction, registrationNextRequest.registrationAction);
    }

    public final String getActionAfterSuccess() {
        return this.actionAfterSuccess;
    }

    public final String getOriginDeeplink() {
        return this.originDeeplink;
    }

    public final String getRegistrationAction() {
        return this.registrationAction;
    }

    public int hashCode() {
        String str = this.originDeeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionAfterSuccess;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationAction;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.originDeeplink;
        String str2 = this.actionAfterSuccess;
        return oyr.t(b64.v("RegistrationNextRequest(originDeeplink=", str, ", actionAfterSuccess=", str2, ", registrationAction="), this.registrationAction, Extension.C_BRAKE);
    }
}
