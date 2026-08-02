package xsna;

import java.util.Objects;

/* compiled from: Pair.java */
/* loaded from: classes11.dex */
public final class qg90<F, S> {
    public final F a;
    public final S b;

    public qg90(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qg90)) {
            return false;
        }
        qg90 qg90Var = (qg90) obj;
        return Objects.equals(qg90Var.a, this.a) && Objects.equals(qg90Var.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return (s != null ? s.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return tk5.c(sb, this.b, "}");
    }
}
