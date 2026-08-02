package xsna;

/* compiled from: TopVideoDialogModel.kt */
/* loaded from: classes8.dex */
public final class l9p0 {
    public final String a;
    public final String b;
    public final vq6 c;

    public l9p0(String str, String str2, vq6 vq6Var) {
        this.a = str;
        this.b = str2;
        this.c = vq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9p0)) {
            return false;
        }
        l9p0 l9p0Var = (l9p0) obj;
        return this.a.equals(l9p0Var.a) && this.b.equals(l9p0Var.b) && this.c.equals(l9p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder a = xe9.a("TopVideoDialogModel(title=", this.a, ", subtitle=", this.b, ", onClick=");
        a.append(this.c);
        a.append(")");
        return a.toString();
    }
}
