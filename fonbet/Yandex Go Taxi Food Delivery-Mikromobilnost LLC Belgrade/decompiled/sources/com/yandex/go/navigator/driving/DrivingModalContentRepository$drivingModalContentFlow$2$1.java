package com.yandex.go.navigator.driving;

import defpackage.imm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yjm;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072&\u0010\u0004\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Triple;", "", "", "Ldme;", "<destruct>", "Limm;", "isCollapsed", "Lyjm;", "<anonymous>", "(Lkotlin/Triple;Limm;)Lyjm;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalContentRepository$drivingModalContentFlow$2$1", f = "DrivingModalContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalContentRepository$drivingModalContentFlow$2$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DrivingModalContentRepository$drivingModalContentFlow$2$1 drivingModalContentRepository$drivingModalContentFlow$2$1 = new DrivingModalContentRepository$drivingModalContentFlow$2$1(3, (Continuation) obj3);
        drivingModalContentRepository$drivingModalContentFlow$2$1.L$0 = (Triple) obj;
        drivingModalContentRepository$drivingModalContentFlow$2$1.L$1 = (imm) obj2;
        return drivingModalContentRepository$drivingModalContentFlow$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Triple triple = (Triple) this.L$0;
        imm immVar = (imm) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new yjm(immVar, (String) triple.getFirst(), (List) triple.getSecond(), (List) triple.getThird());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
