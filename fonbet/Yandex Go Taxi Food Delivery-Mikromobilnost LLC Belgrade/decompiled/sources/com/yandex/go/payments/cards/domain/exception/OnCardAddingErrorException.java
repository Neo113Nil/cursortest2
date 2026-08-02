package com.yandex.go.payments.cards.domain.exception;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/cards/domain/exception/OnCardAddingErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnCardAddingErrorException extends RuntimeException {
    private final String message;

    public OnCardAddingErrorException(String str) {
        super(str);
        String message = super.getMessage();
        this.message = message == null ? "" : message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
