package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class ic5 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ic5(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic5)) {
            return false;
        }
        ic5 ic5Var = (ic5) obj;
        return this.c == ic5Var.c && this.d == ic5Var.d && Objects.equals(this.a, ic5Var.a) && Objects.equals(this.b, ic5Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
