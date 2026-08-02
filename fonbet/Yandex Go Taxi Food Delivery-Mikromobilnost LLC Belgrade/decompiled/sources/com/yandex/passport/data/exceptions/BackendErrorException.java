package com.yandex.passport.data.exceptions;

import com.yandex.passport.common.network.BackendError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/data/exceptions/BackendErrorException;", "Lcom/yandex/passport/data/exceptions/FailedResponseException;", "Lcom/yandex/passport/common/network/BackendError;", "backendError", "Lcom/yandex/passport/common/network/BackendError;", "a", "()Lcom/yandex/passport/common/network/BackendError;", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackendErrorException extends FailedResponseException {
    private final BackendError backendError;

    public BackendErrorException(BackendError backendError) {
        super(backendError.toString());
        this.backendError = backendError;
    }

    /* renamed from: a, reason: from getter */
    public final BackendError getBackendError() {
        return this.backendError;
    }
}
