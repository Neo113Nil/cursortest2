package com.yandex.plus.pay.inapp.internal.error;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/plus/pay/inapp/internal/error/PlusPayInAppException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "pay-sdk-inapp-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class PlusPayInAppException extends Exception {
    public PlusPayInAppException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }

    public PlusPayInAppException() {
        this(null, 3);
    }
}
