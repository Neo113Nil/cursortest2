package com.yandex.go.scooters.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersPassesListException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ScootersPassesNotFoundException", "ScootersPassesListFailedException", "Lcom/yandex/go/scooters/domain/model/ScootersPassesListException$ScootersPassesListFailedException;", "Lcom/yandex/go/scooters/domain/model/ScootersPassesListException$ScootersPassesNotFoundException;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ScootersPassesListException extends RuntimeException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersPassesListException$ScootersPassesListFailedException;", "Lcom/yandex/go/scooters/domain/model/ScootersPassesListException;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScootersPassesListFailedException extends ScootersPassesListException {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersPassesListException$ScootersPassesNotFoundException;", "Lcom/yandex/go/scooters/domain/model/ScootersPassesListException;", "<init>", "()V", "preorder", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScootersPassesNotFoundException extends ScootersPassesListException {
        public ScootersPassesNotFoundException() {
            super(2, null);
        }
    }

    public ScootersPassesListException(int i, Throwable th) {
        super((i & 1) != 0 ? null : "Passes are not found for user in the area", (i & 2) != 0 ? null : th);
    }
}
