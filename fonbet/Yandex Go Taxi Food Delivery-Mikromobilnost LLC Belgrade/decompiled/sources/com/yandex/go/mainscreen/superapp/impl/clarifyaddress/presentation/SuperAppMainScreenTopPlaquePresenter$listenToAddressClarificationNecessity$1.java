package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation;

import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.f;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.x;
import defpackage.ceu0;
import defpackage.e4w0;
import defpackage.g4w0;
import defpackage.h4w0;
import defpackage.j5e0;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tig0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1", f = "SuperAppMainScreenTopPlaquePresenter.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh4w0;", "it", "Lzy11;", "<anonymous>", "(Lh4w0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1$1", f = "SuperAppMainScreenTopPlaquePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((h4w0) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h4w0 h4w0Var = (h4w0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (h4w0Var instanceof g4w0) {
                this.this$0.B.b(((g4w0) h4w0Var).c);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tig0 tig0Var = this.this$0.D;
            jqr jqrVar = new jqr(e.t(new x(((f) tig0Var.a).a(), new ceu0(5), tig0Var)), new AnonymousClass1(this.this$0, null), 3);
            this.this$0.A.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(jqrVar, mdh.b);
            e4w0 e4w0Var = (e4w0) this.this$0.Dg();
            o oVar = new o(F, new SuperAppMainScreenTopPlaquePresenter$listenToAddressClarificationNecessity$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            j5e0 j5e0Var = new j5e0(23, e4w0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(j5e0Var, this) == coroutineSingletons) {
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
