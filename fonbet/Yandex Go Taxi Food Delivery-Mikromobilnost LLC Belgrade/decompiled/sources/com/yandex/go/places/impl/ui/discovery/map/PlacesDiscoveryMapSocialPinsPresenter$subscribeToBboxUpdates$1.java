package com.yandex.go.places.impl.ui.discovery.map;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "Luc4;", "", "<destruct>", "", "isFavoriteSelected", "Lkotlin/Triple;", "<anonymous>", "(Lkotlin/Pair;Z)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.discovery.map.PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1", f = "PlacesDiscoveryMapSocialPinsPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1 placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1 = new PlacesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1(3, (Continuation) obj3);
        placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1.L$0 = (Pair) obj;
        placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1.Z$0 = booleanValue;
        return placesDiscoveryMapSocialPinsPresenter$subscribeToBboxUpdates$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Triple((uc4) pair.getFirst(), new Float(((Number) pair.getSecond()).floatValue()), Boolean.valueOf(z));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
