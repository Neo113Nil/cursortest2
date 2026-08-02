package xsna;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableLongValueImpl.java */
/* loaded from: classes8.dex */
public final class apw extends re implements sow {
    public final long b;

    public apw(long j) {
        this.b = j;
    }

    @Override // xsna.sow
    public final boolean C() {
        long j = this.b;
        return -128 <= j && j <= 127;
    }

    @Override // xsna.sow
    public final long e() {
        return this.b;
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
        if (!kjr0Var.E()) {
            return false;
        }
        sow g = kjr0Var.g();
        return g.r() && this.b == g.n();
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.INTEGER;
    }

    public final int hashCode() {
        long j = this.b;
        return (-2147483648L > j || j > 2147483647L) ? (int) ((j >>> 32) ^ j) : (int) j;
    }

    @Override // xsna.jn70
    public final long n() {
        return this.b;
    }

    @Override // xsna.sow
    public final int o() {
        boolean u = u();
        long j = this.b;
        if (u) {
            return (int) j;
        }
        throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
    }

    @Override // xsna.jn70
    public final BigInteger p() {
        return BigInteger.valueOf(this.b);
    }

    @Override // xsna.sow
    public final boolean r() {
        return true;
    }

    @Override // xsna.kjr0
    public final String toJson() {
        return Long.toString(this.b);
    }

    public final String toString() {
        return Long.toString(this.b);
    }

    @Override // xsna.sow
    public final boolean u() {
        long j = this.b;
        return -2147483648L <= j && j <= 2147483647L;
    }

    @Override // xsna.sow
    public final boolean z() {
        long j = this.b;
        return -32768 <= j && j <= 32767;
    }

    @Override // xsna.re, xsna.kjr0
    public final sow g() {
        return this;
    }

    @Override // xsna.re, xsna.rpw
    /* renamed from: s */
    public final sow g() {
        return this;
    }
}
