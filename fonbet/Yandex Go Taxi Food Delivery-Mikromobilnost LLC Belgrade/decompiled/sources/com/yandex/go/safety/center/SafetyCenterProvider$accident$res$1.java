package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.AccidentsResponse;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/safety/center/api/AccidentsResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/go/safety/center/api/AccidentsResponse;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider$accident$res$1", f = "SafetyCenterProvider.kt", l = {258}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$accident$res$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$accident$res$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterProvider$accident$res$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterProvider$accident$res$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        j jVar = this.this$0;
        cmt<AccidentsResponse> d = jVar.a.d(jVar.d.b);
        this.label = 1;
        Object a = ru.yandex.taxi.network.api.a.a(d, null, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
