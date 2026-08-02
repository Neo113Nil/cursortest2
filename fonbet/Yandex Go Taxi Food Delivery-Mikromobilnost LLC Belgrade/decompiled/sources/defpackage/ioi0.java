package defpackage;

import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ioi0 {
    public final View a;
    public final int b;

    public ioi0(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioi0)) {
            return false;
        }
        ioi0 ioi0Var = (ioi0) obj;
        return jl40.l(this.a, ioi0Var.a) && this.b == ioi0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonMarginState(button=" + this.a + ", topMargin=" + this.b + Extension.C_BRAKE;
    }
}
