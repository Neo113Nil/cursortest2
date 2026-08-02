package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j2i {
    public final String a;
    public final ArrayList b;
    public final u1i c;
    public final String d;

    public j2i(String str, ArrayList arrayList, u1i u1iVar, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = u1iVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2i)) {
            return false;
        }
        j2i j2iVar = (j2i) obj;
        return jl40.l(this.a, j2iVar.a) && this.b.equals(j2iVar.b) && this.c.equals(j2iVar.c) && jl40.l(this.d, j2iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = x4e.m("DeliveryCostDetailsScreen(title=", this.a, ", details=", ", totalPrice=", this.b);
        m.append(this.c);
        m.append(", buttonText=");
        m.append(this.d);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
