package com.yandex.go.taxi.order.details.v2.domain.a11y;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.ky2;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n8k0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityInteractor$startA11y$2", f = "RideCardAccessibilityInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccessibilityInteractor$startA11y$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityInteractor$startA11y$2$1", f = "RideCardAccessibilityInteractor.kt", l = {33}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityInteractor$startA11y$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ RideCardPresentationType $presentationType;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$presentationType = rideCardPresentationType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$presentationType, continuation);
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
                c cVar = this.this$0.d;
                RideCardPresentationType rideCardPresentationType = this.$presentationType;
                this.label = 1;
                if (cVar.a(rideCardPresentationType, this) == coroutineSingletons) {
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
    public RideCardAccessibilityInteractor$startA11y$2(b bVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAccessibilityInteractor$startA11y$2 rideCardAccessibilityInteractor$startA11y$2 = new RideCardAccessibilityInteractor$startA11y$2(this.this$0, this.$presentationType, continuation);
        rideCardAccessibilityInteractor$startA11y$2.L$0 = obj;
        return rideCardAccessibilityInteractor$startA11y$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardAccessibilityInteractor$startA11y$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$presentationType, null), 3);
        e eVar = this.this$0.c;
        RideCardPresentationType rideCardPresentationType = this.$presentationType;
        AtomicReference atomicReference = eVar.h;
        if (atomicReference.get() == null) {
            ky2 ky2Var = eVar.b;
            n8k0 n8k0Var = eVar.j;
            ky2Var.c.remove(n8k0Var);
            ky2Var.d(n8k0Var);
        }
        atomicReference.set(rideCardPresentationType);
        eVar.i.add(rideCardPresentationType);
        RideCardPresentationType rideCardPresentationType2 = RideCardPresentationType.DETAILS;
        if (rideCardPresentationType == rideCardPresentationType2) {
            eVar.a(RideCardPresentationType.COMPACT);
            eVar.b(rideCardPresentationType2);
        }
        b bVar = this.this$0;
        m0 m0Var = new m0(kotlinx.coroutines.flow.e.t(com.yandex.go.taxi.order.util.a.a(bVar.a)), kotlinx.coroutines.flow.e.t(new mth(kotlinx.coroutines.flow.e.I(bVar.b.a(), new RideCardAccessibilityInteractor$rideCardPresentationsAsFlow$1(2, null)), 6)), new RideCardAccessibilityInteractor$subscribeA11yChange$1(bVar, this.$presentationType, null));
        this.this$0.e.getClass();
        return com.yandex.go.coroutines.b.h(tseVar, kotlinx.coroutines.flow.e.F(m0Var, uyj.a));
    }
}
