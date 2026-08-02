package com.yandex.go.address.search.common.deeplink;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.atd0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpv0;", "<anonymous>", "(Ltse;)Lpv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.deeplink.SuggestDeeplinkModelMapper$takeCurrentLocation$2", f = "SuggestDeeplinkModelMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 70}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestDeeplinkModelMapper$takeCurrentLocation$2 extends SuspendLambda implements wls {
    final /* synthetic */ RoutePointType $routePointType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestDeeplinkModelMapper$takeCurrentLocation$2(a aVar, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$routePointType = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestDeeplinkModelMapper$takeCurrentLocation$2(this.this$0, this.$routePointType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestDeeplinkModelMapper$takeCurrentLocation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r14 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        RoutePointType routePointType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            routePointType = this.$routePointType;
            po21 po21Var = aVar.b;
            this.L$0 = aVar;
            this.L$1 = routePointType;
            this.label = 1;
            obj = ((e) po21Var).h(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                pv0 pv0Var = (pv0) obj;
                if (pv0Var != null) {
                    pv0Var.k = true;
                    return pv0Var;
                }
                return null;
            }
            routePointType = (RoutePointType) this.L$1;
            aVar = (a) this.L$0;
            b.b(obj);
        }
        RoutePointType routePointType2 = routePointType;
        tpr c = atd0.c(aVar.c, ((mo21) obj).a(), routePointType2, PositionInitAction.AUTO_LOCATION, Action.PIN_DROP, null, null, 48);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = kotlinx.coroutines.flow.e.A(c, this);
    }
}
