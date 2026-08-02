package com.yandex.payment.divkit.results;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.cwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.stf;
import defpackage.tse;
import defpackage.vtf;
import defpackage.wls;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.results.DKResultFragment$onViewCreated$1", f = "DKResultFragment.kt", l = {109}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class DKResultFragment$onViewCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DKResultFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.divkit.results.DKResultFragment$onViewCreated$1$1", f = "DKResultFragment.kt", l = {110}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.divkit.results.DKResultFragment$onViewCreated$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ DKResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DKResultFragment dKResultFragment, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dKResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            stf stfVar;
            n0 n0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                stfVar = this.this$0.callbacks;
                if (stfVar == null) {
                    stfVar = null;
                }
                yr31 l = stfVar.l();
                vtf vtfVar = l instanceof vtf ? (vtf) l : null;
                if (vtfVar != null && (n0Var = vtfVar.c) != null) {
                    cwc cwcVar = new cwc(18, this.this$0);
                    this.label = 1;
                    if (n0.m(n0Var, cwcVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKResultFragment$onViewCreated$1(DKResultFragment dKResultFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dKResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKResultFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKResultFragment$onViewCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            DKResultFragment dKResultFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dKResultFragment, null);
            this.label = 1;
            if (b0.a(dKResultFragment, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
