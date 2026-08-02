package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fuq0 {
    public final ConstraintLayout a;
    public final auq0 b;

    public fuq0(ConstraintLayout constraintLayout, auq0 auq0Var) {
        this.a = constraintLayout;
        this.b = auq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuq0)) {
            return false;
        }
        fuq0 fuq0Var = (fuq0) obj;
        if (!this.a.equals(fuq0Var.a)) {
            return false;
        }
        nfp0 nfp0Var = nfp0.b;
        return nfp0Var.equals(nfp0Var) && jl40.l(this.b, fuq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.hashCode() * 31) - 1065841712) * 31);
    }

    public final String toString() {
        return "State(container=" + this.a + ", screenType=" + nfp0.b + ", entity=" + this.b + Extension.C_BRAKE;
    }
}
