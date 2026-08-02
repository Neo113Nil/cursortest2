package com.yandex.go.preorder.deeplinks.route;

import com.yandex.go.zone.model.Zone;
import defpackage.dd61;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/zone/model/Zone;", "<anonymous>", "(Ltse;)Lcom/yandex/go/zone/model/Zone;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.RouteDataInteractor$awaitResult$awaitTariffsForZoneDeferred$1", f = "RouteDataInteractor.kt", l = {122, HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteDataInteractor$awaitResult$awaitTariffsForZoneDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ noh $sourceAddressDeferred;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDataInteractor$awaitResult$awaitTariffsForZoneDeferred$1(noh nohVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$sourceAddressDeferred = nohVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDataInteractor$awaitResult$awaitTariffsForZoneDeferred$1(this.$sourceAddressDeferred, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDataInteractor$awaitResult$awaitTariffsForZoneDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            noh nohVar = this.$sourceAddressDeferred;
            this.label = 1;
            obj = nohVar.k(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Zone zone = (Zone) this.L$0;
                kotlin.b.b(obj);
                return zone;
            }
            kotlin.b.b(obj);
        }
        Zone zone2 = ((dd61) obj).b;
        com.yandex.go.taxi.tariffs.interactor.b bVar = this.this$0.h;
        this.L$0 = zone2;
        this.label = 2;
        return bVar.b(zone2, this) == coroutineSingletons ? coroutineSingletons : zone2;
    }
}
