package com.yandex.go.coroutines;

import com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1", f = "BufferedWithTimeout.kt", l = {69}, m = "invokeSuspend$flush", v = 2)
/* loaded from: classes.dex */
final class BufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BufferedWithTimeoutKt$bufferedWithTimeout$3.AnonymousClass1.i(null, null, null, this);
    }
}
