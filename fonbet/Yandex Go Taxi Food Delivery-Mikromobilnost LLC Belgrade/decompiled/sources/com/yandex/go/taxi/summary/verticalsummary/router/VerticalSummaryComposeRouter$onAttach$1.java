package com.yandex.go.taxi.summary.verticalsummary.router;

import com.yandex.go.summary.interactor.core.t;
import com.yandex.go.taxi.summary.verticalsummary.interactor.g;
import defpackage.bov0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.th31;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.router.VerticalSummaryComposeRouter$onAttach$1", f = "VerticalSummaryComposeRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalSummaryComposeRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ bov0 $revealParams;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.summary.verticalsummary.router.VerticalSummaryComposeRouter$onAttach$1$1", f = "VerticalSummaryComposeRouter.kt", l = {226}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.verticalsummary.router.VerticalSummaryComposeRouter$onAttach$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ bov0 $revealParams;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, bov0 bov0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$revealParams = bov0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$revealParams, continuation);
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
                d dVar = this.this$0;
                t tVar = dVar.t0;
                bov0 bov0Var = this.$revealParams;
                c cVar = (c) dVar.L0.getValue();
                this.label = 1;
                if (tVar.a(bov0Var, cVar, this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.taxi.summary.verticalsummary.router.VerticalSummaryComposeRouter$onAttach$1$2", f = "VerticalSummaryComposeRouter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.summary.verticalsummary.router.VerticalSummaryComposeRouter$onAttach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ bov0 $revealParams;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, bov0 bov0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$revealParams = bov0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$revealParams, continuation);
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
                d dVar = this.this$0;
                bov0 bov0Var = this.$revealParams;
                dVar.getClass();
                th31 th31Var = bov0Var.a() ? new th31(bov0Var.b(), bov0Var.a) : null;
                if (th31Var != null) {
                    d dVar2 = this.this$0;
                    g gVar = dVar2.j0;
                    c cVar = (c) dVar2.L0.getValue();
                    this.L$0 = null;
                    this.label = 1;
                    if (gVar.a(th31Var, cVar, this) == coroutineSingletons) {
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
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSummaryComposeRouter$onAttach$1(d dVar, bov0 bov0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$revealParams = bov0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VerticalSummaryComposeRouter$onAttach$1 verticalSummaryComposeRouter$onAttach$1 = new VerticalSummaryComposeRouter$onAttach$1(this.this$0, this.$revealParams, continuation);
        verticalSummaryComposeRouter$onAttach$1.L$0 = obj;
        return verticalSummaryComposeRouter$onAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        VerticalSummaryComposeRouter$onAttach$1 verticalSummaryComposeRouter$onAttach$1 = (VerticalSummaryComposeRouter$onAttach$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        verticalSummaryComposeRouter$onAttach$1.invokeSuspend(zy11Var);
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
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$revealParams, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$revealParams, null), 3);
        return zy11.a;
    }
}
