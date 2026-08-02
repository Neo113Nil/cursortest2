package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lar0 implements nar0 {
    public final String a;
    public final xss0 b;

    public lar0(String str, xss0 xss0Var) {
        this.a = str;
        this.b = xss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lar0)) {
            return false;
        }
        lar0 lar0Var = (lar0) obj;
        return jl40.l(this.a, lar0Var.a) && jl40.l(this.b, lar0Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slot(id=" + this.a + ", slot=" + this.b + Extension.C_BRAKE;
    }
}
