package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kh30 implements wh30 {
    public final ge01 a;

    public kh30(ge01 ge01Var) {
        this.a = ge01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh30) && jl40.l(this.a, ((kh30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenTickets(button=" + this.a + Extension.C_BRAKE;
    }
}
