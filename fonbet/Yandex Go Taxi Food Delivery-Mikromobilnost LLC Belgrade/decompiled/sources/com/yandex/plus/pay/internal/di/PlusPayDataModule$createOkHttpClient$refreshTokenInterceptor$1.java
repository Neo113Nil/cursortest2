package com.yandex.plus.pay.internal.di;

import com.adjust.sdk.Constants;
import defpackage.dbd0;
import defpackage.hj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.internal.di.PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1", f = "PlusPayDataModule.kt", l = {Constants.MINIMAL_ERROR_STATUS_CODE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ dbd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1(dbd0 dbd0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dbd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.domain.auth.impl.a aVar = this.this$0.a.t;
            if (!(aVar.h.getValue() instanceof hj)) {
                aVar = null;
            }
            if (aVar == null) {
                return null;
            }
            this.label = 1;
            b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return (String) (b instanceof Result.Failure ? null : b);
    }
}
