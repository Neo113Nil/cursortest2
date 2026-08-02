package com.yandex.go.tariffcard.ui;

import defpackage.ems;
import defpackage.k3x;
import defpackage.ldx0;
import defpackage.m1a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tix0;
import defpackage.uix0;
import defpackage.viv0;
import defpackage.wi70;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lk3x;", "<destruct>", "Lwi70;", "button", "Lm1a0;", "paymentInfo", "Lldx0;", "scrollButtonState", "", "isRedirectAnimationEnabled", "Luix0;", "<anonymous>", "(Lk3x;Lwi70;Lm1a0;Lldx0;Z)Luix0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$stateFlow$1", f = "TariffOptionsCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardStateInteractor$stateFlow$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ tix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardStateInteractor$stateFlow$1(tix0 tix0Var, Continuation continuation) {
        super(6, continuation);
        this.this$0 = tix0Var;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        TariffOptionsCardStateInteractor$stateFlow$1 tariffOptionsCardStateInteractor$stateFlow$1 = new TariffOptionsCardStateInteractor$stateFlow$1(this.this$0, (Continuation) obj6);
        tariffOptionsCardStateInteractor$stateFlow$1.L$0 = (k3x) obj;
        tariffOptionsCardStateInteractor$stateFlow$1.L$1 = (wi70) obj2;
        tariffOptionsCardStateInteractor$stateFlow$1.L$2 = (m1a0) obj3;
        tariffOptionsCardStateInteractor$stateFlow$1.L$3 = (ldx0) obj4;
        tariffOptionsCardStateInteractor$stateFlow$1.Z$0 = booleanValue;
        return tariffOptionsCardStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k3x k3xVar = (k3x) this.L$0;
        wi70 wi70Var = (wi70) this.L$1;
        m1a0 m1a0Var = (m1a0) this.L$2;
        ldx0 ldx0Var = (ldx0) this.L$3;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List list = k3xVar.a;
        String str = k3xVar.b;
        HeaderType headerType = k3xVar.c;
        viv0 viv0Var = this.this$0.p;
        boolean z2 = !viv0Var.b().b ? false : viv0Var.b().k;
        viv0 viv0Var2 = this.this$0.p;
        return new uix0(list, wi70Var, m1a0Var, z2, !viv0Var2.b().b ? null : viv0Var2.b().h, str, headerType, ldx0Var, z);
    }
}
