package xsna;

/* compiled from: GoodArrowItemHolder.kt */
/* loaded from: classes18.dex */
public final class ul3 {
    public final gzs<s3q0> a;
    public final String b;
    public final String c;
    public final boolean d;

    public ul3(gzs gzsVar, String str, String str2, boolean z) {
        this.a = gzsVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul3)) {
            return false;
        }
        ul3 ul3Var = (ul3) obj;
        return epx.f(this.a, ul3Var.a) && epx.f(this.b, ul3Var.b) && epx.f(this.c, ul3Var.c) && this.d == ul3Var.d;
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(true) + qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArrowItemInfo(listener=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", useChevron=");
        return n23.b(sb, this.d, ", isSingleLine=true)");
    }
}
