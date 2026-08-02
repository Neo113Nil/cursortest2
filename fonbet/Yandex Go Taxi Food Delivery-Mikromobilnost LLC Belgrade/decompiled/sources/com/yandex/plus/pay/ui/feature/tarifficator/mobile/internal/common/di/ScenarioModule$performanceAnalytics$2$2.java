package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di;

import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pmm0;
import defpackage.pwt;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.ScenarioModule$performanceAnalytics$2$2", f = "ScenarioModule.kt", l = {677}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ScenarioModule$performanceAnalytics$2$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ pmm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScenarioModule$performanceAnalytics$2$2(pmm0 pmm0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = pmm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScenarioModule$performanceAnalytics$2$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScenarioModule$performanceAnalytics$2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pwt pwtVar = (pwt) ((com.yandex.plus.pay.internal.b) this.this$0.v).f.getValue();
            this.label = 1;
            obj = pwtVar.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
        if (plusPayGoogleBillingConfig != null) {
            return plusPayGoogleBillingConfig.getGoogleCountryCode();
        }
        return null;
    }
}
