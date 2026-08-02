package com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact;

import com.yandex.go.taxi.order.domain.repositories.f0;
import defpackage.dek0;
import defpackage.eek0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactPresenter$attachView$4", f = "RideCardCompactPresenter.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompactPresenter$attachView$4 extends SuspendLambda implements wls {
    final /* synthetic */ dek0 $mvpView;
    int label;
    final /* synthetic */ eek0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactPresenter$attachView$4$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((dek0) this.receiver).setCollapseRate(((Number) obj).floatValue());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompactPresenter$attachView$4(eek0 eek0Var, dek0 dek0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eek0Var;
        this.$mvpView = dek0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardCompactPresenter$attachView$4(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompactPresenter$attachView$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            f0 f0Var = this.this$0.x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.$mvpView, dek0.class, "setCollapseRate", "setCollapseRate(F)V", 0);
            this.label = 1;
            if (f0Var.a(anonymousClass1, this) == coroutineSingletons) {
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
