package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class nhx extends lgi0 {
    public final nc51 a;

    public nhx(jc51 jc51Var, BigInteger bigInteger, byte[] bArr) {
        this(new nc51(jc51Var, bigInteger, bArr));
    }

    @Override // defpackage.blq0
    public final boolean Q0(Object obj) {
        return obj instanceof qhx ? ((qhx) obj).a.equals(this) : this.a.Q0(obj);
    }

    public final Object clone() {
        return new nhx(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhx) {
            return this.a.equals(((nhx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public nhx(nc51 nc51Var) {
        this.a = nc51Var;
    }
}
