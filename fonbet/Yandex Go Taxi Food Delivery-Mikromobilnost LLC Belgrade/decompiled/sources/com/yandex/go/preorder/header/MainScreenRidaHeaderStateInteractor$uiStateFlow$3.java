package com.yandex.go.preorder.header;

import com.yandex.go.address.models.Address;
import defpackage.b6k0;
import defpackage.bms;
import defpackage.c6k0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.fyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.q5z;
import defpackage.w5k0;
import defpackage.x5k0;
import defpackage.xqg0;
import defpackage.y5k0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/address/models/Address;", "sourceAddress", "", "isInteractingWithMap", "Lpex0;", "singleUnavailableTariff", "Ld6k0;", "<anonymous>", "(Lcom/yandex/go/address/models/Address;ZLpex0;)Ld6k0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.header.MainScreenRidaHeaderStateInteractor$uiStateFlow$3", f = "MainScreenRidaHeaderStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainScreenRidaHeaderStateInteractor$uiStateFlow$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenRidaHeaderStateInteractor$uiStateFlow$3(g gVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MainScreenRidaHeaderStateInteractor$uiStateFlow$3 mainScreenRidaHeaderStateInteractor$uiStateFlow$3 = new MainScreenRidaHeaderStateInteractor$uiStateFlow$3(this.this$0, (Continuation) obj4);
        mainScreenRidaHeaderStateInteractor$uiStateFlow$3.L$0 = (Address) obj;
        mainScreenRidaHeaderStateInteractor$uiStateFlow$3.Z$0 = booleanValue;
        mainScreenRidaHeaderStateInteractor$uiStateFlow$3.L$1 = (pex0) obj3;
        return mainScreenRidaHeaderStateInteractor$uiStateFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address = (Address) this.L$0;
        boolean z = this.Z$0;
        pex0 pex0Var = (pex0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z || address == null) {
            return x5k0.a;
        }
        if (pex0Var == null) {
            c6k0 c6k0Var = new c6k0(q5z.F(address), true, 2);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.a;
            b6k0 b6k0Var = new b6k0(eVar.a.getString(fyh0.rida_you_are_here), new Integer(f1h0.ic_location_fill_24));
            ru.yandex.taxi.widget.utils.e eVar2 = this.this$0.a;
            return new y5k0(c6k0Var, b6k0Var, new w5k0(eVar2.a.getColor(xqg0.rida_header_gradient_top), eVar2.a.getColor(xqg0.rida_header_gradient_bottom)), true);
        }
        g gVar = this.this$0;
        String str = pex0Var.D;
        gVar.getClass();
        if (str == null || evu0.J(str)) {
            str = (String) gVar.d.getValue();
        }
        c6k0 c6k0Var2 = new c6k0(str, false, 2);
        ru.yandex.taxi.widget.utils.e eVar3 = this.this$0.a;
        return new y5k0(c6k0Var2, new b6k0(eVar3.a.getString(fyh0.rida_you_are_here), new Integer(f1h0.ic_location_fill_24)), null, true);
    }
}
