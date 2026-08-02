package xsna;

/* compiled from: BoundaryDrawState.kt */
/* loaded from: classes16.dex */
public final class w98 implements emv {
    public boolean a;
    public boolean b;
    public boolean c;

    public w98() {
        this(0);
    }

    @Override // xsna.emv
    public final void a() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    @Override // xsna.emv
    public final void b(boolean z) {
        this.b = true;
    }

    @Override // xsna.emv
    public final void c(boolean z) {
        this.a = z;
    }

    @Override // xsna.emv
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w98)) {
            return false;
        }
        w98 w98Var = (w98) obj;
        return this.a == w98Var.a && this.b == w98Var.b && this.c == w98Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoundaryDrawState(isDrawWarningLine=");
        sb.append(this.a);
        sb.append(", isDrawLine=");
        sb.append(this.b);
        sb.append(", isDrawFillRect=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public w98(int i) {
        this.a = false;
        this.b = false;
        this.c = false;
    }
}
