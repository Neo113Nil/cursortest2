package com.yandex.passport.data.exceptions;

import com.yandex.passport.common.exception.NetworkException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/data/exceptions/DeviceValidationException;", "Lcom/yandex/passport/common/exception/NetworkException;", "<init>", "()V", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceValidationException extends NetworkException {
    public DeviceValidationException() {
        super("not correct service or brand");
    }
}
