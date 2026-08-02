package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.PhonishAccountLinkedRequest;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcmt;", "Lzy11;", "<anonymous>", "(Ltse;)Lcmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2", f = "NotifyPhonishAccountLinkedInteractorImpl.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2 extends SuspendLambda implements wls {
    final /* synthetic */ PhonishAccountLinkedRequest $request;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcmt;", "Lzy11;", "<anonymous>", "(Ltse;)Lcmt;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments.shared.NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2$1", f = "NotifyPhonishAccountLinkedInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments.shared.NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ PhonishAccountLinkedRequest $request;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, PhonishAccountLinkedRequest phonishAccountLinkedRequest, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$request = phonishAccountLinkedRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$request, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return this.this$0.a.k(this.$request);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2(c cVar, PhonishAccountLinkedRequest phonishAccountLinkedRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$request = phonishAccountLinkedRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotifyPhonishAccountLinkedInteractorImpl$notifyAccountLinked$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o430 o430Var = e3n.b;
        long U = kp50.U(10, DurationUnit.SECONDS);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
        this.label = 1;
        Object v = kotlinx.coroutines.a.v(U, anonymousClass1, this);
        return v == coroutineSingletons ? coroutineSingletons : v;
    }
}
