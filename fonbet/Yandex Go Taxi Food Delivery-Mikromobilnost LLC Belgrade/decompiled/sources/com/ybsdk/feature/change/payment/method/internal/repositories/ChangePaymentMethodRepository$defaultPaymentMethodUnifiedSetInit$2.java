package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.change.payment.method.internal.network.ChangePaymentMethodsApi;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetInitRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponse;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2", f = "ChangePaymentMethodRepository.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $parameters;
    final /* synthetic */ String $productId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1", f = "ChangePaymentMethodRepository.kt", l = {66, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ Map<String, String> $parameters;
        final /* synthetic */ String $productId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, Map map, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$token = str;
            this.$productId = str2;
            this.$parameters = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$token, this.$productId, this.$parameters, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        
            if (r8 == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r9 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                ChangePaymentMethodsApi changePaymentMethodsApi = this.this$0.a;
                String str = this.$token;
                DefaultPaymentMethodUnifiedSetInitRequest defaultPaymentMethodUnifiedSetInitRequest = new DefaultPaymentMethodUnifiedSetInitRequest(this.$productId, this.$parameters);
                this.label = 1;
                b = changePaymentMethodsApi.b(str, defaultPaymentMethodUnifiedSetInitRequest, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    failure = ((Result) obj).getValue();
                    return new Result(failure);
                }
                b.b(obj);
                b = ((Result) obj).getValue();
            }
            Throwable a = Result.a(b);
            if (a == null) {
                ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1(2, null);
                this.label = 2;
                failure = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) b, changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1, this);
            } else {
                failure = new Result.Failure(a);
            }
            return new Result(failure);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2(a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$productId = str;
        this.$parameters = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2(this.this$0, this.$productId, this.$parameters, continuation);
        changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2.L$0 = obj;
        return changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (String) this.L$0, this.$productId, this.$parameters, null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
