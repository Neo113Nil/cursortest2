package xsna;

/* compiled from: TemplatesKeyboardAction.kt */
/* loaded from: classes3.dex */
public final class i9o0 implements j9o0 {
    public final int b;
    public final String c;

    public i9o0(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9o0)) {
            return false;
        }
        i9o0 i9o0Var = (i9o0) obj;
        return this.b == i9o0Var.b && epx.f(this.c, i9o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Template(id=");
        sb.append(this.b);
        sb.append(", content=");
        return ho8.a(sb, this.c, ')');
    }
}
