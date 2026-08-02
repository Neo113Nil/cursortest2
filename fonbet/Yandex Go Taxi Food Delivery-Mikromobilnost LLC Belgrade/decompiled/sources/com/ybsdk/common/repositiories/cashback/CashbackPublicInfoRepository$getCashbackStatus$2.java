package com.ybsdk.common.repositiories.cashback;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.CashbackStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import defpackage.zzq0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lhf51;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.cashback.CashbackPublicInfoRepository$getCashbackStatus$2", f = "CashbackPublicInfoRepository.kt", l = {19, 24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CashbackPublicInfoRepository$getCashbackStatus$2 extends SuspendLambda implements tls {
    final /* synthetic */ YBProduct $product;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackPublicInfoRepository$getCashbackStatus$2(a aVar, YBProduct yBProduct, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$product = yBProduct;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CashbackPublicInfoRepository$getCashbackStatus$2(this.this$0, this.$product, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CashbackPublicInfoRepository$getCashbackStatus$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            Api api = this.this$0.a;
            CashbackStatusRequest cashbackStatusRequest = new CashbackStatusRequest(zzq0.a(this.$product));
            this.label = 1;
            i = api.i(cashbackStatusRequest, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            b.b(obj);
            i = ((Result) obj).getValue();
        }
        Throwable a = Result.a(i);
        if (a == null) {
            CashbackPublicInfoRepository$getCashbackStatus$2$1$1 cashbackPublicInfoRepository$getCashbackStatus$2$1$1 = new CashbackPublicInfoRepository$getCashbackStatus$2$1$1(2, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) i, cashbackPublicInfoRepository$getCashbackStatus$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
