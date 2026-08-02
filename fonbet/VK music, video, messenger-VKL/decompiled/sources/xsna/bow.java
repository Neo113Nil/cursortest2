package xsna;

import org.msgpack.value.ValueType;

/* compiled from: ImmutableBooleanValueImpl.java */
/* loaded from: classes8.dex */
public final class bow extends re implements rpw, kjr0 {
    public static final bow c = new bow(true);
    public static final bow d = new bow(false);
    public final boolean b;

    public bow(boolean z) {
        this.b = z;
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
        if (kjr0Var.w()) {
            return this.b == kjr0Var.y().b;
        }
        return false;
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.BOOLEAN;
    }

    public final int hashCode() {
        return this.b ? 1231 : 1237;
    }

    @Override // xsna.kjr0
    public final String toJson() {
        return Boolean.toString(this.b);
    }

    public final String toString() {
        return Boolean.toString(this.b);
    }

    @Override // xsna.re
    /* renamed from: J */
    public final bow y() {
        return this;
    }

    @Override // xsna.re, xsna.kjr0
    public final bow y() {
        return this;
    }
}
