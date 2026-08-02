package xsna;

/* compiled from: VisualTransformation.kt */
/* loaded from: classes11.dex */
public final class klp0 {
    public final us2 a;
    public final uv70 b;

    public klp0(us2 us2Var, uv70 uv70Var) {
        this.a = us2Var;
        this.b = uv70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klp0)) {
            return false;
        }
        klp0 klp0Var = (klp0) obj;
        return epx.f(this.a, klp0Var.a) && epx.f(this.b, klp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
