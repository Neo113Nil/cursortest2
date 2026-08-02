package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mjl {
    public final rr51 a;

    public mjl(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mjl) && jl40.l(this.a, ((mjl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivTransactionInfoEntity(divData=" + this.a + Extension.C_BRAKE;
    }
}
