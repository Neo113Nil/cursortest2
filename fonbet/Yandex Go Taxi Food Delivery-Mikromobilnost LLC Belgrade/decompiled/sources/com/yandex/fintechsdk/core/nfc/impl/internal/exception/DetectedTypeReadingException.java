package com.yandex.fintechsdk.core.nfc.impl.internal.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/fintechsdk/core/nfc/impl/internal/exception/DetectedTypeReadingException;", "Lcom/yandex/fintechsdk/core/nfc/impl/internal/exception/ReadingException;", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DetectedTypeReadingException extends ReadingException {
    public DetectedTypeReadingException(String str) {
        super("Failed to detected type of block: ".concat(str));
    }
}
