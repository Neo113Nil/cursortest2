package xsna;

/* compiled from: DescriptionViewState.kt */
/* loaded from: classes7.dex */
public final class u2m implements lm50 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public u2m(String str, boolean z, boolean z2, boolean z3) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2m)) {
            return false;
        }
        u2m u2mVar = (u2m) obj;
        return epx.f(this.b, u2mVar.b) && this.c == u2mVar.c && this.d == u2mVar.d && this.e == u2mVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionViewState(description=");
        sb.append(this.b);
        sb.append(", isCounterValid=");
        sb.append(this.c);
        sb.append(", isButtonEnabled=");
        sb.append(this.d);
        sb.append(", isExitConfirmDialogVisible=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
