package com.yandex.go.tariffcard.interactor;

import defpackage.cxu0;
import defpackage.f6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ygj0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcxu0;", "style", "Lf6v;", "Lhmx0;", "Lygj0;", "groupInfoIdentifier", "Ld3u;", "<anonymous>", "(Lcxu0;Lf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.interactor.GroupedRequirementsItemInteractor$styledRequirementsFlow$1", f = "GroupedRequirementsItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class GroupedRequirementsItemInteractor$styledRequirementsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupedRequirementsItemInteractor$styledRequirementsFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GroupedRequirementsItemInteractor$styledRequirementsFlow$1 groupedRequirementsItemInteractor$styledRequirementsFlow$1 = new GroupedRequirementsItemInteractor$styledRequirementsFlow$1(this.this$0, (Continuation) obj3);
        groupedRequirementsItemInteractor$styledRequirementsFlow$1.L$0 = (cxu0) obj;
        groupedRequirementsItemInteractor$styledRequirementsFlow$1.L$1 = (f6v) obj2;
        return groupedRequirementsItemInteractor$styledRequirementsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cxu0 cxu0Var = (cxu0) this.L$0;
        f6v f6vVar = (f6v) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new f6v(f6vVar.a, this.this$0.a.g((ygj0) f6vVar.b, cxu0Var));
    }
}
