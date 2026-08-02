package com.yandex.go.superapp.order.multi.old.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.order.multi.old.view.RedirectToCompletedInteractor", f = "RedirectToCompletedInteractor.kt", l = {HProv.PROV_GOST_2001_DH}, m = "onOrderCompleted", v = 2)
/* loaded from: classes14.dex */
final class RedirectToCompletedInteractor$onOrderCompleted$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectToCompletedInteractor$onOrderCompleted$1(l lVar, Continuation continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.a(this.this$0, null, this);
    }
}
