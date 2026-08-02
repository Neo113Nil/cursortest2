package com.yandex.go.masstransit.sdk.client_api;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/ClientApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/yandex/go/masstransit/sdk/client_api/ErrorCode;", AuthSdkActivity.RESPONSE_TYPE_CODE, "Lcom/yandex/go/masstransit/sdk/client_api/ErrorCode;", "a", "()Lcom/yandex/go/masstransit/sdk/client_api/ErrorCode;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "", "original", "Ljava/lang/Throwable;", "getOriginal", "()Ljava/lang/Throwable;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClientApiException extends Exception {
    private final ErrorCode code;
    private final String message;
    private final Throwable original;

    public ClientApiException(ErrorCode errorCode, String str, Throwable th) {
        this.code = errorCode;
        this.message = str;
        this.original = th;
    }

    /* renamed from: a, reason: from getter */
    public final ErrorCode getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
