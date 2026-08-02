package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.br1;

/* loaded from: classes7.dex */
public final class jy61 {
    public final String a;
    public final br1 b;

    public jy61(String str, br1 br1Var) {
        this.a = str;
        this.b = br1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy61)) {
            return false;
        }
        jy61 jy61Var = (jy61) obj;
        return this.a.equals(jy61Var.a) && this.b == jy61Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
