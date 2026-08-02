package com.yandex.go.chargers.passes.offer_screen;

import defpackage.aia;
import defpackage.ala;
import defpackage.aza;
import defpackage.bb0;
import defpackage.bla;
import defpackage.c29;
import defpackage.cla;
import defpackage.cy9;
import defpackage.dla;
import defpackage.ela;
import defpackage.eza;
import defpackage.fla;
import defpackage.gla;
import defpackage.hla;
import defpackage.ila;
import defpackage.iy9;
import defpackage.jj9;
import defpackage.jl40;
import defpackage.kka;
import defpackage.ly9;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tka;
import defpackage.tse;
import defpackage.uka;
import defpackage.vka;
import defpackage.w511;
import defpackage.wga;
import defpackage.wka;
import defpackage.wls;
import defpackage.xga;
import defpackage.xka;
import defpackage.yga;
import defpackage.yka;
import defpackage.zka;
import defpackage.zla;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.offer_screen.ChargersPassesOfferRouter$content$1$1$1", f = "ChargersPassesOfferRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesOfferRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ila $action;
    final /* synthetic */ xga $navigator;
    int label;
    final /* synthetic */ yga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesOfferRouter$content$1$1$1(yga ygaVar, ila ilaVar, xga xgaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ygaVar;
        this.$action = ilaVar;
        this.$navigator = xgaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPassesOfferRouter$content$1$1$1(this.this$0, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersPassesOfferRouter$content$1$1$1 chargersPassesOfferRouter$content$1$1$1 = (ChargersPassesOfferRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersPassesOfferRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c29 c29Var = this.this$0.M;
        ila ilaVar = this.$action;
        xga xgaVar = this.$navigator;
        c29Var.getClass();
        if (jl40.l(ilaVar, tka.a) || jl40.l(ilaVar, vka.a)) {
            xgaVar.a.r(new qu(9));
        } else if (ilaVar instanceof wka) {
            cy9 cy9Var = ((wka) ilaVar).a;
            yga ygaVar = xgaVar.a;
            ygaVar.A((m950) ygaVar.I.get(), new ly9(cy9Var), new iy9(1));
        } else if (jl40.l(ilaVar, fla.a)) {
            yga ygaVar2 = xgaVar.a;
            ygaVar2.A((m950) ygaVar2.O.get(), new zla(false, 5), new jj9(3));
        } else if (ilaVar instanceof xka) {
            String str = ((xka) ilaVar).a;
            yga ygaVar3 = xgaVar.a;
            ygaVar3.A((m950) ygaVar3.H.get(), new eza(new aza(str)), sy60.Q2);
        } else if (ilaVar instanceof gla) {
            String uuid = UUID.randomUUID().toString();
            String str2 = ((gla) ilaVar).a;
            yga ygaVar4 = xgaVar.a;
            ygaVar4.A((m950) ygaVar4.N.get(), new aia(str2, uuid), new wga(ygaVar4));
        } else if (jl40.l(ilaVar, yka.a)) {
            yga ygaVar5 = xgaVar.a;
            ygaVar5.C((m950) ygaVar5.K.get(), new bb0(ygaVar5, 19));
        } else if (ilaVar instanceof cla) {
            kka kkaVar = (kka) c29Var.b;
            kkaVar.a.l(((cla) ilaVar).a);
        } else if (!(ilaVar instanceof ala) && !(ilaVar instanceof bla) && !(ilaVar instanceof zka) && !(ilaVar instanceof uka) && !(ilaVar instanceof ela) && !jl40.l(ilaVar, dla.a) && !jl40.l(ilaVar, hla.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
