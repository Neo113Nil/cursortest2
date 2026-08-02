package com.ybsdk.core.utils.coroutines;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.core.utils.coroutines.TimeoutKt", f = "Timeout.kt", l = {24}, m = "scopeWithTimeout-rnQQ1Ag")
/* loaded from: classes8.dex */
final class TimeoutKt$scopeWithTimeout$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(0L, null, null, this);
    }
}
