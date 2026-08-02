package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.gau;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yfw;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "comment", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardCommentInteractorImpl$observeCommentChanges$2", f = "IntercityDashboardCommentInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardCommentInteractorImpl$observeCommentChanges$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardCommentInteractorImpl$observeCommentChanges$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardCommentInteractorImpl$observeCommentChanges$2 intercityDashboardCommentInteractorImpl$observeCommentChanges$2 = new IntercityDashboardCommentInteractorImpl$observeCommentChanges$2(this.this$0, continuation);
        intercityDashboardCommentInteractorImpl$observeCommentChanges$2.L$0 = obj;
        return intercityDashboardCommentInteractorImpl$observeCommentChanges$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IntercityDashboardCommentInteractorImpl$observeCommentChanges$2 intercityDashboardCommentInteractorImpl$observeCommentChanges$2 = (IntercityDashboardCommentInteractorImpl$observeCommentChanges$2) create((String) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        intercityDashboardCommentInteractorImpl$observeCommentChanges$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = this.this$0.b.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, yfw.a((yfw) value, null, null, null, null, null, str, 63)));
        a aVar = this.this$0;
        aVar.c.b(new gau(19, aVar));
        return zy11.a;
    }
}
