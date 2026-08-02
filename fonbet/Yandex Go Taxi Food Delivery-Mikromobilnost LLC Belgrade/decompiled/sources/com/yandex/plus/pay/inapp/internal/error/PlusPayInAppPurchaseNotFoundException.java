package com.yandex.plus.pay.inapp.internal.error;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/inapp/internal/error/PlusPayInAppPurchaseNotFoundException;", "Lcom/yandex/plus/pay/inapp/internal/error/PlusPayInAppException;", "<init>", "()V", "pay-sdk-inapp-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayInAppPurchaseNotFoundException extends PlusPayInAppException {
    public PlusPayInAppPurchaseNotFoundException() {
        super("Purchase not found", 2);
    }
}
