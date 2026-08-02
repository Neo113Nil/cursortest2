package com.yandex.go.navigator.map_interactions.parkings;

import com.yandex.go.address.models.Address;
import defpackage.d68;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x58;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "", "Lcom/yandex/go/address/models/Address;", "title", "Ld68;", "carParkSearchResult", "Lx58;", "<anonymous>", "(Lkotlin/Pair;Ld68;)Lx58;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.CarParksUiStateInteractor$contentFlow$4", f = "CarParksUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksUiStateInteractor$contentFlow$4 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CarParksUiStateInteractor$contentFlow$4 carParksUiStateInteractor$contentFlow$4 = new CarParksUiStateInteractor$contentFlow$4(3, (Continuation) obj3);
        carParksUiStateInteractor$contentFlow$4.L$0 = (Pair) obj;
        carParksUiStateInteractor$contentFlow$4.L$1 = (d68) obj2;
        return carParksUiStateInteractor$contentFlow$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        d68 d68Var = (d68) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new x58(d68Var != null ? d68Var.a : null, (String) pair.c(), (Address) pair.f(), d68Var != null ? d68Var.b : null, d68Var != null ? d68Var.c : null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
