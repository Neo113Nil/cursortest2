package com.yandex.images;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oyr;
import java.io.IOException;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/images/HttpException;", "Ljava/io/IOException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "a", "()I", "images_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HttpException extends IOException {
    private final int code;

    public HttpException(int i) {
        super(oyr.i(i, "Http error: "));
        this.code = i;
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }
}
