package com.yandex.go.drive.sdkintegration.domain;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/drive/sdkintegration/domain/DriveSdkHttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", Constants.INTENT_PARAM_RESPONSE_CODE, CA20Status.STATUS_USER_I, "getResponseCode", "()I", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DriveSdkHttpException extends RuntimeException {
    private final int responseCode;

    public DriveSdkHttpException(int i, Exception exc) {
        super(exc);
        this.responseCode = i;
    }
}
