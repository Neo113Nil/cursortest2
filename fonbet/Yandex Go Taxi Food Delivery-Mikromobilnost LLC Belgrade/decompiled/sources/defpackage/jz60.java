package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jz60 {
    public final az60 a;
    public final ArrayList b;
    public final yy60 c;
    public final ArrayList d;
    public final hz60 e;
    public final boolean f;

    public jz60(az60 az60Var, ArrayList arrayList, yy60 yy60Var, ArrayList arrayList2, hz60 hz60Var, boolean z) {
        this.a = az60Var;
        this.b = arrayList;
        this.c = yy60Var;
        this.d = arrayList2;
        this.e = hz60Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz60)) {
            return false;
        }
        jz60 jz60Var = (jz60) obj;
        return this.a.equals(jz60Var.a) && this.b.equals(jz60Var.b) && this.c.equals(jz60Var.c) && this.d.equals(jz60Var.d) && e3n.d(0L, 0L) && this.e.equals(jz60Var.e) && this.f == jz60Var.f;
    }

    public final int hashCode() {
        int b = ly3.b((this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        o430 o430Var = e3n.b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + qv10.c(b, 31, 0L)) * 31);
    }

    public final String toString() {
        String p = e3n.p(0L);
        StringBuilder sb = new StringBuilder("OnJumpOrDivergenceProcessorConfig(primaryGroup=");
        sb.append(this.a);
        sb.append(", alternativeGroups=");
        sb.append(this.b);
        sb.append(", alternativeSelection=");
        sb.append(this.c);
        sb.append(", referenceGroups=");
        sb.append(this.d);
        sb.append(", referenceTimeout=");
        sb.append(p);
        sb.append(", sourcePriority=");
        sb.append(this.e);
        sb.append(", startWithLastKnown=");
        return x4e.i(sb, this.f, Extension.C_BRAKE);
    }
}
