package com.yandex.go.summary.navigation;

import com.yandex.go.summary.interactor.core.t;
import defpackage.bov0;
import defpackage.hqv0;
import defpackage.jqv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oiv0;
import defpackage.qdv0;
import defpackage.rdv0;
import defpackage.sdv0;
import defpackage.tdv0;
import defpackage.tje;
import defpackage.tse;
import defpackage.udv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$onAttach$1", f = "ComposeSummaryRouter.kt", l = {252}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ComposeSummaryRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ bov0 $revealParams;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$onAttach$1$2", f = "ComposeSummaryRouter.kt", l = {257}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.navigation.ComposeSummaryRouter$onAttach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
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
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.summary.interactor.core.a aVar = (com.yandex.go.summary.interactor.core.a) this.this$0.o0.get();
                this.label = 1;
                if (aVar.a(this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.summary.navigation.ComposeSummaryRouter$onAttach$1$3", f = "ComposeSummaryRouter.kt", l = {262}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.navigation.ComposeSummaryRouter$onAttach$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ bov0 $revealParams;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(e eVar, bov0 bov0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$revealParams = bov0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$revealParams, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                t tVar = (t) this.this$0.n0.get();
                bov0 bov0Var = this.$revealParams;
                oiv0 oiv0Var = (oiv0) this.this$0.L0.getValue();
                this.label = 1;
                if (tVar.a(bov0Var, oiv0Var, this) == coroutineSingletons) {
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
    public ComposeSummaryRouter$onAttach$1(e eVar, bov0 bov0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$revealParams = bov0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposeSummaryRouter$onAttach$1 composeSummaryRouter$onAttach$1 = new ComposeSummaryRouter$onAttach$1(this.this$0, this.$revealParams, continuation);
        composeSummaryRouter$onAttach$1.L$0 = obj;
        return composeSummaryRouter$onAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeSummaryRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            bov0 bov0Var = this.$revealParams;
            eVar.getClass();
            boolean a = bov0Var.a();
            boolean z = bov0Var.a;
            udv0 tdv0Var = (a && z) ? new tdv0(bov0Var.b()) : a ? new rdv0(bov0Var.b()) : (a || !z) ? !a ? qdv0.a : null : sdv0.a;
            hqv0 hqv0Var = tdv0Var != null ? new hqv0(tdv0Var) : null;
            if (hqv0Var != null) {
                e eVar2 = this.this$0;
                jqv0 jqv0Var = eVar2.I;
                oiv0 oiv0Var = (oiv0) eVar2.L0.getValue();
                this.L$0 = tseVar;
                this.L$1 = null;
                this.label = 1;
                if (jqv0Var.a(hqv0Var, oiv0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, this.$revealParams, null), 3);
        return zy11.a;
    }
}
