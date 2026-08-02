package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a0x0 {
    public final Pair a;
    public final Pair b;

    public a0x0(Pair pair, Pair pair2) {
        this.a = pair;
        this.b = pair2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0x0)) {
            return false;
        }
        a0x0 a0x0Var = (a0x0) obj;
        return jl40.l(this.a, a0x0Var.a) && jl40.l(this.b, a0x0Var.b);
    }

    public final int hashCode() {
        Pair pair = this.a;
        int hashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Pair pair2 = this.b;
        return hashCode + (pair2 != null ? pair2.hashCode() : 0);
    }

    public final String toString() {
        return "SymmetricalState(firstRow=" + this.a + ", secondRow=" + this.b + Extension.C_BRAKE;
    }
}
