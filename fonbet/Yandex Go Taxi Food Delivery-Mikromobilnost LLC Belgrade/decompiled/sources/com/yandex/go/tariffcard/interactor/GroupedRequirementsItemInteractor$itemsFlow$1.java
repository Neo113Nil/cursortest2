package com.yandex.go.tariffcard.interactor;

import defpackage.d3u;
import defpackage.f6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lf6v;", "Lhmx0;", "Ld3u;", "styledRequirementsIdentifiable", "", "", "", "isBadgeVisible", "<anonymous>", "(Lf6v;Ljava/util/Map;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.interactor.GroupedRequirementsItemInteractor$itemsFlow$1", f = "GroupedRequirementsItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class GroupedRequirementsItemInteractor$itemsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupedRequirementsItemInteractor$itemsFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GroupedRequirementsItemInteractor$itemsFlow$1 groupedRequirementsItemInteractor$itemsFlow$1 = new GroupedRequirementsItemInteractor$itemsFlow$1(this.this$0, (Continuation) obj3);
        groupedRequirementsItemInteractor$itemsFlow$1.L$0 = (f6v) obj;
        groupedRequirementsItemInteractor$itemsFlow$1.L$1 = (Map) obj2;
        return groupedRequirementsItemInteractor$itemsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f6v f6vVar = (f6v) this.L$0;
        Map map = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new f6v(f6vVar.a, this.this$0.a.f((d3u) f6vVar.b, map));
    }
}
