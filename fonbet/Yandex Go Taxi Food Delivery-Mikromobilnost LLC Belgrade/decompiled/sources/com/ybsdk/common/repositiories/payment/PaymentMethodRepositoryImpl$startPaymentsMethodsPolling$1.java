package com.ybsdk.common.repositiories.payment;

import com.ybsdk.network.Api;
import com.ybsdk.network.dto.WalletsInfoResponse;
import com.ybsdk.utils.poller.c;
import defpackage.e5z0;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.m0e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1", f = "PaymentMethodRepositoryImpl.kt", l = {229, 232, 233, 233}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/ybsdk/network/dto/WalletsInfoResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1$1", f = "PaymentMethodRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((WalletsInfoResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(!jl40.l(((WalletsInfoResponse) this.L$0).getShouldPoll(), Boolean.TRUE));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/network/dto/WalletsInfoResponse;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1$2", f = "PaymentMethodRepositoryImpl.kt", l = {226}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.I$0 = ((tq11) obj).a;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            int i = ((tq11) obj).a;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj2);
            anonymousClass2.I$0 = i;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                int i2 = this.I$0;
                Api api = this.this$0.b;
                this.label = 1;
                c = api.c(i2, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodRepositoryImpl$startPaymentsMethodsPolling$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        if (r1.emit(r12, r11) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r12 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        b bVar;
        WalletsInfoResponse walletsInfoResponse;
        Object h;
        lz40 lz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c c = this.this$0.f.c(m0e0.b, new AnonymousClass1(2, null), new AnonymousClass2(this.this$0, null));
            this.label = 1;
            e = c.e(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        } else {
            if (i == 2) {
                walletsInfoResponse = (WalletsInfoResponse) this.L$1;
                bVar = (b) this.L$0;
                kotlin.b.b(obj);
                n0 n0Var = bVar.j;
                this.L$0 = n0Var;
                this.L$1 = null;
                this.label = 3;
                h = bVar.h(walletsInfoResponse, this);
                if (h != coroutineSingletons) {
                    lz40Var = n0Var;
                    obj = h;
                    this.L$0 = null;
                    this.label = 4;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lz40Var = (lz40) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 4;
        }
        b bVar2 = this.this$0;
        Throwable a = Result.a(e);
        if (a != null) {
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("PaymentMethodRepository");
            e5z0Var.a("payment methods polling error " + a, new Object[0]);
            return zy11.a;
        }
        WalletsInfoResponse walletsInfoResponse2 = (WalletsInfoResponse) e;
        this.L$0 = bVar2;
        this.L$1 = walletsInfoResponse2;
        this.label = 2;
        if (bVar2.e(walletsInfoResponse2, this) != coroutineSingletons) {
            bVar = bVar2;
            walletsInfoResponse = walletsInfoResponse2;
            n0 n0Var2 = bVar.j;
            this.L$0 = n0Var2;
            this.L$1 = null;
            this.label = 3;
            h = bVar.h(walletsInfoResponse, this);
            if (h != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
