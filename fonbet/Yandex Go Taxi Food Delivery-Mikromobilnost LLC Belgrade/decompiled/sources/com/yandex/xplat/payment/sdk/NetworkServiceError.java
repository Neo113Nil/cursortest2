package com.yandex.xplat.payment.sdk;

import defpackage.evu0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/xplat/payment/sdk/NetworkServiceError;", "Lcom/yandex/xplat/payment/sdk/ExternalConvertibleError;", "", "isTransportError", "Z", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class NetworkServiceError extends ExternalConvertibleError {
    private final boolean isTransportError;

    public /* synthetic */ NetworkServiceError(ExternalErrorKind externalErrorKind, ExternalErrorTrigger externalErrorTrigger, Integer num, String str, String str2, int i) {
        this(externalErrorKind, externalErrorTrigger, num, str, (i & 16) != 0 ? null : str2, false);
    }

    public final NetworkServiceError h(ExternalErrorTrigger externalErrorTrigger) {
        return new NetworkServiceError(getKind(), externalErrorTrigger, getCode(), getMessage(), (String) null, this.isTransportError);
    }

    public final boolean i() {
        Integer code;
        Integer code2 = getCode();
        if ((code2 != null && code2.intValue() == 429) || this.isTransportError) {
            return true;
        }
        return getTrigger() == ExternalErrorTrigger.diehard && (code = getCode()) != null && code.intValue() == 500 && evu0.y(getMessage(), "context deadline exceeded", false);
    }

    public NetworkServiceError(ExternalErrorKind externalErrorKind, ExternalErrorTrigger externalErrorTrigger, Integer num, String str, String str2, boolean z) {
        super(externalErrorKind, externalErrorTrigger, num, str2, str);
        this.isTransportError = z;
    }
}
