package com.ybsdk.core.utils.poller;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/core/utils/poller/PollerTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PollerTimeoutException extends Exception {
    public PollerTimeoutException() {
        super("polling finished with timeout");
    }
}
