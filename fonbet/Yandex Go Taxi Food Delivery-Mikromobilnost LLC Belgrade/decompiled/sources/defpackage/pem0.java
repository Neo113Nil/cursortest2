package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pem0 implements qem0 {
    public final BottomSheetDialogView.State a;
    public final cx11 b;

    public pem0(BottomSheetDialogView.State state, cx11 cx11Var) {
        this.a = state;
        this.b = cx11Var;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pem0)) {
            return false;
        }
        pem0 pem0Var = (pem0) obj;
        return this.a.equals(pem0Var.a) && this.b.equals(pem0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountUnbindLoading(bottomSheetState=" + this.a + ", unbindAccountSheet=" + this.b + Extension.C_BRAKE;
    }
}
