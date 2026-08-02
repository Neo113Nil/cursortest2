package com.yandex.go.navigator.address;

import com.yandex.go.address.models.Address;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.address.NavigationRouteFromPreorderInteractor$updateDestinations$2", f = "NavigationRouteFromPreorderInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigationRouteFromPreorderInteractor$updateDestinations$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Address> $targetDestinations;
    final /* synthetic */ RoutePointType $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRouteFromPreorderInteractor$updateDestinations$2(List list, a aVar, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.$targetDestinations = list;
        this.this$0 = aVar;
        this.$type = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationRouteFromPreorderInteractor$updateDestinations$2 navigationRouteFromPreorderInteractor$updateDestinations$2 = new NavigationRouteFromPreorderInteractor$updateDestinations$2(this.$targetDestinations, this.this$0, this.$type, continuation);
        navigationRouteFromPreorderInteractor$updateDestinations$2.L$0 = obj;
        return navigationRouteFromPreorderInteractor$updateDestinations$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationRouteFromPreorderInteractor$updateDestinations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<Address> list = this.$targetDestinations;
            a aVar = this.this$0;
            RoutePointType routePointType = this.$type;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (Address address : list) {
                zzs originPoint = address.getOriginPoint();
                if (originPoint == null) {
                    originPoint = address.B();
                }
                arrayList.add(tje.h(tseVar, null, null, new NavigationRouteFromPreorderInteractor$updateDestinations$2$1$1(aVar, originPoint, routePointType, null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
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
        return kotlin.collections.a.M((Iterable) obj);
    }
}
