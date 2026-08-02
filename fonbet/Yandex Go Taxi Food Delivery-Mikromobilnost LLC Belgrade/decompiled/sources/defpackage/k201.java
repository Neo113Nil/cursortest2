package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k201 implements l201 {
    public final String a;
    public final List b;

    public k201(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k201)) {
            return false;
        }
        k201 k201Var = (k201) obj;
        return this.a.equals(k201Var.a) && this.b.equals(k201Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("Updated(id=", this.a, ", points=", Extension.C_BRAKE, this.b);
    }
}
