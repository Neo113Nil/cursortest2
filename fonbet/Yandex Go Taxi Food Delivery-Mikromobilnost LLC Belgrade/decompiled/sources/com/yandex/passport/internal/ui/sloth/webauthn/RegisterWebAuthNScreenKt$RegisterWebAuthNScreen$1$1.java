package com.yandex.passport.internal.ui.sloth.webauthn;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/sloth/webauthn/q;", "effect", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/sloth/webauthn/q;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1", f = "RegisterWebAuthNScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onExit;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1(sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$onExit = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 = new RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1(this.$onExit, continuation);
        registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1.L$0 = obj;
        return registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 = (RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1) create((q) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1.invokeSuspend(zy11Var);
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
        if (jl40.l((q) this.L$0, q.a)) {
            this.$onExit.invoke();
            return zy11.a;
        }
        w511.b();
        return null;
    }
}
