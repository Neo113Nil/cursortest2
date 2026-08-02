package com.yandex.go.payments.cards.domain.exception;

import java.util.Calendar;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/cards/domain/exception/TooManyRequestsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/util/Calendar;", "when", "Ljava/util/Calendar;", "a", "()Ljava/util/Calendar;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TooManyRequestsException extends RuntimeException {
    private final Calendar when;

    public TooManyRequestsException(Calendar calendar) {
        this.when = calendar;
    }

    /* renamed from: a, reason: from getter */
    public final Calendar getWhen() {
        return this.when;
    }
}
