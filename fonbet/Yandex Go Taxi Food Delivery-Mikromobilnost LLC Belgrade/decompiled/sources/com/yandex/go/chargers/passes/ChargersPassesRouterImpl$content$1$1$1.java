package com.yandex.go.chargers.passes;

import defpackage.ala;
import defpackage.aza;
import defpackage.bb0;
import defpackage.bla;
import defpackage.cla;
import defpackage.cy9;
import defpackage.dla;
import defpackage.ela;
import defpackage.eza;
import defpackage.fla;
import defpackage.gka;
import defpackage.gla;
import defpackage.hka;
import defpackage.hla;
import defpackage.ika;
import defpackage.ila;
import defpackage.jha;
import defpackage.jj9;
import defpackage.jl40;
import defpackage.ly9;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oga;
import defpackage.qs9;
import defpackage.qu;
import defpackage.r;
import defpackage.sy60;
import defpackage.tka;
import defpackage.tse;
import defpackage.uk9;
import defpackage.uka;
import defpackage.vka;
import defpackage.w511;
import defpackage.wka;
import defpackage.wls;
import defpackage.xka;
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
@mvg(c = "com.yandex.go.chargers.passes.ChargersPassesRouterImpl$content$1$1$1", f = "ChargersPassesRouterImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ila $action;
    final /* synthetic */ hka $navigator;
    final /* synthetic */ com.yandex.go.chargers.passes.ui.b $uiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesRouterImpl$content$1$1$1(com.yandex.go.chargers.passes.ui.b bVar, ila ilaVar, hka hkaVar, Continuation continuation) {
        super(2, continuation);
        this.$uiActionInteractor = bVar;
        this.$action = ilaVar;
        this.$navigator = hkaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPassesRouterImpl$content$1$1$1(this.$uiActionInteractor, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPassesRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0160 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.chargers.passes.ui.b bVar = this.$uiActionInteractor;
        ila ilaVar = this.$action;
        hka hkaVar = this.$navigator;
        this.label = 1;
        bVar.getClass();
        if (jl40.l(ilaVar, tka.a) || jl40.l(ilaVar, vka.a)) {
            hkaVar.a.r(new qu(9));
        } else if (ilaVar instanceof wka) {
            cy9 cy9Var = ((wka) ilaVar).a;
            ika ikaVar = hkaVar.a;
            ikaVar.A((m950) ikaVar.K.get(), new ly9(cy9Var), new qs9(ikaVar, 5));
        } else if (ilaVar instanceof bla) {
            String str = ((bla) ilaVar).a;
            ika ikaVar2 = hkaVar.a;
            ikaVar2.A((m950) ikaVar2.Q.get(), new jha(str), new uk9(2));
        } else {
            if (ilaVar instanceof ela) {
                obj2 = bVar.a(((ela) ilaVar).a, hkaVar, this);
                return obj2 != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            if (ilaVar instanceof gla) {
                hkaVar.a.r(new r(((gla) ilaVar).a, UUID.randomUUID().toString(), 7));
            } else if (ilaVar instanceof ala) {
                String str2 = ((ala) ilaVar).a;
                ika ikaVar3 = hkaVar.a;
                ikaVar3.A((m950) ikaVar3.L.get(), new oga(str2), new gka(ikaVar3));
            } else if (ilaVar instanceof cla) {
                bVar.d.a.l(((cla) ilaVar).a);
            } else if (jl40.l(ilaVar, fla.a)) {
                ika ikaVar4 = hkaVar.a;
                ikaVar4.A((m950) ikaVar4.O.get(), new zla(true, 5), new jj9(4));
            } else if (ilaVar instanceof xka) {
                String str3 = ((xka) ilaVar).a;
                ika ikaVar5 = hkaVar.a;
                ikaVar5.A((m950) ikaVar5.I.get(), new eza(new aza(str3)), sy60.Q2);
            } else if (!(ilaVar instanceof dla)) {
                if (jl40.l(ilaVar, yka.a)) {
                    ika ikaVar6 = hkaVar.a;
                    ikaVar6.C((m950) ikaVar6.N.get(), new bb0(ikaVar6, 20));
                } else if (!(ilaVar instanceof zka) && !(ilaVar instanceof uka) && !jl40.l(ilaVar, hla.a)) {
                    w511.b();
                    return null;
                }
            }
        }
        obj2 = zy11Var;
        if (obj2 != coroutineSingletons) {
        }
    }
}
