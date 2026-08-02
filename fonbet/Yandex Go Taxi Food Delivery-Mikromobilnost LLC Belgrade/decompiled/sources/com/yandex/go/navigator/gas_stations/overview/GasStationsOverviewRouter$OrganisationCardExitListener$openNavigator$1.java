package com.yandex.go.navigator.gas_stations.overview;

import com.yandex.go.address.models.Address;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewRouter$OrganisationCardExitListener$openNavigator$1", f = "GasStationsOverviewRouter.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsOverviewRouter$OrganisationCardExitListener$openNavigator$1 extends SuspendLambda implements wls {
    final /* synthetic */ OpenNavigatorActionSubtype $actionSubtype;
    int label;
    final /* synthetic */ i this$0;
    final /* synthetic */ j this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsOverviewRouter$OrganisationCardExitListener$openNavigator$1(i iVar, j jVar, OpenNavigatorActionSubtype openNavigatorActionSubtype, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.this$1 = jVar;
        this.$actionSubtype = openNavigatorActionSubtype;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsOverviewRouter$OrganisationCardExitListener$openNavigator$1(this.this$0, this.this$1, this.$actionSubtype, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsOverviewRouter$OrganisationCardExitListener$openNavigator$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh qohVar = this.this$0.c;
            this.label = 1;
            obj = qohVar.s(this);
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
        Address address = (Address) obj;
        if (address != null) {
            this.this$1.r(new ynn(7, this.$actionSubtype, this.this$0, address));
        } else {
            this.this$0.a();
        }
        return zy11.a;
    }
}
