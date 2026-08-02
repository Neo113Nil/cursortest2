package com.yandex.go.xiva.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.xiva.domain.TaxiXivaPushNotificationInteractorImpl", f = "TaxiXivaPushNotificationInteractorImpl.kt", l = {HProv.PP_SIGNATUREOID}, m = "updateXivaConnection", v = 2)
/* loaded from: classes11.dex */
final class TaxiXivaPushNotificationInteractorImpl$updateXivaConnection$1 extends ContinuationImpl {
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiXivaPushNotificationInteractorImpl$updateXivaConnection$1(f fVar, Continuation continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.b(this.this$0, false, this);
    }
}
