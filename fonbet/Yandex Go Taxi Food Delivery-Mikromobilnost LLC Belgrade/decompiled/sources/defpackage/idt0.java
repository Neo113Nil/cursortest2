package defpackage;

/* loaded from: classes10.dex */
public final class idt0 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public idt0(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idt0)) {
            return false;
        }
        idt0 idt0Var = (idt0) obj;
        return this.a == idt0Var.a && this.b == idt0Var.b && this.c == idt0Var.c && jl40.l(this.d, idt0Var.d) && this.e == idt0Var.e;
    }

    public final int hashCode() {
        int b = oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return Integer.hashCode(this.e) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceLocation(lineNumber=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", length=");
        sb.append(this.c);
        sb.append(", sourceFile=");
        sb.append(this.d);
        sb.append(", packageHash=");
        return oyr.s(sb, this.e, ')');
    }
}
