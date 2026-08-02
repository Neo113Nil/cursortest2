package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class iee0 {
    public final String a;
    public final Map b;

    public iee0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iee0)) {
            return false;
        }
        iee0 iee0Var = (iee0) obj;
        return this.a.equals(iee0Var.a) && this.b.equals(iee0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("PostMessage(type=", this.a, ", payload=", Extension.C_BRAKE, this.b);
    }
}
