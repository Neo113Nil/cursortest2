package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ji10 {
    public final q7v a;
    public final Map b;

    public ji10(q7v q7vVar, Map map) {
        this.a = q7vVar;
        this.b = vng.M(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji10)) {
            return false;
        }
        ji10 ji10Var = (ji10) obj;
        return jl40.l(this.a, ji10Var.a) && jl40.l(this.b, ji10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + Extension.C_BRAKE;
    }
}
