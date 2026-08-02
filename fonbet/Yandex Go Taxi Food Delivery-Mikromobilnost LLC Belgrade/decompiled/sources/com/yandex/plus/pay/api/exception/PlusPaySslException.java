package com.yandex.plus.pay.api.exception;

import defpackage.hzj0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPaySslException;", "Lcom/yandex/plus/pay/api/exception/PlusPayNetworkException;", "Lhzj0;", "resultError", "Lhzj0;", "getResultError", "()Lhzj0;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPaySslException extends PlusPayNetworkException {
    private final hzj0 resultError;

    public PlusPaySslException(hzj0 hzj0Var) {
        super(hzj0Var);
        this.resultError = hzj0Var;
    }
}
