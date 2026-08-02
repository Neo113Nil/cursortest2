package com.yandex.go.personal_goals_v2.router;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.personal_goals_v2.router.PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl", f = "PersonalGoalsRouterImpl.kt", l = {HProv.PP_CONTAINER_EXTENSION, HProv.PP_CONTAINER_EXTENSION_DEL, 142}, m = "acceptPersonalGoal", v = 2)
/* loaded from: classes13.dex */
final class PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalGoalsRouterImpl$PersonalGoalNavigatorImpl$acceptPersonalGoal$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
