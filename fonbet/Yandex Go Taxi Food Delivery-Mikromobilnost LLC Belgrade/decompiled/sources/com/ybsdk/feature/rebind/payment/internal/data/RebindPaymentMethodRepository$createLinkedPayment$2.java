package com.ybsdk.feature.rebind.payment.internal.data;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodStatusDto;
import com.ybsdk.feature.rebind.payment.internal.network.RebindPaymentMethodApi;
import com.ybsdk.feature.rebind.payment.internal.network.dto.LinkedPaymentDto;
import com.ybsdk.feature.rebind.payment.internal.network.dto.LinkedPaymentRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.wpy;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lwpy;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodRepository$createLinkedPayment$2", f = "RebindPaymentMethodRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RebindPaymentMethodRepository$createLinkedPayment$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $paymentMethodId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lwpy;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodRepository$createLinkedPayment$2$1", f = "RebindPaymentMethodRepository.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.rebind.payment.internal.data.RebindPaymentMethodRepository$createLinkedPayment$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ String $paymentMethodId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.this$0 = aVar;
            this.$paymentMethodId = str;
            this.$token = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$paymentMethodId, this.$token, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                RebindPaymentMethodApi rebindPaymentMethodApi = this.this$0.a;
                LinkedPaymentRequest linkedPaymentRequest = new LinkedPaymentRequest(this.$paymentMethodId);
                String str = this.$token;
                this.label = 1;
                a = rebindPaymentMethodApi.a(str, linkedPaymentRequest, this);
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
            a aVar = this.this$0;
            Throwable a2 = Result.a(a);
            if (a2 == null) {
                LinkedPaymentDto linkedPaymentDto = (LinkedPaymentDto) a;
                if (linkedPaymentDto.getStatus() == RebindPaymentMethodStatusDto.FAILED) {
                    failure = new Result.Failure(new IllegalStateException("Error create linked payment"));
                } else {
                    aVar.getClass();
                    failure = new wpy(a.d(linkedPaymentDto.getStatus()), linkedPaymentDto.getPaymentId());
                }
            } else {
                failure = new Result.Failure(a2);
            }
            return new Result(failure);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RebindPaymentMethodRepository$createLinkedPayment$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$paymentMethodId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RebindPaymentMethodRepository$createLinkedPayment$2 rebindPaymentMethodRepository$createLinkedPayment$2 = new RebindPaymentMethodRepository$createLinkedPayment$2(this.this$0, this.$paymentMethodId, continuation);
        rebindPaymentMethodRepository$createLinkedPayment$2.L$0 = obj;
        return rebindPaymentMethodRepository$createLinkedPayment$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RebindPaymentMethodRepository$createLinkedPayment$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$paymentMethodId, (String) this.L$0, null);
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
