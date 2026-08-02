package defpackage;

/* loaded from: classes10.dex */
public final class gk2 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ gk2(fk2 fk2Var, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, fk2Var, (i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent");
    }

    public final ik2 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            jxv.c("Item.end should be set first");
        }
        return new ik2(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk2)) {
            return false;
        }
        gk2 gk2Var = (gk2) obj;
        return jl40.l(this.a, gk2Var.a) && this.b == gk2Var.b && this.c == gk2Var.c && jl40.l(this.d, gk2Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return b64.p(sb, this.d, ')');
    }

    public gk2(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
