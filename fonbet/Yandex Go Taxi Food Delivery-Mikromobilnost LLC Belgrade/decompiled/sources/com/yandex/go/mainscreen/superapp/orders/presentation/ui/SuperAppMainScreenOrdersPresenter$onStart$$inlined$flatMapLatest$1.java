package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import defpackage.jqr;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r2w0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w601;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1", f = "SuperAppMainScreenOrdersPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r2w0 receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1(Continuation continuation, r2w0 r2w0Var) {
        super(3, continuation);
        this.receiver$inlined = r2w0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1 superAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1 = new SuperAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1((Continuation) obj3, this.receiver$inlined);
        superAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        superAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1.L$1 = obj2;
        return superAppMainScreenOrdersPresenter$onStart$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            w601 w601Var = (w601) obj2;
            r2w0 r2w0Var = this.receiver$inlined;
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new jqr(r2w0Var.E.a(w601Var.a), new SuperAppMainScreenOrdersPresenter$observeUiState$1(r2w0Var, w601Var, null), 3), new SuperAppMainScreenOrdersPresenter$observeUiState$$inlined$flatMapLatest$1(r2w0Var, w601Var, null));
            r2w0Var.A.getClass();
            sjh sjhVar = uyj.a;
            tpr F = kotlinx.coroutines.flow.e.F(X, mdh.b);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(F, vprVar, this) == coroutineSingletons) {
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
