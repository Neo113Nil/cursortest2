package com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wte;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.CorpAccountEmployeeAccessInfoModalRouter$onLaunch$1", f = "CorpAccountEmployeeAccessInfoModalRouter.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CorpAccountEmployeeAccessInfoModalRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ wte $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpAccountEmployeeAccessInfoModalRouter$onLaunch$1(a aVar, wte wteVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = wteVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpAccountEmployeeAccessInfoModalRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpAccountEmployeeAccessInfoModalRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.domain.a aVar = this.this$0.J;
            wte wteVar = this.$payload;
            this.label = 1;
            if (aVar.b(wteVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        o61 o61Var = this.this$0.I;
        o61Var.getClass();
        o61Var.a.a("B2BAccountFlow.EmployeeAccessInfoModal.Shown", new HashMap(), 1, new HashMap());
        return zy11.a;
    }
}
