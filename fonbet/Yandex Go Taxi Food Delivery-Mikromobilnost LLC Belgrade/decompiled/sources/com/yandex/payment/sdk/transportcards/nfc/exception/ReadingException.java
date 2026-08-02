package com.yandex.payment.sdk.transportcards.nfc.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/nfc/exception/ReadingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class ReadingException extends Exception {
    public ReadingException(String str) {
        super("Failed to read block: ".concat(str));
    }
}
