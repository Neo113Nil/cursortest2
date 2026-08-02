package com.yandex.go.navigator.gas_stations;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import com.yandex.mapkit.search.Session;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$refreshLastSearch$1$1", f = "GasStationsSearchManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsSearchManager$refreshLastSearch$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ GasStationSearchType $searchType;
    final /* synthetic */ Session $session;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$refreshLastSearch$1$1(Session session, b bVar, GasStationSearchType gasStationSearchType, Continuation continuation) {
        super(2, continuation);
        this.$session = session;
        this.this$0 = bVar;
        this.$searchType = gasStationSearchType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$refreshLastSearch$1$1(this.$session, this.this$0, this.$searchType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GasStationsSearchManager$refreshLastSearch$1$1 gasStationsSearchManager$refreshLastSearch$1$1 = (GasStationsSearchManager$refreshLastSearch$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        gasStationsSearchManager$refreshLastSearch$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$session.resubmit(new a(this.this$0, this.$searchType));
        return zy11.a;
    }
}
