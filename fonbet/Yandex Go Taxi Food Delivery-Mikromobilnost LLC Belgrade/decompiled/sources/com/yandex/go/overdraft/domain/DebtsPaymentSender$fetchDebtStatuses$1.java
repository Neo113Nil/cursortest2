package com.yandex.go.overdraft.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.overdraft.domain.DebtsPaymentSender", f = "DebtsPaymentSender.kt", l = {HProv.PROV_GOST_2001_DH}, m = "fetchDebtStatuses-IoAF18A", v = 2)
/* loaded from: classes13.dex */
final class DebtsPaymentSender$fetchDebtStatuses$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebtsPaymentSender$fetchDebtStatuses$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
