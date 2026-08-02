package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a5r0 implements g5r0 {
    public final int a;
    public final List b;
    public final String c;
    public final tls d;

    public a5r0(int i, tls tlsVar, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5r0)) {
            return false;
        }
        a5r0 a5r0Var = (a5r0) obj;
        return this.a == a5r0Var.a && jl40.l(this.b, a5r0Var.b) && jl40.l(this.c, a5r0Var.c) && this.d.equals(a5r0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ButtonsSettings(titleRes=" + this.a + ", buttons=" + this.b + ", selectedId=" + this.c + ", onSettingsSelected=" + this.d + Extension.C_BRAKE;
    }
}
