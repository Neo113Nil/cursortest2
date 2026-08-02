package com.yandex.go.personal_goals_v2.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.personal_goals_v2.router.PersonalGoalsRouterImpl", f = "PersonalGoalsRouterImpl.kt", l = {HProv.PP_RESERVED1}, m = "processAcceptError", v = 2)
/* loaded from: classes13.dex */
final class PersonalGoalsRouterImpl$processAcceptError$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalGoalsRouterImpl$processAcceptError$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.U(this.this$0, null, this);
    }
}
