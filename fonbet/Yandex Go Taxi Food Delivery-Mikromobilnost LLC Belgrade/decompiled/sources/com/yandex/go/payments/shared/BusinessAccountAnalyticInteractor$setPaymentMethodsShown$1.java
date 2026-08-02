package com.yandex.go.payments.shared;

import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.nea0;
import defpackage.nj0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1", f = "BusinessAccountAnalyticInteractor.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ SharedPaymentsOpenReason $openReason;
    final /* synthetic */ List<nea0> $paymentModels;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.shared.BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1$1", f = "BusinessAccountAnalyticInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.shared.BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ SharedPaymentsOpenReason $openReason;
        final /* synthetic */ List<nea0> $paymentModels;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, SharedPaymentsOpenReason sharedPaymentsOpenReason, List list, Continuation continuation) {
            super(2, continuation);
            this.$paymentModels = list;
            this.this$0 = aVar;
            this.$openReason = sharedPaymentsOpenReason;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$openReason, this.$paymentModels, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SharedPaymentsOpenReason sharedPaymentsOpenReason;
            Iterator it;
            a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                List<nea0> list = this.$paymentModels;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof nj0) {
                        arrayList.add(obj2);
                    }
                }
                a aVar2 = this.this$0;
                sharedPaymentsOpenReason = this.$openReason;
                it = arrayList.iterator();
                aVar = aVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$3;
                sharedPaymentsOpenReason = (SharedPaymentsOpenReason) this.L$2;
                aVar = (a) this.L$1;
                kotlin.b.b(obj);
            }
            while (it.hasNext()) {
                if (((nj0) it.next()).a == SharedAccountType.BUSINESS) {
                    aVar.c.b.set(true);
                    aVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1$1$1$1 businessAccountAnalyticInteractor$setPaymentMethodsShown$1$1$1$1 = new BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1$1$1$1(aVar, sharedPaymentsOpenReason, null);
                    this.L$0 = null;
                    this.L$1 = aVar;
                    this.L$2 = sharedPaymentsOpenReason;
                    this.L$3 = it;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 1;
                    if (tje.k0(g6uVar, businessAccountAnalyticInteractor$setPaymentMethodsShown$1$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1(a aVar, SharedPaymentsOpenReason sharedPaymentsOpenReason, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$paymentModels = list;
        this.$openReason = sharedPaymentsOpenReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1(this.this$0, this.$openReason, this.$paymentModels, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessAccountAnalyticInteractor$setPaymentMethodsShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$openReason, this.$paymentModels, null);
            this.label = 1;
            if (tje.k0(sjhVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
