package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import com.yandex.go.mainscreen.superapp.orders.domain.h;
import defpackage.ku6;
import defpackage.lu6;
import defpackage.mdh;
import defpackage.mu6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5w0;
import defpackage.qu;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundlePresenter$onResume$1", f = "SuperAppOrderBundlePresenter.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppOrderBundlePresenter$onResume$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "", "Lw201;", "Lkyw0;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundlePresenter$onResume$1$3", f = "SuperAppOrderBundlePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundlePresenter$onResume$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(f fVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((Pair) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            List list = (List) pair.getFirst();
            List list2 = (List) pair.getSecond();
            this.this$0.L = list;
            if (list2.isEmpty()) {
                this.this$0.D.a.r(new qu(9));
            }
            ((p5w0) this.this$0.Dg()).render(list2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppOrderBundlePresenter$onResume$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppOrderBundlePresenter$onResume$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppOrderBundlePresenter$onResume$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            mu6 mu6Var = fVar.A;
            if (mu6Var instanceof lu6) {
                h hVar = fVar.J;
                cVar = new com.yandex.go.mainscreen.superapp.orders.domain.b(hVar.a(fVar.C), ((lu6) mu6Var).a);
            } else {
                if (!(mu6Var instanceof ku6)) {
                    w511.b();
                    return null;
                }
                cVar = new c(fVar.G.v, fVar);
            }
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(cVar, new SuperAppOrderBundlePresenter$onResume$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null)));
            this.this$0.E.getClass();
            sjh sjhVar = uyj.a;
            tpr F = kotlinx.coroutines.flow.e.F(t, mdh.b);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(F, anonymousClass3, this) == coroutineSingletons) {
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
