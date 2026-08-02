package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class j170 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final Map d;

    public j170(String str, CharSequence charSequence, CharSequence charSequence2, Map map) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j170)) {
            return false;
        }
        j170 j170Var = (j170) obj;
        return jl40.l(this.a, j170Var.a) && jl40.l(this.b, j170Var.b) && jl40.l(this.c, j170Var.c) && jl40.l(this.d, j170Var.d);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Map map = this.d;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Onboarding(id=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", analyticsPayload=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
