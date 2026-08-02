package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gg01 implements jg01 {
    public final List a;
    public final stz0 b;

    public gg01(List list, stz0 stz0Var) {
        this.a = list;
        this.b = stz0Var;
    }

    public final stz0 a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg01)) {
            return false;
        }
        gg01 gg01Var = (gg01) obj;
        return jl40.l(this.a, gg01Var.a) && this.b.equals(gg01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(transactions=" + this.a + ", toolbarState=" + this.b + Extension.C_BRAKE;
    }
}
