package com.yandex.payment.divkit.license;

import defpackage.atf;
import defpackage.bw;
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
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.license.DKLicenseFragment$onViewCreated$1", f = "DKLicenseFragment.kt", l = {100}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class DKLicenseFragment$onViewCreated$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DKLicenseFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKLicenseFragment$onViewCreated$1(DKLicenseFragment dKLicenseFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dKLicenseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKLicenseFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKLicenseFragment$onViewCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            n0 n0Var = ((bw) this.this$0.getActionFlowReceiver()).a;
            atf atfVar = new atf(this.this$0, 0);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, atfVar, this) == coroutineSingletons) {
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
