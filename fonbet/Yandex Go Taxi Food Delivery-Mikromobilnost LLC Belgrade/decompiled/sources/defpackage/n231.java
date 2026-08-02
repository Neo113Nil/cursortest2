package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class n231 extends p131 {
    public static final m231 Companion = new m231();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(13)), null, null};
    public final List a;
    public final boolean b;
    public final b c;

    public n231(int i, List list, boolean z, b bVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, l231.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n231)) {
            return false;
        }
        n231 n231Var = (n231) obj;
        return jl40.l(this.a, n231Var.a) && this.b == n231Var.b && jl40.l(this.c, n231Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        return e + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "VariableNode(path=" + this.a + ", isOptional=" + this.b + ", optionalDescriptor=" + this.c + Extension.C_BRAKE;
    }
}
