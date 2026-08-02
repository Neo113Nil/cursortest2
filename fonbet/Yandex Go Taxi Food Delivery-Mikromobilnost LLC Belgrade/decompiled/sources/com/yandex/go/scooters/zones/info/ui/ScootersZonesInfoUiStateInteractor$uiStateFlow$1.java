package com.yandex.go.scooters.zones.info.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.x9p0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx9p0;", "infoScreen", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "<anonymous>", "(Lx9p0;Lru/yandex/taxi/theme/ThemeType;)Lx9p0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.info.ui.ScootersZonesInfoUiStateInteractor$uiStateFlow$1", f = "ScootersZonesInfoUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesInfoUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersZonesInfoUiStateInteractor$uiStateFlow$1 scootersZonesInfoUiStateInteractor$uiStateFlow$1 = new ScootersZonesInfoUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        scootersZonesInfoUiStateInteractor$uiStateFlow$1.L$0 = (x9p0) obj;
        return scootersZonesInfoUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x9p0 x9p0Var = (x9p0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return x9p0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
