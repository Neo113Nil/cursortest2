package com.yandex.plus.pay.api.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayUnexpectedException;", "Lcom/yandex/plus/pay/api/exception/PlusPayException;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayUnexpectedException extends PlusPayException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlusPayUnexpectedException(Throwable th) {
        super(r0 == null ? "Unexpected error" : r0, th);
        String message = th.getMessage();
    }
}
