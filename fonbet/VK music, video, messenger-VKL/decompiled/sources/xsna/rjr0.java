package xsna;

/* compiled from: InspectableValue.kt */
/* loaded from: classes11.dex */
public final class rjr0 {
    public final String a;
    public final Object b;

    public rjr0(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjr0)) {
            return false;
        }
        rjr0 rjr0Var = (rjr0) obj;
        return epx.f(this.a, rjr0Var.a) && epx.f(this.b, rjr0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return k73.c(sb, this.b, ')');
    }
}
