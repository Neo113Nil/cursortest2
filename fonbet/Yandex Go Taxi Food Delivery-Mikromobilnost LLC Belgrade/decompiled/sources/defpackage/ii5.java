package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ii5 extends keo {
    public final boolean c;
    public final ro41 d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ii5(boolean z, ro41 ro41Var, String str) {
        super("bdui_webview_error", b.i(r0, r2, new Pair("error", r1)));
        String concat;
        Pair pair = new Pair("url", str);
        Pair pair2 = new Pair("is_auth_required", String.valueOf(z));
        if (ro41Var instanceof qo41) {
            concat = "No auth provider";
        } else if (ro41Var instanceof no41) {
            concat = g8e.o("Auth error: ", ((no41) ro41Var).a.getMessage());
        } else if (ro41Var instanceof oo41) {
            oo41 oo41Var = (oo41) ro41Var;
            concat = "Navigation failed for " + oo41Var.b + " error: " + oo41Var.a;
        } else {
            if (!(ro41Var instanceof po41)) {
                w511.b();
                throw null;
            }
            concat = "Error: ".concat(((po41) ro41Var).a);
        }
        this.c = z;
        this.d = ro41Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii5)) {
            return false;
        }
        ii5 ii5Var = (ii5) obj;
        return this.c == ii5Var.c && jl40.l(this.d, ii5Var.d) && jl40.l(this.e, ii5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (Boolean.hashCode(this.c) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewError(authRequired=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", url=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
