package com.ybsdk.feature.change.payment.method.internal.domain;

import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetInitResponse;
import defpackage.d6v;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lahh;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.domain.DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2", f = "DefaultPaymentMethodUnifiedSetInteractor.kt", l = {40, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;
    final /* synthetic */ d6v $idempotencyTokenProvider;
    final /* synthetic */ DefaultPaymentMethodUnifiedSetInitResponse $initResponse;
    final /* synthetic */ String $productId;
    /* synthetic */ int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2(a aVar, String str, DefaultPaymentMethodUnifiedSetInitResponse defaultPaymentMethodUnifiedSetInitResponse, d6v d6vVar, y6f0 y6f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$productId = str;
        this.$initResponse = defaultPaymentMethodUnifiedSetInitResponse;
        this.$idempotencyTokenProvider = d6vVar;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 = new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2(this.this$0, this.$productId, this.$initResponse, this.$idempotencyTokenProvider, this.$$this$channelFlow, continuation);
        defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2.I$0 = ((tq11) obj).a;
        return defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 = new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2(this.this$0, this.$productId, this.$initResponse, this.$idempotencyTokenProvider, this.$$this$channelFlow, (Continuation) obj2);
        defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2.I$0 = i;
        return defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (((defpackage.x6f0) r10).y.o(r1, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r9 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.change.payment.method.internal.repositories.a aVar = this.this$0.a;
            String str = this.$productId;
            Map<String, Object> pollingPayload = this.$initResponse.getPollingPayload();
            d6v d6vVar = this.$idempotencyTokenProvider;
            this.label = 1;
            defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 = this;
            b = aVar.b(str, pollingPayload, i2, d6vVar, defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b = this.L$0;
                b.b(obj);
                return new Result(b);
            }
            b.b(obj);
            defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2 = this;
            b = ((Result) obj).getValue();
        }
        y6f0 y6f0Var = defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2.$$this$channelFlow;
        if (!(b instanceof Result.Failure)) {
            Object obj2 = ((iyd0) b).a;
            defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2.L$0 = b;
            defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2.label = 2;
        }
        return new Result(b);
    }
}
