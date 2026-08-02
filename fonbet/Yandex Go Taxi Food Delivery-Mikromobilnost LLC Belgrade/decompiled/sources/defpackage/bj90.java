package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bj90 {
    public final br51 a;
    public final boolean b;
    public final u8j0 c;
    public final TransferScenario d;

    public bj90(br51 br51Var, boolean z, u8j0 u8j0Var, TransferScenario transferScenario) {
        this.a = br51Var;
        this.b = z;
        this.c = u8j0Var;
        this.d = transferScenario;
    }

    public static bj90 a(bj90 bj90Var, br51 br51Var, u8j0 u8j0Var, int i) {
        if ((i & 1) != 0) {
            br51Var = bj90Var.a;
        }
        boolean z = bj90Var.b;
        if ((i & 4) != 0) {
            u8j0Var = bj90Var.c;
        }
        TransferScenario transferScenario = bj90Var.d;
        bj90Var.getClass();
        return new bj90(br51Var, z, u8j0Var, transferScenario);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj90)) {
            return false;
        }
        bj90 bj90Var = (bj90) obj;
        return jl40.l(this.a, bj90Var.a) && this.b == bj90Var.b && this.c.equals(bj90Var.c) && this.d == bj90Var.d;
    }

    public final int hashCode() {
        br51 br51Var = this.a;
        int hashCode = (this.c.hashCode() + unr0.e((br51Var == null ? 0 : br51Var.hashCode()) * 31, 31, this.b)) * 31;
        TransferScenario transferScenario = this.d;
        return hashCode + (transferScenario != null ? transferScenario.hashCode() : 0);
    }

    public final String toString() {
        return "PartnersState(errorInfo=" + this.a + ", isBackButtonVisible=" + this.b + ", partnersStateStatus=" + this.c + ", transferScenario=" + this.d + Extension.C_BRAKE;
    }
}
