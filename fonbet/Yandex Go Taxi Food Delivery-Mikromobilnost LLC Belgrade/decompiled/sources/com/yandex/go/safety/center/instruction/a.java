package com.yandex.go.safety.center.instruction;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallScenario;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallStatus;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.n48;
import defpackage.ppl0;
import defpackage.tje;
import defpackage.tse0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ a(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SafetyCenterExperiment.Instruction instruction = hVar.J;
                com.yandex.go.safety.center.analytics.a aVar = hVar.L;
                if (booleanValue) {
                    aVar.d(SafetyCenterAnalytics$EmergencyCallStatus.Ended, instruction instanceof n48 ? SafetyCenterAnalytics$EmergencyCallScenario.Accident : SafetyCenterAnalytics$EmergencyCallScenario.Instructions);
                    boolean z = instruction instanceof n48;
                    tje.N(hVar.Jg(), null, null, new SafetyCenterInstructionPresenter$onCallResult$1(hVar, z ? ShareRequestParam.NotificationType.CRASH_DETECTION : ShareRequestParam.NotificationType.INSTRUCTION, null), 3);
                    ppl0 ppl0Var = aVar.a;
                    if (!z) {
                        ppl0Var.a.a("SafetyCenter.Instruction.ShareExecuted", tse0.o(ppl0Var), 1, new HashMap());
                        break;
                    } else {
                        ppl0Var.a.a("SafetyCenter.CarCrash.ShareExecuted", tse0.o(ppl0Var), 1, new HashMap());
                        break;
                    }
                }
                break;
            default:
                tje.N(hVar.Jg(), null, null, new SafetyCenterInstructionPresenter$showInstruction$1(hVar, null), 3);
                break;
        }
        return zy11Var;
    }
}
