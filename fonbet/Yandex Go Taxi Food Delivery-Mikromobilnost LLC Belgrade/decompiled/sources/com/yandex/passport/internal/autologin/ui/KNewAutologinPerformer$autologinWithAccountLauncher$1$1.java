package com.yandex.passport.internal.autologin.ui;

import com.yandex.passport.api.PassportUidImpl;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.autologin.ui.KNewAutologinPerformer$autologinWithAccountLauncher$1$1", f = "KNewAutologinPerformer.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class KNewAutologinPerformer$autologinWithAccountLauncher$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Result<PassportUidImpl> $it;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNewAutologinPerformer$autologinWithAccountLauncher$1$1(Result result, j jVar, Continuation continuation) {
        super(2, continuation);
        this.$it = result;
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KNewAutologinPerformer$autologinWithAccountLauncher$1$1(this.$it, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KNewAutologinPerformer$autologinWithAccountLauncher$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object value = this.$it.getValue();
            j jVar = this.this$0;
            Throwable a = Result.a(value);
            if (a == null) {
                com.yandex.passport.internal.impl.f fVar = jVar.d;
                this.label = 1;
                failure = fVar.g((PassportUidImpl) value, this);
                if (failure == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                failure = new Result.Failure(a);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            failure = ((Result) obj).getValue();
        }
        j.c(this.this$0, failure);
        return zy11.a;
    }
}
