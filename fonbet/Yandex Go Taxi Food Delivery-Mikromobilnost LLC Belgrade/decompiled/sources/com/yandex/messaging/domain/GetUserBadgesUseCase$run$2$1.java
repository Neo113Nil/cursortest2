package com.yandex.messaging.domain;

import defpackage.an4;
import defpackage.bn4;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.dft;
import defpackage.j3b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.vun;
import defpackage.ym4;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lj3b;", "chatInfo", "Lvun;", "employeeInfo", "", "Lcn4;", "<anonymous>", "(Lj3b;Lvun;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.GetUserBadgesUseCase$run$2$1", f = "GetUserBadgesUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserBadgesUseCase$run$2$1 extends SuspendLambda implements zls {
    final /* synthetic */ cl21 $component;
    final /* synthetic */ dft $params;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserBadgesUseCase$run$2$1(cl21 cl21Var, dft dftVar, Continuation continuation) {
        super(3, continuation);
        this.$component = cl21Var;
        this.$params = dftVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetUserBadgesUseCase$run$2$1 getUserBadgesUseCase$run$2$1 = new GetUserBadgesUseCase$run$2$1(this.$component, this.$params, (Continuation) obj3);
        getUserBadgesUseCase$run$2$1.L$0 = (j3b) obj;
        getUserBadgesUseCase$run$2$1.L$1 = (vun) obj2;
        return getUserBadgesUseCase$run$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j3b j3bVar = (j3b) this.L$0;
        vun vunVar = (vun) this.L$1;
        cl21 cl21Var = this.$component;
        dft dftVar = this.$params;
        ListBuilder a = rcc.a();
        if (vunVar != null && vunVar.j) {
            a.add(new bn4(0));
        }
        String str = vunVar != null ? vunVar.h : null;
        Long l = vunVar != null ? new Long(vunVar.a) : null;
        long c = ((com.yandex.messaging.data.e) ((d9g) cl21Var).b.f0.get()).c();
        boolean z = j3bVar.F;
        if (str != null) {
            dftVar.getClass();
            a.add(new an4(str));
        } else if (l != null && l.longValue() != c) {
            a.add(new ym4());
        } else if (z) {
            a.add(new ym4());
        }
        return a.j();
    }
}
