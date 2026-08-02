package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.m2;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.SetCurrentAccountPerformer$performMethod$1", f = "SetCurrentAccountPerformer.kt", l = {28, 30}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SetCurrentAccountPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ m2 $method;
    Object L$0;
    int label;
    final /* synthetic */ g1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCurrentAccountPerformer$performMethod$1(m2 m2Var, g1 g1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = m2Var;
        this.this$0 = g1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SetCurrentAccountPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SetCurrentAccountPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Uid B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            PassportUidImpl passportUidImpl = (PassportUidImpl) this.$method.b.c;
            B = passportUidImpl != null ? com.yandex.passport.internal.util.p.B(passportUidImpl) : null;
            g1 g1Var = this.this$0;
            this.L$0 = B;
            this.label = 1;
            failure = g1.b(g1Var, B, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                failure = value;
                return new Result(failure);
            }
            B = (Uid) this.L$0;
            kotlin.b.b(obj);
            failure = ((Result) obj).getValue();
        }
        g1 g1Var2 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            com.yandex.passport.internal.usecase.j1 j1Var = g1Var2.c;
            this.L$0 = null;
            this.label = 2;
            obj = j1Var.a(B, this);
        }
        return new Result(failure);
    }
}
