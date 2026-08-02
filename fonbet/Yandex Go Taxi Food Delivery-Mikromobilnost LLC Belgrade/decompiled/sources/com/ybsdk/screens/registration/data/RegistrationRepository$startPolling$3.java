package com.ybsdk.screens.registration.data;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationStatusRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tq11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "attempNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.data.RegistrationRepository$startPolling$3", f = "RegistrationRepository.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationRepository$startPolling$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.screens.registration.data.RegistrationRepository$startPolling$3$1", f = "RegistrationRepository.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.screens.registration.data.RegistrationRepository$startPolling$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ String $applicationId;
        final /* synthetic */ int $attempNumber;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, String str, int i, Continuation continuation) {
            super(1, continuation);
            this.this$0 = cVar;
            this.$applicationId = str;
            this.$attempNumber = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$applicationId, this.$attempNumber, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                Api api = this.this$0.a;
                ApplicationStatusRequest applicationStatusRequest = new ApplicationStatusRequest(this.$applicationId);
                int i2 = this.$attempNumber;
                this.label = 1;
                b = api.b(applicationStatusRequest, i2, this);
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
            return new Result(b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationRepository$startPolling$3(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RegistrationRepository$startPolling$3 registrationRepository$startPolling$3 = new RegistrationRepository$startPolling$3(this.this$0, this.$applicationId, continuation);
        registrationRepository$startPolling$3.I$0 = ((tq11) obj).a;
        return registrationRepository$startPolling$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        RegistrationRepository$startPolling$3 registrationRepository$startPolling$3 = new RegistrationRepository$startPolling$3(this.this$0, this.$applicationId, (Continuation) obj2);
        registrationRepository$startPolling$3.I$0 = i;
        return registrationRepository$startPolling$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$applicationId, this.I$0, null);
            this.label = 1;
            c = com.ybsdk.core.utils.ext.c.c(anonymousClass1, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
