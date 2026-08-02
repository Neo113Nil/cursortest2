package com.yandex.go.pin.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isMain", "isShortcuts"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.pin.repository.MainPinStyleRepositoryImpl$tariffSelectionFlow$3", f = "MainPinStyleRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainPinStyleRepositoryImpl$tariffSelectionFlow$3 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        MainPinStyleRepositoryImpl$tariffSelectionFlow$3 mainPinStyleRepositoryImpl$tariffSelectionFlow$3 = new MainPinStyleRepositoryImpl$tariffSelectionFlow$3(3, (Continuation) obj3);
        mainPinStyleRepositoryImpl$tariffSelectionFlow$3.Z$0 = booleanValue;
        mainPinStyleRepositoryImpl$tariffSelectionFlow$3.Z$1 = booleanValue2;
        return mainPinStyleRepositoryImpl$tariffSelectionFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z && z2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
