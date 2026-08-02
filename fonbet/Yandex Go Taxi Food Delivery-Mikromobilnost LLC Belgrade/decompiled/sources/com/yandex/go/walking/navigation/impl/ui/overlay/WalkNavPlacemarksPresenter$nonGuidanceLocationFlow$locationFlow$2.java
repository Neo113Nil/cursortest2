package com.yandex.go.walking.navigation.impl.ui.overlay;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lmo21;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2", f = "WalkNavPlacemarksPresenter.kt", l = {228}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2 walkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2 = new WalkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2(3, (Continuation) obj3);
        walkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2.L$0 = (vpr) obj;
        walkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2.L$1 = (Throwable) obj2;
        return walkNavPlacemarksPresenter$nonGuidanceLocationFlow$locationFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            LocationRequirementsException locationRequirementsException = th instanceof LocationRequirementsException ? (LocationRequirementsException) th : null;
            if (locationRequirementsException != null) {
                mo21 fallbackUserLocation = locationRequirementsException.getFallbackUserLocation();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (vprVar.emit(fallbackUserLocation, this) == coroutineSingletons) {
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
