package com.yandex.plus.pay.inapp.internal.error;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/pay/inapp/internal/error/PlusPayInAppUnexpectedException;", "Lcom/yandex/plus/pay/inapp/internal/error/PlusPayInAppException;", "pay-sdk-inapp-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayInAppUnexpectedException extends PlusPayInAppException {
    public PlusPayInAppUnexpectedException(String str) {
        super("Unexpected error: ".concat(str), 2);
    }
}
