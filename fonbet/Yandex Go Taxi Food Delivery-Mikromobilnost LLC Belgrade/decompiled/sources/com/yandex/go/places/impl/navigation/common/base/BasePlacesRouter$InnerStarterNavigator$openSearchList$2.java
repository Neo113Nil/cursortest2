package com.yandex.go.places.impl.navigation.common.base;

import defpackage.a5g;
import defpackage.cm80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La5g;", "it", "Lcm80;", "<anonymous>", "(La5g;)Lcm80;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.common.base.BasePlacesRouter$InnerStarterNavigator$openSearchList$2", f = "BasePlacesRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BasePlacesRouter$InnerStarterNavigator$openSearchList$2 extends SuspendLambda implements wls {
    final /* synthetic */ cm80 $payload;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlacesRouter$InnerStarterNavigator$openSearchList$2(cm80 cm80Var, Continuation continuation) {
        super(2, continuation);
        this.$payload = cm80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasePlacesRouter$InnerStarterNavigator$openSearchList$2(this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasePlacesRouter$InnerStarterNavigator$openSearchList$2) create((a5g) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$payload;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
