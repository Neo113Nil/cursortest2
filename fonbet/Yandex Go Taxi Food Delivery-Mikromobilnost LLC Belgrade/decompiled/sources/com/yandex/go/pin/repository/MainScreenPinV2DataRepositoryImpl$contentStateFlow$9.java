package com.yandex.go.pin.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", ClidProvider.STATE, "", "isTaxiMain", "<anonymous>", "(Lru/yandex/taxi/widget/map/SourceOnMapControl$a;Z)Lru/yandex/taxi/widget/map/SourceOnMapControl$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV2DataRepositoryImpl$contentStateFlow$9", f = "MainScreenPinV2DataRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainScreenPinV2DataRepositoryImpl$contentStateFlow$9 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MainScreenPinV2DataRepositoryImpl$contentStateFlow$9 mainScreenPinV2DataRepositoryImpl$contentStateFlow$9 = new MainScreenPinV2DataRepositoryImpl$contentStateFlow$9(3, (Continuation) obj3);
        mainScreenPinV2DataRepositoryImpl$contentStateFlow$9.L$0 = (SourceOnMapControl.a) obj;
        mainScreenPinV2DataRepositoryImpl$contentStateFlow$9.Z$0 = booleanValue;
        return mainScreenPinV2DataRepositoryImpl$contentStateFlow$9.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SourceOnMapControl.a aVar = (SourceOnMapControl.a) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return SourceOnMapControl.a.a(aVar, null, null, null, false, null, false, !z, null, 1919);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
