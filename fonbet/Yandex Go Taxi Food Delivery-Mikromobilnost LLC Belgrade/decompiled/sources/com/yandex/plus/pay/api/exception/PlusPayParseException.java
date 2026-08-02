package com.yandex.plus.pay.api.exception;

import defpackage.gzj0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayParseException;", "Lcom/yandex/plus/pay/api/exception/PlusPayNetworkException;", "Lgzj0;", "resultError", "Lgzj0;", "getResultError", "()Lgzj0;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayParseException extends PlusPayNetworkException {
    private final gzj0 resultError;

    public PlusPayParseException(gzj0 gzj0Var) {
        super(gzj0Var);
        this.resultError = gzj0Var;
    }
}
