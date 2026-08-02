package com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl", f = "MapiClientImpl.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH, 90, HProv.PP_DHOID}, m = "executeRequest")
/* loaded from: classes10.dex */
public final class MapiClientImpl$executeRequest$2<R> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MapiClientImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapiClientImpl$executeRequest$2(MapiClientImpl mapiClientImpl, Continuation<? super MapiClientImpl$executeRequest$2> continuation) {
        super(continuation);
        this.this$0 = mapiClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeRequest(null, null, null, null, this);
    }
}
