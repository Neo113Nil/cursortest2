package com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration;

import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.g700;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.nso;
import defpackage.ny61;
import defpackage.vj91;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.yh00;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lnso;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.MapExplorationInteractor$mapCameraFlow$1", f = "MapExplorationInteractor.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapExplorationInteractor$mapCameraFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapExplorationInteractor$mapCameraFlow$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapExplorationInteractor$mapCameraFlow$1 mapExplorationInteractor$mapCameraFlow$1 = new MapExplorationInteractor$mapCameraFlow$1(this.this$0, continuation);
        mapExplorationInteractor$mapCameraFlow$1.L$0 = obj;
        return mapExplorationInteractor$mapCameraFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapExplorationInteractor$mapCameraFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            yh00 yh00Var = new yh00(0, cVar, y6f0Var);
            ((gh00) cVar.d).e(yh00Var);
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.d(new nso(vj91.c(((gh00) this.this$0.d).e.a()), CameraUpdateReason.APPLICATION));
            g700 g700Var = new g700(i2, this.this$0, yh00Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(x6f0Var, g700Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
