package com.yandex.xplat.common;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/xplat/common/JSONSerializerError;", "Lcom/yandex/xplat/common/YSError;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class JSONSerializerError extends YSError {
    private final String message;

    public JSONSerializerError(String str, Throwable th) {
        super(str, th);
        this.message = str;
    }

    @Override // com.yandex.xplat.common.YSError, java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
