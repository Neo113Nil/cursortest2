package com.yandex.go.taxi.order.map;

import defpackage.e901;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isValidDistance", "isCarStoppedState", "Lzy11;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trackTriggerToShowBubble$2", f = "RoadObjectsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsInteractor$trackTriggerToShowBubble$2 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoadObjectsInteractor$trackTriggerToShowBubble$2(n nVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        RoadObjectsInteractor$trackTriggerToShowBubble$2 roadObjectsInteractor$trackTriggerToShowBubble$2 = new RoadObjectsInteractor$trackTriggerToShowBubble$2(this.this$0, (Continuation) obj3);
        roadObjectsInteractor$trackTriggerToShowBubble$2.Z$0 = booleanValue;
        roadObjectsInteractor$trackTriggerToShowBubble$2.Z$1 = booleanValue2;
        zy11 zy11Var = zy11.a;
        roadObjectsInteractor$trackTriggerToShowBubble$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        e901 e901Var;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z && z2) {
            r0 r0Var = this.this$0.b.a;
            do {
                value = r0Var.getValue();
                e901Var = (e901) value;
            } while (!r0Var.k(value, e901.a(e901Var, null, null, 0, null, e901.a.a(e901Var.e, true, 0.0f, null, 6), 15)));
        }
        return zy11.a;
    }
}
