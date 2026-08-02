package com.yandex.go.scooters.live.notification;

import android.os.SystemClock;
import defpackage.axn0;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzwn0;", "<anonymous>", "(Ltse;)Lzwn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.live.notification.ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$stableUiStateAsync$1", f = "ScootersLiveNotificationUiStateInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$stableUiStateAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $sessionState;
    int label;
    final /* synthetic */ axn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$stableUiStateAsync$1(axn0 axn0Var, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = axn0Var;
        this.$sessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$stableUiStateAsync$1(this.this$0, this.$sessionState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersLiveNotificationUiStateInteractor$uiStateFlow$2$1$stableUiStateAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.analytics.b bVar = this.this$0.a;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
            bVar.b("Scooters.Live.UiStateInteractorUiStateFlowMapToStableUiStateStart", mapBuilder.j());
            d dVar = this.this$0.c;
            zuo0 zuo0Var = this.$sessionState;
            this.label = 1;
            obj = bvf0.n(new ScootersLiveNotificationUiStateMapper$mapToStableUiState$2(zuo0Var, dVar, null), this);
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
        com.yandex.go.analytics.b bVar2 = this.this$0.a;
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put("current_time_ms", new Long(SystemClock.elapsedRealtime()));
        bVar2.b("Scooters.Live.UiStateInteractorUiStateFlowMapToStableUiStateFinish", mapBuilder2.j());
        return obj;
    }
}
