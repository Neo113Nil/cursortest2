package com.yandex.go.navigator.address;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/Address;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.address.NavigationRouteFromPreorderInteractor$updateDestinations$2$1$1", f = "NavigationRouteFromPreorderInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigationRouteFromPreorderInteractor$updateDestinations$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $point;
    final /* synthetic */ RoutePointType $type;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRouteFromPreorderInteractor$updateDestinations$2$1$1(a aVar, zzs zzsVar, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$point = zzsVar;
        this.$type = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigationRouteFromPreorderInteractor$updateDestinations$2$1$1(this.this$0, this.$point, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationRouteFromPreorderInteractor$updateDestinations$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        a aVar = this.this$0;
        zzs zzsVar = this.$point;
        RoutePointType routePointType = this.$type;
        this.label = 1;
        Serializable a = aVar.a(zzsVar, routePointType, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
