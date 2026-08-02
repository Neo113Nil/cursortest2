package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportChallengeRequiredException;
import com.yandex.passport.common.core.Uid;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.LogoutPerformer$performMethod$1", f = "LogoutPeformer.kt", l = {25, 29}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LogoutPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutPerformer$performMethod$1(s0 s0Var, Uid uid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s0Var;
        this.$uid = uid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogoutPerformer$performMethod$1(this.this$0, this.$uid, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogoutPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|2|(1:(1:(4:6|7|8|9)(2:11|12))(1:13))(1:47)|14|15|(2:27|(4:29|(1:31)(1:37)|32|(1:34)(2:35|36))(2:38|(2:40|41)(2:42|43)))(1:17)|18|(2:20|(1:22)(2:25|26))|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        r7 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x002d, code lost:
    
        if (r7 == r1) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.d0 d0Var = this.this$0.a;
            Uid uid = this.$uid;
            this.label = 1;
            obj = d0Var.a(uid, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                obj = value;
                return new Result(obj);
            }
            kotlin.b.b(obj);
        }
        if (!(obj instanceof com.yandex.passport.internal.usecase.c0)) {
            if (!(obj instanceof Result)) {
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                Field declaredField = obj.getClass().getDeclaredField(Constants.KEY_EXCEPTION);
                declaredField.setAccessible(true);
                throw ((Throwable) declaredField.get(obj));
            }
            Object value2 = ((Result) obj).getValue();
            kotlin.b.b(value2);
            if (value2 instanceof com.yandex.passport.internal.usecase.c0) {
                obj2 = value2;
            }
            com.yandex.passport.internal.usecase.c0 c0Var = (com.yandex.passport.internal.usecase.c0) obj2;
            if (c0Var == null) {
                throw new ClassCastException("Can't cast " + ((Object) Result.c(((Result) obj).getValue())) + " to " + qoi0.a(com.yandex.passport.internal.usecase.c0.class));
            }
            obj = c0Var;
        }
        s0 s0Var = this.this$0;
        Uid uid2 = this.$uid;
        if (!(obj instanceof Result.Failure)) {
            if (!(((com.yandex.passport.internal.usecase.c0) obj) instanceof com.yandex.passport.internal.usecase.b0)) {
                throw new PassportChallengeRequiredException(0);
            }
            com.yandex.passport.internal.usecase.v0 v0Var = s0Var.b;
            this.label = 2;
            obj = v0Var.a(uid2, this);
        }
        return new Result(obj);
    }
}
