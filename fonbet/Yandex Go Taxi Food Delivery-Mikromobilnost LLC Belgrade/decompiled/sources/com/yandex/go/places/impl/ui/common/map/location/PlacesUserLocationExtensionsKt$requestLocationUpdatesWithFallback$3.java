package com.yandex.go.places.impl.ui.common.map.location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "Lmo21;", "", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.common.map.location.PlacesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3", f = "PlacesUserLocationExtensions.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PlacesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3 placesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3 = new PlacesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3(3, (Continuation) obj3);
        placesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3.L$0 = (vpr) obj;
        placesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3.L$1 = (Throwable) obj2;
        return placesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (th instanceof LocationRequirementsException) {
                Pair pair = new Pair(((LocationRequirementsException) th).getFallbackUserLocation(), Boolean.FALSE);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (vprVar.emit(pair, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
