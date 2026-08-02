package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class p9m0 implements s9m0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public p9m0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9m0)) {
            return false;
        }
        p9m0 p9m0Var = (p9m0) obj;
        return jl40.l(this.a, p9m0Var.a) && jl40.l(this.b, p9m0Var.b) && this.c.equals(p9m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("Income(id=", this.a, ", title=", this.b, ", periods="), this.c);
    }
}
