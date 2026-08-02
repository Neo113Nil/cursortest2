package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xl80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La5g;", "it", "Lte80;", "<anonymous>", "(La5g;)Lte80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1", f = "BasePlacesRouter.kt", l = {327}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isFromPlacesFlow;
    final /* synthetic */ xl80 $payload;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1(xl80 xl80Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$payload = xl80Var;
        this.$isFromPlacesFlow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1 basePlacesRouter$InnerStarterNavigator$openOrganizationCard$1 = new BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1(this.$payload, this.$isFromPlacesFlow, continuation);
        basePlacesRouter$InnerStarterNavigator$openOrganizationCard$1.L$0 = obj;
        return basePlacesRouter$InnerStarterNavigator$openOrganizationCard$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesRouter$InnerStarterNavigator$openOrganizationCard$1) create((a5g) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.places.organization.card.api.navigation.common.a aVar = (com.yandex.go.places.organization.card.api.navigation.common.a) a5gVar.R2.get();
        xl80 xl80Var = this.$payload;
        boolean z = this.$isFromPlacesFlow;
        this.L$0 = null;
        this.label = 1;
        Object c = aVar.c(xl80Var, z, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
