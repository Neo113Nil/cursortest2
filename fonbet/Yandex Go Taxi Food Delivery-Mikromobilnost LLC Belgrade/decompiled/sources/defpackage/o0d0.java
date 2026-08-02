package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o0d0 extends q0d0 {
    public final String b;
    public final List c;
    public final String d;

    public o0d0(String str, List list, String str2) {
        super("typed_screen");
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0d0)) {
            return false;
        }
        o0d0 o0d0Var = (o0d0) obj;
        return jl40.l(this.b, o0d0Var.b) && jl40.l(this.c, o0d0Var.c) && jl40.l(this.d, o0d0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(xvz.r("TypedScreen(typedScreen=", this.b, ", templateKeys=", this.c, ", plusContext="), this.d, Extension.C_BRAKE);
    }
}
