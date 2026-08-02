package com.ybsdk.feature.change.payment.method.internal.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.change.payment.method.internal.data.DefaultPaymentMethodUnifiedStatusEntity;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetInitResponse;
import com.ybsdk.utils.poller.c;
import defpackage.ahh;
import defpackage.d6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xgb1;
import defpackage.y6f0;
import defpackage.zy11;
import defpackage.zzd0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lahh;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.domain.DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1", f = "DefaultPaymentMethodUnifiedSetInteractor.kt", l = {24, 35, 53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 65}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1 extends SuspendLambda implements wls {
    final /* synthetic */ d6v $idempotencyTokenProvider;
    final /* synthetic */ Map<String, String> $parameters;
    final /* synthetic */ String $productId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1(a aVar, String str, Map map, d6v d6vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$productId = str;
        this.$parameters = map;
        this.$idempotencyTokenProvider = d6vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1 defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1 = new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1(this.this$0, this.$productId, this.$parameters, this.$idempotencyTokenProvider, continuation);
        defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1.L$0 = obj;
        return defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        if (((defpackage.x6f0) r2).y.o(r6, r16) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (((defpackage.x6f0) r14).y.o(r2, r16) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        if (((defpackage.x6f0) r14).y.o(r4, r16) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r7 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var;
        Object a;
        Object e;
        y6f0 y6f0Var2;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6f0Var = (y6f0) this.L$0;
            com.ybsdk.feature.change.payment.method.internal.repositories.a aVar = this.this$0.a;
            String str = this.$productId;
            Map<String, String> map = this.$parameters;
            d6v d6vVar = this.$idempotencyTokenProvider;
            this.L$0 = y6f0Var;
            this.label = 1;
            a = aVar.a(str, map, d6vVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6f0Var2 = (y6f0) this.L$0;
                        b.b(obj);
                        e = ((Result) obj).getValue();
                        a2 = Result.a(e);
                        if (a2 != null) {
                            ahh ahhVar = new ahh(DefaultPaymentMethodUnifiedStatusEntity.FAILED, null, null, a2.getMessage());
                            this.L$0 = e;
                            this.label = 4;
                        }
                        return zy11.a;
                    }
                    if (i != 4 && i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                b.b(obj);
                return zy11.a;
            }
            y6f0Var = (y6f0) this.L$0;
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        y6f0 y6f0Var3 = y6f0Var;
        a aVar2 = this.this$0;
        String str2 = this.$productId;
        d6v d6vVar2 = this.$idempotencyTokenProvider;
        Throwable a3 = Result.a(a);
        if (a3 == null) {
            DefaultPaymentMethodUnifiedSetInitResponse defaultPaymentMethodUnifiedSetInitResponse = (DefaultPaymentMethodUnifiedSetInitResponse) a;
            ahh f = xgb1.f(defaultPaymentMethodUnifiedSetInitResponse.getResult());
            DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity = f.a;
            if (defaultPaymentMethodUnifiedStatusEntity == DefaultPaymentMethodUnifiedStatusEntity.FINISHED || defaultPaymentMethodUnifiedStatusEntity == DefaultPaymentMethodUnifiedStatusEntity.FAILED) {
                this.L$0 = null;
                this.label = 2;
            } else {
                c c = aVar2.b.c(zzd0.b, new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1(2, null), new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$2(aVar2, str2, defaultPaymentMethodUnifiedSetInitResponse, d6vVar2, y6f0Var3, null));
                this.L$0 = y6f0Var3;
                this.label = 3;
                e = c.e(this);
                if (e != coroutineSingletons) {
                    y6f0Var2 = y6f0Var3;
                    a2 = Result.a(e);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
            }
            return coroutineSingletons;
        }
        ahh ahhVar2 = new ahh(DefaultPaymentMethodUnifiedStatusEntity.FAILED, null, null, a3.getMessage());
        this.L$0 = null;
        this.label = 5;
    }
}
