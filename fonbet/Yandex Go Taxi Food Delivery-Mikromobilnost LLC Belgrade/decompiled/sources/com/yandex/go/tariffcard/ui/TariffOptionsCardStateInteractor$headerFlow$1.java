package com.yandex.go.tariffcard.ui;

import defpackage.dip0;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nip0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tix0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "it", "Lzy11;", "<anonymous>", "(Lfnx0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.tariffcard.ui.TariffOptionsCardStateInteractor$headerFlow$1", f = "TariffOptionsCardStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffOptionsCardStateInteractor$headerFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tix0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffOptionsCardStateInteractor$headerFlow$1(tix0 tix0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tix0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffOptionsCardStateInteractor$headerFlow$1 tariffOptionsCardStateInteractor$headerFlow$1 = new TariffOptionsCardStateInteractor$headerFlow$1(this.this$0, continuation);
        tariffOptionsCardStateInteractor$headerFlow$1.L$0 = obj;
        return tariffOptionsCardStateInteractor$headerFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffOptionsCardStateInteractor$headerFlow$1 tariffOptionsCardStateInteractor$headerFlow$1 = (TariffOptionsCardStateInteractor$headerFlow$1) create((fnx0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffOptionsCardStateInteractor$headerFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var;
        fnx0 fnx0Var = (fnx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = fnx0Var.c.b;
        fnx0 fnx0Var2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.c).j.g;
        if (!jl40.l(str, (fnx0Var2 == null || (pex0Var = fnx0Var2.c) == null) ? null : pex0Var.b)) {
            dip0 dip0Var = this.this$0.q;
            String str2 = fnx0Var.c.b;
            kotlinx.coroutines.flow.r0 r0Var = dip0Var.a;
            nip0 nip0Var = new nip0(str2, false);
            r0Var.getClass();
            r0Var.m(null, nip0Var);
        }
        return zy11.a;
    }
}
