package com.yandex.plus.pay.api.exception;

import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/plus/pay/api/exception/PlusPayPaymentException;", "Lcom/yandex/plus/pay/api/exception/PlusPayException;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "kind", "Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "a", "()Lcom/yandex/plus/pay/api/exception/PlusPayPaymentGatewayErrorKind;", "pay-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayPaymentException extends PlusPayException {
    private final String description;
    private final PlusPayPaymentGatewayErrorKind kind;

    public PlusPayPaymentException(String str, PlusPayPaymentGatewayErrorKind plusPayPaymentGatewayErrorKind) {
        super("Payment error: description=" + str + ", kind=" + plusPayPaymentGatewayErrorKind, 2);
        this.description = str;
        this.kind = plusPayPaymentGatewayErrorKind;
    }

    /* renamed from: a, reason: from getter */
    public final PlusPayPaymentGatewayErrorKind getKind() {
        return this.kind;
    }
}
