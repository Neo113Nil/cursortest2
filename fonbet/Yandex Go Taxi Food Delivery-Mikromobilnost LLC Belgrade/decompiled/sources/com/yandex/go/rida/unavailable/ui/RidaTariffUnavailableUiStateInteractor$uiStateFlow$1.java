package com.yandex.go.rida.unavailable.ui;

import defpackage.evu0;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.wls;
import defpackage.z7k0;
import defpackage.zy11;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/Optional;", "Lfnx0;", "optionalSelection", "Lz7k0;", "<anonymous>", "(Ljava/util/Optional;)Lz7k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.unavailable.ui.RidaTariffUnavailableUiStateInteractor$uiStateFlow$1", f = "RidaTariffUnavailableUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RidaTariffUnavailableUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RidaTariffUnavailableUiStateInteractor$uiStateFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RidaTariffUnavailableUiStateInteractor$uiStateFlow$1 ridaTariffUnavailableUiStateInteractor$uiStateFlow$1 = new RidaTariffUnavailableUiStateInteractor$uiStateFlow$1(this.this$0, continuation);
        ridaTariffUnavailableUiStateInteractor$uiStateFlow$1.L$0 = obj;
        return ridaTariffUnavailableUiStateInteractor$uiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RidaTariffUnavailableUiStateInteractor$uiStateFlow$1) create((Optional) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Optional optional = (Optional) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        fnx0 fnx0Var = (fnx0) optional.orElse(null);
        pex0 pex0Var = fnx0Var != null ? fnx0Var.c : null;
        a aVar = this.this$0;
        String str3 = pex0Var != null ? pex0Var.D : null;
        aVar.getClass();
        if (str3 == null || evu0.J(str3)) {
            str3 = (String) aVar.b.getValue();
        }
        if (pex0Var != null && (str = pex0Var.E) != null && !evu0.J(str)) {
            str2 = str;
        }
        return new z7k0(str3, str2);
    }
}
