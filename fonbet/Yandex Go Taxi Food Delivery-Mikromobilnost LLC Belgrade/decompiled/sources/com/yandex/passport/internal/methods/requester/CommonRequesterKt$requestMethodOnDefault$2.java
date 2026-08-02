package com.yandex.passport.internal.methods.requester;

import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.x2;
import defpackage.g0c;
import defpackage.lfx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lkotlin/Result;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.requester.CommonRequesterKt$requestMethodOnDefault$2", f = "CommonRequester.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class CommonRequesterKt$requestMethodOnDefault$2 extends SuspendLambda implements wls {
    final /* synthetic */ lfx[] $expectedThrowables;
    final /* synthetic */ x2 $method;
    final /* synthetic */ f $this_requestMethodOnDefault;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRequesterKt$requestMethodOnDefault$2(f fVar, x2 x2Var, lfx[] lfxVarArr, Continuation continuation) {
        super(2, continuation);
        this.$this_requestMethodOnDefault = fVar;
        this.$method = x2Var;
        this.$expectedThrowables = lfxVarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommonRequesterKt$requestMethodOnDefault$2(this.$this_requestMethodOnDefault, this.$method, this.$expectedThrowables, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommonRequesterKt$requestMethodOnDefault$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        lfx[] lfxVarArr;
        lfx[] lfxVarArr2;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = this.$this_requestMethodOnDefault;
                x2 x2Var = this.$method;
                lfx[] lfxVarArr3 = this.$expectedThrowables;
                b bVar = new b(fVar, x2Var);
                zy11 zy11Var = zy11.a;
                this.L$0 = lfxVarArr3;
                this.label = 1;
                failure = bVar.a(zy11Var, this);
                if (failure == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lfxVarArr = lfxVarArr3;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lfxVarArr = (lfx[]) this.L$0;
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
            }
            lfxVarArr2 = (lfx[]) Arrays.copyOf(lfxVarArr, lfxVarArr.length);
            a = Result.a(failure);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (a == null) {
            return new Result(failure);
        }
        for (lfx lfxVar : lfxVarArr2) {
            if (((g0c) lfxVar).e(a)) {
                throw a;
            }
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "catch non-PassportException from provider", a);
        }
        throw new PassportRuntimeUnknownException(a);
    }
}
