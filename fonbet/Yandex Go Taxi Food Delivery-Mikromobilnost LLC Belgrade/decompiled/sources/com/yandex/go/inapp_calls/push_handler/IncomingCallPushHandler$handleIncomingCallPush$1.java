package com.yandex.go.inapp_calls.push_handler;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.push_handler.IncomingCallPushHandler", f = "IncomingCallPushHandler.kt", l = {HProv.PP_DHOID, 114, HProv.PP_CACHE_SIZE, HProv.PP_DELETE_SAVED_PASSWD}, m = "handleIncomingCallPush", v = 2)
/* loaded from: classes12.dex */
final class IncomingCallPushHandler$handleIncomingCallPush$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncomingCallPushHandler$handleIncomingCallPush$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
