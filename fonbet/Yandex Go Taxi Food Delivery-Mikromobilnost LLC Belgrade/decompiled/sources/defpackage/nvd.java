package defpackage;

import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResult;
import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResultV2;
import com.ybsdk.api.YBSdkScenarioResultReceiver$RegistrationResult;
import com.ybsdk.navigation.ScenarioResultReceiver$AccountUpgradeResult;
import com.ybsdk.navigation.ScenarioResultReceiver$CardActivationResult;
import com.ybsdk.navigation.ScenarioResultReceiver$ChangePhoneResult;
import com.ybsdk.navigation.ScenarioResultReceiver$EsiaUpgradeResult;
import com.ybsdk.navigation.ScenarioResultReceiver$TransferResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class nvd implements kh51 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.kh51
    public final void a(jh51 jh51Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kh51) it.next()).a(jh51Var);
        }
    }

    @Override // defpackage.kh51
    public final void b(YBSdkScenarioResultReceiver$RegistrationResult yBSdkScenarioResultReceiver$RegistrationResult, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kh51) it.next()).b(yBSdkScenarioResultReceiver$RegistrationResult, str);
        }
    }

    @Override // defpackage.kh51
    public final void c(YBSdkScenarioResultReceiver$CreditResult yBSdkScenarioResultReceiver$CreditResult) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kh51) it.next()).c(yBSdkScenarioResultReceiver$CreditResult);
        }
    }

    @Override // defpackage.kh51
    public final void d(YBSdkScenarioResultReceiver$CreditResultV2 yBSdkScenarioResultReceiver$CreditResultV2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kh51) it.next()).d(yBSdkScenarioResultReceiver$CreditResultV2);
        }
    }

    public final void e(iop0 iop0Var) {
        this.a.add(iop0Var);
    }

    public final void f(ScenarioResultReceiver$AccountUpgradeResult scenarioResultReceiver$AccountUpgradeResult) {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.f(scenarioResultReceiver$AccountUpgradeResult);
            }
        }
    }

    public final void g(ScenarioResultReceiver$CardActivationResult scenarioResultReceiver$CardActivationResult) {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.g(scenarioResultReceiver$CardActivationResult);
            }
        }
    }

    public final void h(ScenarioResultReceiver$ChangePhoneResult scenarioResultReceiver$ChangePhoneResult) {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.h(scenarioResultReceiver$ChangePhoneResult);
            }
        }
    }

    public final void i(ScenarioResultReceiver$EsiaUpgradeResult scenarioResultReceiver$EsiaUpgradeResult) {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.i(scenarioResultReceiver$EsiaUpgradeResult);
            }
        }
    }

    public final void j() {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.j();
            }
        }
    }

    public final void k(String str) {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.k(str);
            }
        }
    }

    public final void l(ScenarioResultReceiver$TransferResult scenarioResultReceiver$TransferResult) {
        for (kh51 kh51Var : this.a) {
            nvd nvdVar = kh51Var instanceof nvd ? (nvd) kh51Var : null;
            if (nvdVar != null) {
                nvdVar.l(scenarioResultReceiver$TransferResult);
            }
        }
    }
}
