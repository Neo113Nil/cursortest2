package xsna;

/* compiled from: CenterDrawState.kt */
/* loaded from: classes16.dex */
public final class xpa implements hmv {
    public boolean a;
    public boolean b;

    public xpa() {
        this(0);
    }

    @Override // xsna.hmv
    public final boolean a() {
        return this.a;
    }

    @Override // xsna.hmv
    public final void b(boolean z) {
        this.a = z;
    }

    @Override // xsna.hmv
    public final void c(boolean z) {
        this.b = z;
    }

    @Override // xsna.hmv
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpa)) {
            return false;
        }
        xpa xpaVar = (xpa) obj;
        return this.a == xpaVar.a && this.b == xpaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CenterDrawState(isDrawVerticalLine=");
        sb.append(this.a);
        sb.append(", isDrawHorizontalLine=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public xpa(int i) {
        this.a = false;
        this.b = false;
    }
}
