package com.yandex.div.internal.storage;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "com.yandex.div.internal.storage.DataStorage$special$$inlined$map$1$2", f = "DataStorage.kt", l = {50}, m = "emit")
/* loaded from: classes11.dex */
public final class DataStorage$special$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStorage$special$$inlined$map$1$2$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
