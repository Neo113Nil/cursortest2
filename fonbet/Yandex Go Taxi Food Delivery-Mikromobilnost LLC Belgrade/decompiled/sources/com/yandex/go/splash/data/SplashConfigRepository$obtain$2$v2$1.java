package com.yandex.go.splash.data;

import com.yandex.go.splash.v2.g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.urt0;
import defpackage.wls;
import defpackage.zg2;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzg2;", "<anonymous>", "(Ltse;)Lzg2;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.data.SplashConfigRepository$obtain$2$v2$1", f = "SplashConfigRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SplashConfigRepository$obtain$2$v2$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashConfigRepository$obtain$2$v2$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SplashConfigRepository$obtain$2$v2$1 splashConfigRepository$obtain$2$v2$1 = new SplashConfigRepository$obtain$2$v2$1(this.this$0, continuation);
        splashConfigRepository$obtain$2$v2$1.L$0 = obj;
        return splashConfigRepository$obtain$2$v2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashConfigRepository$obtain$2$v2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                g gVar = (g) this.this$0.d.get();
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = gVar.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            urt0 urt0Var = (urt0) obj;
            failure = urt0Var != null ? new zg2(urt0Var) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return null;
        }
        return failure;
    }
}
