package xsna;

import java.math.BigInteger;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableBigIntegerValueImpl.java */
/* loaded from: classes8.dex */
public final class xnw extends re implements sow {
    public static final BigInteger c = BigInteger.valueOf(-128);
    public static final BigInteger d = BigInteger.valueOf(127);
    public static final BigInteger e = BigInteger.valueOf(-32768);
    public static final BigInteger f = BigInteger.valueOf(32767);
    public static final BigInteger g = BigInteger.valueOf(-2147483648L);
    public static final BigInteger h = BigInteger.valueOf(2147483647L);
    public static final BigInteger i = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger j = BigInteger.valueOf(Long.MAX_VALUE);
    public final BigInteger b;

    public xnw(BigInteger bigInteger) {
        this.b = bigInteger;
    }

    @Override // xsna.sow
    public final boolean C() {
        BigInteger bigInteger = c;
        BigInteger bigInteger2 = this.b;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(d) <= 0;
    }

    @Override // xsna.sow
    public final long e() {
        boolean r = r();
        BigInteger bigInteger = this.b;
        if (r) {
            return bigInteger.longValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
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
        return this.b.equals(kjr0Var.g().p());
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.INTEGER;
    }

    public final int hashCode() {
        long j2;
        BigInteger bigInteger = g;
        BigInteger bigInteger2 = this.b;
        if (bigInteger.compareTo(bigInteger2) <= 0 && bigInteger2.compareTo(h) <= 0) {
            j2 = bigInteger2.longValue();
        } else {
            if (i.compareTo(bigInteger2) > 0 || bigInteger2.compareTo(j) > 0) {
                return bigInteger2.hashCode();
            }
            long longValue = bigInteger2.longValue();
            j2 = longValue ^ (longValue >>> 32);
        }
        return (int) j2;
    }

    @Override // xsna.jn70
    public final long n() {
        return this.b.longValue();
    }

    @Override // xsna.sow
    public final int o() {
        boolean u = u();
        BigInteger bigInteger = this.b;
        if (u) {
            return bigInteger.intValue();
        }
        throw new MessageIntegerOverflowException(bigInteger);
    }

    @Override // xsna.jn70
    public final BigInteger p() {
        return this.b;
    }

    @Override // xsna.sow
    public final boolean r() {
        BigInteger bigInteger = i;
        BigInteger bigInteger2 = this.b;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(j) <= 0;
    }

    @Override // xsna.kjr0
    public final String toJson() {
        return this.b.toString();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // xsna.sow
    public final boolean u() {
        BigInteger bigInteger = g;
        BigInteger bigInteger2 = this.b;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(h) <= 0;
    }

    @Override // xsna.sow
    public final boolean z() {
        BigInteger bigInteger = e;
        BigInteger bigInteger2 = this.b;
        return bigInteger2.compareTo(bigInteger) >= 0 && bigInteger2.compareTo(f) <= 0;
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
