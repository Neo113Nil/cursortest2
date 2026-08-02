package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j9m0 implements s9m0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public j9m0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9m0)) {
            return false;
        }
        j9m0 j9m0Var = (j9m0) obj;
        return jl40.l(this.a, j9m0Var.a) && jl40.l(this.b, j9m0Var.b) && this.c.equals(j9m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, b64.v("Documents(id=", this.a, ", title=", this.b, ", buttons="), this.c);
    }
}
