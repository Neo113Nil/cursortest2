package com.yandex.go.transfer_requirement.transferapi;

import defpackage.fh01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.transferapi.TransferCallRepository$addCallJob$2", f = "TransferCallRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferCallRepository$addCallJob$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $apiCall;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fh01 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.transfer_requirement.transferapi.TransferCallRepository$addCallJob$2$1", f = "TransferCallRepository.kt", l = {17}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.transfer_requirement.transferapi.TransferCallRepository$addCallJob$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tls $apiCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tls tlsVar, Continuation continuation) {
            super(2, continuation);
            this.$apiCall = tlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$apiCall, continuation);
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
                tls tlsVar = this.$apiCall;
                this.label = 1;
                if (tlsVar.invoke(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferCallRepository$addCallJob$2(fh01 fh01Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fh01Var;
        this.$apiCall = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferCallRepository$addCallJob$2 transferCallRepository$addCallJob$2 = new TransferCallRepository$addCallJob$2(this.this$0, this.$apiCall, continuation);
        transferCallRepository$addCallJob$2.L$0 = obj;
        return transferCallRepository$addCallJob$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferCallRepository$addCallJob$2 transferCallRepository$addCallJob$2 = (TransferCallRepository$addCallJob$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferCallRepository$addCallJob$2.invokeSuspend(zy11Var);
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
        pzt0 pzt0Var = this.this$0.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.this$0.a = tje.N(tseVar, null, null, new AnonymousClass1(this.$apiCall, null), 3);
        return zy11.a;
    }
}
