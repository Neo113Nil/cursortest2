package com.yandex.plus.pay.internal.di;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/yandex/plus/pay/api/model/PlusPayGoogleBillingConfig;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.internal.di.PlusPaySdkComponentImpl$getInternalDependencies$7", f = "PlusPaySdkComponentImpl.kt", l = {263}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusPaySdkComponentImpl$getInternalDependencies$7 extends SuspendLambda implements tls {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPaySdkComponentImpl$getInternalDependencies$7(d dVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlusPaySdkComponentImpl$getInternalDependencies$7(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PlusPaySdkComponentImpl$getInternalDependencies$7) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.a aVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.a) this.this$0.e.j.getValue();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = aVar.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (TimeoutCancellationException e) {
            obj = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        if (obj instanceof Result.Failure) {
            return null;
        }
        return obj;
    }
}
