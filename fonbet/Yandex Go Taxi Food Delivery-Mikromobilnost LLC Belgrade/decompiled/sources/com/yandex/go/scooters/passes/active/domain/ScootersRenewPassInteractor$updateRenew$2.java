package com.yandex.go.scooters.passes.active.domain;

import com.yandex.go.scooters.passes.model.PassPayment;
import com.yandex.go.scooters.passes.model.PassPaymentType;
import defpackage.cjm0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wqm0;
import defpackage.yfo0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.domain.ScootersRenewPassInteractor$updateRenew$2", f = "ScootersRenewPassInteractor.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersRenewPassInteractor$updateRenew$2 extends SuspendLambda implements tls {
    final /* synthetic */ boolean $enableRenew;
    final /* synthetic */ String $passId;
    final /* synthetic */ wqm0 $paymentMethod;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRenewPassInteractor$updateRenew$2(f fVar, String str, boolean z, wqm0 wqm0Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$passId = str;
        this.$enableRenew = z;
        this.$paymentMethod = wqm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersRenewPassInteractor$updateRenew$2(this.this$0, this.$passId, this.$enableRenew, this.$paymentMethod, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersRenewPassInteractor$updateRenew$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        PassPayment passPayment = null;
        if (i == 0) {
            kotlin.b.b(obj);
            cjm0 cjm0Var = this.this$0.b;
            String str = this.$passId;
            boolean z = this.$enableRenew;
            wqm0 wqm0Var = this.$paymentMethod;
            this.label = 1;
            ((ru.yandex.taxi.scooters.data.mapper.e) cjm0Var.c).getClass();
            String str2 = wqm0Var != null ? wqm0Var.a : null;
            Iterator<E> it = PassPaymentType.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((PassPaymentType) obj2).name(), wqm0Var != null ? wqm0Var.b : null)) {
                    break;
                }
            }
            PassPaymentType passPaymentType = (PassPaymentType) obj2;
            if (passPaymentType != null) {
                passPayment = new PassPayment(passPaymentType, str2, wqm0Var != null ? wqm0Var.c.booleanValue() : false);
            }
            if (((com.yandex.go.scooters.passes.data.d) ((yfo0) cjm0Var.b)).g(str, z, passPayment, this) == coroutineSingletons) {
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
