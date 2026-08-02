package com.yandex.messaging.domain.organizations;

import defpackage.lat;
import defpackage.mat;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w4b0;
import defpackage.x4b0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx4b0;", "personalInfo", "", "currentOrganizationId", "Lmat;", "<anonymous>", "(Lx4b0;J)Lmat;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.organizations.GetOrganizationsWithMentionsUseCase$getInitialOrganizations$1", f = "GetOrganizationsWithMentionsUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetOrganizationsWithMentionsUseCase$getInitialOrganizations$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        GetOrganizationsWithMentionsUseCase$getInitialOrganizations$1 getOrganizationsWithMentionsUseCase$getInitialOrganizations$1 = new GetOrganizationsWithMentionsUseCase$getInitialOrganizations$1(3, (Continuation) obj3);
        getOrganizationsWithMentionsUseCase$getInitialOrganizations$1.L$0 = (x4b0) obj;
        getOrganizationsWithMentionsUseCase$getInitialOrganizations$1.J$0 = longValue;
        return getOrganizationsWithMentionsUseCase$getInitialOrganizations$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        x4b0 x4b0Var = (x4b0) this.L$0;
        long j = this.J$0;
        w4b0[] w4b0VarArr = x4b0Var.j;
        ArrayList arrayList = new ArrayList();
        for (w4b0 w4b0Var : w4b0VarArr) {
            if (!w4b0Var.d && !w4b0Var.e && w4b0Var.a != 0) {
                arrayList.add(w4b0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w4b0 w4b0Var2 = (w4b0) it.next();
            arrayList2.add(new lat(w4b0Var2.b, w4b0Var2.a, w4b0Var2.f));
        }
        if (!x4b0Var.l) {
            arrayList2 = kotlin.collections.a.o0(arrayList2, new lat("", 0L, false));
        }
        return new mat(arrayList2.size() > 1, j, arrayList2);
    }
}
