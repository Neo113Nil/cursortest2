package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class nv00 {
    public final Object a;
    public final List b;

    public nv00(Object obj, List list) {
        this.a = obj;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv00)) {
            return false;
        }
        nv00 nv00Var = (nv00) obj;
        return this.a.equals(nv00Var.a) && jl40.l(this.b, nv00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MappedResponse(response=" + this.a + ", expirables=" + this.b + Extension.C_BRAKE;
    }
}
