package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class buq {
    public final String a;
    public final String b;
    public final List c;
    public final ga0 d;

    public buq(String str, String str2, List list, ga0 ga0Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = ga0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buq)) {
            return false;
        }
        buq buqVar = (buq) obj;
        return jl40.l(this.a, buqVar.a) && jl40.l(this.b, buqVar.b) && jl40.l(this.c, buqVar.c) && jl40.l(this.d, buqVar.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ga0 ga0Var = this.d;
        return c + (ga0Var == null ? 0 : ga0Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("FeedbackReason(reasonId=", this.a, ", title=", this.b, ", scores=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
