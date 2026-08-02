package xsna;

/* compiled from: PhotoAttachment.kt */
/* loaded from: classes18.dex */
public final class n5a0 {
    public final int a;
    public final String b;

    public n5a0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5a0)) {
            return false;
        }
        n5a0 n5a0Var = (n5a0) obj;
        return this.a == n5a0Var.a && epx.f(this.b, n5a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoAttachment(id=");
        sb.append(this.a);
        sb.append(", file=");
        return ho8.a(sb, this.b, ')');
    }
}
