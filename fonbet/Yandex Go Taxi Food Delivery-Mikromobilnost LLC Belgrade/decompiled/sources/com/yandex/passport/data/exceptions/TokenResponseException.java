package com.yandex.passport.data.exceptions;

import com.yandex.passport.common.exception.NetworkException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/passport/data/exceptions/TokenResponseException;", "Lcom/yandex/passport/common/exception/NetworkException;", "", "error", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "errorDescription", "a", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public class TokenResponseException extends NetworkException {
    private final String error;
    private final String errorDescription;

    public TokenResponseException(String str, String str2) {
        super(str);
        this.error = str;
        this.errorDescription = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }
}
