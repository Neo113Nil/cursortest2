package com.yandex.go.scooters.domain.model;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/domain/model/ScootersBookingFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", ErrorResponseData.JSON_ERROR_CODE, "Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "a", "()Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBookingFailedException extends RuntimeException {
    private final ScootersErrorCode errorCode;

    public ScootersBookingFailedException(ScootersErrorCode scootersErrorCode) {
        this.errorCode = scootersErrorCode;
    }

    /* renamed from: a, reason: from getter */
    public final ScootersErrorCode getErrorCode() {
        return this.errorCode;
    }

    public ScootersBookingFailedException() {
        this(null);
    }
}
