package com.yandex.plus.pay.api.exception;

import defpackage.ezj0;
import defpackage.izj0;
import defpackage.kzj0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayNetworkException;", "Lcom/yandex/plus/pay/api/exception/PlusPayException;", "Lkzj0;", "resultError", "Lkzj0;", "getResultError", "()Lkzj0;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public class PlusPayNetworkException extends PlusPayException {
    private final kzj0 resultError;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlusPayNetworkException(kzj0 kzj0Var) {
        super(r0, r2 != null ? r2.getCause() : null);
        String b = kzj0Var instanceof ezj0 ? ((ezj0) kzj0Var).b() : kzj0Var instanceof izj0 ? ((izj0) kzj0Var).c : null;
        if (b == null) {
            Throwable a = kzj0Var.a();
            b = a != null ? a.getMessage() : null;
        }
        Throwable a2 = kzj0Var.a();
        this.resultError = kzj0Var;
    }
}
