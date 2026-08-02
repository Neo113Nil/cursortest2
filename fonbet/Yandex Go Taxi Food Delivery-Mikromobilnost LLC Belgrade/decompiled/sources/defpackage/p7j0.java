package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class p7j0 {
    public final String a;
    public final Map b;
    public final kq90 c;

    public /* synthetic */ p7j0(int i, String str, Map map) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? b.f() : map, (kq90) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p7j0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p7j0 p7j0Var = (p7j0) obj;
        return jl40.l(this.a, p7j0Var.a) && jl40.l(this.b, p7j0Var.b) && jl40.l(this.c, p7j0Var.c);
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        kq90 kq90Var = this.c;
        return d + (kq90Var != null ? kq90Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestNetworkDataModel(path=" + this.a + ", queryItems=" + this.b + ", patchParams=" + this.c + Extension.C_BRAKE;
    }

    public p7j0(String str, Map map, kq90 kq90Var) {
        this.a = str;
        this.b = map;
        this.c = kq90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p7j0() {
        this(7, (String) null, (Map) (0 == true ? 1 : 0));
    }
}
