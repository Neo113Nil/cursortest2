package com.yandex.go.scooters.domain.model;

import defpackage.pjn0;
import defpackage.qkn0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersBookingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "throwable", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "Lqkn0;", "payload", "Lqkn0;", "b", "()Lqkn0;", "Lpjn0;", "content", "Lpjn0;", "a", "()Lpjn0;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBookingException extends RuntimeException {
    private final pjn0 content;
    private final qkn0 payload;
    private final Throwable throwable;

    public ScootersBookingException(Throwable th, qkn0 qkn0Var, pjn0 pjn0Var) {
        super(th);
        this.throwable = th;
        this.payload = qkn0Var;
        this.content = pjn0Var;
    }

    /* renamed from: a, reason: from getter */
    public final pjn0 getContent() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final qkn0 getPayload() {
        return this.payload;
    }

    /* renamed from: c, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }
}
