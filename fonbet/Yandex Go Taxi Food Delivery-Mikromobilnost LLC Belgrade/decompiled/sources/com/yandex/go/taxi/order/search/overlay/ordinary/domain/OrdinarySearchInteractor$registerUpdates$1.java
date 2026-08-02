package com.yandex.go.taxi.order.search.overlay.ordinary.domain;

import com.yandex.go.taxi.order.domain.repositories.n;
import defpackage.i350;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$registerUpdates$1", f = "OrdinarySearchInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrdinarySearchInteractor$registerUpdates$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$registerUpdates$1$1", f = "OrdinarySearchInteractor.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$registerUpdates$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                d dVar = this.this$0;
                this.label = 1;
                if (new m0(((n) dVar.a).e(), dVar.e.c(), new OrdinarySearchInteractor$collectIsLongSearch$2(3, null)).collect(new i350(26, dVar), this) == coroutineSingletons) {
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
    @mvg(c = "com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$registerUpdates$1$2", f = "OrdinarySearchInteractor.kt", l = {49}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.search.overlay.ordinary.domain.OrdinarySearchInteractor$registerUpdates$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
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
                d dVar = this.this$0;
                this.label = 1;
                if (new b(((n) dVar.a).e()).collect(new c(dVar), this) == coroutineSingletons) {
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
    public OrdinarySearchInteractor$registerUpdates$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrdinarySearchInteractor$registerUpdates$1 ordinarySearchInteractor$registerUpdates$1 = new OrdinarySearchInteractor$registerUpdates$1(this.this$0, continuation);
        ordinarySearchInteractor$registerUpdates$1.L$0 = obj;
        return ordinarySearchInteractor$registerUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrdinarySearchInteractor$registerUpdates$1 ordinarySearchInteractor$registerUpdates$1 = (OrdinarySearchInteractor$registerUpdates$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ordinarySearchInteractor$registerUpdates$1.invokeSuspend(zy11Var);
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
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return zy11.a;
    }
}
