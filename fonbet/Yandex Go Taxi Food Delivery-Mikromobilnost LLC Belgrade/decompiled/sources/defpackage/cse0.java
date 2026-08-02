package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cse0 extends qse0 {
    public final m000 a;

    public cse0(m000 m000Var) {
        this.a = m000Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cse0) && jl40.l(this.a, ((cse0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MaaS(maasDeeplinkData=" + this.a + Extension.C_BRAKE;
    }
}
