package com.yandex.go.mainscreen.superapp.impl.currentaddress;

import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.avj0;
import defpackage.aye0;
import defpackage.b61;
import defpackage.cag;
import defpackage.ddf;
import defpackage.dye;
import defpackage.f45;
import defpackage.f51;
import defpackage.fh4;
import defpackage.hnb0;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.m3o;
import defpackage.ny61;
import defpackage.o51;
import defpackage.p51;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.r51;
import defpackage.ref;
import defpackage.tjt0;
import defpackage.uef;
import defpackage.ujt0;
import defpackage.v8e;
import defpackage.vef;
import defpackage.w030;
import defpackage.yit;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes12.dex */
public final class c extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final yit G;
    public final kr0 H;
    public final vef I;
    public final ref J;
    public final yvf0 K;
    public final hnb0 L;
    public pzt0 M;

    public c(w030 w030Var, yit yitVar, kr0 kr0Var, vef vefVar, ref refVar, yvf0 yvf0Var, hnb0 hnb0Var) {
        super(null);
        this.F = w030Var;
        this.G = yitVar;
        this.H = kr0Var;
        this.I = vefVar;
        this.J = refVar;
        this.K = yvf0Var;
        this.L = hnb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(c cVar, pv0 pv0Var, ContinuationImpl continuationImpl) {
        CurrentAddressSearchModalViewRouter$setIsAddressClarified$1 currentAddressSearchModalViewRouter$setIsAddressClarified$1;
        int i;
        PositionInitAction positionInitAction;
        PositionInitAction positionInitAction2;
        kr0 kr0Var = cVar.H;
        if (continuationImpl instanceof CurrentAddressSearchModalViewRouter$setIsAddressClarified$1) {
            currentAddressSearchModalViewRouter$setIsAddressClarified$1 = (CurrentAddressSearchModalViewRouter$setIsAddressClarified$1) continuationImpl;
            int i2 = currentAddressSearchModalViewRouter$setIsAddressClarified$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentAddressSearchModalViewRouter$setIsAddressClarified$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentAddressSearchModalViewRouter$setIsAddressClarified$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentAddressSearchModalViewRouter$setIsAddressClarified$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    currentAddressSearchModalViewRouter$setIsAddressClarified$1.L$0 = pv0Var;
                    currentAddressSearchModalViewRouter$setIsAddressClarified$1.label = 1;
                    obj = ((com.yandex.go.clarify_address.a) kr0Var).b.a(currentAddressSearchModalViewRouter$setIsAddressClarified$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) currentAddressSearchModalViewRouter$setIsAddressClarified$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                positionInitAction = PositionInitAction.GEO;
                positionInitAction2 = pv0Var.a.getPositionInitAction();
                yit yitVar = cVar.G;
                if (positionInitAction != positionInitAction2) {
                    yitVar.getClass();
                    ((com.yandex.go.clarify_address.a) kr0Var).c(booleanValue, AddressClarificationReason.LocationButtonTap);
                } else {
                    yitVar.getClass();
                    ((com.yandex.go.clarify_address.a) kr0Var).c(true, AddressClarificationReason.Suggest);
                }
                cVar.r(new qu(9));
                return zy11.a;
            }
        }
        currentAddressSearchModalViewRouter$setIsAddressClarified$1 = new CurrentAddressSearchModalViewRouter$setIsAddressClarified$1(cVar, continuationImpl);
        Object obj2 = currentAddressSearchModalViewRouter$setIsAddressClarified$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentAddressSearchModalViewRouter$setIsAddressClarified$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        positionInitAction = PositionInitAction.GEO;
        positionInitAction2 = pv0Var.a.getPositionInitAction();
        yit yitVar2 = cVar.G;
        if (positionInitAction != positionInitAction2) {
        }
        cVar.r(new qu(9));
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final /* bridge */ /* synthetic */ Object S(Object obj, Continuation continuation) {
        return U(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(Continuation continuation) {
        CurrentAddressSearchModalViewRouter$provideModalView$1 currentAddressSearchModalViewRouter$provideModalView$1;
        int i;
        vef vefVar;
        f51 f51Var;
        if (continuation instanceof CurrentAddressSearchModalViewRouter$provideModalView$1) {
            currentAddressSearchModalViewRouter$provideModalView$1 = (CurrentAddressSearchModalViewRouter$provideModalView$1) continuation;
            int i2 = currentAddressSearchModalViewRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentAddressSearchModalViewRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentAddressSearchModalViewRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentAddressSearchModalViewRouter$provideModalView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ref refVar = this.J;
                    tjt0 tjt0Var = refVar.b;
                    ujt0 ujt0Var = new ujt0(false);
                    ddf ddfVar = new ddf(RoutePointType.POINT_A);
                    cag c = fh4.c(new r51(SourcePicker.A_FROM_HOME), ddfVar, m3o.b, tjt0Var.a, new aye0(20, refVar.a), ujt0Var);
                    currentAddressSearchModalViewRouter$provideModalView$1.L$0 = null;
                    currentAddressSearchModalViewRouter$provideModalView$1.L$1 = null;
                    vefVar = this.I;
                    currentAddressSearchModalViewRouter$provideModalView$1.L$2 = vefVar;
                    currentAddressSearchModalViewRouter$provideModalView$1.L$3 = c;
                    currentAddressSearchModalViewRouter$provideModalView$1.label = 1;
                    Object b = ((com.yandex.go.clarify_address.a) this.H).b(currentAddressSearchModalViewRouter$provideModalView$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f51Var = c;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f51Var = (f51) currentAddressSearchModalViewRouter$provideModalView$1.L$3;
                    vefVar = (vef) currentAddressSearchModalViewRouter$provideModalView$1.L$2;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dye dyeVar = new dye(10, this);
                a aVar = new a(this);
                b bVar = new b(this);
                vefVar.getClass();
                AddressSearchView.Companion.getClass();
                b61 b61Var = new b61(f51Var);
                b61Var.n = ((avj0) vefVar.a).h(kyh0.menu_address_title);
                b61Var.q = new f45(vefVar, booleanValue, dyeVar);
                b61Var.y = new v8e(6, bVar);
                AddressSearchModalView.Companion.getClass();
                AddressSearchModalView a = p51.a(b61Var);
                a.setOnAddressPickedListener(new uef(aVar));
                a.setOnKeyboardListener(new o51(a, 1));
                return a;
            }
        }
        currentAddressSearchModalViewRouter$provideModalView$1 = new CurrentAddressSearchModalViewRouter$provideModalView$1(this, (ContinuationImpl) continuation);
        Object obj2 = currentAddressSearchModalViewRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentAddressSearchModalViewRouter$provideModalView$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        dye dyeVar2 = new dye(10, this);
        a aVar2 = new a(this);
        b bVar2 = new b(this);
        vefVar.getClass();
        AddressSearchView.Companion.getClass();
        b61 b61Var2 = new b61(f51Var);
        b61Var2.n = ((avj0) vefVar.a).h(kyh0.menu_address_title);
        b61Var2.q = new f45(vefVar, booleanValue2, dyeVar2);
        b61Var2.y = new v8e(6, bVar2);
        AddressSearchModalView.Companion.getClass();
        AddressSearchModalView a2 = p51.a(b61Var2);
        a2.setOnAddressPickedListener(new uef(aVar2));
        a2.setOnKeyboardListener(new o51(a2, 1));
        return a2;
    }
}
