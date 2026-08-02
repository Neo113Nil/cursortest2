package com.yandex.xplat.payment.sdk;

import defpackage.q4g;
import defpackage.ss20;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/xplat/payment/sdk/MobileBackendApiError;", "Lcom/yandex/xplat/payment/sdk/NetworkServiceError;", "Lss20;", "error", "Lss20;", "getError", "()Lss20;", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MobileBackendApiError extends NetworkServiceError {
    private final ss20 error;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MobileBackendApiError(ss20 ss20Var) {
        super(r3, r4, r5, unr0.r(unr0.v(r0, "Mobile Backend Error: code - ", ", status - ", r1, " in request "), r2, Extension.COLON_SPACE, r6 == null ? "empty message" : r6), (String) null, 48);
        int i = ss20Var.b;
        Integer num = ss20Var.e;
        ExternalErrorKind externalErrorKind = i == 1004 ? (num != null && num.intValue() == 1) ? ExternalErrorKind.authorization_expired_token : ExternalErrorKind.authorization : ExternalErrorKind.unknown;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.mobile_backend;
        Integer valueOf = Integer.valueOf(i);
        String str = ss20Var.a;
        String str2 = ss20Var.c;
        String str3 = ss20Var.d;
        this.error = ss20Var;
    }

    @Override // com.yandex.xplat.payment.sdk.ExternalConvertibleError
    public final q4g a() {
        return new q4g(getKind(), getTrigger(), getCode(), this.error.a, getMessage(), 18);
    }
}
