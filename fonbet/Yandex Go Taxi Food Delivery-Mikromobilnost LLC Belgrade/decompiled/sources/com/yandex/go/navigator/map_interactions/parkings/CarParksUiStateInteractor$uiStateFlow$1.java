package com.yandex.go.navigator.map_interactions.parkings;

import defpackage.a68;
import defpackage.dms;
import defpackage.e68;
import defpackage.lpt0;
import defpackage.m68;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r901;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lr901;", "trafficState", "La68;", "contentState", "Le68;", "carParksState", "Llpt0;", "speedGroupUiState", "Lm68;", "<anonymous>", "(Lr901;La68;Le68;Llpt0;)Lm68;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.CarParksUiStateInteractor$uiStateFlow$1", f = "CarParksUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CarParksUiStateInteractor$uiStateFlow$1 carParksUiStateInteractor$uiStateFlow$1 = new CarParksUiStateInteractor$uiStateFlow$1(5, (Continuation) obj5);
        carParksUiStateInteractor$uiStateFlow$1.L$0 = (r901) obj;
        carParksUiStateInteractor$uiStateFlow$1.L$1 = (a68) obj2;
        carParksUiStateInteractor$uiStateFlow$1.L$2 = (e68) obj3;
        carParksUiStateInteractor$uiStateFlow$1.L$3 = (lpt0) obj4;
        return carParksUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r901 r901Var = (r901) this.L$0;
        a68 a68Var = (a68) this.L$1;
        e68 e68Var = (e68) this.L$2;
        lpt0 lpt0Var = (lpt0) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new m68(r901Var, a68Var, e68Var, lpt0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
