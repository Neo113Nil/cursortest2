package com.yandex.messaging.internal.authorized;

import defpackage.el21;
import defpackage.fi9;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public abstract class i {
    public static final Object a(el21 el21Var, ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.flow.e.y(b(el21Var), continuationImpl);
    }

    public static final fi9 b(el21 el21Var) {
        return kotlinx.coroutines.flow.e.i(new UserComponentHolderKt$userComponentFlow$1(el21Var, null));
    }
}
