package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.cgc0;
import defpackage.mvg;
import defpackage.n75;
import defpackage.ny61;
import defpackage.sls;
import defpackage.sn80;
import defpackage.toc;
import defpackage.yl80;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "La5g;", "component", "Lzy11;", "<anonymous>", "(Ltse;La5g;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerStarterNavigator$openOrganizationsList$1", f = "BasePlacesRouter.kt", l = {428}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerStarterNavigator$openOrganizationsList$1 extends SuspendLambda implements zls {
    final /* synthetic */ sls $doOnGoBack;
    final /* synthetic */ boolean $isPayloadUpdating;
    final /* synthetic */ yl80 $payload;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerStarterNavigator$openOrganizationsList$1(d dVar, yl80 yl80Var, boolean z, sls slsVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$payload = yl80Var;
        this.$isPayloadUpdating = z;
        this.$doOnGoBack = slsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BasePlacesRouter$InnerStarterNavigator$openOrganizationsList$1 basePlacesRouter$InnerStarterNavigator$openOrganizationsList$1 = new BasePlacesRouter$InnerStarterNavigator$openOrganizationsList$1(this.this$0, this.$payload, this.$isPayloadUpdating, this.$doOnGoBack, (Continuation) obj3);
        basePlacesRouter$InnerStarterNavigator$openOrganizationsList$1.L$0 = (a5g) obj2;
        return basePlacesRouter$InnerStarterNavigator$openOrganizationsList$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            yl80 yl80Var = this.$payload;
            this.L$0 = a5gVar;
            this.label = 1;
            obj = dVar.h0(yl80Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        sn80 sn80Var = (sn80) obj;
        int i2 = 0;
        boolean z = sn80Var != null;
        this.this$0.W().q(z);
        d dVar2 = this.this$0;
        n75 n75Var = new n75(dVar2, this.$doOnGoBack, z, i2);
        if (sn80Var != null) {
            d.P(dVar2, sn80Var, (toc) a5gVar.d1.get(), n75Var, a5gVar, this.$isPayloadUpdating);
        } else {
            d.P(dVar2, this.$payload, (cgc0) a5gVar.F1.get(), n75Var, a5gVar, this.$isPayloadUpdating);
        }
        return zy11.a;
    }
}
