package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import com.yandex.passport.internal.ui.bouncer.model.l2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.roundabout.items.PhonishSlab$performBind$2$1$1", f = "PhonishSlab.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PhonishSlab$performBind$2$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ b0 $data;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonishSlab$performBind$2$1$1(u uVar, b0 b0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = uVar;
        this.$data = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PhonishSlab$performBind$2$1$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PhonishSlab$performBind$2$1$1 phonishSlab$performBind$2$1$1 = (PhonishSlab$performBind$2$1$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        phonishSlab$performBind$2$1$1.invokeSuspend(zy11Var);
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
        this.this$0.E.a(new l2(this.$data.a, EmptyList.a));
        return zy11.a;
    }
}
