package com.yandex.go.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.domain.ScootersStateInteractor", f = "ScootersStateInteractor.kt", l = {HProv.PP_VERSION_TIMESTAMP, 128}, m = "doActiveOrdersPolling", v = 2)
/* loaded from: classes13.dex */
final class ScootersStateInteractor$doActiveOrdersPolling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersStateInteractor$doActiveOrdersPolling$1(a0 a0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a0.d(this.this$0, this);
    }
}
