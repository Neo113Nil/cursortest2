package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class g630 {
    public final d630 a;
    public final List b;
    public final Integer c;

    public g630(d630 d630Var, List list, Integer num) {
        this.a = d630Var;
        this.b = list;
        this.c = num;
    }

    public static e630 a() {
        return new e630();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g630)) {
            return false;
        }
        g630 g630Var = (g630) obj;
        return this.a.equals(g630Var.a) && this.b.equals(g630Var.b) && Objects.equals(this.c, g630Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
