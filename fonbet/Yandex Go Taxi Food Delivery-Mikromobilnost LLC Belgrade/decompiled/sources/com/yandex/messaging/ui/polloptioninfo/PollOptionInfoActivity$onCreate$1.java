package com.yandex.messaging.ui.polloptioninfo;

import defpackage.ccg;
import defpackage.f9t;
import defpackage.fy30;
import defpackage.i5m;
import defpackage.kt11;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.qs11;
import defpackage.qxd0;
import defpackage.v8c0;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkt11;", "profile", "Lzy11;", "<anonymous>", "(Lkt11;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.polloptioninfo.PollOptionInfoActivity$onCreate$1", f = "PollOptionInfoActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PollOptionInfoActivity$onCreate$1 extends SuspendLambda implements wls {
    final /* synthetic */ qxd0 $args;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PollOptionInfoActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollOptionInfoActivity$onCreate$1(PollOptionInfoActivity pollOptionInfoActivity, qxd0 qxd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pollOptionInfoActivity;
        this.$args = qxd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollOptionInfoActivity$onCreate$1 pollOptionInfoActivity$onCreate$1 = new PollOptionInfoActivity$onCreate$1(this.this$0, this.$args, continuation);
        pollOptionInfoActivity$onCreate$1.L$0 = obj;
        return pollOptionInfoActivity$onCreate$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PollOptionInfoActivity$onCreate$1 pollOptionInfoActivity$onCreate$1 = (PollOptionInfoActivity$onCreate$1) create((kt11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pollOptionInfoActivity$onCreate$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qs11 ui;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ccg ccgVar = ((ccg) ((kt11) this.L$0)).b;
        PollOptionInfoActivity pollOptionInfoActivity = this.this$0;
        pollOptionInfoActivity.getClass();
        qxd0 qxd0Var = this.$args;
        qxd0Var.getClass();
        n3w a = n3w.a(pollOptionInfoActivity);
        xvf0 b = i5m.b(new fy30(i5m.b(new v8c0(a, 2)), a, i5m.b(new f9t(ccgVar.G, ccgVar.j, 5)), n3w.a(qxd0Var), ccgVar.U, ccgVar.G, ccgVar.B, ccgVar.b0, 12));
        ui = this.this$0.getUi();
        ui.c.a((a) b.get());
        return zy11.a;
    }
}
