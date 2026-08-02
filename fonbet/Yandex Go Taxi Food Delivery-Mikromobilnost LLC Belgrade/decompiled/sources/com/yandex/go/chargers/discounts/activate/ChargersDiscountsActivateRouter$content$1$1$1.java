package com.yandex.go.chargers.discounts.activate;

import defpackage.au9;
import defpackage.bu9;
import defpackage.c06;
import defpackage.cs8;
import defpackage.cu9;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.tt9;
import defpackage.vt9;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.discounts.activate.ChargersDiscountsActivateRouter$content$1$1$1", f = "ChargersDiscountsActivateRouter.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDiscountsActivateRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ cu9 $action;
    final /* synthetic */ tt9 $navigator;
    int label;
    final /* synthetic */ vt9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDiscountsActivateRouter$content$1$1$1(vt9 vt9Var, cu9 cu9Var, tt9 tt9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vt9Var;
        this.$action = cu9Var;
        this.$navigator = tt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersDiscountsActivateRouter$content$1$1$1(this.this$0, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersDiscountsActivateRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c06 c06Var = this.this$0.J;
        cu9 cu9Var = this.$action;
        tt9 tt9Var = this.$navigator;
        this.label = 1;
        c06Var.getClass();
        if (jl40.l(cu9Var, bu9.a)) {
            tt9Var.a.r(new qu(9));
            a = zy11Var;
        } else {
            if (!(cu9Var instanceof au9)) {
                w511.b();
                return null;
            }
            a = ((com.yandex.go.chargers.discounts.activate.domain.a) c06Var.b).a(((au9) cu9Var).a, new cs8(12, c06Var, tt9Var), this);
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
