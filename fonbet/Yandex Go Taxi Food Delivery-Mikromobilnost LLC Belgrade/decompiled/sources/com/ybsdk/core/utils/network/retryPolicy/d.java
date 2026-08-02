package com.ybsdk.core.utils.network.retryPolicy;

import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class d {
    public static RetryTimeoutException a(List list) {
        Throwable th = (Throwable) kotlin.collections.a.b0(list);
        return th == null ? new RetryTimeoutException.Network("retry policy finished with timeout, before receiving result of the first attempt", null) : th instanceof IOException ? new RetryTimeoutException.Network("retry policy finished with timeout with Network exception", (IOException) th) : th instanceof ErrorResponseException ? new RetryTimeoutException.ServiceUnresponsive((ErrorResponseException) th) : new RetryTimeoutException.Unknown(th);
    }
}
