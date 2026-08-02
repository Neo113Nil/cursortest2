package com.yandex.go.scooters.offers.v2.components.bottom;

import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyException;
import defpackage.h7n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.s4n0;
import defpackage.tse;
import defpackage.w5n0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomPresenter$reloadCard$1", f = "ScootersCardBottomPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersCardBottomPresenter$reloadCard$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ s4n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCardBottomPresenter$reloadCard$1(s4n0 s4n0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s4n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCardBottomPresenter$reloadCard$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersCardBottomPresenter$reloadCard$1 scootersCardBottomPresenter$reloadCard$1 = (ScootersCardBottomPresenter$reloadCard$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersCardBottomPresenter$reloadCard$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Object value = this.this$0.B.a.getValue();
        w5n0 w5n0Var = value instanceof w5n0 ? (w5n0) value : null;
        zy11 zy11Var = zy11.a;
        if (w5n0Var != null && (th = w5n0Var.a) != null) {
            boolean z = th instanceof ScooterIsBusyException;
            s4n0 s4n0Var = this.this$0;
            if (z) {
                ((h7n0) s4n0Var.x).b.r(new qu(9));
                return zy11Var;
            }
            s4n0Var.C.a(zy11Var);
        }
        return zy11Var;
    }
}
