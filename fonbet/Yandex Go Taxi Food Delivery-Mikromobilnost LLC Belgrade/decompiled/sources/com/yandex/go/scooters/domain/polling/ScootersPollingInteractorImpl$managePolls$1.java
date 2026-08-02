package com.yandex.go.scooters.domain.polling;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.domain.polling.ScootersPollingInteractorImpl", f = "ScootersPollingInteractorImpl.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "managePolls", v = 2)
/* loaded from: classes13.dex */
final class ScootersPollingInteractorImpl$managePolls$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPollingInteractorImpl$managePolls$1(j jVar, Continuation continuation) {
        super(continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.a(this.this$0, null, null, this);
    }
}
