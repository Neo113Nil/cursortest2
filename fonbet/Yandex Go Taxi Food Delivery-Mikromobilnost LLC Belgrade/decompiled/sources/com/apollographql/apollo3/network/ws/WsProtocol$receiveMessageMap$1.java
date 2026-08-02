package com.apollographql.apollo3.network.ws;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@mvg(c = "com.apollographql.apollo3.network.ws.WsProtocol", f = "WsProtocol.kt", l = {HProv.PP_FAST_CODE}, m = "receiveMessageMap")
/* loaded from: classes10.dex */
final class WsProtocol$receiveMessageMap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsProtocol$receiveMessageMap$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
