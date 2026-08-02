package com.yandex.go.navigator.main_screen;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ems;
import defpackage.k71;
import defpackage.lpt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.pe50;
import defpackage.spr;
import defpackage.tc50;
import defpackage.x700;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lpe50;", "routes", "Lspr;", "floatingTopContent", "Llpt0;", "speedGroupUiState", "", "isInteractingWithMap", "Lk71;", "suggests", "Lx700;", "<anonymous>", "(Lpe50;Lspr;Llpt0;ZLk71;)Lx700;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.main_screen.MainModalUiStateInteractor$uiStateFlow$1", f = "MainModalUiStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainModalUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements ems {
    final /* synthetic */ com.yandex.go.navigator.main_screen.experiement.e $mainScreenExperimentRepository;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainModalUiStateInteractor$uiStateFlow$1(com.yandex.go.navigator.main_screen.experiement.e eVar, Continuation continuation) {
        super(6, continuation);
        this.$mainScreenExperimentRepository = eVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        MainModalUiStateInteractor$uiStateFlow$1 mainModalUiStateInteractor$uiStateFlow$1 = new MainModalUiStateInteractor$uiStateFlow$1(this.$mainScreenExperimentRepository, (Continuation) obj6);
        mainModalUiStateInteractor$uiStateFlow$1.L$0 = (pe50) obj;
        mainModalUiStateInteractor$uiStateFlow$1.L$1 = (spr) obj2;
        mainModalUiStateInteractor$uiStateFlow$1.L$2 = (lpt0) obj3;
        mainModalUiStateInteractor$uiStateFlow$1.Z$0 = booleanValue;
        mainModalUiStateInteractor$uiStateFlow$1.L$3 = (k71) obj5;
        return mainModalUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oe50 oe50Var;
        Address address;
        AddressDTO address2;
        pe50 pe50Var = (pe50) this.L$0;
        spr sprVar = (spr) this.L$1;
        lpt0 lpt0Var = (lpt0) this.L$2;
        boolean z = this.Z$0;
        k71 k71Var = (k71) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.navigator.main_screen.experiement.e eVar = this.$mainScreenExperimentRepository;
            this.L$0 = pe50Var;
            this.L$1 = sprVar;
            this.L$2 = lpt0Var;
            this.L$3 = k71Var;
            this.Z$0 = z;
            this.label = 1;
            obj = eVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        tc50 tc50Var = (tc50) obj;
        String str2 = tc50Var.c;
        String str3 = tc50Var.b;
        if (pe50Var != null && (oe50Var = pe50Var.a) != null && (address = oe50Var.c) != null && (address2 = address.getAddress()) != null) {
            str = address2.f;
        }
        return new x700(sprVar, tc50Var.d, tc50Var.e, z, str2, str3, str, lpt0Var, k71Var);
    }
}
