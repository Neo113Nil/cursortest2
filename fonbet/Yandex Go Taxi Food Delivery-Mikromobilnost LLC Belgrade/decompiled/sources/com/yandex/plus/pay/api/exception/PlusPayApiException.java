package com.yandex.plus.pay.api.exception;

import defpackage.ezj0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayApiException;", "Lcom/yandex/plus/pay/api/exception/PlusPayNetworkException;", "Lezj0;", "resultError", "Lezj0;", "getResultError", "()Lezj0;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayApiException extends PlusPayNetworkException {
    private final ezj0 resultError;

    public PlusPayApiException(ezj0 ezj0Var) {
        super(ezj0Var);
        this.resultError = ezj0Var;
    }
}
