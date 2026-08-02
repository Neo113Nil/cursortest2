package com.yandex.xplat.xflags;

import com.yandex.xplat.common.YSError;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/xplat/xflags/UnknownOperationError;", "Lcom/yandex/xplat/common/YSError;", "", "operation", "Ljava/lang/String;", "getOperation", "()Ljava/lang/String;", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public class UnknownOperationError extends YSError {
    private final String operation;

    public UnknownOperationError(String str) {
        super(oyr.p("Unknown operation '", str, "'"), null);
        this.operation = str;
    }
}
