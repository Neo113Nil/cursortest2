package com.yandex.go.navigator.favorites.building_card;

import defpackage.at6;
import defpackage.bms;
import defpackage.e68;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.os6;
import defpackage.r901;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr901;", "trafficState", "Los6;", "contentState", "Le68;", "carParksState", "Lat6;", "<anonymous>", "(Lr901;Los6;Le68;)Lat6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.favorites.building_card.BuildingCardUiStateInteractor$uiStateFlow$1", f = "BuildingCardUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BuildingCardUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BuildingCardUiStateInteractor$uiStateFlow$1 buildingCardUiStateInteractor$uiStateFlow$1 = new BuildingCardUiStateInteractor$uiStateFlow$1(4, (Continuation) obj4);
        buildingCardUiStateInteractor$uiStateFlow$1.L$0 = (r901) obj;
        buildingCardUiStateInteractor$uiStateFlow$1.L$1 = (os6) obj2;
        buildingCardUiStateInteractor$uiStateFlow$1.L$2 = (e68) obj3;
        return buildingCardUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r901 r901Var = (r901) this.L$0;
        os6 os6Var = (os6) this.L$1;
        e68 e68Var = (e68) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new at6(r901Var, os6Var, e68Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
