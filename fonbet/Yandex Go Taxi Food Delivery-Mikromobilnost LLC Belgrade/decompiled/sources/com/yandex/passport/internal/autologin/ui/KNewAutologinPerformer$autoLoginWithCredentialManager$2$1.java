package com.yandex.passport.internal.autologin.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.autologin.ui.KNewAutologinPerformer$autoLoginWithCredentialManager$2$1", f = "KNewAutologinPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class KNewAutologinPerformer$autoLoginWithCredentialManager$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $th;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNewAutologinPerformer$autoLoginWithCredentialManager$2$1(j jVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$th = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KNewAutologinPerformer$autoLoginWithCredentialManager$2$1(this.this$0, this.$th, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        KNewAutologinPerformer$autoLoginWithCredentialManager$2$1 kNewAutologinPerformer$autoLoginWithCredentialManager$2$1 = (KNewAutologinPerformer$autoLoginWithCredentialManager$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        kNewAutologinPerformer$autoLoginWithCredentialManager$2$1.invokeSuspend(zy11Var);
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
        this.this$0.j.a(this.$th);
        return zy11.a;
    }
}
