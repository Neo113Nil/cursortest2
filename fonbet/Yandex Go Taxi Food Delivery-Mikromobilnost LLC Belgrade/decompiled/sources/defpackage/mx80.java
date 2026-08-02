package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mx80 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;

    public mx80(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx80)) {
            return false;
        }
        mx80 mx80Var = (mx80) obj;
        return this.a.equals(mx80Var.a) && this.b.equals(mx80Var.b) && this.c.equals(mx80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, x4e.m("OutlineData(cleanText=", this.a, ", boldIndices=", ", italicIndices=", this.b), this.c);
    }
}
