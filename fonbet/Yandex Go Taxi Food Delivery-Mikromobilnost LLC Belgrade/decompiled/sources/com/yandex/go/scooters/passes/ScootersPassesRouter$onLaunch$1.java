package com.yandex.go.scooters.passes;

import defpackage.bei;
import defpackage.beo0;
import defpackage.ggo0;
import defpackage.jl40;
import defpackage.l76;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.reo0;
import defpackage.seo0;
import defpackage.teo0;
import defpackage.tse;
import defpackage.ueo0;
import defpackage.veo0;
import defpackage.w511;
import defpackage.weo0;
import defpackage.wls;
import defpackage.zfo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesRouter$onLaunch$1", f = "ScootersPassesRouter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ veo0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesRouter$onLaunch$1(veo0 veo0Var, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = veo0Var;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassesRouter$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ggo0 ggo0Var;
        ggo0 ggo0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ueo0 ueo0Var = this.$payload.a;
            if (ueo0Var instanceof seo0) {
                ggo0Var = new ggo0(ScootersPassesScreenRoute$PassType.PACKAGES, ScootersPassesScreenRoute$Intention.PURCHASE, null);
            } else if (jl40.l(ueo0Var, l76.P)) {
                ggo0Var = new ggo0(ScootersPassesScreenRoute$PassType.PACKAGES, ScootersPassesScreenRoute$Intention.ACTIVE, null);
            } else if (ueo0Var instanceof teo0) {
                ggo0Var = new ggo0(ScootersPassesScreenRoute$PassType.SUPERPASSES, ScootersPassesScreenRoute$Intention.PURCHASE, null);
            } else if (jl40.l(ueo0Var, reo0.a)) {
                ggo0Var = new ggo0(ScootersPassesScreenRoute$PassType.SUPERPASSES, ScootersPassesScreenRoute$Intention.ACTIVE, null);
            } else {
                if (!jl40.l(ueo0Var, bei.N)) {
                    w511.b();
                    return null;
                }
                ggo0Var = new ggo0(ScootersPassesScreenRoute$PassType.SUPERPASSES, ScootersPassesScreenRoute$Intention.ACTIVE_RENEW, null);
            }
            beo0 beo0Var = this.this$0.D;
            this.L$0 = ggo0Var;
            this.label = 1;
            Object a = ((d) beo0Var).a(ggo0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            ggo0Var2 = ggo0Var;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ggo0Var2 = (ggo0) this.L$0;
            kotlin.b.b(obj);
        }
        i iVar = (i) obj;
        h hVar = this.this$0;
        veo0 veo0Var = this.$payload;
        if (iVar != null) {
            hVar.getClass();
            hVar.A(iVar, new weo0(ggo0Var2), new zfo0(hVar, veo0Var));
        } else {
            h.P(hVar, veo0Var.a, veo0Var.b, veo0Var.c);
        }
        return zy11.a;
    }
}
