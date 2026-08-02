package com.yandex.plus.webview.internal.contract.impl.loading;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/webview/internal/contract/impl/loading/ReadyTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "plus-core-webview-contracts_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReadyTimeoutException extends Exception {
    public ReadyTimeoutException() {
        super("Loading timed out!");
    }
}
