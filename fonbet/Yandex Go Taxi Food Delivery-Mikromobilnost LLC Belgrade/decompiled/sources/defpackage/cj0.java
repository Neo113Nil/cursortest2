package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cj0 {
    public final String a;
    public final SpinnerState b;

    static {
        SpinnerState spinnerState = SpinnerState.LOADING;
    }

    public cj0(String str, SpinnerState spinnerState) {
        this.a = str;
        this.b = spinnerState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj0)) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        return this.a.equals(cj0Var.a) && this.b == cj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddPaymentSpinnerUiState(title=" + this.a + ", spinnerState=" + this.b + Extension.C_BRAKE;
    }
}
