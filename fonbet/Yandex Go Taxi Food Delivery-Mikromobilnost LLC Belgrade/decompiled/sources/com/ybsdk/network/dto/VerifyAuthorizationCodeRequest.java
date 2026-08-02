package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/VerifyAuthorizationCodeRequest;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "", "trackId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getTrackId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyAuthorizationCodeRequest {
    private final String code;
    private final String trackId;

    public VerifyAuthorizationCodeRequest(@Json(name = "code") String str, @Json(name = "track_id") String str2) {
        this.code = str;
        this.trackId = str2;
    }

    public static /* synthetic */ VerifyAuthorizationCodeRequest copy$default(VerifyAuthorizationCodeRequest verifyAuthorizationCodeRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyAuthorizationCodeRequest.code;
        }
        if ((i & 2) != 0) {
            str2 = verifyAuthorizationCodeRequest.trackId;
        }
        return verifyAuthorizationCodeRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    public final VerifyAuthorizationCodeRequest copy(@Json(name = "code") String code, @Json(name = "track_id") String trackId) {
        return new VerifyAuthorizationCodeRequest(code, trackId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyAuthorizationCodeRequest)) {
            return false;
        }
        VerifyAuthorizationCodeRequest verifyAuthorizationCodeRequest = (VerifyAuthorizationCodeRequest) other;
        return jl40.l(this.code, verifyAuthorizationCodeRequest.code) && jl40.l(this.trackId, verifyAuthorizationCodeRequest.trackId);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return this.trackId.hashCode() + (this.code.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("VerifyAuthorizationCodeRequest(code=", this.code, ", trackId=", this.trackId, Extension.C_BRAKE);
    }
}
