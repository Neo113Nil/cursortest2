package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l2i {
    public final String a;
    public final List b;
    public final v1i c;
    public final String d;

    public l2i(String str, List list, v1i v1iVar, String str2) {
        this.a = str;
        this.b = list;
        this.c = v1iVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2i)) {
            return false;
        }
        l2i l2iVar = (l2i) obj;
        return jl40.l(this.a, l2iVar.a) && this.b.equals(l2iVar.b) && this.c.equals(l2iVar.c) && jl40.l(this.d, l2iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("DeliveryCostDetailsScreenState(title=", this.a, ", details=", this.b, ", totalPrice=");
        r.append(this.c);
        r.append(", buttonText=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
