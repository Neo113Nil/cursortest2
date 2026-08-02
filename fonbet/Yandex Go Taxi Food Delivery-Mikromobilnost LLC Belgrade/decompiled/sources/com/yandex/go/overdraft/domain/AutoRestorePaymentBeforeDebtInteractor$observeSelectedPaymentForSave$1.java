package com.yandex.go.overdraft.domain;

import defpackage.lt3;
import defpackage.lv90;
import defpackage.mt3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.j0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1", f = "AutoRestorePaymentBeforeDebtInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llt3;", "acc", "Llv90;", "new", "<anonymous>", "(Llt3;Llv90;)Llt3;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.overdraft.domain.AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1$1", f = "AutoRestorePaymentBeforeDebtInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.overdraft.domain.AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (lt3) obj;
            anonymousClass1.L$1 = (lv90) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            lt3 lt3Var = (lt3) this.L$0;
            lv90 lv90Var = (lv90) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new lt3(lt3Var.b, lv90Var);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoRestorePaymentBeforeDebtInteractor$observeSelectedPaymentForSave$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j0 j0Var = new j0(new lt3(null, null), this.this$0.f.b(), new AnonymousClass1(3, null));
            mt3 mt3Var = new mt3(this.this$0, 0);
            this.label = 1;
            if (j0Var.collect(mt3Var, this) == coroutineSingletons) {
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
