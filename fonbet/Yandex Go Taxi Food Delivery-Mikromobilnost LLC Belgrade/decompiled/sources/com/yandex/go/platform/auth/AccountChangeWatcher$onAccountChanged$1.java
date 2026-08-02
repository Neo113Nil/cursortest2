package com.yandex.go.platform.auth;

import defpackage.g6u;
import defpackage.mb20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.auth.AccountChangeWatcher$onAccountChanged$1", f = "AccountChangeWatcher.kt", l = {30, 38}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AccountChangeWatcher$onAccountChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $shouldRetry;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountChangeWatcher$onAccountChanged$1(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$shouldRetry = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountChangeWatcher$onAccountChanged$1(this.this$0, this.$shouldRetry, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountChangeWatcher$onAccountChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.b.getClass();
        } else if (i == 1) {
            b.b(obj);
            Object value = ((Result) obj).getValue();
            a aVar = this.this$0;
            boolean z = this.$shouldRetry;
            Throwable a = Result.a(value);
            if (a != null) {
                ((mb20) aVar.e).a("AccountChangeWatcher", "Loguout failure", a);
                if (z) {
                    aVar.a(false);
                }
            }
            a aVar2 = this.this$0;
            if (!(value instanceof Result.Failure)) {
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AccountChangeWatcher$onAccountChanged$1$2$1 accountChangeWatcher$onAccountChanged$1$2$1 = new AccountChangeWatcher$onAccountChanged$1$2$1(aVar2, null);
                this.L$0 = value;
                this.label = 2;
                if (tje.k0(g6uVar, accountChangeWatcher$onAccountChanged$1$2$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
