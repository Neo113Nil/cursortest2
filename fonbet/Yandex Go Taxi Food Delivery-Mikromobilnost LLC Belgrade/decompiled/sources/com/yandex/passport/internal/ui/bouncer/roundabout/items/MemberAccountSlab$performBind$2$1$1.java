package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.n2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.items.MemberAccountSlab$performBind$2$1$1", f = "MemberAccountSlab.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MemberAccountSlab$performBind$2$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ a0 $data;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberAccountSlab$performBind$2$1$1(t tVar, a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = tVar;
        this.$data = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MemberAccountSlab$performBind$2$1$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        MemberAccountSlab$performBind$2$1$1 memberAccountSlab$performBind$2$1$1 = (MemberAccountSlab$performBind$2$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        memberAccountSlab$performBind$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.ui.bouncer.t tVar = this.this$0.F;
        a0 a0Var = this.$data;
        tVar.a(new n2(a0Var.a, a0Var.b));
        return zy11.a;
    }
}
