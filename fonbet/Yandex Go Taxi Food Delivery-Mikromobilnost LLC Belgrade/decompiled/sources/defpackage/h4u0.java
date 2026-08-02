package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h4u0 {
    public final String a;
    public final Object b;
    public final qus0 c;

    public h4u0(String str, Object obj, qus0 qus0Var) {
        this.a = str;
        this.b = obj;
        this.c = qus0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4u0)) {
            return false;
        }
        h4u0 h4u0Var = (h4u0) obj;
        return jl40.l(this.a, h4u0Var.a) && jl40.l(this.b, h4u0Var.b) && this.c.equals(h4u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "StateDependedStyleModel(formStateKey=" + this.a + ", formStateValue=" + this.b + ", style=" + this.c + Extension.C_BRAKE;
    }
}
