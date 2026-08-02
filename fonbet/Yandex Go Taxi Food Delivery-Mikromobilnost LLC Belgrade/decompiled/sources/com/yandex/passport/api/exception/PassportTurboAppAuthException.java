package com.yandex.passport.api.exception;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/passport/api/exception/PassportTurboAppAuthException;", "Lcom/yandex/passport/api/exception/PassportException;", "", "", "flowErrorCodes", "Ljava/util/List;", "getFlowErrorCodes", "()Ljava/util/List;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportTurboAppAuthException extends PassportException {
    private final List<String> flowErrorCodes;

    public PassportTurboAppAuthException(String str, List list) {
        super(str);
        this.flowErrorCodes = list;
    }
}
