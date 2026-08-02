package defpackage;

/* loaded from: classes10.dex */
public final class gd90 {
    public final Object a;
    public final String b;

    public gd90(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd90)) {
            return false;
        }
        gd90 gd90Var = (gd90) obj;
        return this.a.equals(gd90Var.a) && jl40.l(this.b, gd90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entry(value=");
        sb.append(this.a);
        sb.append(", memoryCacheKey=");
        return b64.p(sb, this.b, ')');
    }
}
