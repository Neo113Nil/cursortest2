package xsna;

/* compiled from: ToolbarMenuModels.kt */
/* loaded from: classes16.dex */
public final class s7p0 {
    public final dko a;
    public final String b;
    public final boolean c;
    public final gzs<s3q0> d;
    public final Integer e;

    public s7p0(dko dkoVar, String str, boolean z, gzs<s3q0> gzsVar, Integer num) {
        this.a = dkoVar;
        this.b = str;
        this.c = z;
        this.d = gzsVar;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7p0)) {
            return false;
        }
        s7p0 s7p0Var = (s7p0) obj;
        return epx.f(this.a, s7p0Var.a) && epx.f(this.b, s7p0Var.b) && this.c == s7p0Var.c && epx.f(this.d, s7p0Var.d) && epx.f(this.e, s7p0Var.e);
    }

    public final int hashCode() {
        int a = sf3.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopBarMenuItem(drawable=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", enabled=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(", tint=");
        return uqi.b(sb, this.e, ')');
    }
}
