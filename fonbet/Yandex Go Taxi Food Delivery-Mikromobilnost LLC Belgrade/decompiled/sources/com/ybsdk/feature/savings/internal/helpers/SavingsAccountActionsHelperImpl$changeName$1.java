package com.ybsdk.feature.savings.internal.helpers;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.helpers.SavingsAccountActionsHelperImpl$changeName$1", f = "SavingsAccountActionsHelperImpl.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountActionsHelperImpl$changeName$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $newName;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountActionsHelperImpl$changeName$1(a aVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$agreementId = str;
        this.$idempotencyToken = str2;
        this.$newName = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsAccountActionsHelperImpl$changeName$1(this.this$0, this.$agreementId, this.$idempotencyToken, this.$newName, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsAccountActionsHelperImpl$changeName$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.b;
            String str = this.$agreementId;
            String str2 = this.$idempotencyToken;
            String str3 = this.$newName;
            this.label = 1;
            n = com.ybsdk.feature.savings.internal.data.b.n(bVar, str, str2, null, null, null, str3, null, this, 92);
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            n = ((Result) obj).getValue();
        }
        return new Result(n);
    }
}
