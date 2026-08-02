package com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration;

import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.mvg;
import defpackage.nso;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.vh00;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luc4;", "anchor", "Lnso;", "camera", "Lkotlin/Pair;", "Lcom/yandex/mapkit/map/CameraUpdateReason;", "", "<anonymous>", "(Luc4;Lnso;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.MapExplorationFarPanDetectorInteractor$detectorFlow$1", f = "MapExplorationFarPanDetectorInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapExplorationFarPanDetectorInteractor$detectorFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ vh00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapExplorationFarPanDetectorInteractor$detectorFlow$1(vh00 vh00Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = vh00Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MapExplorationFarPanDetectorInteractor$detectorFlow$1 mapExplorationFarPanDetectorInteractor$detectorFlow$1 = new MapExplorationFarPanDetectorInteractor$detectorFlow$1(this.this$0, (Continuation) obj3);
        mapExplorationFarPanDetectorInteractor$detectorFlow$1.L$0 = (uc4) obj;
        mapExplorationFarPanDetectorInteractor$detectorFlow$1.L$1 = (nso) obj2;
        return mapExplorationFarPanDetectorInteractor$detectorFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uc4 uc4Var = (uc4) this.L$0;
        nso nsoVar = (nso) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        uc4 uc4Var2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CameraUpdateReason cameraUpdateReason = nsoVar.b;
        vh00 vh00Var = this.this$0;
        uc4 uc4Var3 = nsoVar.a;
        vh00Var.getClass();
        double a = vh00.a(uc4Var);
        zzs zzsVar = uc4Var.a;
        double d = 0.0d;
        if (a <= 0.0d) {
            d = 1.0d;
        } else {
            double a2 = vh00.a(uc4Var3);
            zzs zzsVar2 = uc4Var3.a;
            if (a2 <= 0.0d) {
                d = Double.NaN;
            } else {
                double max = Math.max(zzsVar.b, zzsVar2.b);
                double max2 = Math.max(zzsVar.a, zzsVar2.a);
                zzs zzsVar3 = uc4Var.b;
                double d2 = zzsVar3.b;
                zzs zzsVar4 = uc4Var3.b;
                double min = Math.min(d2, zzsVar4.b);
                double min2 = Math.min(zzsVar3.a, zzsVar4.a);
                if (max < min && max2 < min2) {
                    uc4Var2 = new uc4(new zzs(max2, max, 0, null, null, 28), new zzs(min2, min, 0, null, null, 28));
                }
                if (uc4Var2 != null) {
                    d = vh00.a(uc4Var2) / Math.min(a, a2);
                }
            }
        }
        return new Pair(cameraUpdateReason, new Double(d));
    }
}
