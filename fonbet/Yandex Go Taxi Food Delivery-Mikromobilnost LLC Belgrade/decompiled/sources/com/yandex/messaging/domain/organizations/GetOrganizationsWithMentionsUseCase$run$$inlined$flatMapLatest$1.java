package com.yandex.messaging.domain.organizations;

import defpackage.lat;
import defpackage.mat;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7u;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.wet;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.organizations.GetOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1", f = "GetOrganizationsWithMentionsUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1 getOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1 = new GetOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        getOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getOrganizationsWithMentionsUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            mat matVar = (mat) this.L$1;
            List<lat> list = matVar.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (lat latVar : list) {
                c cVar = this.this$0;
                long j = latVar.a;
                arrayList.add(new m0(e.X(cVar.e.a(new o7u(Long.valueOf(j))), new GetOrganizationsWithMentionsUseCase$hasMentionsForOrganization$$inlined$flatMapLatest$1(null, cVar, j)), this.this$0.g.a(new wet(new Long(latVar.a), 6)), new GetOrganizationsWithMentionsUseCase$run$1$1$1(latVar, null)));
            }
            tpr[] tprVarArr = (tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]);
            this.label = 1;
            e.w(vprVar);
            Object a = j.a(vprVar, new v10(tprVarArr, 24), new GetOrganizationsWithMentionsUseCase$run$lambda$3$lambda$2$$inlined$combine$1$3(null, matVar), this, tprVarArr);
            if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                a = zy11Var;
            }
            if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                a = zy11Var;
            }
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
