package com.yandex.messaging.domain.statuses;

import defpackage.gu21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0k;
import defpackage.z6t;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgu21;", "userStatus", "Lo0k;", "kotlin.jvm.PlatformType", "displayUserData", "Lz6t;", "<anonymous>", "(Lgu21;Lo0k;)Lz6t;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.GetDndWarningUseCase$flowByUserId$1", f = "GetDndWarningUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetDndWarningUseCase$flowByUserId$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDndWarningUseCase$flowByUserId$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetDndWarningUseCase$flowByUserId$1 getDndWarningUseCase$flowByUserId$1 = new GetDndWarningUseCase$flowByUserId$1(this.this$0, (Continuation) obj3);
        getDndWarningUseCase$flowByUserId$1.L$0 = (gu21) obj;
        getDndWarningUseCase$flowByUserId$1.L$1 = (o0k) obj2;
        return getDndWarningUseCase$flowByUserId$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gu21 gu21Var = (gu21) this.L$0;
        o0k o0kVar = (o0k) this.L$1;
        if (gu21Var.a()) {
            return new z6t(o0kVar.a, gu21Var.b(this.this$0.a.getResources()), gu21Var.c);
        }
        return null;
    }
}
