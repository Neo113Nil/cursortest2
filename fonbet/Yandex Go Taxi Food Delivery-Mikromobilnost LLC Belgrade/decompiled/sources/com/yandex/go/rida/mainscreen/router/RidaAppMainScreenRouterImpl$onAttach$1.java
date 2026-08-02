package com.yandex.go.rida.mainscreen.router;

import defpackage.b5k0;
import defpackage.c5k0;
import defpackage.d5k0;
import defpackage.d5y0;
import defpackage.gse0;
import defpackage.jse0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.mainscreen.router.RidaAppMainScreenRouterImpl$onAttach$1", f = "RidaAppMainScreenRouterImpl.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RidaAppMainScreenRouterImpl$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ d5k0 $payload;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaAppMainScreenRouterImpl$onAttach$1(d5k0 d5k0Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = d5k0Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RidaAppMainScreenRouterImpl$onAttach$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RidaAppMainScreenRouterImpl$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d5k0 d5k0Var = this.$payload;
            boolean z = d5k0Var instanceof b5k0;
            e eVar = this.this$0;
            if (z) {
                eVar.R(((b5k0) d5k0Var).a);
            } else if (!eVar.E.a.Kg() && this.this$0.F.a()) {
                e.Q(this.this$0, gse0.a, "launch with unauthorized user and preload");
            } else if (this.this$0.E.a.Kg()) {
                d5k0 d5k0Var2 = this.$payload;
                boolean z2 = d5k0Var2 instanceof c5k0;
                e eVar2 = this.this$0;
                if (z2) {
                    d5y0 d5y0Var = ((c5k0) d5k0Var2).a;
                    this.label = 1;
                    if (eVar2.S(d5y0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    e.Q(eVar2, new jse0(), "back to main screen");
                }
            } else {
                e.Q(this.this$0, new jse0(), "back to main screen with unauthorized user");
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
