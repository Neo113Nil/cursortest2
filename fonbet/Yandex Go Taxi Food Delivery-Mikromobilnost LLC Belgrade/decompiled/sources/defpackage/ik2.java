package defpackage;

/* loaded from: classes10.dex */
public final class ik2 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ik2(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        jxv.a("Reversed range is not supported");
    }

    public static ik2 a(ik2 ik2Var, fk2 fk2Var, int i, int i2) {
        Object obj = fk2Var;
        if ((i2 & 1) != 0) {
            obj = ik2Var.a;
        }
        int i3 = ik2Var.b;
        if ((i2 & 4) != 0) {
            i = ik2Var.c;
        }
        String str = ik2Var.d;
        ik2Var.getClass();
        return new ik2(i3, i, obj, str);
    }

    public final int b() {
        return this.c;
    }

    public final Object c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik2)) {
            return false;
        }
        ik2 ik2Var = (ik2) obj;
        return jl40.l(this.a, ik2Var.a) && this.b == ik2Var.b && this.c == ik2Var.c && jl40.l(this.d, ik2Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return b64.p(sb, this.d, ')');
    }

    public ik2(Object obj, int i, int i2) {
        this(i, i2, obj, "");
    }
}
