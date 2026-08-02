package com.yandex.go.scooters.domain.model;

import defpackage.tho0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersPhotoVerificationRequiredException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ltho0;", "action", "Ltho0;", "a", "()Ltho0;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPhotoVerificationRequiredException extends RuntimeException {
    private final tho0 action;

    public ScootersPhotoVerificationRequiredException(tho0 tho0Var) {
        this.action = tho0Var;
    }

    /* renamed from: a, reason: from getter */
    public final tho0 getAction() {
        return this.action;
    }
}
