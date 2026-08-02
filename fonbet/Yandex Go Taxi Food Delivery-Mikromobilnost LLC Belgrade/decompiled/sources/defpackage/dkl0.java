package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dkl0 implements fkl0 {
    public final String a;

    public dkl0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkl0) && jl40.l(this.a, ((dkl0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RedirectRuleModel(tariffToRedirect=", this.a, Extension.C_BRAKE);
    }
}
