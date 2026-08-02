package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class bg3 {
    public final k1b1 a;
    public final sf3 b;

    public bg3(int i) {
        this.a = (i & 1) != 0 ? qf3.a : rf3.a;
        this.b = sf3.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return jl40.l(this.a, bg3Var.a) && jl40.l(this.b, bg3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        this.b.getClass();
        return hashCode - 1927537897;
    }

    public final String toString() {
        return "RequestGain(gainType=" + this.a + ", lossBehavior=" + this.b + Extension.C_BRAKE;
    }

    public bg3() {
        this(3);
    }
}
