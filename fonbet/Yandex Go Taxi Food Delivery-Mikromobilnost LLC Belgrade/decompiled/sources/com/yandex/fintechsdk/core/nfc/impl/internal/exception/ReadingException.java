package com.yandex.fintechsdk.core.nfc.impl.internal.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/fintechsdk/core/nfc/impl/internal/exception/ReadingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public class ReadingException extends Exception {
    public ReadingException(String str) {
        super("Failed to read block: ".concat(str));
    }
}
