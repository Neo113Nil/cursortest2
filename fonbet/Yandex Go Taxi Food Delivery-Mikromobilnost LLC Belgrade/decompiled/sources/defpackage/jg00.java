package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jg00 {
    public final List a;
    public final ArrayList b;
    public final int c;

    public jg00(List list, ArrayList arrayList, int i) {
        this.a = list;
        this.b = arrayList;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg00)) {
            return false;
        }
        jg00 jg00Var = (jg00) obj;
        return jl40.l(this.a, jg00Var.a) && this.b.equals(jg00Var.b) && this.c == jg00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapConfig(modes=");
        sb.append(this.a);
        sb.append(", styles=");
        sb.append(this.b);
        sb.append(", zoom=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
