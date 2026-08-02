package com.yandex.go.taxi.order.state;

import defpackage.k5s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wd00;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwd00;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lwd00;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.state.MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3", f = "MakeAnotherOrderButtonStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3 makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3 = new MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3(this.this$0, continuation);
        makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3.L$0 = obj;
        return makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3 makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3 = (MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3) create((wd00) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wd00 wd00Var = (wd00) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (wd00Var.a) {
            k5s0 k5s0Var = this.this$0.b;
            k5s0Var.getClass();
            k5s0Var.a.a("ShowAddTaxi", new HashMap(), 1, new HashMap());
        }
        return zy11.a;
    }
}
