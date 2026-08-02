package xsna;

/* compiled from: DonutTeaserViewState.kt */
/* loaded from: classes4.dex */
public final class x3o {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final qko0 d;
    public final boolean e;
    public final tlo0 f;
    public final int g;

    public x3o(boolean z, boolean z2, String str, qko0 qko0Var, boolean z3, tlo0 tlo0Var, int i) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = qko0Var;
        this.e = z3;
        this.f = tlo0Var;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3o)) {
            return false;
        }
        x3o x3oVar = (x3o) obj;
        return this.a == x3oVar.a && this.b == x3oVar.b && epx.f(this.c, x3oVar.c) && epx.f(this.d, x3oVar.d) && this.e == x3oVar.e && epx.f(this.f, x3oVar.f) && this.g == x3oVar.g;
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        qko0 qko0Var = this.d;
        int b = qoy.b((a + (qko0Var == null ? 0 : Long.hashCode(qko0Var.a))) * 31, 31, this.e);
        tlo0 tlo0Var = this.f;
        return Integer.hashCode(this.g) + ((b + (tlo0Var != null ? tlo0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutTeaserViewData(isLoading=");
        sb.append(this.a);
        sb.append(", isLoaderVisible=");
        sb.append(this.b);
        sb.append(", teaserText=");
        sb.append(this.c);
        sb.append(", teaserTextSelection=");
        sb.append(this.d);
        sb.append(", isResetTeaserOptionVisible=");
        sb.append(this.e);
        sb.append(", errorTextSource=");
        sb.append(this.f);
        sb.append(", updateTeaserTextTrigger=");
        return vu5.b(sb, this.g, ')');
    }
}
