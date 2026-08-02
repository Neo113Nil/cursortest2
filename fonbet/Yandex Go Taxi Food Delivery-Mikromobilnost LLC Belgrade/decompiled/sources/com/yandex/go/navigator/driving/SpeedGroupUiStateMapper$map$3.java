package com.yandex.go.navigator.driving;

import com.yandex.mapkit.navigation.automotive.SpeedLimitStatus;
import defpackage.bms;
import defpackage.lpt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "currentSpeed", "speedLimit", "Lcom/yandex/mapkit/navigation/automotive/SpeedLimitStatus;", "speedLimitStatus", "Llpt0;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/mapkit/navigation/automotive/SpeedLimitStatus;)Llpt0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.SpeedGroupUiStateMapper$map$3", f = "SpeedGroupUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SpeedGroupUiStateMapper$map$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SpeedGroupUiStateMapper$map$3 speedGroupUiStateMapper$map$3 = new SpeedGroupUiStateMapper$map$3(4, (Continuation) obj4);
        speedGroupUiStateMapper$map$3.L$0 = (String) obj;
        speedGroupUiStateMapper$map$3.L$1 = (String) obj2;
        speedGroupUiStateMapper$map$3.L$2 = (SpeedLimitStatus) obj3;
        return speedGroupUiStateMapper$map$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        SpeedLimitStatus speedLimitStatus = (SpeedLimitStatus) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new lpt0(str, str2, speedLimitStatus != SpeedLimitStatus.BELOW_LIMIT);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
