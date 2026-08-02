package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class f671 implements qf71 {
    public final fh61 a;

    public f671(fh61 fh61Var) {
        this.a = fh61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f671) && jl40.l(this.a, ((f671) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.a + Extension.C_BRAKE;
    }
}
