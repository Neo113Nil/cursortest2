package com.yandex.passport.api.exception;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/passport/api/exception/PassportCommonWebException;", "Lcom/yandex/passport/api/exception/PassportException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "getCode", "()I", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "passport-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PassportCommonWebException extends PassportException {
    private final int code;
    private final String url;

    public PassportCommonWebException(int i, String str) {
        super(oyr.k(i, "Passport common web error. Error code: ", ". Url: ", str));
        this.code = i;
        this.url = str;
    }
}
