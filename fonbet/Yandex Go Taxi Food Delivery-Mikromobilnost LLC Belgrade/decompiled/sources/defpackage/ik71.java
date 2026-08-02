package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ik71 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ik71(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik71)) {
            return false;
        }
        ik71 ik71Var = (ik71) obj;
        return this.c == ik71Var.c && this.d == ik71Var.d && tja1.a(this.a, ik71Var.a) && tja1.a(this.b, ik71Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
