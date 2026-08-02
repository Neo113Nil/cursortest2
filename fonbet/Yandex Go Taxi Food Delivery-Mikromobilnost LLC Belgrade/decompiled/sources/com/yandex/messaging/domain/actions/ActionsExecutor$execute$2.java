package com.yandex.messaging.domain.actions;

import com.yandex.messaging.internal.authorized.i;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.gr;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wx4;
import defpackage.ym11;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.actions.ActionsExecutor$execute$2", f = "ActionsExecutor.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ActionsExecutor$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ gr $action;
    final /* synthetic */ eyc $deferred;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.actions.ActionsExecutor$execute$2$1", f = "ActionsExecutor.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.actions.ActionsExecutor$execute$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ gr $action;
        final /* synthetic */ eyc $deferred;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eyc eycVar, gr grVar, Continuation continuation) {
            super(2, continuation);
            this.$deferred = eycVar;
            this.$action = grVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$deferred, this.$action, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            eyc eycVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    b.b(obj);
                    eyc eycVar2 = this.$deferred;
                    gr grVar = this.$action;
                    this.L$0 = eycVar2;
                    this.label = 1;
                    wx4 wx4Var = (wx4) grVar;
                    Object y = e.y(e.I(i.b(wx4Var.a), new BaseAuthAction$doWork$2(wx4Var, null)), this);
                    if (y == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    eycVar = eycVar2;
                    obj = y;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eycVar = (eyc) this.L$0;
                    b.b(obj);
                }
                ((fyc) eycVar).T(obj);
            } catch (Throwable th) {
                ((fyc) this.$deferred).j0(th);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsExecutor$execute$2(a aVar, gr grVar, eyc eycVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = grVar;
        this.$deferred = eycVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActionsExecutor$execute$2 actionsExecutor$execute$2 = new ActionsExecutor$execute$2(this.this$0, this.$action, this.$deferred, continuation);
        actionsExecutor$execute$2.L$0 = obj;
        return actionsExecutor$execute$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionsExecutor$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        l8x l8xVar = null;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                tse tseVar = (tse) this.L$0;
                for (Map.Entry entry : this.this$0.b.entrySet()) {
                    if (this.$action.a((gr) entry.getValue())) {
                        ((fyc) this.$deferred).j0(new CancellationException());
                        return zy11Var;
                    }
                    gr grVar = this.$action;
                    grVar.getClass();
                }
                l8xVar = tje.N(tseVar, null, null, new AnonymousClass1(this.$deferred, this.$action, null), 3);
                this.this$0.b.put(l8xVar, this.$action);
                this.L$0 = l8xVar;
                this.label = 1;
                if (l8xVar.u0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l8xVar = (l8x) this.L$0;
                b.b(obj);
            }
            return zy11Var;
        } finally {
            ym11.c(this.this$0.b).remove(l8xVar);
        }
    }
}
