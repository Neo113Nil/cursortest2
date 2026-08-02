package com.yandex.go.rida.bids.interactor;

import defpackage.bvf0;
import defpackage.f721;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xq5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2", f = "BidsLifecycleSubscriptionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 extends SuspendLambda implements wls {
    final /* synthetic */ xq5 $navigator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.rida.bids.interactor.BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$1", f = "BidsLifecycleSubscriptionsInteractor.kt", l = {18}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.rida.bids.interactor.BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ xq5 $navigator;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, xq5 xq5Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$navigator = xq5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$navigator, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                s sVar = this.this$0.a;
                xq5 xq5Var = this.$navigator;
                this.label = 1;
                if (sVar.c(xq5Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.rida.bids.interactor.BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$2", f = "BidsLifecycleSubscriptionsInteractor.kt", l = {22}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.rida.bids.interactor.BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f721 f721Var = this.this$0.b;
            this.label = 1;
            Object n = bvf0.n(new UpdateLocalBidsListInteractor$updateLocalBidsList$2(f721Var, null), this);
            if (n != coroutineSingletons) {
                n = zy11Var;
            }
            return n == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2(f fVar, xq5 xq5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$navigator = xq5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 bidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 = new BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2(this.this$0, this.$navigator, continuation);
        bidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2.L$0 = obj;
        return bidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 bidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2 = (BidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bidsLifecycleSubscriptionsInteractor$runOnResumedSubscriptions$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$navigator, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return zy11.a;
    }
}
