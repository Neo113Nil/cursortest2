package com.ybsdk.screens.registration.data.auth;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutVerifyCodeRequest;", "", "purchaseId", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPurchaseId", "()Ljava/lang/String;", "getCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MkkCashoutVerifyCodeRequest {
    private final String code;
    private final String purchaseId;

    public MkkCashoutVerifyCodeRequest(@Json(name = "purchase_id") String str, @Json(name = "code") String str2) {
        this.purchaseId = str;
        this.code = str2;
    }

    public static /* synthetic */ MkkCashoutVerifyCodeRequest copy$default(MkkCashoutVerifyCodeRequest mkkCashoutVerifyCodeRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mkkCashoutVerifyCodeRequest.purchaseId;
        }
        if ((i & 2) != 0) {
            str2 = mkkCashoutVerifyCodeRequest.code;
        }
        return mkkCashoutVerifyCodeRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final MkkCashoutVerifyCodeRequest copy(@Json(name = "purchase_id") String purchaseId, @Json(name = "code") String code) {
        return new MkkCashoutVerifyCodeRequest(purchaseId, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MkkCashoutVerifyCodeRequest)) {
            return false;
        }
        MkkCashoutVerifyCodeRequest mkkCashoutVerifyCodeRequest = (MkkCashoutVerifyCodeRequest) other;
        return jl40.l(this.purchaseId, mkkCashoutVerifyCodeRequest.purchaseId) && jl40.l(this.code, mkkCashoutVerifyCodeRequest.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getPurchaseId() {
        return this.purchaseId;
    }

    public int hashCode() {
        return this.code.hashCode() + (this.purchaseId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("MkkCashoutVerifyCodeRequest(purchaseId=", this.purchaseId, ", code=", this.code, Extension.C_BRAKE);
    }
}
