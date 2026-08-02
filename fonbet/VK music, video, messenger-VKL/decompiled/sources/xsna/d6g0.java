package xsna;

/* compiled from: ReportState.kt */
/* loaded from: classes4.dex */
public final class d6g0 {
    public static final d6g0 e = new d6g0(14);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public d6g0() {
        this(15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6g0)) {
            return false;
        }
        d6g0 d6g0Var = (d6g0) obj;
        return this.a == d6g0Var.a && this.b == d6g0Var.b && this.c == d6g0Var.c && epx.f(this.d, d6g0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportState(isLoading=");
        sb.append(this.a);
        sb.append(", isSuccess=");
        sb.append(this.b);
        sb.append(", isError=");
        sb.append(this.c);
        sb.append(", screenshotPath=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ d6g0(int i) {
        this(null, (i & 1) == 0, false, false);
    }

    public d6g0(String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }
}
