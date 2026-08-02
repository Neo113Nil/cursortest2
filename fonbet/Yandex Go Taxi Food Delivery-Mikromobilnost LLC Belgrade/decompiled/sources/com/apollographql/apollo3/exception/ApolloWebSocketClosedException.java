package com.apollographql.apollo3.exception;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "getCode", "()I", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ApolloWebSocketClosedException extends ApolloException {
    private final int code;
    private final String reason;

    public ApolloWebSocketClosedException(int i, String str) {
        super("WebSocket Closed code='" + i + "' reason='" + str + '\'', (Throwable) null);
        this.code = i;
        this.reason = str;
    }
}
