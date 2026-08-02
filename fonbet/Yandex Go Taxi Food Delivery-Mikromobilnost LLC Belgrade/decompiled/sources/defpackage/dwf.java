package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class dwf {
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final ewf d;

    public dwf(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, ewf ewfVar) {
        this.a = bigInteger3;
        this.c = bigInteger;
        this.b = bigInteger2;
        this.d = ewfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwf)) {
            return false;
        }
        dwf dwfVar = (dwf) obj;
        return dwfVar.c.equals(this.c) && dwfVar.b.equals(this.b) && dwfVar.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (this.c.hashCode() ^ this.b.hashCode());
    }
}
