package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.l2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.items.AccountSlab$performBind$2$1$1", f = "AccountSlab.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AccountSlab$performBind$2$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ z $data;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSlab$performBind$2$1$1(c cVar, z zVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = cVar;
        this.$data = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AccountSlab$performBind$2$1$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AccountSlab$performBind$2$1$1 accountSlab$performBind$2$1$1 = (AccountSlab$performBind$2$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        accountSlab$performBind$2$1$1.invokeSuspend(zy11Var);
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
        z zVar = this.$data;
        tVar.a(new l2(zVar.a, zVar.j));
        return zy11.a;
    }
}
