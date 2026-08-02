package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class n8j0 {
    public final String a;
    public final Map b;
    public final leu c;
    public final kq90 d;

    public n8j0() {
        this("", b.f(), leu.b, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!n8j0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n8j0 n8j0Var = (n8j0) obj;
        return jl40.l(this.a, n8j0Var.a) && jl40.l(this.b, n8j0Var.b) && jl40.l(this.c, n8j0Var.c) && jl40.l(this.d, n8j0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        kq90 kq90Var = this.d;
        return hashCode + (kq90Var != null ? kq90Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestResponseNetworkDataModel(path=" + this.a + ", queryItems=" + this.b + ", responseHeaders=" + this.c + ", patchParams=" + this.d + Extension.C_BRAKE;
    }

    public n8j0(String str, Map map, leu leuVar, kq90 kq90Var) {
        this.a = str;
        this.b = map;
        this.c = leuVar;
        this.d = kq90Var;
    }
}
