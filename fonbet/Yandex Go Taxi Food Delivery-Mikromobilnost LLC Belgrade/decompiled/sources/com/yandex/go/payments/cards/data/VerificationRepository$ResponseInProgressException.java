package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.Verification;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"com/yandex/go/payments/cards/data/VerificationRepository$ResponseInProgressException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/yandex/go/payments/cards/data/model/Verification;", "verification", "Lcom/yandex/go/payments/cards/data/model/Verification;", "c", "()Lcom/yandex/go/payments/cards/data/model/Verification;", "", "retryTime", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "pollingDeadline", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class VerificationRepository$ResponseInProgressException extends RuntimeException {
    private final Long pollingDeadline;
    private final Long retryTime;
    private final Verification verification;

    public VerificationRepository$ResponseInProgressException(Verification verification, Long l, Long l2) {
        this.verification = verification;
        this.retryTime = l;
        this.pollingDeadline = l2;
    }

    /* renamed from: a, reason: from getter */
    public final Long getPollingDeadline() {
        return this.pollingDeadline;
    }

    /* renamed from: b, reason: from getter */
    public final Long getRetryTime() {
        return this.retryTime;
    }

    /* renamed from: c, reason: from getter */
    public final Verification getVerification() {
        return this.verification;
    }
}
