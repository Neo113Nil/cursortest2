package com.yandex.go.scooters;

import com.yandex.go.scooters.api.domain.model.ScootersPassesListService;
import com.yandex.go.scooters.domain.q;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.alo0;
import defpackage.blo0;
import defpackage.c0o0;
import defpackage.clo0;
import defpackage.dhn;
import defpackage.glo0;
import defpackage.hlo0;
import defpackage.jjn0;
import defpackage.kjn0;
import defpackage.klo0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pxm0;
import defpackage.reo0;
import defpackage.s6k0;
import defpackage.teo0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v3o0;
import defpackage.veo0;
import defpackage.vgn;
import defpackage.w511;
import defpackage.wko0;
import defpackage.wls;
import defpackage.xko0;
import defpackage.yko0;
import defpackage.zko0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ScootersPreorderRouter$onAttach$1", f = "ScootersPreorderRouter.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreorderRouter$onAttach$1 extends SuspendLambda implements wls {
    final /* synthetic */ clo0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreorderRouter$onAttach$1(clo0 clo0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = clo0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPreorderRouter$onAttach$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPreorderRouter$onAttach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersPreorderRouter$onAttach$1 scootersPreorderRouter$onAttach$1;
        b bVar;
        clo0 clo0Var;
        clo0 clo0Var2;
        c0o0 c0o0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            clo0 clo0Var3 = this.$payload;
            if ((clo0Var3 instanceof xko0) || (clo0Var3 instanceof wko0)) {
                scootersPreorderRouter$onAttach$1 = this;
                clo0Var = scootersPreorderRouter$onAttach$1.$payload;
                if (!(clo0Var instanceof yko0)) {
                    scootersPreorderRouter$onAttach$1.this$0.S((yko0) clo0Var);
                } else if (clo0Var instanceof zko0) {
                    scootersPreorderRouter$onAttach$1.this$0.U(clo0Var.a, (zko0) clo0Var);
                } else if (clo0Var instanceof alo0) {
                    b bVar2 = scootersPreorderRouter$onAttach$1.this$0;
                    tje.N(bVar2.o(), null, null, new ScootersPreorderRouter$launchScooterOffer$1(bVar2, (alo0) clo0Var, null), 3);
                } else if (clo0Var instanceof blo0) {
                    b bVar3 = scootersPreorderRouter$onAttach$1.this$0;
                    pxm0 pxm0Var = clo0Var.a;
                    hlo0 hlo0Var = new hlo0(bVar3, 1);
                    com.yandex.go.scooters.offer_on_camera.b bVar4 = bVar3.h0;
                    if (bVar4 == null) {
                        bVar4 = (com.yandex.go.scooters.offer_on_camera.b) bVar3.O.get();
                        bVar3.h0 = bVar4;
                    }
                    bVar3.A(bVar4, new v3o0(pxm0Var, null), new klo0(bVar3, pxm0Var, hlo0Var));
                } else {
                    int i2 = 2;
                    if (clo0Var instanceof xko0) {
                        b bVar5 = scootersPreorderRouter$onAttach$1.this$0;
                        xko0 xko0Var = (xko0) clo0Var;
                        String str = xko0Var.b;
                        ScootersPassesListService scootersPassesListService = xko0Var.c;
                        bVar5.getClass();
                        bVar5.D((m950) bVar5.H.get(), new veo0(new teo0(str), scootersPassesListService == ScootersPassesListService.CHARGERS ? ScootersPassesFromScreen.CHARGERS : ScootersPassesFromScreen.DISCOVERY, null), new glo0(bVar5, i2));
                    } else {
                        if (!(clo0Var instanceof wko0)) {
                            w511.b();
                            return null;
                        }
                        b bVar6 = scootersPreorderRouter$onAttach$1.this$0;
                        ScootersPassesListService scootersPassesListService2 = ((wko0) clo0Var).b;
                        bVar6.getClass();
                        bVar6.D((m950) bVar6.H.get(), new veo0(reo0.a, scootersPassesListService2 == ScootersPassesListService.CHARGERS ? ScootersPassesFromScreen.CHARGERS : ScootersPassesFromScreen.DISCOVERY, null), new glo0(bVar6, i2));
                    }
                }
                clo0Var2 = scootersPreorderRouter$onAttach$1.$payload;
                if (!(clo0Var2 instanceof xko0) && !(clo0Var2 instanceof wko0)) {
                    b bVar7 = scootersPreorderRouter$onAttach$1.this$0;
                    c0o0Var = bVar7.g0;
                    if (c0o0Var == null) {
                        c0o0Var = (c0o0) bVar7.N.get();
                        bVar7.g0 = c0o0Var;
                    }
                    bVar7.z(c0o0Var, new glo0(bVar7, 0));
                }
                return zy11.a;
            }
            b bVar8 = this.this$0;
            s6k0 s6k0Var = bVar8.P;
            this.L$0 = bVar8;
            this.label = 1;
            scootersPreorderRouter$onAttach$1 = this;
            Object a = ((com.yandex.go.eboks.objects.a) s6k0Var.b).a(new dhn("scooters", "discovery"), new jjn0(), (q) s6k0Var.c, (kjn0) s6k0Var.a, scootersPreorderRouter$onAttach$1);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar8;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
            scootersPreorderRouter$onAttach$1 = this;
        }
        bVar.k0 = (vgn) obj;
        b bVar9 = scootersPreorderRouter$onAttach$1.this$0;
        bVar9.R.a = bVar9.k0;
        b.Q(bVar9, scootersPreorderRouter$onAttach$1.$payload);
        clo0Var = scootersPreorderRouter$onAttach$1.$payload;
        if (!(clo0Var instanceof yko0)) {
        }
        clo0Var2 = scootersPreorderRouter$onAttach$1.$payload;
        if (!(clo0Var2 instanceof xko0)) {
            b bVar72 = scootersPreorderRouter$onAttach$1.this$0;
            c0o0Var = bVar72.g0;
            if (c0o0Var == null) {
            }
            bVar72.z(c0o0Var, new glo0(bVar72, 0));
        }
        return zy11.a;
    }
}
