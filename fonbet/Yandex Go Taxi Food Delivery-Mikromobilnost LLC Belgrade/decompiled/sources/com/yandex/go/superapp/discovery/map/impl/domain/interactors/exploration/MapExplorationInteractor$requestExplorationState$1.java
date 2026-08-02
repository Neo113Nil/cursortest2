package com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration;

import com.yandex.go.superapp.discovery.map.impl.domain.entities.exploration.ExplorationState;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oso;
import defpackage.pso;
import defpackage.qso;
import defpackage.rso;
import defpackage.sso;
import defpackage.tso;
import defpackage.uso;
import defpackage.vso;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/exploration/ExplorationState;", ClidProvider.STATE, "Lvso;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "<anonymous>", "(Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/exploration/ExplorationState;Lvso;)Lcom/yandex/go/superapp/discovery/map/impl/domain/entities/exploration/ExplorationState;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.MapExplorationInteractor$requestExplorationState$1", f = "MapExplorationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapExplorationInteractor$requestExplorationState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapExplorationInteractor$requestExplorationState$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MapExplorationInteractor$requestExplorationState$1 mapExplorationInteractor$requestExplorationState$1 = new MapExplorationInteractor$requestExplorationState$1(this.this$0, (Continuation) obj3);
        mapExplorationInteractor$requestExplorationState$1.L$0 = (ExplorationState) obj;
        mapExplorationInteractor$requestExplorationState$1.L$1 = (vso) obj2;
        return mapExplorationInteractor$requestExplorationState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ExplorationState explorationState = (ExplorationState) this.L$0;
        vso vsoVar = (vso) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        if (jl40.l(vsoVar, tso.a)) {
            return ExplorationState.a(explorationState, null, true, false, 5);
        }
        if (jl40.l(vsoVar, sso.a)) {
            return ExplorationState.a(explorationState, null, false, false, 5);
        }
        if (vsoVar instanceof pso) {
            return ExplorationState.a(explorationState, null, false, ((pso) vsoVar).a, 3);
        }
        if (jl40.l(vsoVar, qso.a)) {
            return ExplorationState.a(explorationState, ExplorationState.Mode.FILTER, false, false, 4);
        }
        if (jl40.l(vsoVar, oso.a)) {
            return ExplorationState.a(explorationState, ExplorationState.Mode.DEFAULT, false, false, 4);
        }
        if (jl40.l(vsoVar, rso.a)) {
            return ExplorationState.a(explorationState, ExplorationState.Mode.GAMIFICATION, false, false, 4);
        }
        if (jl40.l(vsoVar, uso.a)) {
            return new ExplorationState(0);
        }
        w511.b();
        return null;
    }
}
