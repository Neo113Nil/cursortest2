package com.yandex.go.navigator.driving;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tjm;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "leftInJamTime", "streetName", "Ltjm;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;)Ltjm;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingBubbleStateInteractor$bubbleStateFlow$1", f = "DrivingBubbleStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingBubbleStateInteractor$bubbleStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DrivingBubbleStateInteractor$bubbleStateFlow$1 drivingBubbleStateInteractor$bubbleStateFlow$1 = new DrivingBubbleStateInteractor$bubbleStateFlow$1(3, (Continuation) obj3);
        drivingBubbleStateInteractor$bubbleStateFlow$1.L$0 = (String) obj;
        drivingBubbleStateInteractor$bubbleStateFlow$1.L$1 = (String) obj2;
        return drivingBubbleStateInteractor$bubbleStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (str == null) {
            str = str2;
        }
        return new tjm(str);
    }
}
