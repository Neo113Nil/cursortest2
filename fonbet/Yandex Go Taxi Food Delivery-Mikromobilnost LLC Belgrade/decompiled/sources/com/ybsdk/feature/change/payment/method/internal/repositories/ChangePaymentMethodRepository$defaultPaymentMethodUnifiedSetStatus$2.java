package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.change.payment.method.internal.network.ChangePaymentMethodsApi;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetStatusRequest;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Liyd0;", "Lahh;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2", f = "ChangePaymentMethodRepository.kt", l = {HProv.ALG_SID_KECCAK_224, 99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ Map<String, Object> $payload;
    final /* synthetic */ String $productId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$1", f = "ChangePaymentMethodRepository.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ int $attemptNumber;
        final /* synthetic */ Map<String, Object> $payload;
        final /* synthetic */ String $productId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, int i, String str2, Map map, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$token = str;
            this.$attemptNumber = i;
            this.$productId = str2;
            this.$payload = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$token, this.$attemptNumber, this.$productId, this.$payload, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                ChangePaymentMethodsApi changePaymentMethodsApi = this.this$0.a;
                String str = this.$token;
                int i2 = this.$attemptNumber;
                DefaultPaymentMethodUnifiedSetStatusRequest defaultPaymentMethodUnifiedSetStatusRequest = new DefaultPaymentMethodUnifiedSetStatusRequest(this.$productId, this.$payload);
                this.label = 1;
                a = changePaymentMethodsApi.a(str, i2, defaultPaymentMethodUnifiedSetStatusRequest, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2(a aVar, int i, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$attemptNumber = i;
        this.$productId = str;
        this.$payload = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2(this.this$0, this.$attemptNumber, this.$productId, this.$payload, continuation);
        changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2.L$0 = obj;
        return changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r14 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object failure;
        iyd0 iyd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (String) this.L$0, this.$attemptNumber, this.$productId, this.$payload, null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iyd0Var = (iyd0) this.L$0;
                b.b(obj);
                failure = ((Result) obj).getValue();
                if (!(failure instanceof Result.Failure)) {
                    failure = new iyd0(iyd0Var.b, failure);
                }
                return new Result(failure);
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        Throwable a = Result.a(c);
        if (a != null) {
            failure = new Result.Failure(a);
            return new Result(failure);
        }
        iyd0 iyd0Var2 = (iyd0) c;
        DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1(2, null);
        this.L$0 = iyd0Var2;
        this.label = 2;
        Object b = com.ybsdk.core.utils.dto.b.b(dataWithStatusResponse, changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1, this);
        if (b != coroutineSingletons) {
            failure = b;
            iyd0Var = iyd0Var2;
            if (!(failure instanceof Result.Failure)) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
