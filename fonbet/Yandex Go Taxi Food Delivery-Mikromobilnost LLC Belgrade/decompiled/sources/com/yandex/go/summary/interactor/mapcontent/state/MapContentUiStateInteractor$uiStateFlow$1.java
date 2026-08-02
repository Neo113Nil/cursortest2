package com.yandex.go.summary.interactor.mapcontent.state;

import defpackage.mvg;
import defpackage.nww0;
import defpackage.ny61;
import defpackage.ug00;
import defpackage.z91;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz91;", "addressesUiState", "Lnww0;", "surgeWidgetUiState", "Lug00;", "<anonymous>", "(Lz91;Lnww0;)Lug00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.mapcontent.state.MapContentUiStateInteractor$uiStateFlow$1", f = "MapContentUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapContentUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MapContentUiStateInteractor$uiStateFlow$1 mapContentUiStateInteractor$uiStateFlow$1 = new MapContentUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        mapContentUiStateInteractor$uiStateFlow$1.L$0 = (z91) obj;
        mapContentUiStateInteractor$uiStateFlow$1.L$1 = (nww0) obj2;
        return mapContentUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z91 z91Var = (z91) this.L$0;
        nww0 nww0Var = (nww0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new ug00(z91Var, nww0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
