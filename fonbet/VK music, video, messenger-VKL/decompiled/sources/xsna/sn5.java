package xsna;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
public final class sn5 extends jii0 {
    public final eo5 a;
    public final String b;
    public final wxp<?> c;
    public final plp0<?, byte[]> d;
    public final ijp e;

    public sn5(eo5 eo5Var, String str, wxp wxpVar, plp0 plp0Var, ijp ijpVar) {
        this.a = eo5Var;
        this.b = str;
        this.c = wxpVar;
        this.d = plp0Var;
        this.e = ijpVar;
    }

    @Override // xsna.jii0
    public final ijp a() {
        return this.e;
    }

    @Override // xsna.jii0
    public final wxp<?> b() {
        return this.c;
    }

    @Override // xsna.jii0
    public final plp0<?, byte[]> c() {
        return this.d;
    }

    @Override // xsna.jii0
    public final sop0 d() {
        return this.a;
    }

    @Override // xsna.jii0
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jii0)) {
            return false;
        }
        jii0 jii0Var = (jii0) obj;
        return this.a.equals(jii0Var.d()) && this.b.equals(jii0Var.e()) && this.c.equals(jii0Var.b()) && this.d.equals(jii0Var.c()) && this.e.equals(jii0Var.a());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
