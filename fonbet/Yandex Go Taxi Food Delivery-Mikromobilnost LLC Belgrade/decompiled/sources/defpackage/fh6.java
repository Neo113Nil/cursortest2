package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.BottomSheetViewState$SelectAccount$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fh6 implements hh6 {
    public final pdq0 a;
    public final rr51 b;
    public final BottomSheetViewState$SelectAccount$Type c;

    public fh6(pdq0 pdq0Var, rr51 rr51Var, BottomSheetViewState$SelectAccount$Type bottomSheetViewState$SelectAccount$Type) {
        this.a = pdq0Var;
        this.b = rr51Var;
        this.c = bottomSheetViewState$SelectAccount$Type;
    }

    public final rr51 a() {
        return this.b;
    }

    public final pdq0 b() {
        return this.a;
    }

    public final BottomSheetViewState$SelectAccount$Type c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh6)) {
            return false;
        }
        fh6 fh6Var = (fh6) obj;
        return this.a.equals(fh6Var.a) && jl40.l(this.b, fh6Var.b) && this.c == fh6Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rr51 rr51Var = this.b;
        return this.c.hashCode() + ((hashCode + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31);
    }

    public final String toString() {
        return "SelectAccount(selectPaymentMethodViewState=" + this.a + ", divkitData=" + this.b + ", type=" + this.c + Extension.C_BRAKE;
    }
}
