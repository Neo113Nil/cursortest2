package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.epb;
import defpackage.j3v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "La5g;", "component", "Lzy11;", "<anonymous>", "(Ltse;La5g;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerNavigator$closeOrganizationCard$1", f = "BasePlacesRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerNavigator$closeOrganizationCard$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerNavigator$closeOrganizationCard$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BasePlacesRouter$InnerNavigator$closeOrganizationCard$1 basePlacesRouter$InnerNavigator$closeOrganizationCard$1 = new BasePlacesRouter$InnerNavigator$closeOrganizationCard$1(this.this$0, (Continuation) obj3);
        basePlacesRouter$InnerNavigator$closeOrganizationCard$1.L$0 = (a5g) obj2;
        zy11 zy11Var = zy11.a;
        basePlacesRouter$InnerNavigator$closeOrganizationCard$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        dVar.T = null;
        dVar.j(new epb((j3v) a5gVar.m2.get()));
        return zy11.a;
    }
}
