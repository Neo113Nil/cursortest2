package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class mjx extends lgi0 {
    public final nc51 a;

    public mjx(jc51 jc51Var, BigInteger bigInteger, byte[] bArr) {
        this(new nc51(jc51Var, bigInteger, bArr));
    }

    @Override // defpackage.blq0
    public final boolean Q0(Object obj) {
        return obj instanceof ojx ? ((ojx) obj).a.equals(this) : this.a.Q0(obj);
    }

    public final Object clone() {
        return new mjx(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mjx) {
            return this.a.equals(((mjx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public mjx(nc51 nc51Var) {
        this.a = nc51Var;
    }
}
