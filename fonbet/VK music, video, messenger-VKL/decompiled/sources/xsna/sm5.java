package xsna;

/* compiled from: AutoValue_ImmutableSpanContext.java */
/* loaded from: classes11.dex */
public final class sm5 extends kpw {
    public final String b;
    public final String c;
    public final rdp0 d;
    public final ok3 e;
    public final boolean f;

    public sm5(String str, String str2, rdp0 rdp0Var, ok3 ok3Var, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.b = str;
        this.c = str2;
        if (rdp0Var == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.d = rdp0Var;
        if (ok3Var == null) {
            throw new NullPointerException("Null traceState");
        }
        this.e = ok3Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kpw)) {
            return false;
        }
        kpw kpwVar = (kpw) obj;
        sm5 sm5Var = (sm5) kpwVar;
        return this.b.equals(sm5Var.b) && this.c.equals(sm5Var.c) && this.d.equals(sm5Var.d) && this.e.equals(sm5Var.e) && this.f == kpwVar.isValid();
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    @Override // xsna.qhk0
    public final boolean isValid() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableSpanContext{traceId=");
        sb.append(this.b);
        sb.append(", spanId=");
        sb.append(this.c);
        sb.append(", traceFlags=");
        sb.append(this.d);
        sb.append(", traceState=");
        sb.append(this.e);
        sb.append(", remote=false, valid=");
        return n23.b(sb, this.f, "}");
    }
}
