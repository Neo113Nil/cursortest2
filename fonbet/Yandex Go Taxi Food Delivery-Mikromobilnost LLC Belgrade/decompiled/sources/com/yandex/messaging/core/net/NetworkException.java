package com.yandex.messaging.core.net;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/messaging/core/net/NetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "getCode", "()I", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NetworkException extends Exception {
    private final int code;

    public NetworkException(int i) {
        super(oyr.i(i, "Network error occured. Code: "));
        this.code = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkException) && this.code == ((NetworkException) obj).code;
    }

    public final int hashCode() {
        return Integer.hashCode(this.code);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return oyr.j(this.code, "NetworkException(code=", Extension.C_BRAKE);
    }
}
