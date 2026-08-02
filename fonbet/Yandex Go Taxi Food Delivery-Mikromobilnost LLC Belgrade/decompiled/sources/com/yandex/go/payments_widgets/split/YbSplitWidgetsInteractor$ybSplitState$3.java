package com.yandex.go.payments_widgets.split;

import defpackage.cx51;
import defpackage.ex51;
import defpackage.ix51;
import defpackage.jx51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lex51;", "ybSplitState", "Lzy11;", "<anonymous>", "(Lex51;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.split.YbSplitWidgetsInteractor$ybSplitState$3", f = "YbSplitWidgetsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class YbSplitWidgetsInteractor$ybSplitState$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ix51 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbSplitWidgetsInteractor$ybSplitState$3(ix51 ix51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ix51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        YbSplitWidgetsInteractor$ybSplitState$3 ybSplitWidgetsInteractor$ybSplitState$3 = new YbSplitWidgetsInteractor$ybSplitState$3(this.this$0, continuation);
        ybSplitWidgetsInteractor$ybSplitState$3.L$0 = obj;
        return ybSplitWidgetsInteractor$ybSplitState$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        YbSplitWidgetsInteractor$ybSplitState$3 ybSplitWidgetsInteractor$ybSplitState$3 = (YbSplitWidgetsInteractor$ybSplitState$3) create((ex51) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ybSplitWidgetsInteractor$ybSplitState$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ex51 ex51Var = (ex51) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = ex51Var instanceof cx51;
        ix51 ix51Var = this.this$0;
        if (z) {
            cx51 cx51Var = (cx51) ex51Var;
            ix51Var.b.b = cx51Var.f;
            this.this$0.b.a = cx51Var.e;
            this.this$0.b.c = cx51Var.g;
        } else {
            jx51 jx51Var = ix51Var.b;
            jx51Var.a = "";
            jx51Var.b = "";
            jx51Var.c = "";
        }
        return zy11.a;
    }
}
