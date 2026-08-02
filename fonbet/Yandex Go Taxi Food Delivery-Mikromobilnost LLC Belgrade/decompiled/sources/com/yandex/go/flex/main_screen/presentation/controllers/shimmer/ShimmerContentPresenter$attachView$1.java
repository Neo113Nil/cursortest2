package com.yandex.go.flex.main_screen.presentation.controllers.shimmer;

import defpackage.jvr0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ptr0;
import defpackage.qtr0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.controllers.shimmer.ShimmerContentPresenter$attachView$1", f = "ShimmerContentPresenter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ShimmerContentPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ptr0 $mvpView;
    int label;
    final /* synthetic */ qtr0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.controllers.shimmer.ShimmerContentPresenter$attachView$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((ptr0) this.receiver).render((jvr0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerContentPresenter$attachView$1(qtr0 qtr0Var, ptr0 ptr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qtr0Var;
        this.$mvpView = ptr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShimmerContentPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShimmerContentPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = new e(kotlinx.coroutines.flow.e.t(new c(this.this$0.x.b)));
            this.this$0.y.getClass();
            sjh sjhVar = uyj.a;
            tpr F = kotlinx.coroutines.flow.e.F(eVar, mdh.b);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, this.$mvpView, ptr0.class, "render", "render(Ljava/lang/Object;)V", 4);
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
