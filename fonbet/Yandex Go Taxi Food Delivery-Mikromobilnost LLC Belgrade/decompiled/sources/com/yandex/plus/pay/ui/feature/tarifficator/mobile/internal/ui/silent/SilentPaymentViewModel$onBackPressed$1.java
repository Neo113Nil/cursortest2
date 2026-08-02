package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocs0;
import defpackage.pcs0;
import defpackage.qcs0;
import defpackage.rcs0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentViewModel$onBackPressed$1", f = "SilentPaymentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SilentPaymentViewModel$onBackPressed$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentPaymentViewModel$onBackPressed$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SilentPaymentViewModel$onBackPressed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SilentPaymentViewModel$onBackPressed$1 silentPaymentViewModel$onBackPressed$1 = (SilentPaymentViewModel$onBackPressed$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        silentPaymentViewModel$onBackPressed$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rcs0 rcs0Var = (rcs0) this.this$0.F.getValue();
        if ((rcs0Var instanceof ocs0) || (rcs0Var instanceof pcs0)) {
            b bVar = this.this$0;
            bVar.X(true);
            bVar.D.b();
            bVar.z.a();
        } else if (!(rcs0Var instanceof qcs0)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
