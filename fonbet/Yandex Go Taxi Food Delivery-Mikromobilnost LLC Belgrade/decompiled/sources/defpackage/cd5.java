package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cd5 extends vb5 {
    public final izc0 a;
    public final boolean b;

    public cd5(izc0 izc0Var, boolean z) {
        this.a = izc0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd5)) {
            return false;
        }
        cd5 cd5Var = (cd5) obj;
        return jl40.l(this.a, cd5Var.a) && this.b == cd5Var.b;
    }

    public final int hashCode() {
        izc0 izc0Var = this.a;
        return Boolean.hashCode(this.b) + ((izc0Var == null ? 0 : izc0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "ViewState(playlist=" + this.a + ", textIsCollapsed=" + this.b + Extension.C_BRAKE;
    }

    public cd5() {
        this(null, true);
    }
}
