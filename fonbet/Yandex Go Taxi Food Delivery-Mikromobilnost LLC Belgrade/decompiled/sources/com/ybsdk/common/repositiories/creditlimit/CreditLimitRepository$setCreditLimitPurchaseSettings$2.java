package com.ybsdk.common.repositiories.creditlimit;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.creditlimit.CreditLimitSetSettingsRequest;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.creditlimit.CreditLimitRepository$setCreditLimitPurchaseSettings$2", f = "CreditLimitRepository.kt", l = {HProv.PP_RESERVED1, 99}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreditLimitRepository$setCreditLimitPurchaseSettings$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ CreditLimitSetSettingsRequest $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLimitRepository$setCreditLimitPurchaseSettings$2(a aVar, String str, CreditLimitSetSettingsRequest creditLimitSetSettingsRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$request = creditLimitSetSettingsRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CreditLimitRepository$setCreditLimitPurchaseSettings$2(this.this$0, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CreditLimitRepository$setCreditLimitPurchaseSettings$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object E;
        Object failure;
        Throwable a;
        Object failure2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Api api = this.this$0.a;
            String str = this.$idempotencyToken;
            CreditLimitSetSettingsRequest creditLimitSetSettingsRequest = this.$request;
            this.label = 1;
            E = api.E(str, creditLimitSetSettingsRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                a = Result.a(failure);
                if (a != null) {
                    dqg dqgVar = (dqg) failure;
                    if (dqgVar instanceof bqg) {
                        failure2 = new Result.Failure(new Exception(((bqg) dqgVar).a));
                    } else {
                        if (!(dqgVar instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        failure2 = ((cqg) dqgVar).a;
                    }
                } else {
                    failure2 = new Result.Failure(a);
                }
                return new Result(failure2);
            }
            b.b(obj);
            E = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(E);
        if (a2 == null) {
            CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1 creditLimitRepository$setCreditLimitPurchaseSettings$2$1$1 = new CreditLimitRepository$setCreditLimitPurchaseSettings$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) E, creditLimitRepository$setCreditLimitPurchaseSettings$2$1$1, this);
        } else {
            failure = new Result.Failure(a2);
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return new Result(failure2);
    }
}
