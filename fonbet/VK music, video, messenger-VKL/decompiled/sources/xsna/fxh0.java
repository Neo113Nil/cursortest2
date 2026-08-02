package xsna;

/* compiled from: SearchParamsValue.kt */
/* loaded from: classes5.dex */
public final class fxh0<T> {
    public final Integer a;
    public final String b;

    public fxh0(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxh0)) {
            return false;
        }
        fxh0 fxh0Var = (fxh0) obj;
        return this.a.equals(fxh0Var.a) && epx.f(this.b, fxh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchParamsValue(value=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }
}
