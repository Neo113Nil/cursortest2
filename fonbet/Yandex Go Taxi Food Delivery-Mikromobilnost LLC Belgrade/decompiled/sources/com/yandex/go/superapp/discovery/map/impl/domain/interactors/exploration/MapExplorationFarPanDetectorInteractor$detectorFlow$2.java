package com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration;

import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n"}, d2 = {"<anonymous>", "", "wasFar", "<destruct>", "Lkotlin/Pair;", "Lcom/yandex/mapkit/map/CameraUpdateReason;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.MapExplorationFarPanDetectorInteractor$detectorFlow$2", f = "MapExplorationFarPanDetectorInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapExplorationFarPanDetectorInteractor$detectorFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ double $enterAnchorThreshold;
    final /* synthetic */ double $exitAnchorThreshold;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapExplorationFarPanDetectorInteractor$detectorFlow$2(double d, double d2, Continuation continuation) {
        super(3, continuation);
        this.$exitAnchorThreshold = d;
        this.$enterAnchorThreshold = d2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MapExplorationFarPanDetectorInteractor$detectorFlow$2 mapExplorationFarPanDetectorInteractor$detectorFlow$2 = new MapExplorationFarPanDetectorInteractor$detectorFlow$2(this.$exitAnchorThreshold, this.$enterAnchorThreshold, (Continuation) obj3);
        mapExplorationFarPanDetectorInteractor$detectorFlow$2.Z$0 = booleanValue;
        mapExplorationFarPanDetectorInteractor$detectorFlow$2.L$0 = (Pair) obj2;
        return mapExplorationFarPanDetectorInteractor$detectorFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CameraUpdateReason cameraUpdateReason = (CameraUpdateReason) pair.getFirst();
        double doubleValue = ((Number) pair.getSecond()).doubleValue();
        if (!Double.isNaN(doubleValue)) {
            if (!z && cameraUpdateReason == CameraUpdateReason.GESTURES && doubleValue < this.$exitAnchorThreshold) {
                z = true;
            } else if (z && doubleValue >= this.$enterAnchorThreshold) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
