package com.yandex.go.logger;

import defpackage.ffx;
import defpackage.fot;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/logger/GoMangoThrowable;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GoMangoThrowable extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoMangoThrowable(boolean z, int i) {
        super(null, null);
        z = (i & 1) != 0 ? false : z;
        if (z) {
            ffx.t(fot.b, this);
        } else {
            ffx.t(fot.a, this);
        }
    }

    public GoMangoThrowable() {
        this(false, 7);
    }
}
