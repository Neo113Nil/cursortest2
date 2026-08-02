package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class jb41 {
    public static final ib41 Companion = new ib41();
    public final mb41 a;

    public /* synthetic */ jb41(int i, mb41 mb41Var) {
        if (1 == (i & 1)) {
            this.a = mb41Var;
        } else {
            qje.Z(i, 1, hb41.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb41) && jl40.l(this.a, ((jb41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Configuration(uploadEndpoint=" + this.a + Extension.C_BRAKE;
    }
}
