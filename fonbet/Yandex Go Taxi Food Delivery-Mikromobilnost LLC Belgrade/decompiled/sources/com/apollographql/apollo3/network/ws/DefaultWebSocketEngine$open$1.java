package com.apollographql.apollo3.network.ws;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@mvg(c = "com.apollographql.apollo3.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", l = {74}, m = OpenList.STR_OPEN)
/* loaded from: classes10.dex */
final class DefaultWebSocketEngine$open$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketEngine$open$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
