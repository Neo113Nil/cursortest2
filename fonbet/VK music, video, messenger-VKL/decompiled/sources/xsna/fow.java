package xsna;

import org.msgpack.value.ValueType;

/* compiled from: ImmutableDoubleValueImpl.java */
/* loaded from: classes8.dex */
public final class fow extends re implements jn70 {
    public final double b;

    public fow(double d) {
        this.b = d;
    }

    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kjr0)) {
            return false;
        }
        kjr0 kjr0Var = (kjr0) obj;
        if (kjr0Var.j()) {
            return this.b == kjr0Var.G().b;
        }
        return false;
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.FLOAT;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // xsna.kjr0
    public final String toJson() {
        double d = this.b;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    public final String toString() {
        return Double.toString(this.b);
    }

    @Override // xsna.re, xsna.kjr0
    public final fow G() {
        return this;
    }

    @Override // xsna.re
    /* renamed from: L */
    public final fow G() {
        return this;
    }
}
