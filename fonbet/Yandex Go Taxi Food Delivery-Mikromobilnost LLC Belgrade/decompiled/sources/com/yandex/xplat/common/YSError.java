package com.yandex.xplat.common;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/xplat/common/YSError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class YSError extends RuntimeException {
    private final String message;

    public YSError(String str, Throwable th) {
        super(str, th);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
