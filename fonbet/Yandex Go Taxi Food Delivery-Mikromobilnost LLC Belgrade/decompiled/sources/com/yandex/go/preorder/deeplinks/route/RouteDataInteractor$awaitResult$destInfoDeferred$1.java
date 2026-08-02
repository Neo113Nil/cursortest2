package com.yandex.go.preorder.deeplinks.route;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lpv0;", "<anonymous>", "(Ltse;)Lpv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.deeplinks.route.RouteDataInteractor$awaitResult$destInfoDeferred$1", f = "RouteDataInteractor.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteDataInteractor$awaitResult$destInfoDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ IntentData $intentData;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDataInteractor$awaitResult$destInfoDeferred$1(c cVar, IntentData intentData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$intentData = intentData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDataInteractor$awaitResult$destInfoDeferred$1(this.this$0, this.$intentData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDataInteractor$awaitResult$destInfoDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        IntentData intentData = this.$intentData;
        this.label = 1;
        cVar.getClass();
        zzs zzsVar = intentData.b;
        if (zzsVar != null) {
            e eVar = cVar.b;
            String str = intentData.i;
            boolean z = intentData.q;
            String str2 = intentData.r;
            obj2 = kotlinx.coroutines.flow.e.y(((i) eVar.b).g(zzsVar, str, RoutePointType.POINT_B, z, false, intentData.x, str2), this);
            if (obj2 != coroutineSingletons) {
                obj2 = (pv0) obj2;
            }
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
