package com.yandex.plus.core.network.api.exceptions;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/core/network/api/exceptions/OfflineModeEnabledException;", "Ljava/io/IOException;", "<init>", "()V", "homeless-core-network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OfflineModeEnabledException extends IOException {
    public OfflineModeEnabledException() {
        super("Can't proceed request, offline mode is enabled!");
    }
}
