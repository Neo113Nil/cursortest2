package com.yandex.payment.divkit.bind;

import com.yandex.payment.sdk.nfcscanner.tools.c;
import defpackage.e3n;
import defpackage.hrf;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.bind.DKBindCardFragment$onCreateView$2", f = "DKBindCardFragment.kt", l = {207}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class DKBindCardFragment$onCreateView$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DKBindCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKBindCardFragment$onCreateView$2(DKBindCardFragment dKBindCardFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dKBindCardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKBindCardFragment$onCreateView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKBindCardFragment$onCreateView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c requestController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            requestController = this.this$0.requestController();
            n0 n0Var = requestController.C;
            o430 o430Var = e3n.b;
            tpr q = e.q(n0Var, kp50.U(1, DurationUnit.SECONDS));
            hrf hrfVar = new hrf(this.this$0, 2);
            this.label = 1;
            if (q.collect(hrfVar, this) == coroutineSingletons) {
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
