package com.yandex.xplat.payment.sdk;

import defpackage.q4g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/xplat/payment/sdk/DiehardBackendApiError;", "Lcom/yandex/xplat/payment/sdk/NetworkServiceError;", "cg91", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DiehardBackendApiError extends NetworkServiceError {
    @Override // com.yandex.xplat.payment.sdk.ExternalConvertibleError
    public final q4g a() {
        return new q4g(getKind(), getTrigger(), getCode(), getStatus(), getMessage(), 18);
    }
}
