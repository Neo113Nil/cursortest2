package com.yandex.payment.divkit.usecases;

import defpackage.bgc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.yv90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly6f0;", "Lqyj0;", "", "Lfq4;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.SbpUseCaseImpl$getFullBanks$1", f = "SbpUseCaseImpl.kt", l = {143}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class SbpUseCaseImpl$getFullBanks$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpUseCaseImpl$getFullBanks$1(t tVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpUseCaseImpl$getFullBanks$1 sbpUseCaseImpl$getFullBanks$1 = new SbpUseCaseImpl$getFullBanks$1(this.this$0, continuation);
        sbpUseCaseImpl$getFullBanks$1.L$0 = obj;
        return sbpUseCaseImpl$getFullBanks$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpUseCaseImpl$getFullBanks$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String string = this.this$0.c.getString("com.yandex.payment.LAST_USED_BANK_SCHEME", null);
            ((yv90) this.this$0.b).b(new o8g0(y6f0Var, string));
            bgc bgcVar = new bgc(12);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bgcVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
