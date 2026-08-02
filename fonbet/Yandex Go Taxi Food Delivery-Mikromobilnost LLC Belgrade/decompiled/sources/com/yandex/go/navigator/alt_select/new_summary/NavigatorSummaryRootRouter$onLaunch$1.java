package com.yandex.go.navigator.alt_select.new_summary;

import defpackage.a8l0;
import defpackage.c8l0;
import defpackage.dg50;
import defpackage.gfl0;
import defpackage.hfl0;
import defpackage.ifl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.alt_select.new_summary.NavigatorSummaryRootRouter$onLaunch$1", f = "NavigatorSummaryRootRouter.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorSummaryRootRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ dg50 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorSummaryRootRouter$onLaunch$1(a aVar, dg50 dg50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = dg50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorSummaryRootRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorSummaryRootRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            dg50 dg50Var = this.$payload;
            aVar.getClass();
            ifl0 ifl0Var = dg50Var.b;
            if (!(ifl0Var instanceof hfl0) && ((!(ifl0Var instanceof gfl0) || !((c8l0) ((gfl0) ifl0Var).a.a).equals(a8l0.a)) && !aVar.G.e)) {
                a aVar2 = this.this$0;
                this.label = 1;
                if (a.P(aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ifl0 ifl0Var2 = this.$payload.b;
        if (ifl0Var2 != null) {
            this.this$0.I.n(ifl0Var2);
        }
        return zy11.a;
    }
}
