package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class n2j0 {
    public final String a;
    public final List b;

    public n2j0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2j0)) {
            return false;
        }
        n2j0 n2j0Var = (n2j0) obj;
        return jl40.l(this.a, n2j0Var.a) && this.b.equals(n2j0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportFormInfo(url=");
        sb.append(this.a);
        sb.append(", prefilledAnswers=");
        return unr0.t(sb, this.b, ')');
    }
}
