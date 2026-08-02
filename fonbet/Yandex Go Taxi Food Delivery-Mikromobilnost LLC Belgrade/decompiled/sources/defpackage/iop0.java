package defpackage;

import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResult;
import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResultV2;
import com.ybsdk.api.YBSdkScenarioResultReceiver$RegistrationResult;
import com.ybsdk.api.e;

/* loaded from: classes2.dex */
public final class iop0 implements kh51 {
    public final e a;

    public iop0(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.kh51
    public final void a(jh51 jh51Var) {
        fh51 fh51Var;
        if (jh51Var instanceof ih51) {
            fh51Var = new ah51(((ih51) jh51Var).a);
        } else if (jh51Var.equals(wbz0.w)) {
            fh51Var = zg51.b;
        } else {
            if (!jh51Var.equals(m501.x)) {
                w511.b();
                return;
            }
            fh51Var = zg51.c;
        }
        this.a.f(fh51Var);
    }

    @Override // defpackage.kh51
    public final void b(YBSdkScenarioResultReceiver$RegistrationResult yBSdkScenarioResultReceiver$RegistrationResult, String str) {
        fh51 yg51Var;
        int i = hop0.a[yBSdkScenarioResultReceiver$RegistrationResult.ordinal()];
        if (i == 1) {
            yg51Var = new yg51(str);
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            yg51Var = xg51.b;
        }
        this.a.f(yg51Var);
    }

    @Override // defpackage.kh51
    public final void c(YBSdkScenarioResultReceiver$CreditResult yBSdkScenarioResultReceiver$CreditResult) {
    }

    @Override // defpackage.kh51
    public final void d(YBSdkScenarioResultReceiver$CreditResultV2 yBSdkScenarioResultReceiver$CreditResultV2) {
        fh51 rg51Var;
        if (yBSdkScenarioResultReceiver$CreditResultV2 instanceof YBSdkScenarioResultReceiver$CreditResultV2.Fail) {
            ((YBSdkScenarioResultReceiver$CreditResultV2.Fail) yBSdkScenarioResultReceiver$CreditResultV2).getOnFail();
            rg51Var = new qg51(null);
        } else {
            if (!(yBSdkScenarioResultReceiver$CreditResultV2 instanceof YBSdkScenarioResultReceiver$CreditResultV2.Success)) {
                w511.b();
                return;
            }
            rg51Var = new rg51();
        }
        this.a.f(rg51Var);
    }
}
