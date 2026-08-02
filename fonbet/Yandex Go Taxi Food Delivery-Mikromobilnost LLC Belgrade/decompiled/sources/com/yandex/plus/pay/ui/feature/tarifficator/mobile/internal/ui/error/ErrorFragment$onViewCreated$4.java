package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r6o;
import defpackage.w9o;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lw9o;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Lw9o;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment$onViewCreated$4", f = "ErrorFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ErrorFragment$onViewCreated$4 extends SuspendLambda implements zls {
    final /* synthetic */ r6o $errorContentViewController;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ErrorFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorFragment$onViewCreated$4(ErrorFragment errorFragment, r6o r6oVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = errorFragment;
        this.$errorContentViewController = r6oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ErrorFragment$onViewCreated$4 errorFragment$onViewCreated$4 = new ErrorFragment$onViewCreated$4(this.this$0, this.$errorContentViewController, (Continuation) obj3);
        errorFragment$onViewCreated$4.L$0 = (w9o) obj2;
        zy11 zy11Var = zy11.a;
        errorFragment$onViewCreated$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        w9o w9oVar = (w9o) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.setScreenState(w9oVar, this.$errorContentViewController);
        return zy11.a;
    }
}
