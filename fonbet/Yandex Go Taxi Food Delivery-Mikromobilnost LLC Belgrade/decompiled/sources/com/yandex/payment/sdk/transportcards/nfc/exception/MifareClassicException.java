package com.yandex.payment.sdk.transportcards.nfc.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/nfc/exception/MifareClassicException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MifareClassicException extends Exception {
    public MifareClassicException() {
        super("Failed to initialize MifareClassic");
    }
}
