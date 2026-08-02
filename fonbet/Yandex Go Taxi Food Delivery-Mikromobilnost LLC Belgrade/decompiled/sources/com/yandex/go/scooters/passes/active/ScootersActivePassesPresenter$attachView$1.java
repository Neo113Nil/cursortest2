package com.yandex.go.scooters.passes.active;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersActivePassesOpenedType;
import defpackage.b0b1;
import defpackage.grm0;
import defpackage.irm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lirm0;", "it", "Lzy11;", "<anonymous>", "(Lirm0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.ScootersActivePassesPresenter$attachView$1", f = "ScootersActivePassesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ grm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesPresenter$attachView$1(grm0 grm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = grm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        List list = ((irm0) obj).a;
        ScootersActivePassesPresenter$attachView$1 scootersActivePassesPresenter$attachView$1 = new ScootersActivePassesPresenter$attachView$1(this.this$0, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersActivePassesPresenter$attachView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        grm0 grm0Var = this.this$0;
        grm0Var.x.a(ScootersAnalytics$ScootersActivePassesOpenedType.Packages, b0b1.d(grm0Var.A), this.this$0.z);
        return zy11.a;
    }
}
