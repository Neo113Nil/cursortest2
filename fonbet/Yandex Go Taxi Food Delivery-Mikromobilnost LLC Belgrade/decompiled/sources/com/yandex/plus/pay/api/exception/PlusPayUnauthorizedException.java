package com.yandex.plus.pay.api.exception;

import defpackage.izj0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayUnauthorizedException;", "Lcom/yandex/plus/pay/api/exception/PlusPayNetworkException;", "Lizj0;", "resultError", "Lizj0;", "getResultError", "()Lizj0;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlusPayUnauthorizedException extends PlusPayNetworkException {
    private final izj0 resultError;

    public PlusPayUnauthorizedException(izj0 izj0Var) {
        super(izj0Var);
        this.resultError = izj0Var;
    }
}
