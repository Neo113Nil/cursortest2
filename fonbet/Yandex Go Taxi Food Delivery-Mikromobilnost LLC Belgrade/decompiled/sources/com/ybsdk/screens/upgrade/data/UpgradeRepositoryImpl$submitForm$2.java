package com.ybsdk.screens.upgrade.data;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationFormRequest;
import defpackage.ja21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ya21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.data.UpgradeRepositoryImpl$submitForm$2", f = "UpgradeRepositoryImpl.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeRepositoryImpl$submitForm$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ ja21 $form;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeRepositoryImpl$submitForm$2(a aVar, String str, ja21 ja21Var, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$applicationId = str;
        this.$form = ja21Var;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UpgradeRepositoryImpl$submitForm$2(this.this$0, this.$applicationId, this.$form, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((UpgradeRepositoryImpl$submitForm$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Api api = this.this$0.a;
            SimplifiedIdApplicationFormRequest simplifiedIdApplicationFormRequest = new SimplifiedIdApplicationFormRequest(this.$applicationId, ya21.a(this.$form));
            String str = this.$idempotencyToken;
            this.label = 1;
            t = api.t(simplifiedIdApplicationFormRequest, str, this);
            if (t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            t = ((Result) obj).getValue();
        }
        return new Result(t);
    }
}
