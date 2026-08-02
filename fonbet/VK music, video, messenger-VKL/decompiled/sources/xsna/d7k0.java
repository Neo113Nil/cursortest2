package xsna;

/* compiled from: SnackbarViewer.kt */
/* loaded from: classes16.dex */
public final class d7k0 {
    public final int a;
    public final izs<ikv0, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public d7k0(int i, izs<? super ikv0, s3q0> izsVar) {
        this.a = i;
        this.b = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7k0)) {
            return false;
        }
        d7k0 d7k0Var = (d7k0) obj;
        return this.a == d7k0Var.a && this.b.equals(d7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnackbarButton(title=");
        sb.append(this.a);
        sb.append(", listener=");
        return up.c(sb, this.b, ')');
    }
}
