package com.ybsdk.common.repositiories.auth;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.saj;
import defpackage.t6f0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x8g;
import defpackage.zy11;
import io.appmetrica.analytics.push.AppMetricaPush;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.auth.AuthRepositoryImpl$1", f = "AuthRepositoryImpl.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthRepositoryImpl$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepositoryImpl$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthRepositoryImpl$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthRepositoryImpl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                f fVar = aVar2.o;
                this.L$0 = aVar2;
                this.label = 1;
                Object a = fVar.a(this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                aVar = aVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                kotlin.b.b(obj);
            }
            Long l = (Long) obj;
            AppMetricaPush.setPassportUidProvider(((x8g) ((com.ybsdk.feature.push.impl.a) aVar.g).a).a, new t6f0(14, l));
            aVar.c.j.updateAndGet(new saj(0, l));
            failure = zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            x4c.g("Failed to initialize auth uid dependent services", a2, null, null, 12);
        }
        return zy11Var;
    }
}
