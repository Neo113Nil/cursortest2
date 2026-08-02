package defpackage;

/* loaded from: classes2.dex */
public final class iy20 implements eje {
    public final q230 a;
    public final int b;

    public iy20(q230 q230Var, int i) {
        this.a = q230Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy20)) {
            return false;
        }
        iy20 iy20Var = (iy20) obj;
        return jl40.l(this.a, iy20Var.a) && this.b == iy20Var.b;
    }

    public final int hashCode() {
        q230 q230Var = this.a;
        return Integer.hashCode(this.b) + ((q230Var == null ? 0 : q230Var.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalContentViewContainerOptions(modalViewOptions=");
        sb.append(this.a);
        sb.append(", topPadding=");
        return oyr.s(sb, this.b, ')');
    }
}
