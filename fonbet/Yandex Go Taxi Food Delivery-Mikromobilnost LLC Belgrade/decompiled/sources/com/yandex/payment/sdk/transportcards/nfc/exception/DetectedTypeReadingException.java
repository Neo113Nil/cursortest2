package com.yandex.payment.sdk.transportcards.nfc.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/payment/sdk/transportcards/nfc/exception/DetectedTypeReadingException;", "Lcom/yandex/payment/sdk/transportcards/nfc/exception/ReadingException;", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DetectedTypeReadingException extends ReadingException {
    public DetectedTypeReadingException(String str) {
        super("Failed to detected type of block: ".concat(str));
    }
}
