package com.ybsdk.core.utils.ext;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/utils/ext/ErrorResponse;", "Ljava/io/Serializable;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "a", "()I", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ErrorResponse implements Serializable {
    private final int code;
    private final String message;

    public ErrorResponse(int i, String str) {
        this.code = i;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return this.code == errorResponse.code && jl40.l(this.message, errorResponse.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public final String toString() {
        return oyr.l(this.code, "ErrorResponse(code=", ", message=", this.message, Extension.C_BRAKE);
    }
}
