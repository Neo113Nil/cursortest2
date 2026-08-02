package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersIgnitionControlPanelButtonName;
import defpackage.c21;
import defpackage.hrn0;
import defpackage.m950;
import defpackage.mo30;
import defpackage.mrn0;
import defpackage.mvg;
import defpackage.nrn0;
import defpackage.ny61;
import defpackage.orn0;
import defpackage.prn0;
import defpackage.qrn0;
import defpackage.qu;
import defpackage.qwo0;
import defpackage.qxm0;
import defpackage.rrn0;
import defpackage.srn0;
import defpackage.sy60;
import defpackage.trn0;
import defpackage.tse;
import defpackage.tse0;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wls;
import defpackage.z7n0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.panel.ScootersIgnitionPanelRouter$content$1$1$1", f = "ScootersIgnitionPanelRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPanelRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ rrn0 $action;
    final /* synthetic */ hrn0 $navigator;
    final /* synthetic */ trn0 $scootersIgnitionPanelUiActionInteractor;
    final /* synthetic */ mrn0 $screenStateRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPanelRouter$content$1$1$1(trn0 trn0Var, rrn0 rrn0Var, hrn0 hrn0Var, mrn0 mrn0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersIgnitionPanelUiActionInteractor = trn0Var;
        this.$action = rrn0Var;
        this.$navigator = hrn0Var;
        this.$screenStateRepository = mrn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersIgnitionPanelRouter$content$1$1$1(this.$scootersIgnitionPanelUiActionInteractor, this.$action, this.$navigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersIgnitionPanelRouter$content$1$1$1 scootersIgnitionPanelRouter$content$1$1$1 = (ScootersIgnitionPanelRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersIgnitionPanelRouter$content$1$1$1.invokeSuspend(zy11Var);
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
        trn0 trn0Var = this.$scootersIgnitionPanelUiActionInteractor;
        rrn0 rrn0Var = this.$action;
        hrn0 hrn0Var = this.$navigator;
        mrn0 mrn0Var = this.$screenStateRepository;
        qwo0 qwo0Var = trn0Var.b;
        qxm0 qxm0Var = trn0Var.a;
        boolean z = rrn0Var instanceof qrn0;
        zy11 zy11Var = zy11.a;
        if (z) {
            qxm0Var.a.a("Scooters.IgnitionControlPanel.Opened", tse0.p(qxm0Var), 1, new HashMap());
            return zy11Var;
        }
        if (rrn0Var instanceof prn0) {
            qxm0Var.b(ScootersAnalytics$ScootersIgnitionControlPanelButtonName.Close, null);
            hrn0Var.a.r(new qu(9));
            return zy11Var;
        }
        boolean z2 = rrn0Var instanceof nrn0;
        c21 c21Var = sy60.Q2;
        if (!z2) {
            if (!(rrn0Var instanceof orn0)) {
                w511.b();
                return null;
            }
            qxm0Var.b(ScootersAnalytics$ScootersIgnitionControlPanelButtonName.StartControlling, null);
            if (!qwo0Var.a()) {
                String str = ((orn0) rrn0Var).a;
                if (str.length() != 0) {
                    r1 = str;
                }
            }
            c cVar = hrn0Var.a;
            if (r1 == null || r1.length() == 0) {
                cVar.z((m950) cVar.J.get(), c21Var);
                return zy11Var;
            }
            cVar.A((m950) cVar.I.get(), new z7n0(r1, true), new mo30(28, hrn0Var));
            return zy11Var;
        }
        ScootersAnalytics$ScootersIgnitionControlPanelButtonName scootersAnalytics$ScootersIgnitionControlPanelButtonName = ScootersAnalytics$ScootersIgnitionControlPanelButtonName.Banner;
        nrn0 nrn0Var = (nrn0) rrn0Var;
        String str2 = nrn0Var.c;
        String str3 = nrn0Var.a;
        qxm0Var.b(scootersAnalytics$ScootersIgnitionControlPanelButtonName, str3);
        int i = srn0.a[nrn0Var.b.ordinal()];
        if (i == 1) {
            qwo0Var.t.setValue(qwo0Var, qwo0.B[18], v4r0.i(qwo0Var.b(), str3));
            c cVar2 = hrn0Var.a;
            cVar2.A((m950) cVar2.I.get(), new z7n0(str2, true), c21Var);
            mrn0Var.a.g(zy11Var);
            return zy11Var;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        if (qwo0Var.b().contains(str3)) {
            r1 = str2.length() != 0 ? str2 : null;
            if (r1 != null) {
                c cVar3 = hrn0Var.a;
                cVar3.A((m950) cVar3.I.get(), new z7n0(r1, true), c21Var);
                mrn0Var.a.g(zy11Var);
            }
            return zy11Var;
        }
        r1 = str2.length() != 0 ? str2 : null;
        if (r1 != null) {
            qwo0Var.t.setValue(qwo0Var, qwo0.B[18], v4r0.i(qwo0Var.b(), str3));
        }
        c cVar4 = hrn0Var.a;
        if (r1 == null || r1.length() == 0) {
            cVar4.z((m950) cVar4.J.get(), c21Var);
        } else {
            cVar4.A((m950) cVar4.I.get(), new z7n0(r1, true), new mo30(28, hrn0Var));
        }
        mrn0Var.a.g(zy11Var);
        return zy11Var;
    }
}
