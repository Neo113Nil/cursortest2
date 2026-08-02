package com.ybsdk.feature.credit.deposit.internal.domain;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.domain.CreditDepositInteractor", f = "CreditDepositInteractor.kt", l = {114, HProv.PP_PASSWD_TERM, HProv.PP_CONTAINER_EXTENSION, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "checkAmount-yxL6bBk")
/* loaded from: classes3.dex */
final class CreditDepositInteractor$checkAmount$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositInteractor$checkAmount$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, null, null, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
