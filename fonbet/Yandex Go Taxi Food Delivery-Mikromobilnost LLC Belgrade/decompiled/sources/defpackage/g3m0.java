package defpackage;

import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class g3m0 {
    public final SavingsAccountCloseDepositParams a;
    public final boolean b;

    public g3m0(SavingsAccountCloseDepositParams savingsAccountCloseDepositParams, boolean z) {
        this.a = savingsAccountCloseDepositParams;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3m0)) {
            return false;
        }
        g3m0 g3m0Var = (g3m0) obj;
        return this.a.equals(g3m0Var.a) && this.b == g3m0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SavingsAccountCloseDepositState(params=" + this.a + ", closingInProgress=" + this.b + Extension.C_BRAKE;
    }
}
