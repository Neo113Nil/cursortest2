package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.state.AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mu3 implements su3 {
    public final ou3 a;
    public final ou3 b;
    public final AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput c;

    public mu3(ou3 ou3Var, ou3 ou3Var2, AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput) {
        this.a = ou3Var;
        this.b = ou3Var2;
        this.c = autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput;
    }

    public static mu3 a(mu3 mu3Var, ou3 ou3Var, ou3 ou3Var2, AutoTopupBottomSheetV2State$AutoTopupEdit$FocusInput autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput, int i) {
        if ((i & 1) != 0) {
            ou3Var = mu3Var.a;
        }
        if ((i & 2) != 0) {
            ou3Var2 = mu3Var.b;
        }
        if ((i & 4) != 0) {
            autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput = mu3Var.c;
        }
        mu3Var.getClass();
        return new mu3(ou3Var, ou3Var2, autoTopupBottomSheetV2State$AutoTopupEdit$FocusInput);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu3)) {
            return false;
        }
        mu3 mu3Var = (mu3) obj;
        return this.a.equals(mu3Var.a) && this.b.equals(mu3Var.b) && this.c == mu3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AutoTopupEdit(amount=" + this.a + ", threshold=" + this.b + ", focusedInput=" + this.c + Extension.C_BRAKE;
    }
}
